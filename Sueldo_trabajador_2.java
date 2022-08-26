//19. Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra €40.000 euros
//anuales, el programa debe realizar los cálculos en función de los siguientes criterios:
//a.       Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
//b.       Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
//c.       Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
//d.       Si lleva menos de 3 años se le aplica un aumento del 3%.

import java.util.Scanner;
public class Sueldo_trabajador_2 {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double salario=40000;
        double aumento;
        double años;
        double saltot;



        System.out.println("¿Cuántos años tienes trabando aqui?");
        años=leer.nextDouble();


        if(años < 3){
            aumento=salario*0.03;
            saltot=salario + aumento;
            System.out.println("Tu tienes un aumento por el tiempo que estuviste laborando el cual es de: €" + aumento);
            System.out.println("Tu paga sera de: €" + saltot + " euros");
        }
        else if(años > 3 && años < 5){
            aumento=salario*0.05;
            saltot=salario + aumento;
            System.out.println("Tu tienes un aumento por el tiempo que estuviste laborando el cual es de: €" + aumento);
            System.out.println("Tu paga sera de: €" + saltot + " euros");  
        }
        else if(años > 5 && años < 10){
            aumento=salario*0.07;
            saltot=salario + aumento;
            System.out.println("Tu tienes un aumento por el tiempo que estuviste laborando el cual es de: €" + aumento);
            System.out.println("Tu paga sera de: €" + saltot + " euros");
        }
        else if(años > 10){
            aumento=salario*0.10;
            saltot=salario + aumento;
            System.out.println("Tu tienes un aumento por el tiempo que estuviste laborando el cual es de: €" + aumento);
            System.out.println("Tu paga sera de: €" + saltot + " euros"); 
        }
        
    
}
}