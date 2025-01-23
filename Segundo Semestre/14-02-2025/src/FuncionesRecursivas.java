public class FuncionesRecursivas {

    //  Calcula la suma de los números del 0 al n de forma recursiva.
    public static int sumaRecursiva(int n) {
        // Caso base: si n es 0, la suma es 0.
        if (n == 0) {
            return 0;
        } else {
            // Caso recursivo: se suma n al resultado de la llamada recursiva con n-1.
            return n + sumaRecursiva(n - 1);
        }
    }

    // Calcula el factorial de un número de forma recursiva.
        public static int factorial(int n) {
        // Caso base: el factorial de 0 es 1.
        if (n == 0) {
            return 1;
        } else {
            // Caso recursivo: se multiplica n por el factorial de n-1.
            return n * factorial(n - 1);
        }
    }

    // Calcula la potencia de un número de forma recursiva.
    public static int potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a 0 es 1.
        if (exponente == 0) {
            return 1;
        } else {
            // Caso recursivo: se multiplica la base por el resultado de la potencia con exponente-1.
            return base * potencia(base, exponente - 1);
        }
    }

    // Calcula la suma de los elementos de un array de forma recursiva.
    public static int sumaLista(int[] lista, int indice) {
        // Caso base: si llegamos al final del arreglo, la suma es 0.
        if (indice == lista.length) {
            return 0;
        } else {
            // Caso recursivo: se suma el elemento actual al resultado de la llamada recursiva con el siguiente índice.
            return lista[indice] + sumaLista(lista, indice + 1);
        }
    }

    // Calcula la media aritmética de los elementos de un arreglo.
    public static double media(int[] lista) {
        return (double) sumaLista(lista, 0) / lista.length;
    }

    // Calcula la desviación estándar de los elementos de un arreglo.
    public static double desviacionEstandar(int[] lista) {
        double mean = media(lista);
        double sum = 0.0;
        for (int i = 0; i < lista.length; i++) {
            sum += Math.pow(lista[i] - mean, 2);
        }
        return Math.sqrt(sum / (lista.length - 1));
    }

    // Metodo principal para probar las funciones recursivas.
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4};
        System.out.println(sumaRecursiva(5));
        System.out.println(factorial(5));
        System.out.println(potencia(2, 3));
        System.out.println(sumaLista(lista, 0));
        System.out.println(media(lista));
        System.out.println(desviacionEstandar(lista));
    }
}