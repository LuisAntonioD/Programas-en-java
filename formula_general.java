//4.Calcula x1 y x2 de la fórmula general.

import java.util.Scanner;
public class formula_general {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        double x1=0;
        double x2=0;
        double o=0;

        System.out.println("Dame el primer valor");
        a=leer.nextInt();
        System.out.println("Dame el segundo valor");
        b=leer.nextInt();
        System.out.println("Dame el tercer valor");
        c=leer.nextInt();

        o=Math.pow(b, 2) - 4 * a * c;
        if(o>0){
            x1 = (-b  + Math.sqrt(o)) / (2*a);
            x2 = (-b  - Math.sqrt(o)) / (2*a);

            System.out.println("El resultado de x1 es:   " + x1);
            System.out.println("El resultado de x2 es:   " + x2);
        }
            else{
            System.out.println("Error esta operacón no se puede hacer");
                
            }

        
       
        
    }
}