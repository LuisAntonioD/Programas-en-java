//11. En una Granja existen N conejos, N1 blancos y N2 negros. Se venden X negros y Y blancos. Hacer
//un algoritmo que:
//a) Imprima la cantidad de conejos vendida.
//b) Si P1 es el precio de venta de los conejos blancos y P2 es el precio de venta de los conejos negros, imprima el monto total de la venta.
//c) Imprima el color de los conejos que se vendieron mas.

import java.util.Scanner;
public class Conteo_conejos {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int P1;
        int P2;
        int X;
        int Y;
        int totalconejos;
        int ventatot;

        System.out.println("¿Cuántos conejos blancos quieres?");
        X=leer.nextInt();
        System.out.println("¿Cuántos conejos negros quieres?");
        Y=leer.nextInt();
        System.out.println("Dame el costo de los conejos blancos...");
        P1=leer.nextInt();
        System.out.println("Dame el costo de los conejos negros...");
        P2=leer.nextInt();

        totalconejos= X + Y;
        System.out.println("Te voy a vender " + totalconejos + " conejos");
        ventatot= P1 * X + P2 * Y;
        System.out.println("$" + ventatot + " sera el costo por la venta de dichos conejos");


        if(X > Y){
            System.out.println("Los conejos blancos se vendierón mas");
        }
        else{
            System.out.println("Los conejos negros se vendierón mas");  
        }
        }
    }
