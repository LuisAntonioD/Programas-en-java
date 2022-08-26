//29. Pide a tu usuario que indique 3 números: un límite superior, un límite inferior y uno de comparación.
//Si el número de comparación se encuentra entre los 2 primeros, comunicarlo en pantalla. En caso
//estar por debajo del límite inferior o por arriba del límite superior, también mostrarlo en pantalla.

import java.util.Scanner;
public class Comparación_de_limites {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Dame tres números");
        System.out.println("Dame el limite superior");
        num1=leer.nextInt();
        System.out.println("Dame el limite inferior");
        num2=leer.nextInt();
        System.out.println("Dame la comparación");
        num3=leer.nextInt();


       if(num3 > num2 && num3 < num1){
        System.out.println("El número de comparación esta en medio del limite superior y el limite inferior");
       }
       else if(num3 > num2 && num3 > num1){
        System.out.println("El número de comparación es el número mayor de los que ingresaste");
       }
       else if(num3 < num2 && num3 < num1){
        System.out.println("El número de comparación es el número menor de los que ingresaste");
       }
       else{
        System.out.println("Este es un triangulo escaleno");
       }
    }
      
}