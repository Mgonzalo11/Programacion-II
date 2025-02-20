package aplicacion;
import dominio.Mates;

public class Principal {
    public static void main(String[] args) {
        // Comprobantes de los ejercicios de la clase Mates
        System.out.println("Ejercicio 1: La suma de los primeros 5 números naturales es: " + Mates.sumaRecursiva(5)); // Resultado esperado: 15
        System.out.println("Ejercicio 2: El factorial de 5 es: " + Mates.factorialRecursivo(5)); // Resultado esperado: 120
        System.out.println("Ejercicio 3: La potencia de 2 elevado a 5 es: " + Mates.potenciaRecursiva(2, 5)); // Resultado esperado: 32
        int[] lista = {1, 2, 3, 4, 5};
        System.out.println("Ejercicio 4: La suma de los elementos de la lista {1, 2, 3, 4, 5} es: " + Mates.sumaListaRecursiva(lista, lista.length)); // Resultado esperado: 15
        System.out.println("Ejercicio 5: La media aritmética de los elementos de la lista {1, 2, 3, 4, 5} es: " + Mates.mediaListaRecursiva(lista, lista.length)); // Resultado esperado: 3.0
        System.out.println("Ejercicio 6: La desviación típica de los elementos de la lista {1, 2, 3, 4, 5} es: " + Mates.desviacionTipicaListaRecursiva(lista, lista.length)); // Resultado esperado: 1.4142135623730951
        System.out.println("Ejercicio 7: La suma de los primeros números pares hasta 9 es: " + Mates.sumaPares(9)); // Resultado esperado: 20
        System.out.println("Ejercicio 8: La suma de los primeros números pares de una lista de números es: " + Mates.sumaParesLista(lista, lista.length)); // Resultado esperado: 6

    }
}
