package mates;
import java.util.stream.IntStream;
    /**
     * * Genera una aproximación al número Pi mediante el metodo de Montecarlo. El parámetro `pasos` indica el número de puntos generado
     */
public class Matematicas {
    static final int r = 1;
    public static double generarNumeroPiWithExpresionesLambda(long pasos) {
        // La sintaxis de expresiones lambda es: (parametros) -> expresion
        // En este caso, el parametro es `i` y la expresion es la condicion  de que el punto (x, y) este dentro del circulo de radio r.
        // La funcion `range` de la clase `IntStream` se encarga de generar un rango de numeros enteros.
        // La funcion `filter` de la clase `IntStream` se encarga de filtrar los elementos que cumplan con la condicion.
        // La funcion `count` de la clase `IntStream` se encarga de contar los elementos que cumplieron con la condicion.
        long dentro = IntStream.range(0, (int) pasos)
                .filter(i -> {
                    double x = Math.random() * 2 * r - r;
                    double y = Math.random() * 2 * r - r;
                    return x * x + y * y <= r * r;
                })
                .count();
        // La formula para calcular el area del circulo es: A 4 * (puntos dentro) / (puntos totales)
        return 4.0 * dentro / pasos;
    }
}
