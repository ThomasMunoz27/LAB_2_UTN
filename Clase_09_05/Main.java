package Clase_09_05;

public class Main {
    public static void main(String[] args) {
        Equipo<String> e1 = new Equipo<>("Boca");

        e1.addJugadores("Pablo");
        e1.addJugadores("Paula");
        e1.addJugadores("Rodrigo");
        e1.addJugadores("Messi");

        Equipo<Integer> e2 = new Equipo<>("Los pumas");

        e2.addJugadores(1);
        e2.addJugadores(4);
    }
}
