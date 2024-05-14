package Clase_09_05.Ejerc2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class PilaArray<E> {
    private int countIns;
    private ArrayList<E> elementos;
    private int maxElemetos;
    public PilaArray(int maxElemetos) {
        this.countIns = 0;
        this.elementos = new ArrayList<>() ;
        this.maxElemetos = maxElemetos;
    }

    public int getCountIns() {
        return countIns;
    }

    public void setCountIns(int countIns) {
        this.countIns = countIns;
    }

    public ArrayList<E> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<E> elementos) {
        this.elementos = elementos;
    }

    public int getMaxElemetos() {
        return maxElemetos;
    }

    public void setMaxElemetos(int maxElemetos) {
        this.maxElemetos = maxElemetos;
    }

    public boolean estaVacia(){
        if (elementos.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean anadir(E elemento){
        if(estaVacia()){
            throw new EmptyStackException();
        }else {
            if (elementos.size() < maxElemetos){
                elementos.add(elemento);
                countIns++;
                return true;
            }else {
                System.out.println("No se pudo añadir");
                return false;
            }
        }
    }

    public E primero(){
        if (estaVacia()){
            throw new NoSuchElementException();
        }
        return elementos.get(countIns);
    }

    public E extraer(){
        if (estaVacia()){
            throw new NoSuchElementException();
        }
        countIns--;
        return elementos.get(countIns);
    }
}
