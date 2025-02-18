package dominio;

public class Mates {
    // 1 Calcular la suma de los primeros n numeros naturales de forma recursiva sin guardar en memoria
    public static int sumaRecursiva (int n){
        if (n == 0){
            return 0;
        } else {
            return n + sumaRecursiva(n-1);
        }
    }
}
