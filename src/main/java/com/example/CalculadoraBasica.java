package com.example;

import java.util.ArrayList;
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

    /**
     * Función para determinar si un número es par o impar.
     * @param n El número a verificar.
     * @return true si el número es par, false si es impar.
     */
    public boolean esPar(int n) {
        if (n % 2 == 0) {
            return true; // Retorna true si el número es par
        } else {
            return false; // Retorna false si el número es impar
        }
    }

    /**
     * Función para calcular el factorial de un número utilizando un bucle for.
     * @param n El número del cual se desea calcular el factorial (debe ser >= 0).
     * @return El factorial de n (n!). El factorial de un número n es el producto de todos los enteros positivos desde 1 hasta n. Por ejemplo, el factorial de 5 es 5 * 4 * 3 * 2 * 1 = 120.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser positivo.");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i; // Multiplicamos resultado por i en cada iteración
        }
        return resultado;
    }

    /**
     * Función para determinar si un número es primo o no.
     * @param n El número a verificar.
     * @return true si el número es primo, false si no lo es. Un número primo es un número entero mayor que 1 que solo es divisible por 1 y por sí mismo. Por ejemplo, los primeros números primos son 2, 3, 5, 7, 11, etc.
     */
    public boolean esPrimo(int n) {
        if (n <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Solo necesitamos verificar hasta la raíz cuadrada de n
            if (n % i == 0) {
                return false; // Si n es divisible por cualquier número entre 2 y la raíz cuadrada de n, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, n es primo
    }

    /**
     * Función para invertir un número entero. Por ejemplo, si el número es 1234, el resultado será 4321.
     * @param n El número a invertir.
     * @return El número invertido. El proceso de invertir un número implica tomar cada dígito del número original y colocarlo en orden inverso para formar un nuevo número. Por ejemplo, el número 1234 se convierte en 4321 al invertirlo.
     */
    public int invertirNumero(int n) {
        int numeroInvertido = 0;
        while (n != 0) {
            int digito = n % 10; // Obtiene el último dígito de n
            numeroInvertido = numeroInvertido * 10 + digito; // Agrega el dígito al número invertido
            n /= 10; // Elimina el último dígito de n
        }
        return numeroInvertido;
    }

    /**
     * Función para contar el número de dígitos en un número entero. Por ejemplo, el número 1234 tiene 4 dígitos.
     * @param n El número del cual se desea contar los dígitos.
     * @return El número de dígitos en n. El proceso de contar los dígitos de un número implica dividir el número repetidamente por 10 hasta que el número se reduzca a 0, incrementando un contador en cada paso para contar cuántas veces se realizó esta operación. Por ejemplo, para el número 1234, el contador se incrementaría 4 veces (1234 -> 123 -> 12 -> 1 -> 0), lo que indica que hay 4 dígitos en el número.
     */
    public int contarDigitos(int n) {
        int contador = 0;
        if (n == 0) {
            return 1; // El número 0 tiene un dígito
        }
        while (n != 0) {
            n /= 10; // Elimina el último dígito de n
            contador++; // Incrementa el contador por cada dígito eliminado
        }
        return contador; // Retorna el número total de dígitos
    }


    /** 
     * Función para confimar si la hora es correcta.
     * @return La hora formateada como una cadena.
     */
    public boolean  comprobar_hora (String hora) {
        return hora.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]");//El primer núm puede ser 0-1 + 0-9 y por otro lado 0-5 + 0-9
    } 

    public boolean comprobar_fecha (String fecha) {
        return fecha.matches("(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20\\d{2}|2100)");//En el año no hace falta poner el rango 0-9 ya que son todos.
    }

    public static void main(String[] args) {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        Scanner sc = new Scanner(System.in);

        int resultadoSuma = calculadora.sumar(5, 7);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        int resultadoMultiplicacion = calculadora.multiplicarConSumas(4, 3);
        System.out.println("Resultado de la multiplicación con sumas: " + resultadoMultiplicacion);

        int resultadoSumatoria = calculadora.sumarHasta(5);
        System.out.println("Resultado de la sumatoria hasta 5: " + resultadoSumatoria);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        int suma = calculadora.sumar(num1, num2);//Llamo a la función sumar para poder usarla

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    

      
        System.out.print("Dime la hora: ");
        String hora = sc.nextLine();
        if (calculadora.comprobar_hora(hora)) {
            System.out.println("La hora es válida.");
        } else {
            System.out.println("La hora no es válida.");
        }


        System.out.print("Dime la fecha: ");
        String fecha = sc.nextLine();
        if (calculadora.comprobar_fecha(fecha)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
        sc.close();//Me pide cerrar el scanner

//ArrayList ------

        //Hay que importar al principio: import java.util.ArrayList;
 
        String [] vector = new String [3];
        ArrayList <String> vector_2 = new ArrayList<>();

        // vector [0]= 1; así sería uno normal
        // vector [1]= 3;
        // vector [2]= 5;

        //vector_2.add(1);// Añadimos valores al ArraList
        //vector_2.add(2);// Todo el tiempo los añade de forma consecutiva

        //System.out.print(vector_2[0]);// Imprimimos la posición 0
        System.out.print(vector_2.get(0));// Otra forma de imprimir la posición 0, se usa get

        vector_2.size();//Para obtener el tamaño del ArraList

        vector_2.remove(0);//Para eliminar el elemento de la posición 0, se usa remove

        for (String s: vector_2) {// Al igual que i en un bucle for, aquí se usa s
            System.out.print(s);
        }


    }

}


