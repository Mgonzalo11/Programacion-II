package dominio;
/* Ejercicios Teóricos
EJERCICIO 1 - Explique qué es un metodo recursivo y cómo funciona
Un metodo recursivo es un metodo que se llama a sí mismo para resolver un problema de forma iterativa.
Existen dos partes en un metodo recursivo: el caso base y el caso recursivo.
El caso base es la condición que detiene la recursión, y el caso recursivo es la llamada al metodo dentro de sí mismo.
Hay dos formas de implementar un metodo recursivo: guardando en memoria y sin guardar en memoria.
En el caso de guardar en memoria, se almacena el resultado de cada llamada recursiva en una variable, y se retorna al final.
En el caso de no guardar en memoria, se retorna el resultado de la llamada recursiva directamente.

EJERCICIO 3- ¿En que consiste el problema de las Torres de Hanoi? ¿Cómo se resuelve de forma recursiva?
El problema de las Torres de Hanoi consiste en mover una torre de discos de un palo a otro, utilizando un palo auxiliar, de forma que nunca se coloque un disco más grande
sobre uno más pequeño. Se resuelve de forma recursiva moviendo n-1 discos al palo auxiliar, moviendo el disco n al palo destino y moviendo los n-1 discos del palo auxiliar al
palo destino.
Para resolver el problema de las Torres de Hanoi de forma recursiva, se puede utilizar la siguiente función:
public static void torresDeHanoi(int n, char origen, char destino, char auxiliar){
    if (n == 1){
        System.out.println("Mover disco 1 de " + origen + " a " + destino);
    } else {
        torresDeHanoi(n-1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        torresDeHanoi(n-1, auxiliar, destino, origen);
    }
}
EJERCICIO 5 - ¿Por qué la ejecución de un metodo recursivo puede levantar una excepción de desbordamiento de pila con la misma entrada que la versión no recursiva no provoca tal 	excepción?
Porque en la versión recursiva se guardan en memoria las llamadas a la función recursiva, mientras que en la versión no recursiva no se guardan en memoria las llamadas a 	la función recursiva. Lo que provoca que en la versión recursiva se consuma más memoria y se pueda llegar a desbordar la pila.
*/

// EJERCICIO 2 - Escribe los siguientes metodos de forma recursiva

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

    // EJERCICIO 4 Escriba un metodo recursivo con la siguiente cabecera:
    // double integralEXCuadrado(double limInf, double limSup, double h) para que calcule la integral de ex2 mediante el metodo de los rectángulos. Es
    // decir, sup suma = x=inf ex2h donde inf, el límite inferior, se corresponde con limInf en la cabecera del predicado; sup, el límite superior, se corresponde con limSup; h es el paso; y
    // suma, el resultado de la integral definida, se corresponde con valor devuelto por el metodo.
    // Por ejemplo, si se desea calcular 1 0 ex2 dx con h = 0,1, se realizará la
    // siguiente invocación: Matematicas.integralEXCuadrado(0, 1, 0.1); donde 0 es el límite inferior; 1, el límite superior; y 0,1 el paso, por tanto: Formula:
    public static double integralEXCuadrado(double limInf, double limSup, double h){
        return auxiliarIntegralEXCuadrado(limInf,limSup,h,0);
    }
    private static double auxiliarIntegralEXCuadrado(double limInf,double limSup,double h,double resul){
        if(limInf >= limSup){
            return resul;
        }
        resul += Math.exp(Math.pow(limInf,2)) * h;
        return auxiliarIntegralEXCuadrado(limInf + h,limSup,h,resul);
    }
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
