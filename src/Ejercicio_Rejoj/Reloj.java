package Ejercicio_Rejoj;

public class Reloj<O> {


    private int hora;
    private int minuto;
    private int segundo;


    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void introducirHora(Reloj<Object> nuevo) {
        int min, seg, hor;
        int sumaSeg;
        int sumaMin;
        int sumHora;
        if (nuevo.getSegundo() > 60) {
            sumaSeg = nuevo.getSegundo() % 10;

            System.out.println(sumaSeg);
        } else if (nuevo.getMinuto() > 0 || nuevo.getMinuto() < 60) {

        } else if (nuevo.getHora() > 0 || nuevo.getHora() < 60) {

        } else {
            System.out.println("Hora incorrecta");
        }


    }


}
