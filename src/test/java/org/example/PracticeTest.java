package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class PracticeTest {

    private Practice practice;

    @BeforeEach
    public void init(){

        this.practice = new Practice();
    }

    // test que verifica el boolean
    @Test
    public void testCheckPositive(){

        //Given - teniendo
        int number = 2;

        // When - cuando
        boolean result = practice.checkPositive(number);

        // Then - Entonces
        assertTrue(result);
    }

    // test que verifica en caso de haber una excepcion
    @Test
    public void testCheckPositiveError(){

        //Given
        int number = -3;

        // Then
        // la excepcion que se espera, y la excepcion que larga el bloque de lamda
        assertThrows(IllegalArgumentException.class, () -> {
            practice.checkPositive(number);
        });
    }

    // test que verifica cuantas 'a' tiene una palabra
    @Test
    public void testCountLetter(){

        // Given - teniendo
        String word = "Marciano";

        // When - cuando
        int result = practice.countLetters(word);

        // Then
        assertEquals(2, result);
    }

    // test que verifica si un elemento está en una lsita
    @Test
    public void testContainsElement(){

        // Given
        List<String> names = List.of("Juan", "Franco", "Matias");
        String name = "Matias";

        // When
        boolean result = practice.containsElement(names, name);

        // Then
        assertTrue(result);
    }

    // test que verifica si un elemento es null
    @Test
    public void testRevertChain(){

        // Given
        String element = "cadena"; // anedac

        // When
        String result = practice.revertChain(element);

        // Then
        assertEquals("anedac", result);
    }

    // test que verifica si el factorial de un num es igual a un resultado
    @Test
    public void testFactorial(){

        // Given
        int number = 4; // factorial = 24

        // When
        long result = practice.factorial(number);

        // Then
        assertEquals(24, result);
    }

    // test para validar una excepcion
    @Test
    public void testFactorialError(){

        // Given
        int number = -4;

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            practice.factorial(number);
        });
    }

    // test que verifica si un numero es primo
    @Test
    public void testIsCousin(){

        // Given
        int number = 2; // es primo

        // When
        boolean result = practice.isCousin(number);

        // Then
        assertTrue(result);
    }

    // test que verifica si el argumento es uno o menor a uno
    @Test
    public void testIsCousinLessThanOne(){

        // Given
        int number = 1; // uno o menor a uno

        // When
        boolean result = practice.isCousin(number);

        // Then
        assertFalse(result);
    }

    // test que verifica que un numero mayor a uno sea primo
    @Test
    public void testNotIsCousin(){

        // Given
        int number = 8; // mayor a uno no primo

        // When
        boolean result = practice.isCousin(number);

        // Then
        assertFalse(result);
    }

    // test que verifica un numero primo mayor a 4
    @Test
    public void testIsCousinMoreThanFour(){

        // Given
        int number = 5; // es primo

        // When
        boolean result = practice.isCousin(number);

        // Then
        assertTrue(result);
    }

    // test que verifica un mensaje despues de un retraso
    @Test
    public void testDelayedMessage() throws InterruptedException {

        // When
        String result = practice.delayedMessage();

        // Then
        assertEquals("Listo después de retraso", result);
    }

    // test que verifica la convercion de una lista a String
    @Test
    public void testConvertToString(){

        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // When
        List<String> result = practice.convertToString(numbers);

        // Then
        assertEquals(List.of("1", "2", "3", "4", "5"), result);
    }

    // test que valida la media de una lista llena
    @Test
    public void testCalculateAverage(){

        // Given
        List<Integer> numbers = List.of(10, 4, 2, 6); // media 5.5

        // When
        double result = practice.calculateAverage(numbers);

        // Then
        assertEquals(5.5, result);
    }

    // test que valida la media de una lista vacia
    @Test
    public void testCalculateAverageErrorEmpty(){

        // Given
        List<Integer> number = Collections.emptyList();

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            practice.calculateAverage(number);
        });
    }

    // test que valida la media de una lista null
    @Test
    public void testCalculateAverageErrorNull(){

        // Given
        List<Integer> numbers = null;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            practice.calculateAverage(numbers);
        });
    }

    @Test
    public void testConvertListToString(){

        // Given
        List<String> words = List.of("Hola", "Chau", "Vaso");

        // When
        String result = practice.convertListToString(words);

        // Then
        assertEquals("HOLA,CHAU,VASO", result);
    }

}
