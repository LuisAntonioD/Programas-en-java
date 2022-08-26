

import java.util.Scanner;
public class Potencia_de_un_número {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int numero1;
        int numero2;
        int potencia=1;
        int numeros=1;

        System.out.println("Ingrese el primer numero ");
        numero1=leer.nextInt();
        System.out.println("Ingrese el segundo numero ");
        numero2=leer.nextInt();
         while(numeros<=numero2){
           potencia=potencia*numero1;
           numeros=numeros+1;
           
         }
         System.out.println("La potencia es :" + numero1 + "^" + numero2 + "=" + potencia);
    }
}