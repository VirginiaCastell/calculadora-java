package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para CalculadoraBasica.
 * Contiene 5 tests unitarios utilizando JUnit 5 para validar el comportamiento
 * de las funciones de suma, multiplicación y sumatoria.
 * En esta versión, cada test instancia su propia calculadora para mayor simplicidad.
 */
public class CalculadoraBasicaTest {

    /**
     * Test 1: Verifica que la suma de dos números positivos sea correcta.
     */
    @Test
    public void testSumar() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.sumar(5, 7);
        // Esperamos que 5 + 7 sea igual a 12
        assertEquals(12, resultado, "5 + 7 debería ser igual a 12");
    }

    /**
     * Test 2: Verifica que la suma de dos números negativos sea correcta.
     */
    @Test
    public void testSumarNegativos() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.sumar(-3, -2);
        // Esperamos que -3 + -2 sea igual a -5
        assertEquals(-5, resultado, "-3 + -2 debería ser igual a -5");
    }

    /**
     * Test 3: Verifica que la multiplicación mediante sumas sea correcta.
     */
    @Test
    public void testMultiplicarConSumas() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.multiplicarConSumas(4, 3);
        // Esperamos que 4 multiplicado por 3 sea 12 (4+4+4)
        assertEquals(12, resultado, "4 * 3 mediante sumas repetidas debería ser 12");
    }

    /**
     * Test 4: Verifica que multiplicar por cero devuelva cero.
     */
    @Test
    public void testMultiplicarPorCero() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.multiplicarConSumas(10, 0);
        // Esperamos que cualquier número multiplicado por 0 sea 0
        assertEquals(0, resultado, "Cualquier número por cero debería dar cero");
    }

    /**
     * Test 5: Verifica la función sumarHasta utilizando un bucle while.
     */
    @Test
    public void testSumarHastaCinco() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.sumarHasta(5);
        // Sumatoria de 1 a 5: 1+2+3+4+5 = 15
        assertEquals(15, resultado, "La suma de los números del 1 al 5 debería ser 15");
    }
}
