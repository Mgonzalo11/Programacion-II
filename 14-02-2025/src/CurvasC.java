/* package curvasc;
import acm.graphics.GTurtle;
public class CurvasC extends GTurtle {
    void C(int n){
        if (n==0)
            forward(40);
        else{
            C(n-1);
            right(90);
            C(n-1);
            left(90);
        }}
    public void run() {
        setSize(20); // Establecer el tamaño (en píxeles) de la tortuga.
        penDown(); // Bajar la pluma de la tortuga para que deje un rastro al
        desplazarse.
                C(5); //Dibuja la curva C
    }
    public static void main(String[] args) {
        new CurvasC().start(); //start ejecuta el metodo run de la clase GTurtle
    }}
*/