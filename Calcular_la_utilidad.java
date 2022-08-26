//18. Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si este se le asigna
//como un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
//con la siguiente tabla:
//      Tiempo                                     Utilidad

//Menos de 1 año.                               5% del salario
//1 año o más y menos de 2 años.                7% del salario
//2 años o más y menos de 5 años.               10% del salario
//5 años o más y menos de 10 años.              15% del salario
//10 años o más.                                20% del salario

import java.util.Scanner;
public class Calcular_la_utilidad {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double salario;
        double utilidad;
        double años;


        System.out.println("¿Cuánto te pagan?");
        salario=leer.nextDouble();
        System.out.println("¿Cuántos años tienes trabando aqui?");
        años=leer.nextDouble();


        if(años < 1){
            utilidad=salario*0.05;
            System.out.println("Tu utlidad por el tiempo que estuviste laborando es: $" + utilidad);
        }
        else if(años >= 1 && años < 2){
            utilidad=salario*0.07;
            System.out.println("Tu utlidad por el tiempo que estuviste laborando es: $" + utilidad);  
        }
        else if(años >= 2 && años < 5){
            utilidad=salario*0.10;
            System.out.println("Tu utlidad por el tiempo que estuviste laborando es: $" + utilidad);
        }
        else if(años >= 5 && años < 10){
            utilidad=salario*0.15;
            System.out.println("Tu utlidad por el tiempo que estuviste laborando es: $" + utilidad);
        }
        else if(años >= 10){
            utilidad=salario*0.20;
            System.out.println("Tu utlidad por el tiempo que estuviste laborando es: $" + utilidad); 
        }
        
    
}
}
