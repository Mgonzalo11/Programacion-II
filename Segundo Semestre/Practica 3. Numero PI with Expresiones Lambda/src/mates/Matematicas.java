package mates;
import java.util.stream.IntStream;
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
public class Matematicas {
    static final int r = 1;
    public static double generarNumeroPiIterativo(long pasos) {
        // Generamos y evaluamos puntos dentro del cuadrado de lado 2*r
        long dentro = IntStream.range(0, (int) pasos)
                .filter(i -> {
                    double x = Math.random() * 2 * r - r;
                    double y = Math.random() * 2 * r - r;
                    return x * x + y * y <= r * r;
                })
                .count();

        return 4.0 * dentro / pasos;
    }
}
