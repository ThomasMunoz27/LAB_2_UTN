package RelacionHerencia1;

public class Hijo extends Padre{

    public Hijo(int edad) {
        super(edad);
        System.out.println("Se creó el hijo y su edad es " + edad);
    }
}
