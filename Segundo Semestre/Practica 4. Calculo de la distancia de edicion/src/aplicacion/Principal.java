package aplicacion;

import palabras.CalculadoraDistancias;

public class Principal{
    public static void main(String[] args){
        System.out.println("La distancia entre las palabras " + args[0] + " y " + args[1] + " es " + 
                            CalculadoraDistancias.calcularDistancia(args[0], args[1]));
    }
}
