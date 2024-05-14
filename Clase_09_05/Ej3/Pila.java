package Clase_09_05.Ej3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pila <T>{
    private List<T> objetos;

    public Pila() {
        objetos = new ArrayList<T>();
    }
public boolean estaEmpty(){
        if (objetos.isEmpty()){
            return true;
        }
        return false;
}
public int tamano(){
        return objetos.size();
}

public void push(T obj){
        objetos.add(obj);
}

public void pop (T obj){
        if (this.estaEmpty()) {
            throw new EmptyStackException();
        }
        objetos.remove(this.tamano()-1);
}

public T peek(){
        if (this.estaEmpty()){
            throw new EmptyStackException();
        }
        return objetos.get(this.tamano()-1);
}

}
