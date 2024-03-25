package TP1_UML;

public class Pasajero extends Persona{
    private int equipajeKg;

    private Reserva reserva;

    public Pasajero(int edad, String nombre, int equipajeKg, int numAsiento) {
        super(edad, nombre);
        this.equipajeKg = equipajeKg;
        this.reserva = new Reserva(numAsiento);
    }
}
