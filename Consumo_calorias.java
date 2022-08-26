//10. Una persona enferma, que pesa 70 kg, se encuentra en reposo y desea saber cuántas calorías
//consume su cuerpo durante todo el tiempo que realice una misma actividad. Las actividades que
//tiene permitido realizar son únicamente dormir o estar sentado en reposo. Los datos que tiene son
//que estando dormido consume 1.08 calorías por minuto y estando sentado en reposo consume 1.66 calorías por minuto.

import java.util.Scanner;
public class Consumo_calorias {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        //dormido=1.08;
        //sentado=1.66;
        int minutos;
        double calorias;
        int actividad;

        System.out.println("Dime que actividad deseas hacer...");
        System.out.println("---1:dormir");
        System.out.println("---2:sentarte");
        actividad=leer.nextInt();
        System.out.println("Dime cuantos minutos deseas hacer tu actividad");
        minutos=leer.nextInt();

        if(actividad == 1){
            calorias=minutos*1.08;
            System.out.println("Estas son las calorias que consumiras...");
            System.out.println(calorias + " calorias estando dormido :|");
        }
        else{
            calorias=minutos*1.66;
            System.out.println("Estas son las calorias que consumiras haciendo esta actividad...");
            System.out.println(calorias + " calorias estando sentado :|");  
        }
    }
}