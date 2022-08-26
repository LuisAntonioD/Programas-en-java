//3.Construya un algoritmo que dado como datos los valores enteros P y Q, determine si
//los mismos satisfacen la siguiente expresión:
//P^5 + Q^4 - 2*P^2 < 680
import java.util.Scanner;
public class Operacion_con_2_valores {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int P;
        int Q;
        double suma;
        double operacion;

        System.out.println("Ingresa el número uno ");
        P=leer.nextInt();
        System.out.println("Ingresa el número dos ");
        Q=leer.nextInt();

        suma=Math.pow(P, 5)+Math.pow(Q, 4);

        operacion=suma - 2 * Math.pow(P, 2);

        if (operacion<680){
            System.out.println("El resultado es:   " + operacion);
        }
        else {

            System.out.println("Error,la operación proporcionada es mayor que 680");
        }
    }
}

        
    