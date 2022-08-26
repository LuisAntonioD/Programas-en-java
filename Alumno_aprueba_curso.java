//7. Determinar si un alumno aprueba a reprueba un curso, sabiendo que aprobara si su promedio de 3
//calificaciones es mayor a 80.

import java.util.Scanner;
public class Alumno_aprueba_curso {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        
        int uno;
        int dos;
        int tres;
        int suma;
        double calificacion;

        System.out.println("Dame tu primer calificaión");
        uno=leer.nextInt();
        System.out.println("Dame tu segunda calificaión");
        dos=leer.nextInt();
        System.out.println("Dame tu tercera calificaión");
        tres=leer.nextInt();

        suma=uno  + dos  + tres;
        calificacion= suma/3;

        if(calificacion > 80){
            System.out.println("Felicidades pasate :) tu calificaión es " + calificacion); 
        }
        else{
            System.out.println("Lo sentimos,no alcanzaste a pasar esta vez :( y tu calificaión final quedo asi..." + calificacion); 
        }

    }
    
}
