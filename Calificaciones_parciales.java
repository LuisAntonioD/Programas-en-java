//5. Que pida un calificación e indique si tiene NA, SA, DE o AU. NA si la calificación es menor de 8. SA si
//es desde 8 hasta 8.9. DE si es desde 9-9.9 y AU si es 10.

import java.util.Scanner;
public class Calificaciones_parciales {

    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double Calificacion=0;

        System.out.println("Dame tu calificación de este parcial");
        Calificacion=leer.nextDouble();

        if(Calificacion < 8){
            System.out.println("Tu calificacion este parcial es: " + "NA");
        }else if(Calificacion >= 8 && Calificacion <= 8.9){
            System.out.println("Tu calificaion este parcial es: " + "SA"); 
        }
        else if(Calificacion >= 9 && Calificacion <= 9.9){
            System.out.println("Tu calificacion este parcial es: " + "DE"); 
        }
        else if(Calificacion == 10){
            System.out.println("Tu calificacion este parcial es: " + "AU"); 
        }
    }
}

