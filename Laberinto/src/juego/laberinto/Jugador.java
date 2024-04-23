package juego.laberinto;


public class Jugador {

    private Image imgJugadorFront;
    private Image imgJugadorBack;
    private Image imgJugadorRight;
    private Image imgJugadorLeft;
    private boolean ganador;
    private Integer puntaje;

    public Jugador(){
        puntaje = 0;
        imgJugadorFront = new Image("/juego/laberinto/sprites/chiqui-pixel.png");
        imgJugadorBack = new Image("/juego/laberinto/sprites/chiqui-pixel-back.png");
        imgJugadorRight = new Image("/juego/laberinto/sprites/chiqui.pixel-right.png");
        imgJugadorLeft = new Image("/juego/laberinto/sprites/chiqui-pixel-left.png");

    }

    public Image getImgJugadorFront() {
        return imgJugadorFront;
    }

    public void setImgJugadorFront(Image imgChiquiFront) {
        this.imgJugadorFront = imgChiquiFront;
    }

    public Image getImgJugadorBack() {
        return imgJugadorBack;
    }

    public void setImgJugadorBack(Image imgChiquiBack) {
        this.imgJugadorBack = imgChiquiBack;
    }

    public Image getImgJugadorRight() {
        return imgJugadorRight;
    }

    public void setImgJugadorRight(Image imgChiquiRight) {
        this.imgJugadorRight = imgChiquiRight;
    }

    public Image getImgJugadorLeft() {
        return imgJugadorLeft;
    }

    public void setImgJugadorLeft(Image imgChiquiLeft) {
        this.imgJugadorLeft = imgChiquiLeft;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

}