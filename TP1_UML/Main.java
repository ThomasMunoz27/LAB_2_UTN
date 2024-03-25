package TP1_UML;

public class Main {
    public static void main(String[] args) {
        Piloto pi1 = new Piloto(27, "Marcos", 10);
        Avion a1 = new Avion("QXR327", "Australia");
        Flota f1 = new Flota("Panamá");
        Vuelo v1 = new Vuelo(175, 90);
        Reserva r1 = new Reserva(15);


        a1.setVuelo(v1);
        System.out.println(a1.getPatente() + " tiene asignado el vuelo " + a1.getVuelo().getNumVuelo());

        r1.agregarVuelo(v1);
        System.out.println("La reserva " + r1.getNumAsiento() + " tiene el vuelo " + r1.getVuelo().getNumVuelo());

        pi1.volar();
    }
}
