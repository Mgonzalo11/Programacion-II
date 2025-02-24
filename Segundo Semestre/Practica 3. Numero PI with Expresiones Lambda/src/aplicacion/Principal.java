package aplicacion;
import mates.Matematicas;

// Metodo principa del programa que genera el numero PI mediante el metodo de Montecarlo y expresiones lambda.
public class Principal{
    public static void main(String[] args){
        System.out.println("El numero PI es " +
                Matematicas.generarNumeroPiWithExpresionesLambda(Integer.parseInt(args[0])));
    }
}
