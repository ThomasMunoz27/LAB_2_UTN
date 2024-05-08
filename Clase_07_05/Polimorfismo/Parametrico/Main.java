package Clase_07_05.Polimorfismo.Parametrico;

public class Main {
    public static void main(String[] args) {
        Caja c1 = new Caja();
        c1.setContenido(3);
        System.out.println(c1.getContenido());
        c1.setContenido("Hola");
        System.out.println(c1.getContenido());
    }
}
