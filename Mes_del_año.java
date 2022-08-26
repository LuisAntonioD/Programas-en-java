//2. Que pida un número del 1 al 12 y diga el nombre del mes correspondiente.

import java.util.Scanner;
public class Mes_del_año {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int mes;

        System.out.println("Dame un número del 1 al 12 y te dire que mes es.");
        mes=leer.nextInt();


        if(mes == 1){
                System.out.println("Ese mes es  enero");
        }
        else if(mes == 2){
                System.out.println("Ese mes es  febrero"); 
        }
        else if(mes == 3){
                System.out.println("Ese mes es  marzo"); 
        }
        else if(mes == 4){
                System.out.println("Ese mes es  abril"); 
        }
        else if(mes == 5){
                System.out.println("Ese mes es  mayo"); 
        }
        else if(mes == 6){
                System.out.println("Ese mes es  junio"); 
        }
        else if(mes == 7){
                System.out.println("Ese mes es  julio"); 
        }
        else if(mes == 8){
                System.out.println("Ese mes es  agosto"); 
        }
        else if(mes == 9){
                System.out.println("Ese mes es  septiembre"); 
        }
        else if(mes == 10){
                System.out.println("Ese mes es  octubre"); 
        }
        else if(mes == 11){
                System.out.println("Ese mes es  noviembre"); 
        }
        else if(mes == 12){
                System.out.println("Ese mes es  diciembre"); 
        }
        else{
                System.out.println("Hay un error,ese número no esta dentro del rando pedido :("); 
        }
    }
      
}
