//16. Que muestre un menú que contemple las opciones “Archivo”, “Buscar” y “Salir”, en caso de que no
//se introduzca una opción correcta se notificará por pantalla.

import java.util.Scanner;
public class Selector_de_opciones {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        String opcion = "";

        System.out.println("Escoge una opción...");
        System.out.println("---Archivo");
        System.out.println("---Buscar");
        System.out.println("---Salir");
        opcion=leer.next();


        switch(opcion){
            case "Archivo":
            System.out.println("Escogite la opción de Archivo");
            break;
            case "Buscar":
            System.out.println("Escogite la opción de Buscar");
            break;
            case "Salir":
            System.out.println("Escogite la opción de Salir");
            break;
            default:
            System.out.println("Error,opción no valida");                   
        }

        
       }
    
    }
    