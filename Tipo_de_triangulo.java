//28. Pida tres números enteros que corresponden a los lados de un triángulo, determine si el triángulo es
//equilátero, isosceles o escaleno.

import java.util.Scanner;
public class Tipo_de_triangulo {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Dame las medidas de tres lados de un triangulo y te dire que tipo es");
        System.out.println("Dame la primer medida");
        num1=leer.nextInt();
        System.out.println("Dame la segunda medida");
        num2=leer.nextInt();
        System.out.println("Dame la tercer medida");
        num3=leer.nextInt();


       if(num1 == num2 && num1 == num3){
        System.out.println("Este es un triangulo equilatero");
       }
       else if(num1 == num2 && num1 != num3){
        System.out.println("Este es un triangulo isóceles");
       }
       else{
        System.out.println("Este es un triangulo escaleno");
       }
    }
      
}