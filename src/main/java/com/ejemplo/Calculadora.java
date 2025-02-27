package com.ejemplo;

/**
 * Clase Calculadora que realiza operaciones básicas de suma, resta, 
 * multiplicación y división.
 * 
 * @author Julio Martínez jmartinezm45@miumg.edu.gt
 */
public final class Calculadora {
    
    private static final String ERROR_DIVISION_CERO = "No se puede dividir por cero";

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a Minuendo
     * @param b Sustraendo
     * @return La resta de a y b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a Primer factor
     * @param b Segundo factor
     * @return El producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros. Si el divisor es cero, lanza una excepción.
     *
     * @param a Dividendo
     * @param b Divisor (no puede ser 0)
     * @return El resultado de la división a / b
     * @throws IllegalArgumentException si b es 0
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(ERROR_DIVISION_CERO);
        }
        return (double) a / b;
    }
    
    
    /**
    * Calcula el módulo (resto) de la división entre dos números enteros.
    *
    * @param a Dividendo
    * @param b Divisor (no puede ser 0)
    * @return El resto de la división de a entre b
    * @throws IllegalArgumentException si b es 0
    */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular el módulo con divisor cero");
        }
        return a % b;
    }
}
