package Clase_09_05;

import java.util.ArrayList;
import java.util.List;

public class Equipo <T>{
    private String nombre;
    private List<T> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<T>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<T> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<T> jugadores) {
        this.jugadores = jugadores;
    }

    public void addJugadores(T jugador){
        this.jugadores.add(jugador);
    }
}
