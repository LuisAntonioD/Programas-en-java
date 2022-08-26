//26. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...

import java.util.Scanner;
public class Nota_numerica {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        String n="";
        int numero;

        System.out.println("Dame una nota numerica de entre 0 y 10");
        numero=leer.nextInt();

        switch(numero){
            case 1:numero=1;
            n="Uno";
                    break;
            case 2:numero=2;
            n="Dos";
                    break;  
            case 3:numero=3;
            n="Tres";
                    break;  
            case 4:numero=4;
            n="Cuatro";
                    break;  
            case 5:numero=5;
            n="Cinco";
                    break;  
            case 6:numero=6;
            n="Seis";
                    break;  
            case 7:numero=7;
            n="Siete";
                    break;  
            case 8:numero=8;
            n="Ocho";
                    break; 
            case 9:numero=9;
            n="Nueve";
                    break;  
            case 10:numero=10;
            n="Diez";
                    break;
            case 0:numero=0;
            n="Cero";
                    break;    
            default:
                System.out.println("Hay un error,ese número no esta dentro del rando pedido :(");            
        }
              System.out.println("La nota numerica es "+ n);
    }
      
}