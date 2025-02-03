package mates;
/**
 * Genera una aproximación al número Pi mediante el metodo de Montecarlo de forma recursiva.
 * El parámetro `pasos` indica el número de puntos generados.
 */
public class Matematicas {

    // Radio del círculo
    static double r = 1;
    // Contador de puntos dentro del círculo
    static int dentro = 0;
    public static double generarNumeroPiRecursivo(long pasos) {
        // Caso base: si no quedan más pasos, retornar 0
        if (pasos <= 0) {
            return 0;
        } else {
            // Generar coordenadas aleatorias dentro del cuadrado de lado 2r (de -r a r)
            double x = -r + Math.random() * (2 * r);
            double y = -r + Math.random() * (2 * r);
            // Comprobar si el punto (x, y) está dentro del círculo de radio r
            double comprobacion = x * x + y * y;
            if (comprobacion <= r * r) {
                dentro++; // Incrementar el contador si está dentro del círculo
            }
            // Llamada recursiva con un paso menos
            generarNumeroPiRecursivo(--pasos);
        }
        // Cálculo final de Pi utilizando la proporción de puntos dentro del círculo respecto al total
        double pi = 4.0 * dentro / pasos;
        return pi;
    }
}
