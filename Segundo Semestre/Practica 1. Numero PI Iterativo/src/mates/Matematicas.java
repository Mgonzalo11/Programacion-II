package mates;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el metodo de Montecarlo. El parámetro `pasos` indica
     * el número de puntos generados.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        int dentroDelCirculo = 0;
        for (int i = 0; i < pasos; i++) {
            double x = Math.random(); // Coordenada X aleatoria entre 0 y 1
            double y = Math.random(); // Coordenada Y aleatoria entre 0 y 1

            // Si el punto cae dentro del círculo unitario, se aumenta el contador
            if (x * x + y * y <= 1) {
                dentroDelCirculo++;
            }
        }
        // La aproximación de Pi es 4 veces la proporción de puntos dentro del círculo
        return 4.0 * dentroDelCirculo / pasos;
    }
}