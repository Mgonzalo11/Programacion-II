// 12. Explique qué es una expresión Lambda.
// Es una forma de escribir funciones anónimas en Java. Se utilizan para escribir funciones de una forma más concisa y clara.
// Las expresiones Lambda se introdujeron en Java 8. Se utilizan para escribir funciones de una forma más concisa y clara.
// Se utilizan para escribir funciones de una forma más concisa y clara.
package aplicacion;

import dominio.Mates;
import java.util.function.Function;

public class Principal {
    public static void main(String[] args) {
        // Ejercicio 13
        // Uso de la integral con una función lambda que calcula el cuadrado de un número
        Function<Double, Double> funcion = x -> x * x;
        double resultado = Mates.integral(0, 1, 0.01, funcion);
        System.out.println("El resultado de la integral es: " + resultado);
        // Ejercicio 14
        // Mostrar streams de diferentes métodos
        System.out.println("Stream usando IntStream.of:");
        Mates.mostrarStreamOf();
        System.out.println("Stream usando IntStream.range:");
        Mates.mostrarStreamRange();
        System.out.println("Stream usando IntStream.iterate:");
        Mates.mostrarStreamIterate();
        System.out.println("Stream usando Random.doubles:");
        Mates.mostrarStreamDoubles();
        // Ejercicio 16
        // Calcular el ejercicio 13 utilizando tanto expresiones lambda como steams
        System.out.println("El resultado de la integral es: " + Mates.integral(0, 1, 0.01, x -> x * x));
    }

}
