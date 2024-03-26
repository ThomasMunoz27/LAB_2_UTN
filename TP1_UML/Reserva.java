package TP1_UML;

public class Reserva {
    private int numAsiento;

    private Vuelo vuelo;

    public Reserva(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void agregarVuelo(Vuelo vuelo1){
        this.vuelo = vuelo1;
    }
}
