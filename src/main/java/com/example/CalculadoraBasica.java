package com.example;

import java.util.Scanner;

/**
 * Una clase simple que realiza operaciones matemáticas básicas.
 * Esta clase está diseñada para demostrar el uso de sumas, 
 * multiplicaciones con bucles for y sumatorias con bucles while.
 */
public class CalculadoraBasica {
    /**
     * Suma dos números enteros.
     * 
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return El resultado de la suma de a + b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Multiplica dos números enteros utilizando un bucle for.
     * Simula la multiplicación como una serie de sumas repetidas.
     * Solo funciona correctamente para multiplicadores positivos (b >= 0).
     * 
     * @param a El número que se va a multiplicar.
     * @param b El multiplicador (número de veces que se suma a).
     * @return El resultado de a multiplicado por b.
     */
    public int multiplicarConSumas(int a, int b) {
        int resultado = 0;
        // Bucle for: comienza en 0, llega hasta b, incrementando de 1 en 1
        for (int i = 0; i < b; i++) {
            resultado = resultado + a;
        }
        return resultado;
    }

    /**
     * Calcula la suma de todos los números desde 1 hasta n utilizando un bucle while.
     * Por ejemplo, si n es 3, el resultado será 1 + 2 + 3 = 6.
     * 
     * @param n El límite superior de la suma (debe ser >= 0).
     * @return La sumatoria de 1 hasta n.
     */
    public int sumarHasta(int n) {
        int suma = 0;
        int contador = 1;
        // Bucle while: mientras el contador sea menor o igual a n
        while (contador <= n) {
            suma = suma + contador;
            contador++; // Incrementamos el contador para no entrar en un bucle infinito
        }
        return suma;
    }

    public static void main(String[] args) {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        int resultadoSuma = calculadora.sumar(5, 7);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        int resultadoMultiplicacion = calculadora.multiplicarConSumas(4, 3);
        System.out.println("Resultado de la multiplicación con sumas: " + resultadoMultiplicacion);

        int resultadoSumatoria = calculadora.sumarHasta(5);
        System.out.println("Resultado de la sumatoria hasta 5: " + resultadoSumatoria);

        try (Scanner sc = new Scanner(System.in)) {//Otra forma de cerrar el Scanner es usando try.
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            
            int suma = calculadora.sumar(num1, num2);//Llamo a la función sumar para poder usarla

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        }
    }
}


