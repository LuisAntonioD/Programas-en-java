//1.Realiza un algoritmo que introduzca el número de un mes (1 al 12) y visualice el
//número de sus días.
import java.util.Scanner;
public class Dias_en_un_mes {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int Mes;
        int Dias=0;
        //proceso
        System.out.println(ANSI_PURPLE+"Dame el numero de un mes del 1-12 "+ANSI_RESET);
        Mes=leer.nextInt();
        switch(Mes){
            case 1: Dias=30;
            break;
            case 2: Dias=28;
            break;
            case 3: Dias=30;
            break;
            case 4: Dias=30;
            break;
            case 5: Dias=31;
            break;
            case 6: Dias=30;
            break;
            case 7: Dias=31;
            break;
            case 8: Dias=31;
            break;
            case 9: Dias=30;
            break;
            case 10: Dias=31;
            break;
            case 11: Dias=30;
            break;
            case 12: Dias=31;
            break;
            default:
       System.out.println("El número que ingresaste no corresponde a un mes valido,por favor ingresa uno correcto :) ");
       }
       System.out.println("Tu mes  tiene " + Dias + " dias");
    }
}
