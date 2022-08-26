//24. Se dispone de un termómetro para medir con exactitud la temperatura en un determinado lugar. Sin
//embargo, les basta con saber de manera aproximada si la temperatura se ajusta a los rangos
//siguientes:

//Rango de temperatura                 Sensación térmica
//[-10, 10)                              Mucho frío
//[10, 15)                               Poco frío
//[15, 25)                             Temperatura normal
//[25, 30)                               Poco calor
//[30, 45)                               Mucho calor
//Programa que simule el comportamiento del termómetro mediante la generación de una temperatura
//aleatoria en una escala entre el -10 y el 45 y devuelva como resultado un mensaje con la sensación
//térmica correspondiente.

import java.util.Scanner;
public class Termometro {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double temperatura;

        System.out.println("¿Que temperatura tienes en grados?");
        temperatura=leer.nextDouble();

        if(temperatura > -10 && temperatura <= 10){
            System.out.println("Tu tienes mucho frio");
        }
        else if(temperatura > 10 && temperatura <= 15){
            System.out.println("Tu tienes poco frio"); 
        }
        else if(temperatura > 15 && temperatura <= 25){
            System.out.println("Tu tienes temperatura normal");
        }
        else if(temperatura > 25 && temperatura <= 30){
            System.out.println("Tu tienes poco calor");
        }
        else if(temperatura > 30 && temperatura <= 45){
            System.out.println("Tu tienes mucho calor"); 
        }
        
    
}
}