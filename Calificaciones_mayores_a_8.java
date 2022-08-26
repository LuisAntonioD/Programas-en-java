//Dado como dato la calificación de un alumno en un examen, escriba “aprobado” en caso de que esa
// calificación sea mayor a 8.
import java.util.Scanner;
public class Calificaciones_mayores_a_8 {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        float calificacion;

        System.out.println("Dame una calificacón ");
        calificacion=leer.nextFloat();
        if(calificacion>8){
            System.out.println("aprobado");
        }
    }
}

