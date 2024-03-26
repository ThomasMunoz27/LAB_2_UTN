package TP1_UML;

public class Avion implements Volador{
    private String patente;
    private Flota flota;
    private Vuelo vuelo;

    public Avion(String patente, String ubicacion) {
        this.patente = patente;
        this.flota = new Flota(ubicacion);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public void volar() {
        System.out.println("El avion con patente " + this.patente + " esta volando");
    }
}
