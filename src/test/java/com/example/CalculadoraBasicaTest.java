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

    /**
     * Test 6: Verifica que el número sea par.
     */
    @Test
    public void testEsPar() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        boolean resultado = calculadora.esPar(n: 2);
        // Números pares n%2==0
        assertEquals(true, resultado, message: "El número es par");
    } 

    /**
     * Test 7: Verifica que el factorial del número sea correcto.
     */
    @Test
    public void testFactorial() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.factorial(n: 5);
        // (5*4*3*2*1)
        assertEquals(120, resultado, message: "El factorial es: 120");
    }    

    /**
     * Test 8: Verifica que el número sea primo.
     */
    @Test
    public void testEsPrimo () {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        boolean resultaro = calculadora.esPrimo(n: 7);
        // El número es primo si es divisible solo entre 1 y el mismo
        asserEquals(expected: true, resultado, message: "El número es primo" );  
    }
        
    /**
     * Test 9: Verifica que el número está invertido
     *  */    
    @Test
    public void testinvertirNumero() {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultado = calculadora.invertirNumero(12345);
        // Comienza por el final del número
        assertEquals(54321, resultado, message: "El número invertido es: 54321);



    /**
     * Test 10: Verifica que los dígitos correspondientes al número son correctos
     */

}

