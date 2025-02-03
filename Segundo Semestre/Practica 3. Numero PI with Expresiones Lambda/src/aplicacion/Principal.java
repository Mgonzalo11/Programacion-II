package aplicacion;
import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        // Se convierte el string "1000" a un entero para definir el numero de puntos a generar
        System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(Integer.parseInt("10000")));
    }
}
