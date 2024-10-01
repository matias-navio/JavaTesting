package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    public void testRevertChain(){

        // Given

    }
}
