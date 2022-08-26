//25. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31
//días. Sin años bisiestos.

import java.util.Scanner;
public class Fecha_correcta {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int dia;
        int mes;
        int año;

        System.out.println("Dame un número que se refiera a un dia");
        dia=leer.nextInt();
        System.out.println("Dame un número que se refiera a un mes del 1-12");
        mes=leer.nextInt();
        System.out.println("Dame un número que se refiera a un año");
        año=leer.nextInt();

        if(dia <= 30 && mes == 4 || dia <= 30 && mes == 6 || dia <= 30 && mes == 9 || dia <= 30 && mes == 11){
            System.out.println("La fecha es correcta");
        }
        else if(dia <= 31 && mes == 1 || dia <= 31 && mes == 3 || dia <= 31 && mes == 5 || dia <= 31 && mes == 7  ||dia <= 31 && mes == 8 || dia <= 31 && mes == 10){
            System.out.println("La fecha es correcta");
        }
        else if(dia <= 31 && mes == 12 || dia <= 28 && mes == 2){
            System.out.println("La fecha es correcta");
        }
        else{
            System.out.println("Fecha incorrecta");
        }
         
        }
      
      }
      