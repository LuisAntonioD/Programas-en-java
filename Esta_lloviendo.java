//17. Crea un programa que pregunte al usuario si está lloviendo, en caso de responder “sí” pregunta si
//está haciendo mucho viento y si responde “sí” nuevamente muestra un mensaje indicando que hace
//mucho viento para salir con una sombrilla. En caso contrario, anima al usuario a que lleve una
//sombrilla. Para el caso de responder “no” en la primer pregunta, entonces solo desea un bonito día.
//Considera que las respuestas pueden estar en mayúsculas o minúsculas para evitar posibles errores.

import java.util.Scanner;
public class Esta_lloviendo {

    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        String resp="";

        System.out.println("¿Esta lloviendo?");
        resp=leer.nextLine();


        if(resp.equalsIgnoreCase("Si")){
            System.out.println("¿Esta está haciendo mucho viento?");
            resp=leer.nextLine();
            System.out.println("Oye,hace mucho viento para salir con una sombrilla");
        }
        else{
            System.out.println("Ten un bonito dia :)");  
        }

    
     }
}