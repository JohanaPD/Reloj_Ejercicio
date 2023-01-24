package Ejercicio_Rejoj;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RelojTest {
    Reloj nuevo= new Reloj(24, 12,55);

    @Test
    void getHora() {
        int hora=nuevo.getHora();
        int minuto= nuevo.getMinuto();
        Assert.assertEquals(24,  hora);
        Assert.assertNotEquals(22, hora);

    }



    @org.junit.jupiter.api.Test
    void setHora() {
        int hora=nuevo.getHora();
        assertNotEquals(22, hora);
    }

    @org.junit.jupiter.api.Test
    void getMinuto() {

    }

    @org.junit.jupiter.api.Test
    void setMinuto() {
        int minuto=nuevo.getMinuto();
        assertNotEquals(22, minuto);
    }

    @org.junit.jupiter.api.Test
    void getSegundo() {
    }

    @org.junit.jupiter.api.Test
    void setSegundo() {
        int segundo=nuevo.getSegundo();
        Assert.assertEquals(55, segundo);
    }
}