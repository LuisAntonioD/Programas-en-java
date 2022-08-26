//22. Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y
//muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.

import java.util.Scanner;
public class Cifras_de_un_numero {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int num;

        System.out.println("Dame una cifra");
        num=leer.nextInt();

        
        if(num < 10 && num > 0){
            System.out.println("Este número tiene 1  cifra");
        }
        else if (num < 100 && num > 0){
            System.out.println("Este número tiene 2  cifras");
        }
        else if (num < 1000 && num > 0){
            System.out.println("Este número tiene 3  cifras");  
        }
        else{
            System.out.println("Hay un problema este número es muy grande para leerlo :("); 
        }
    }
}