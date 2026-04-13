package com.dam.practicajunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0.0, c.getRadio());
    }

}
