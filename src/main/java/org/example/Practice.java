package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    // metodo que verifica que un numero es positivo
    public boolean checkPositive(int number){

        if(number < 0){
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        return true;
    }

    // metodo que cuenta las letras 'a' de una palabra
    public int countLetters(String word){

        return (int) word.chars()
                .filter(letter -> letter == 'a')
                .count();
    }

    // metodo que verifica si un elemento pertenece a una lista
    public boolean containsElement(List<String> words, String element){

        return words.contains(element);
    }

    // metodo que revierte una cadena
    public String revertChain(String element){

        return new StringBuilder(element).reverse().toString();
    }

    // metodo que calcula el factorial de un numero
    public long factorial(int num){

        if(num < 0){
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }

        long result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }

        return result;
    }

    // 7. Método para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Método que simula un retraso y retorna un mensaje
    public String mensajeConRetraso() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo después de retraso";
    }

    // 9. Método para convertir una lista de enteros a lista de strings
    public List<String> convertirAString(List<Integer> lista) {
        return lista.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    // 10. Método que calcula la media de una lista de enteros
    public double calcularMedia(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        return lista.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    // 11. Método para convertir una lista de enteros a lista de strings
    public String convertirListaAString(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
    }
}
