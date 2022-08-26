//Construya un diagrama de flujo tal que dado como dato la calificación de un alumno en un
//examen, escriba “aprobado” si su calificación es mayor o igual que 8 y “reprobado” en caso contrario.
import java.util.Scanner;
public class Calificación_de_un_alumno {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        float calificacion;

        System.out.println("Dame una calificacón ");
        calificacion=leer.nextFloat();
        if(calificacion>=8){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Reprobado"); 
        }
    }
}
