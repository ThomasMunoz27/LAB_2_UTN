import Ejercicio_Analisis.Ejercicio1.Lado;
import Ejercicio_Analisis.Ejercicio1.Punto;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 5);
        Punto punto2 = new Punto(5, 0);
        Lado lado1 = new Lado(punto1.getX(), punto1.getY(), punto2.getX(), punto2.getY());
        Lado lado2 = new Lado(1,2,2,1);
    }
}