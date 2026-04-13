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

}