package Excepciones.TP;

public class ExcepcionesAnidadas {
    public static void main(String[] args) {
        int num = 10;
        String amoungSus = "cero";

        System.out.println(catchErrors(num, amoungSus));
    }
    public static int  catchErrors(int preReturn, String trash){
        int virus = 0;
        try {
            int preError = Integer.parseInt(trash);
            preReturn /= virus;
            return preReturn;
        }catch (ArithmeticException ae){
            System.out.println("Ups, un error númerico");
        }catch (NumberFormatException ne){
            System.out.println("No se puede convertir ese String");
        }catch (Exception e){
            System.out.println("Soy un error general");
        }
        return 0;
    }
}
