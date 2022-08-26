//5. Dado como datos tres números reales, identifique cuál es el mayor. Considere que
//los números pueden ser iguales. Desarrolle el algoritmo correspondiente.

import java.util.Scanner;
public class Numero_real_mayor {
public static void main(String args[]){
Scanner leer=new Scanner(System.in);

      int num1;
      int num2;
      int num3;

      System.out.println("Dime el primer número real");
      num1=leer.nextInt();
      System.out.println("Dime el segundo número real");
      num2=leer.nextInt();
      System.out.println("Dime el tercer número real");
      num3=leer.nextInt();

      if(num1>num2 && num1>num3){
        System.out.println(num1 + " es  el número mayor que " + num2 + "-y-" + num3);  
      }
      else if(num2>num1 && num2>num3){
        System.out.println(num2 + " es el número mayor que " + num1 + "-y-"  + num3); 
      }
      else if(num3>num1 && num3>num2){
        System.out.println(num3 + " es el número mayor que " + num1 +  "-y-"  + num2); 
      }
      else if(num1==num2 && num1==num3){
        System.out.println(num1 + " Es el mismo número que demas asi que es el mayor.");  
      }
      else if(num2==num1 && num2==num3){
        System.out.println(num2 + " Este número es igual a los demas asi que es el mayor."); 
      }
      else if(num3==num1 && num3==num2){
        System.out.println(num3 + " Este número es igual a los demas asi que es el mayor."); 
    }
}
}