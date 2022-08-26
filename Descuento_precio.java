//8. En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $1000  ¿Cuál
//será la cantidad que pagará una persona por su compra?

import java.util.Scanner;
public class Descuento_precio {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        
        double precio;
        double descuento;
        double total;

        System.out.println("Hola,dime cuanto es lo que vas a pagar y vere si te puedo hacer un descuento por tu compra");
        precio=leer.nextDouble();

        if(precio > 1000){
            descuento=precio*.20;
            total=precio-descuento;
            System.out.println("Tengo una buena noticia!... ");
            System.out.println("Te haremos un descuento de 20% a tu compra! "); 
            System.out.println("Entonces el total a pagar por tu compra sera: " + total);
        }
        else{
            System.out.println("Lo sentimos,no alcanzaste el minimo de compra requerido para un descuento :("); 
        }

    }
    
}