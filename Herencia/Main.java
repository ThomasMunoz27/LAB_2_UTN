package Herencia;

public class Main {
    public static void main(String[] args) {
        Pajaro p1 = new Pajaro("colibrí", 2, "fino");
        System.out.println(p1.getRaza() + " " +p1.getEdad() + " " +p1.getPlumaje());
        p1.comer();
        p1.cantar();
    }
}
