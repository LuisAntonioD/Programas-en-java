//4. En un cierto país el impuesto que se debe pagar por los artículos se calcula
//mediante la siguiente regla: los primeros $20 no causan impuesto, los siguientes
//$20 tienen el 30% de impuesto y el resto el 40% de impuesto, pero si el costo del
//producto es mayor a $500, entonces en lugar del 40% se cobra el 50%. Diseñe un
//algoritmo que lea el costo básico de un artículo y calcule su precio total.

import java.util.Scanner;
public class Impuesto_producto {
public static void main(String args[]){
Scanner leer=new Scanner(System.in);

      double costo;
      double impuesto;
      double total;

      System.out.println("Dime cual es el costo de tu articulo");
      costo=leer.nextDouble();

      if(costo <= 20){
        System.out.println("Tu producto no tiene impuesto disfruta de el...");  
      }
      else if(costo <= 40){
          impuesto=costo*.30;
          total=costo + impuesto;
          System.out.println("Tu producto tendra el %30 de impuesto...");
          System.out.println("Tu producto despues de impuestos costara $" + total); 
      }
      else if( costo<=500){
        impuesto=costo*.40;
        total=costo + impuesto;
        System.out.println("Tu producto tendra el %40 de impuesto...");
        System.out.println("Tu producto despues de impuestos costara $" + total); 
      }
      else if(costo > 500){
        impuesto=costo*.50;
        total=costo + impuesto;
        System.out.println("Tu producto tendra el %50 de impuesto...");
        System.out.println("Tu producto despues de impuestos costara $" + total); 
      }


 }
}