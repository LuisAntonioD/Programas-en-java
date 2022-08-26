//23. Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
//cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó
//correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el
//nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

//Nivel máximo: Porcentaje >= 90%.
//Nivel medio: Porcentaje >= 75% y < 90%.
//Nivel regular: Porcentaje >= 50% y  < 75%.
//Fuera de nivel: Porcentaje < 50%.

import java.util.Scanner;
public class Postulante_a_un_empleo {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int Pcont;
        int Prealizadas;
        double prom;

        System.out.println("¿Cuántas preguntas fuerón?");
        Prealizadas=leer.nextInt();
        System.out.println("¿Cuántas preguntas contesto bien?");
        Pcont=leer.nextInt();

        prom=(Pcont*100)/Prealizadas;

        if(prom < 50){
            System.out.println("Fuera de nivel ya que tu porcentaje fue %" + prom);
        }
        else if(prom >= 50 && prom < 75){
            System.out.println("Nivel regular ya que tu porcentaje fue %" + prom);  
        }
        else if(prom >= 75 && prom < 90){
            System.out.println("Nivel medio ya que tu porcentaje fue %" + prom);
        }
        else if(prom >= 90){
            System.out.println("Nivel máximo ya que tu porcentaje fue %" + prom + " FELICIDADES!!!");
        } 
    
     }
}
