//6.Que verifique si se cumple la siguiente ecuación.
//2x-10y + 50
//____________   <   250
//23xy

import java.util.Scanner;
public class Ecuación {

    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        
        int x;
        int y;
        double resta;
        double suma;
        double multi;
        double operacion;

        System.out.println("Dame el valor de x");
        x=leer.nextInt();
        System.out.println("Dame el valor de y");
        y=leer.nextInt();

        resta=2*x - 10*y;
        suma=resta + 50;
        multi=23*x*y;
        operacion=suma/multi;


        if(operacion < 250){
            System.out.println("Este es tu resultado: " + operacion + " y si se cumple la ecuación");
        }
        else{
            System.out.println("Este resultado es mayor que 250 por lo cual tu resultado final es: " + operacion + " y NO se cumple la ecuación"); 
        }
    }

}