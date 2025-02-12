package mates;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el metodo de Montecarlo. El parámetro `pasos` indica
     * el número de puntos generados.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long dentroDelCirculo = 0;
        for (long i = 0; i < pasos; i++) {
            double x = Math.random(); // Coordenada X aleatoria entre 0 y 1
            double y = Math.random(); // Coordenada Y aleatoria entre 0 y 1
            // Si el punto cae dentro del círculo unitario, se aumenta el contador
            // El uno se refiere a que el radio del círculo es 1
            // El condicional es equivalente a la hipotenusa del triángulo formado por x e y
            if (x * x + y * y <= 1) {
                dentroDelCirculo++;
            }
        }
        // La aproximación de Pi es 4 veces la proporción de puntos dentro del círculo
        return 4.0 * dentroDelCirculo / pasos;
    }
}