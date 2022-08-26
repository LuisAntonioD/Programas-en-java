//1. Dado un número entero A, haga un algoritmo para determinar si el mismo es par,
//impar o nulo.

import java.util.Scanner;
public class Numero_par_o_impar {
public static void main(String args[]){
Scanner leer=new Scanner(System.in);

    int num;
    
    System.out.println("Dame un número");
    num=leer.nextInt();



    if (num == 0){
    System.out.println("Este número es nulo");
    }
    else if (num  % 2 == 0){
        System.out.println("Este número es par");
        }
    else{
        System.out.println("Este número es impar");
    }
    
}
}