package juego.laberinto;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.text.Element;
import javax.swing.text.html.ImageView;

import javafx.scene.image.Image;


public class Laberinto {

    private Jugador jugador;
    private Rectangle inicio;
    private Rectangle llegada;
    private List<Rectangle> paredes;
    private List<ImageView> listaMonedas;

    public Laberinto() {

    }

    public Laberinto(int[] listaX, int[] listaY, int[] listaAncho, int[] listaAlto) {
        listaMonedas = new ArrayList<>();
        paredes = new ArrayList<>();
        for (int i = 0; i < listaX.length; i++) {
            paredes.add(new Rectangle(listaX[i], listaY[i], listaAncho[i], listaAlto[i]));
        }
    }

    public List<Rectangle> getParedes() {
        return paredes;
    }

    public void setParedes(List<Rectangle> paredes) {
        this.paredes = paredes;
    }

    public List<ImageView> getListaMonedas() {
        return listaMonedas;
    }

    public void setListaMonedas(List<ImageView> monedas) {
        this.listaMonedas = monedas;
    }

    public Rectangle getInicio() {
        return inicio;
    }

    public void setInicio(Rectangle inicio) {
        this.inicio = inicio;
    }

    public Rectangle getLlegada() {
        return llegada;
    }

    public void setLlegada(Rectangle llegada) {
        this.llegada = llegada;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Genera las posiciones de las monedas dentro del laberinto
     * de forma aleatoria
     * @return 
     */
    public List<ImageView> generarMonedas() {
        Image moneda = new Image("/juego/laberinto/sprites/coin-icon.png");
        Random generador = new Random();

        for (int i = 1; i<=20; i++){
            Double coordX = 1000 * generador.nextDouble() % (570 - 25) + 25;
            Double coordY = 1000 * generador.nextDouble() % (570 - 75) + 75;
            ImageView imgViewMoneda = new ImageView ((Element) moneda);
            ((Object) imgViewMoneda).setTranslateX(coordX);
            ((Object) imgViewMoneda).setTranslateY(coordY);
            if(comprobarColision(imgViewMoneda)){
                i--;
            } else {
                listaMonedas.add(imgViewMoneda);
            }
        }
        return listaMonedas;
    }

    public boolean comprobarColision(ImageView imgView) {
        for(Rectangle pared : this.getParedes()) {
            if(imgView.getBoundsInParent().intersects(pared.getBoundsInParent())){
                return true;
            }
        }
        return false;
    }

    public boolean monedaObtenida(ImageView imgView) {
        for(ImageView moneda : listaMonedas) {
            if(imgView.getBoundsInParent().intersects(moneda.getBoundsInParent()) && moneda.isVisible()){
                moneda.setVisible(false);
                return true;
            }
        }
        return false;
    }
}