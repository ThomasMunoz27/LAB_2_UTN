package RelacionesPersona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Paula", 21, EstadoCivil.SOLTERO);
        Persona p2 = new Persona("Rodrigo", 85, EstadoCivil.DIVORCIADO);
        p2.agregarHijos(p1);
        p1.agregarPadre(p2);

        System.out.println("Yo soy " + p2.getNombre() + " y mi hija es " + p2.getHijos().get(0).getNombre());
        System.out.println("Yo soy " + p1.getNombre() + " y mi padre es es " + p1.getPadres()[0].getNombre());
    }
}
