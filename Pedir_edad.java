//3. Pide al usuario que ingrese su edad y mostrarás un mensaje correspondiente si esta coincide con las
//siguientes condiciones:

//Más de 30 años: Nunca es tarde para aprender ¿Qué curso tomaremos?
//Entre 29 y 18 años: Es un momento excelente para impulsar tu carrera.
//Menos de 18 años: ¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte.

import java.util.Scanner;
public class Pedir_edad {

    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int edad;

        System.out.println("Dame tu edad");
        edad=leer.nextInt();

        if(edad>=30){
            System.out.println("Nunca es tarde para aprender ¿Qué curso tomaremos?");
        }
        else if(edad>=18 && edad<=29){
            System.out.println("Es un momento excelente para impulsar tu carrera."); 
        }
        else if(edad<18){
            System.out.println("¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte."); 
        }
        
        
    
}
}
