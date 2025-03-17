package br.com.kasolution.exercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testVerificarParOuImpar() {
        assertEquals("par", Main.verificarParOuImpar(2));
        assertEquals("ímpar", Main.verificarParOuImpar(3));
        assertEquals("par", Main.verificarParOuImpar(0));
        assertEquals("ímpar", Main.verificarParOuImpar(-1));
        assertEquals("par", Main.verificarParOuImpar(-2));
    }
}