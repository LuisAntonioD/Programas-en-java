//4. Que pida una letra y detecte si es una vocal.

import java.util.Scanner; 
public class Letra_vocal { 
 public static void main(String args[]){ 
 Scanner leer=new Scanner(System.in); 
  
        String letra="";


        System.out.println("Dame una letra del abecedario");
        letra=leer.next();

        switch(letra){
         case "A":
         System.out.println("Esta letra es una vocal");
                 break;
         case "E":
         System.out.println("Esta letra es una vocal");
             break;  
         case "I":
         System.out.println("Esta letra es una vocal");
                 break; 
         case "O":
         System.out.println("Esta letra es una vocal");
                 break;
         case "U":
         System.out.println("Esta letra es una vocal");
                 break;    
         default:
         System.out.println("Esta letra NO es una vocal");            
     }
    } 
} 


