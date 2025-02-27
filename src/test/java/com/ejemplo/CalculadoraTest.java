package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Calculadora.
 * Se utilizan pruebas JUnit 5 para validar las operaciones básicas.
 * 
 *  * @author Julio Martínez jmartinezm45@miumg.edu.gt
 */
public class CalculadoraTest {
    
    /**
     * Prueba unitaria para el método sumar().
     * Verifica que la suma de dos números sea correcta.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Calculadora instance = new Calculadora();
        int result = instance.sumar(3, 2);
        assertEquals(5, result, "Error en la suma");
    }

    /**
     * Prueba unitaria para el método restar().
     * Verifica que la resta de dos números sea correcta.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Calculadora instance = new Calculadora();
        int result = instance.restar(5, 3);
        assertEquals(2, result, "Error en la resta");
    }

    /**
     * Prueba unitaria para el método multiplicar().
     * Verifica que la multiplicación de dos números sea correcta.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Calculadora instance = new Calculadora();
        int result = instance.multiplicar(4, 3);
        assertEquals(12, result, "Error en la multiplicación");
    }

    /**
     * Prueba unitaria para el método dividir().
     * Verifica que la división de dos números sea correcta.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Calculadora instance = new Calculadora();
        double result = instance.dividir(10, 2);
        assertEquals(5, result, "Error en la división");
    }

    /**
     * Prueba unitaria para validar que la división entre cero lanza una excepción.
     * Se espera que se genere una IllegalArgumentException con el mensaje adecuado.
     */
    @Test
    public void testDividirPorCero() {
        System.out.println("dividir por cero");
        Calculadora instance = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.dividir(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage(), "La excepción esperada no fue lanzada correctamente.");
    }
    
    /**
 * Prueba unitaria para el método modulo().
 * Verifica que el cálculo del módulo sea correcto.
 */
@Test
public void testModulo() {
    System.out.println("modulo");
    Calculadora instance = new Calculadora();
    int result = instance.modulo(10, 3);
    assertEquals(1, result, "Error en el cálculo del módulo");
}

/**
 * Prueba unitaria para validar que el módulo con divisor cero lanza una excepción.
 */
@Test
public void testModuloPorCero() {
    System.out.println("modulo por cero");
    Calculadora instance = new Calculadora();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        instance.modulo(10, 0);
    });
    assertEquals("No se puede calcular el módulo con divisor cero", exception.getMessage(), 
                 "La excepción esperada no fue lanzada correctamente.");
}

}
