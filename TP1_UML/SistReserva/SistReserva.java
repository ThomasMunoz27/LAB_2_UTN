package TP1_UML.SistReserva;

public class SistReserva {

    private Pasajero pasajero;
    private Vuelo vuelo;

    public SistReserva() {
    }

    public SistReserva(Pasajero pasajero, Vuelo vuelo) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public void Reservar(){
        System.out.println("Reservaste el asiento: " + pasajero.getNumAsiento() + " a " + vuelo.getDestino()  + " A nombre de: " + pasajero.getNombre() + " con el piloto "+ vuelo.getPiloto().getNombre() + " " + vuelo.getPiloto().getApellido() + " de matricula: " + vuelo.getPiloto().getCarnetPiloto());
    }


}