package mates;
import java.util.Random;

public class Matematicas {
    /**
     * Méeodo que inicia la recursión para calcular una aproximación del número π
     * usando el metodo de Montecarlo.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        Random random = new Random(); // Se crea un objeto Random para generar números aleatorios de forma eficiente.
        return calcularPi(pasos, 0, random); // Se inicia el cálculo recursivo.
    }
    /**
     * Metodo recursivo que estima el valor de π mediante la simulación de Montecarlo.
     *El metodo funciona generando `pasos` puntos aleatorios dentro de un cuadrado de lado 1
     * y verificando cuántos de ellos caen dentro de un cuarto de círculo de radio 1.
     * Como la relación entre el área del círculo y el cuadrado es π/4, podemos estimar π.
     */
    private static double calcularPi(long pasos, long dentro, Random random) {
        // Caso base: cuando no quedan más pasos, se calcula la estimación de π.
        if (pasos == 0) {
            return 4.0 * dentro / (double) (dentro + 1); // Corrección para evitar división por cero.
        }
        // Generamos coordenadas aleatorias (x, y) en el rango [0, 1].
        double x = random.nextDouble();
        double y = random.nextDouble();
        // Verificamos si el punto (x, y) cae dentro del cuarto de círculo de radio 1.
        // Esto se hace usando la ecuación de un círculo: x² + y² ≤ r² (con r = 1).
        if (x * x + y * y <= 1) {
            // Si el punto está dentro del círculo, aumentamos el contador `dentro`.
            return calcularPi(pasos - 1, dentro + 1, random);
        } else {
            // Si el punto está fuera del círculo, continuamos sin aumentar el contador.
            return calcularPi(pasos - 1, dentro, random);
        }
    }
}
