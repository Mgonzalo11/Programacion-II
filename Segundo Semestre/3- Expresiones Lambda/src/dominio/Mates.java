package dominio;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Mates {
    // Ejericio 13
    // Metodo para calcular la integral de una función en un intervalo con paso h
    public static double integral(double a, double b, double h, Function<Double, Double> funcion) {
        double suma = 0;
        for (double x = a; x < b; x += h) {
            suma += funcion.apply(x);
        }
        return suma * h;
    }
    // Ejercicio 14
    // Generar un stream de números con IntStream.of
    public static void mostrarStreamOf() {
        IntStream.of(1, 2, 3, 4, 5).forEach(System.out::println);
    }
    // Generar un stream de números con IntStream.range
    public static void mostrarStreamRange() {
        IntStream.range(1, 6).forEach(System.out::println);
    }
    // Generar un stream de números con IntStream.iterate
    public static void mostrarStreamIterate() {
        IntStream.iterate(1, x -> x + 1).limit(5).forEach(System.out::println);
    }
    // Generar un stream de números aleatorios con Random.doubles
    public static void mostrarStreamDoubles() {
        new Random().doubles().limit(5).forEach(System.out::println);
    }

    // Ejerciico 16
    // Calcular el ejercicio 13 utilizando tanto expresiones lambda como steams
    public static void main(String[] args) {
        // Se crea una funcion que devuelve el cuadrado de un numero
        Function<Double, Double> funcion = x -> x * x;
        // Se calcula la integral de la funcion x^2 en el intervalo [0, 1] con un paso de 0.01
        double resultado2 = integral(0, 1, 0.01, funcion);
        // Se muestra el resultado
        System.out.println("El resultado de la integral es: " + resultado2);
    }
}
