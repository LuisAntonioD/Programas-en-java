//9. Que lea dos números y los imprima en forma ascendente.

import java.util.Scanner;
public class Mostrar_forma_ascendente {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int num1;
        int num2;


        System.out.println("Ingresa el número uno ");
        num1=leer.nextInt();
        System.out.println("Ingresa el número dos ");
        num2=leer.nextInt();

            if(num1 > num2){
                System.out.println("Los numeros en un orden ascendente son:     " + num2+"---"+ num1); 
            }
            else 
            {
                System.out.println("Los numeros en un orden ascendente son:     " + num1+"---"+ num2); 
            }
           
        }
    }