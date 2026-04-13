package com.dam.practicajunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    // CASO A: Constructor vacío
    @Test
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0.0, c.getRadio());
    }

    // CASO B: Método getRadio()
    @Test
    public void testGetRadio() {
        Circulo c = new Circulo(5);
        assertEquals(5.0, c.getRadio());
    }

    // CASO C: Método setRadio()
    @Test
    public void testSetRadio() {
        Circulo c = new Circulo(3);
        c.setRadio(10);
        assertEquals(10.0, c.getRadio());
    }

    // CASO D: Método calcularArea()
    @Test
    public void testCalcularArea() {
        Circulo c = new Circulo(1);
        double esperado = Math.PI * 1 * 1;
        assertEquals(esperado, c.calcularArea(), 0.0);
    }

}