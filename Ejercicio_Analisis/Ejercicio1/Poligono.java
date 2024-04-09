package Ejercicio_Analisis.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Poligono {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Lado> lados = new ArrayList<>();

    public Poligono(){

    }

    public void agregarLados(Lado lado){
        this.lados.add(lado);
    }
}
