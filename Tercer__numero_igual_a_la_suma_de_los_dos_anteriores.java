//15. Que pida tres números e indicar si el tercero es igual a la suma del primero y el segundo.

import java.util.Scanner;
public class Tercer__numero_igual_a_la_suma_de_los_dos_anteriores {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int uno;
        int dos;
        int tres;
        int suma;

        System.out.println("Dime el primer número");
        uno=leer.nextInt();
        System.out.println("Dime el segundo número");
        dos=leer.nextInt();
        System.out.println("Dime el tercer número");
        tres=leer.nextInt();


        suma = uno + dos;

        if(tres == suma){
          System.out.println("La suma del número uno mas el numero dos es " + suma); 
          System.out.println("Por lo tanto es la misma cantidad");
        }
        else{
          System.out.println("La suma del número uno mas el numero dos es " + suma);
          System.out.println("Por lo tanto es una cantidad diferente a " + tres); 
        }

        
}


  }