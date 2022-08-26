//12. Realice un algoritmo donde indique la calificación que obtiene un alumno de acuerdo a la cantidad de
//ejercicios realizados en la clase de metodología de la programación. Para obtener SA, debe tener 10
//ejercicios de condición simple, 10 compuesto y 5 con switch. Para DE, debe tener además 5
//anidados. Para AU debe tener además, una máquina de estados.

import java.util.Scanner;
public class Cakificación_por_ejercicios {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int condsimp;
        int condcomp;
        int sw;
        int ME=1;
        int calificacion;
        int calfinal;
        int anidados;

        System.out.println("¿Cuántos ejercicios de condición simple hiciste?");
        condsimp=leer.nextInt();
        System.out.println("¿Cuántos ejercicios de condición compuesta hiciste?");
        condcomp=leer.nextInt();
        System.out.println("¿Cuántos ejercicios de switch hiciste?");
        sw=leer.nextInt();
        System.out.println("¿Cuántos ejercicios adicionales de condición anidada hiciste para DE?");
        anidados=leer.nextInt();
        System.out.println("¿Hiciste una máquina de estados para el AU?");
        System.out.println("   1 = Si      2 = No");
        ME=leer.nextInt();

        calificacion=condsimp + condcomp + sw + anidados + ME;
        calfinal=condsimp + condcomp + sw + anidados;

        if(calificacion == 31){
            System.out.println("Sacaste AU pasaste :)");
        }
        else if(calfinal == 30){
            System.out.println("Sacaste DE pasaste :)");  
        }
        else if(calfinal == 25){
                System.out.println("Sacaste SA apenas pasaste :|");
        }
        else {
            System.out.println("No pasaste,sigue aprendiendo no te rindas..."); 
        }      
    }
}