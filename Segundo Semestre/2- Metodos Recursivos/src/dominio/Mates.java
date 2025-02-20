package dominio;

public class Mates {
    // 1 Calcular la suma de los primeros n numeros naturales de forma recursiva sin guardar en memoria
    public static int sumaRecursiva (int n){
        if (n == 0){ // Caso base donde si n es 0, la suma es 0
            return 0;
        } else {
            return n + sumaRecursiva(n-1); // Caso recursivo donde se suma n con la suma de los n-1 numeros naturales
        }
    }
    // 2 Calcular el factorial de un numero de forma recursiva sin guardar en memoria.
    public static int factorialRecursivo(int n){
        if (n == 0){ // Caso base donde si n es 0, el factorial es 1
            return 1;
        } else {
            return n * factorialRecursivo(n-1); // Caso recursivo donde se multiplica n con el factorial de n-1
        }
    }
    // 3 Calcular la potencia n-ésima de un número de forma recursiva sin guardar en memoria.
    public static int potenciaRecursiva(int base, int exponente){
        if (exponente == 0){ // Caso base donde si el exponente es 0, la potencia es 1
            return 1;
        } else {
            return base * potenciaRecursiva(base, exponente-1); // Caso recursivo donde se multiplica la base con la potencia de la base y el exponente-1
        }
    }
    // 4 Calcular la suma de los elementos de una lista de numeros de forma recursiva sin guardar en memoria.
    public static int sumaListaRecursiva(int[] lista, int n){
        if (n == 0){ // Caso base donde si n es 0, la suma es 0
            return 0;
        } else {
            return lista[n-1] + sumaListaRecursiva(lista, n-1); // Caso recursivo donde se suma el elemento n-1 con la suma de los n-1 elementos de la lista
        }
    }
    // 5 Calcular la media aritmética de una lista de números de forma recursiva sin guardar en memoria.
    public static double mediaListaRecursiva(int[] lista, int n){
        if (n == 0){ // Caso base donde si n es 0, la media es 0
            return 0;
        } else {
            return (lista[n-1] + mediaListaRecursiva(lista, n-1)*(n-1))/n; // Caso recursivo donde se suma el elemento n-1 con la media de los n-1 elementos de la lista
        }
    }
    // 6 Calcular la desviación típica de una lista de números de forma recursiva sin guardar en memoria.
    public static double desviacionTipicaListaRecursiva(int[] lista, int n){
        if (n == 0){ // Caso base donde si n es 0, la desviación típica es 0
            return 0;
        } else {
            return Math.sqrt(Math.pow(lista[n-1] - mediaListaRecursiva(lista, n), 2) + desviacionTipicaListaRecursiva(lista, n-1)*(n-1))/n; // Caso recursivo donde se calcula la raíz cuadrada de la suma de la diferencia al cuadrado del elemento n-1 con la media de los n-1 elementos de la lista
        }
    }
    // 7 Calcular la suma de los primeros numero pares hasta n asumiendo n mayor o igual que 2. Por ejemplo, sumaPares(9) = 8+6+4+2 = 20
    public static int sumaPares(int n){
        if (n == 2){ // Caso base donde si n es 2, la suma es 2
            return 2;
        } else {
            return n + sumaPares(n-2); // Caso recursivo donde se suma n con la suma de los n-2 numeros pares
        }
    }
    // 8 Calcular la sma de los elementos pares de una lista. Por ejemplo, sumaParesLista([1,2,3,4,5]) = 2+4 = 6
    public static int sumaParesLista(int[] lista, int n){
        if (n == 0){ // Caso base donde si n es 0, la suma es 0
            return 0;
        } else {
            if (lista[n-1] % 2 == 0){ // Si el elemento n-1 es par
                return lista[n-1] + sumaParesLista(lista, n-1); // Caso recursivo donde se suma el elemento n-1 con la suma de los n-1 elementos pares de la lista
            } else {
                return sumaParesLista(lista, n-1); // Caso recursivo donde se suma la suma de los n-1 elementos pares de la lista
            }
        }
    }
    // 9 Dada una lista de numeros naturales mayores o iguales que 2, obtiene otra lista con los numeros pares de la lista inicial, en el mismo orden y respetando los numeros repetidos. Por ejemplo obtenerListaPar([1,2,6,11]) = [2,6]

    // 10 Calcula la lista de los primeros numeros pares hasta n asumiendo n mayor o igual a dos. Por ejemplo, listaPar(9) = [8,6,4,2].

    // 11 Producto escalar de dos listas de numeros no vacias y del mismo tamaño.
    // Por ejemplo, calcularProductoEscalar([1,2,3],[2,4,6]) = 1·2+2·4+3·6 = 2+8+18=28

    // EJERCICIO 6. Escriba un metodo recursivo que reciba una cadena de caracteres y devuelva la suma de sus códigos. La cabecerá será la siguiente:
    // public static int sumaCodigos(String str)
    public static int sumaCodigos(String str){
        if (str.isEmpty()){ // Caso base donde si la cadena está vacía, la suma es 0
            return 0;
        } else {
            return str.charAt(0) + sumaCodigos(str.substring(1)); // Caso recursivo donde se suma el código ASCII del primer carácter con la suma de los códigos de los caracteres restantes
        }
    }
    // EJERCICIO 7. Escriba un metodo recursivo que reciba una cadena de
    // caracteres y la transforme según el cifrado de César. La cabecerá será la que se muestra a continuación:
    // public static String cifrarCadena(String str, int desplazamiento) 7
    public static String cifrarCadena(String str, int desplazamiento){
        if (str.isEmpty()){ // Caso base donde si la cadena está vacía, se devuelve la cadena vacía
            return "";
        } else {
            return (char) (str.charAt(0) + desplazamiento) + cifrarCadena(str.substring(1), desplazamiento); // Caso recursivo donde se cifra el primer carácter con el desplazamiento y se concatena con la cadena cifrada de los caracteres restantes
        }
    }

}
