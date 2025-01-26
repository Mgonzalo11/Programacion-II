public class Fibonacci {

    // Calcula el n-ésimo término de la serie de Fibonacci de forma recursiva.
    public static int fibonacciRecursivo(int n) {
        // Caso base: si n es menor o igual a 1, el valor es n mismo
        if (n <= 1) {
            return n;
        } else {
            // Caso recursivo: la suma de los dos términos anteriores
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    // Calcula el n-ésimo término de la serie de Fibonacci de forma iterativa.
    public static int fibonacciIterativo(int n) {
        int f = 0, sig = 1;
        for (int i = 1; i <= n; i++) {
            sig = sig+f;
            f = sig-f;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 10; // Puedes cambiar este valor para calcular otros términos

        // Llamada a la función recursiva
        int resultadoRecursivo = fibonacciRecursivo(n);
        System.out.println("Fibonacci recursivo de " + n + ": " + resultadoRecursivo);

        // Llamada a la función iterativa
        int resultadoIterativo = fibonacciIterativo(n);
        System.out.println("Fibonacci iterativo de " + n + ": " + resultadoIterativo);
    }
}