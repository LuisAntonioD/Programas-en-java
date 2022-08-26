//5.Construya un algoritmo que dado como dato un número entero, determine e imprima
//si el mismo es positivo, negativo o nulo.

import java.util.Scanner;
public class numentero {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int numero;

        System.out.println("Dame un valor:");
        numero=leer.nextInt();

        if(numero >= 1){
            System.out.println("Este número es positivo:   " + numero);  
        }
        else if(numero <= -1){
            System.out.println("Este número es negativo:   " + numero);
        }
        else if(numero == 0){
            System.out.println("Este numero es nulo:   " + numero);
        }
        
    }
}