//13. Calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado
//en el que se encuentra esa persona en función del valor de IMC:

import java.util.Scanner;
public class Calcular_IMC {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double peso;
        double altura;
        double IMC;


        System.out.println("¿Cuánto pesas?");
        peso=leer.nextDouble();
        System.out.println("¿Cuánto mides?");
        altura=leer.nextDouble();

        IMC=peso/(altura*altura);

        if(IMC < 16){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y estas en criterio de ingreso en hospital");
        }
        else if(IMC <= 16 || IMC <= 17){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes infrapeso");  
        }
        else if(IMC <= 17 || IMC <= 18){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes Bajo peso");
        }
        else if(IMC <= 18 || IMC <= 25){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes peso normal (saludable)");
        }
        else if(IMC <= 25 || IMC <= 30){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes sobrepeso (obesidad grado I)");
        }
        else if(IMC <= 30 || IMC <= 35){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes sobrepeso crónico (obesidad grado II)");
        }
        else if(IMC <= 35 || IMC <= 40){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes obesidad premórbida (obesidad grado III)");
        }
        else if(IMC > 40){
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Y tienes obesidad mórbida (obesidad grado IV)"); 
        }
        
    
}
}