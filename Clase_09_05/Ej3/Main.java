package Clase_09_05.Ej3;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> p1 =  new Pila<>();
        p1.push(4444);
        p1.push(2);
        System.out.println(p1.peek());
        p1.pop(1);
        System.out.println(p1.peek());
    }
}
