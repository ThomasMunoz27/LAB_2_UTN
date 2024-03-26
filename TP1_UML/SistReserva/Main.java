package TP1_UML.SistReserva;

public class Main {
    public static void main(String[] args) {
        Piloto pilot = new Piloto("Hector", "Zapata", 69, 5471789, "29AA");
        Pasajero psj1 = new Pasajero("Thomas", "Muñoz", 19, 94219667, 10.00, 25);
        Vuelo v1 = new Vuelo("Argentina", "Canadá", "06:00", pilot);

        SistReserva res = new SistReserva(psj1, v1);

        res.Reservar();
    }
}
