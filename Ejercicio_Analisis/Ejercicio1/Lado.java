package Ejercicio_Analisis.Ejercicio1;

public class Lado {
    private Punto[] puntos= new Punto[2];
    //private Punto[] puntos;

    public Lado(int x, int y, int x1, int y1) {
        this.puntos[0]  = new Punto(x, y);
        this.puntos[1] = new Punto(x1, y1);
    }
    /*
    public Lado(Punto puntos){
        this.puntos = new puntos[4];
    }
     */


}
