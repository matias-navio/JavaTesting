package org.example;


// se suele importar asi, para no escribir la clase cada vez que la vamos a usar
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    Example example = new Example();

    @Test
    public void sumarTest(){

        int result = example.sumar(2, 2); // 4

        // el primer parametró es el valor esperado y el segundo valor es el valor actual
        assertEquals(4, result);
    }

    @Test
    public void sumarTestBooleanTrue(){

        int result = example.sumar(10, 10); // 20

        // esto lo que hace es evaluar si un resultado es verdadero
        assertTrue(result < 30);
    }

    @Test
    public void sumarTestBooleanFalse(){

        int result = example.sumar(10, 10); // 20

        // esto lo que hace es evaluar si un resultado es falso
        assertFalse(result > 30);
    }

    @Test
    public void sumarTestNotNull(){

        int result = example.sumar(10, 10); // 20

        // esto lo que hace es evaluar si un valor no es null
        assertNotNull(result);
    }
}
