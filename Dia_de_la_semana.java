///1. Que pida un número del 1 al 7 y diga el día de la semana correspondiente.


import java.util.Scanner;
public class Dia_de_la_semana {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int dia;

        System.out.println("Dame un número del 1 al 7 y te dire que dia de la semana es.");
        dia=leer.nextInt();


        if(dia == 1){
                System.out.println("Ese dia es lunes");
        }
        else if(dia == 2){
                System.out.println("Ese dia es martes"); 
        }
        else if(dia == 3){
                System.out.println("Ese dia es miercoles"); 
        }
        else if(dia == 4){
                System.out.println("Ese dia es jueves"); 
        }
        else if(dia == 5){
                System.out.println("Ese dia es viernes"); 
        }
        else if(dia == 6){
                System.out.println("Ese dia es sabado"); 
        }
        else if(dia == 7){
                System.out.println("Ese dia es domingo"); 
        }
        else{
                System.out.println("Hay un error,ese número no esta dentro del rando pedido :("); 
        }
    }
      
}
    


