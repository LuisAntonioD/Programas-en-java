//2. El costo de las llamadas telefónicas internacionales depende de la zona geográfica
//en la que se encuentre el país destino y del número de minutos hablados. En la
//siguiente tabla se presenta el costo del minuto por zona. A cada zona se le ha
//asociado una clave. Construya un algoritmo que le permita calcular e imprimir el
//costo total de una llamada.

import java.util.Scanner;
public class Costo_de_una_llamada {
public static void main(String args[]){
Scanner leer=new Scanner(System.in);

        int clave;
        double minuto;
        double precio=0;

        System.out.println("Dame la clave de tu zona");
        clave=leer.nextInt();
        System.out.println("Dime cuantos minutos estaras en llamada");
        minuto=leer.nextDouble();
        switch(clave){
            case 12: 
            precio=minuto * 2;
                    break;
            case 15: ;
            precio=minuto * 2.2;
                    break;  
            case 18: 
            precio=minuto * 4.5;
                    break;  
            case 19: 
            precio=minuto * 3.5;
                    break;  
            case 23: 
            precio=minuto * 6;
                    break;  
            case 25: 
            precio=minuto * 6;
                    break;  
            case 29: 
            precio=minuto * 5;
                    break;  
            default:
                System.out.println("Error, clave no valida");             
        }
        System.out.println("Este sera el costo de tu llamada  " + precio);


}
}