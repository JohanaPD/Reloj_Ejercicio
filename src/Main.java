import Ejercicio_Rejoj.Reloj;

public class Main {
    public static void main(String[] args) {

        Reloj nuevoReloj=new Reloj(12,120,68);
        Reloj usar= new Reloj();
        usar.introducirHora(nuevoReloj);
        System.out.println(nuevoReloj.getSegundo());

    }
}