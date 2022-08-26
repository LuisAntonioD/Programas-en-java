//14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera: Si trabaja 40
//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de
//las primeras 40 horas y $20 por cada hora extra.

import java.util.Scanner;
public class Calcular_salario {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double sal;
        double salsem;
        double tot;
        double horas;
        double hextra;



        System.out.println("¿Cuántas horas trabajaste?");
        horas=leer.nextDouble();
        System.out.println("Cuántas horas extra trabajaste?");
        hextra=leer.nextDouble();


        if(horas > 40){
          sal=horas * 16;
          salsem = hextra * 20;
          tot = sal + salsem;
          System.out.println("Te pagaremos más ya que trabajaste " + hextra + " horas extra"); 
          System.out.println("Entonces el total a pagarte sera de:$" + tot);
        }
        else{
          sal=horas * 16;
          System.out.println("Esta vez no trabaste horas extra pero te pagaremos lo siguiente");
          System.out.println("El total a pagarte sera de:$" + sal); 
        }

        
}


  }
