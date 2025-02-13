public class Factorial {

    // Función recursiva para calcular el factorial de un número
    public static int factorial(int n) {
        // Caso base: si n es 0, el factorial es 1
        if (n == 0) {
            return 1;
        } else {
            // Caso recursivo: el factorial de n es n multiplicado por el factorial de n-1
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}