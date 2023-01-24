package Ejercicio_Rejoj;

public class actividadReloj {
    static final  int BATERIA_TOTAL=2400;
    static final int BATERIA_GASTO_HORA=100;
    static final int TIEMPO_RECARGA=24;
    private int bateria;

    public void RelojBateria(int bateria) {
        this.bateria = bateria;
    }
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public void recargarBateria(int bateria,  int tiempoRecarga, int minutoRecarga){
        if(bateria<0 || bateria<= BATERIA_TOTAL){

        }
    }
}
