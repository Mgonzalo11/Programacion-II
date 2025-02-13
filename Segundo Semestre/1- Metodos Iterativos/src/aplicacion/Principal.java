package aplicacion;

import dominio.Mates;

/**
 * Ejercicio 4. Métodos iterativos, del cuaderno de ejercicios de clase.
 * Se entrega en un único repositorio git, con una sola clase de dominio, mates, y una clase principal que invoque a
 * todos los métodos estáticos de la clase para hacer una prueba.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("1. La suma 0+1+2+...+n es: " + Mates.suma(10));
        System.out.println("2. El factorial de un número es: " + Mates.factorial(5));
        System.out.println("3. La potencia n-ésima de un número es: " + Mates.potencia(2, 3));
        System.out.println("4. La suma de los elementos de una lista es: " + Mates.sumaLista(new int[]{1, 2, 3, 4}));
        System.out.println("5. La media aritmética es: " + Mates.media(new int[]{1, 2, 3, 4}));
        System.out.println("6. La desviación típica es: " + Mates.desviacion(new int[]{1, 2, 3, 4}));
        System.out.println("7. La suma de los primeros números pares hasta n es: " + Mates.sumaPares(9));
        System.out.println("8. La suma de los elementos pares de una lista es: " + Mates.sumaParesLista(new int[]{1, 2, 3, 4}));
        System.out.println("9. Lista con los números pares: " + Mates.obtenerListaPar(new int[]{1, 2, 6, 11}));
        System.out.println("10. Lista de primeros números pares hasta n: " + Mates.listaPares(9));
        System.out.println("11. Producto escalar de dos listas: " + Mates.calcularProductoEscalar(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println("12. Elemento n-ésimo de Fibonacci: " + Mates.fibonacci(10));
    }
}
