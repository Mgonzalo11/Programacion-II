public class torres_hanoi {
    // Resuelve el problema de las Torres de Hanoi de forma recursiva.
    static void Hanoi(int discos, char TorreOrigen, char TorreAuxiliar, char TorreDestino) {
        // Caso base: si solo queda un disco, moverlo directamente al destino
        if (discos == 1) {
            System.out.println(TorreOrigen + " -> " + TorreDestino); // Mover disco directamente
        } else {
            // Mover los discos superiores (n-1) a la torre auxiliar
            Hanoi(discos - 1, TorreOrigen, TorreDestino, TorreAuxiliar);

            // Mover el disco más grande a la torre de destino
            System.out.println(TorreOrigen + " -> " + TorreDestino);

            // Mover los discos superiores (n-1) de la torre auxiliar a la torre de destino
            Hanoi(discos - 1, TorreAuxiliar, TorreOrigen, TorreDestino);
        }
    }

    public static void main(String[] args) {
        int numDiscos = 5; // Número de discos a mover
        Hanoi(numDiscos, 'A', 'B', 'C');
    }
}