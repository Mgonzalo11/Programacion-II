package aplicacion;

import mates.Matematicas;
/** El metodo de Montecarlo para calcular π consiste en generar puntos aleatorios dentro de un cuadrado de lado 1
 * y contar cuántos caen dentro de un cuarto de círculo inscrito en él. Como la proporción entre sus áreas es π/4,
 * podemos obtener π multiplicando por 4 la fracción de puntos que quedan dentro del círculo.
 * Cuantos más puntos se usan, más precisa es la aproximación.
*/

public class Principal {
    public static void main(String[] args){
        System.out.println("El número PI es " + //+ Matematicas.generarNumeroPiIterativo(Integer.parseInt("8"))); // De esta manera se puede pasar el número de iteraciones directamente.
        Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0]))); //De esta manera se puede pasar el número de iteraciones por consola
    }
}
