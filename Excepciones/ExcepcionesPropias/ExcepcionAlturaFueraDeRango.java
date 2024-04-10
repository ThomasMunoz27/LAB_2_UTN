package Excepciones.ExcepcionesPropias;

public class ExcepcionAlturaFueraDeRango extends Exception {
  public ExcepcionAlturaFueraDeRango() {
    System.out.println("ExcepcionAlturaFueraDeRango: La altura está fuera del SOS rango permitido.");
  }
}
