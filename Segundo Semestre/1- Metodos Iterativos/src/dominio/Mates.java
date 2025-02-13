package dominio;

import java.util.ArrayList;
import java.util.List;

public class Mates {
    // 1. Calcula la suma de los primeros n números naturales.
    public static int suma(int n) {
        int suma = 0;
        // Se recorre desde 0 hasta n y se van sumando los valores.
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // 2. Calcula el factorial de un número n.
    public static int factorial(int n) {
        int factorial = 1;
        // Se multiplica cada número desde 1 hasta n acumulativamente.
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 3. Calcula la potencia n-ésima de un número.
    public static int potencia(int num, int n) {
        int potencia = 1;
        // Se multiplica el número por sí mismo n veces.
        for (int i = 1; i <= n; i++) {
            potencia *= num;
        }
        return potencia;
    }

    // 4. Calcula la suma de los elementos de una lista de números.
    public static int sumaLista(int[] lista) {
        int suma = 0;
        // Se recorre la lista sumando cada elemento.
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    // 5. Calcula la media aritmética de una lista de números.
    public static int media(int[] lista) {
        // Se divide la suma de los elementos entre el número de elementos.
        return sumaLista(lista) / lista.length;
    }

    // 6. Calcula la desviación típica de una lista de números.
    public static double desviacion(int[] lista) {
        double media = media(lista);
        double sum = 0;
        // Se calcula la suma de los cuadrados de las diferencias con la media.
        for (int num : lista) {
            sum += Math.pow(num - media, 2);
        }
        // Se obtiene la raíz cuadrada del promedio de las diferencias.
        return Math.sqrt(sum / lista.length);
    }

    // 7. Calcula la suma de los primeros números pares hasta n.
    public static int sumaPares(int n) {
        int suma = 0;
        // Se recorre desde 2 hasta n sumando solo los pares.
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // 8. Calcula la suma de los elementos pares de una lista de números.
    public static int sumaParesLista(int[] lista) {
        int suma = 0;
        // Se recorren los elementos y se suman solo los pares.
        for (int num : lista) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        return suma;
    }

    // 9. Devuelve una lista con solo los números pares de la lista original.
    public static List<Integer> obtenerListaPar(int[] numeros) {
        List<Integer> listaPares = new ArrayList<>();
        // Se recorren los números y se añaden a la nueva lista solo si son pares.
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }
        return listaPares;
    }

    // 10. Devuelve una lista con los primeros números pares hasta n en orden descendente.
    public static List<Integer> listaPares(int n) {
        List<Integer> lista = new ArrayList<>();
        // Se recorre desde n hasta 2 agregando solo los pares.
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        return lista;
    }

    // 11. Calcula el producto escalar de dos listas de números del mismo tamaño.
    public static int calcularProductoEscalar(int[] lista1, int[] lista2) {
        int productoEscalar = 0;
        // Se multiplican los elementos en la misma posición y se suman los resultados.
        for (int i = 0; i < lista1.length; i++) {
            productoEscalar += lista1[i] * lista2[i];
        }
        return productoEscalar;
    }

    // 12. Calcula el elemento n-ésimo de la sucesión de Fibonacci.
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        // Se suman iterativamente los dos últimos valores para obtener el siguiente.
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
