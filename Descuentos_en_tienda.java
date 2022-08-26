//3. En una tienda efectúan un descuento a los clientes dependiendo del monto de la compra. 
//El descuento se efectúa con base en el siguiente criterio: Si el monto es
//menor que $500, no hay descuento. Si el monto está comprendido entre $500 y $1000 inclusive,
//5% de descuento. Si el monto está comprendido entre $1 000 y $7000 inclusive,
//11% de descuento. Si el monto está comprendido entre $7 000 y
//$15 000 inclusive, 18% de descuento. Si el monto es mayor a $15 000, 25% de
//descuento. Construya un algoritmo que dado el monto de la compra de un cliente,
//determine lo que el mismo debe pagar.

import java.util.Scanner;
public class Descuentos_en_tienda {
public static void main(String args[]){
Scanner leer=new Scanner(System.in);

    double monto;
    double descuento;
    double total;

    System.out.println("Dime cual es el monto de tu compra ");
    monto=leer.nextDouble();

    if(monto < 500){
        System.out.println("Lo siento pero esta ves no te podremos hacer un descuento :(");
        System.out.println("Tu monto de compra quedera igual $" + monto);
    }   
    else if (monto>500 && monto<=1000){
            descuento=monto*.05;
            total=monto-descuento;
            System.out.println("Felicidades tienes descuento del 5% :)");
            System.out.println("Tu monto de compra despues del descuento sera $" + total);
    }  
    if(monto>1000 && monto<=7000){
        descuento=monto*.11;
        total=monto-descuento;
        System.out.println("Felicidades tienes descuento del 11% :)"); 
        System.out.println("Tu monto de compra despues del descuento sera $" + total);  
    }
    else if(monto>7000 && monto<=15000){
        descuento=monto*.18;
        total=monto-descuento;
        System.out.println("Felicidades tienes descuento del 18% :)");
        System.out.println("Tu monto de compra despues del descuento sera $" + total);
    }
    if(monto > 25000){
        descuento=monto*.25;
        total=monto-descuento;
        System.out.println("Felicidades tienes descuento del 25% :)"); 
        System.out.println("Tu monto de compra despues del descuento sera $" + total);
    }
     
}  
 }
