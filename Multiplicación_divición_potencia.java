//Construya un diagrama de flujo tal que dado como datos dos variables de tipo entero,
//obtenga el resultado de la siguiente función:
//   num = 1---- 100*v
//   num = 2---- 100**v
//   num = 3---- 100/v
//   Cualquier numero = 0
import java.util.Scanner;
public class Multiplicación_divición_potencia {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int num;
        double v;
        double res;
        System.out.println("Dame un numero del 1 al 3: ");
        System.out.println("-------------------------- ");
        System.out.println("Las opciones son: ");
        System.out.println("num = 1---- 100*v ");
        System.out.println("num = 2---- 100**v ");
        System.out.println("num = 3---- 100/v ");
        System.out.println("---------------------------");
        num=leer.nextInt();
        System.out.println("Ingresa el número que se va a se remplazara por la v: ");
        v=leer.nextDouble();
        
        if(num==1){
            res=(double)100*v;
            System.out.println("El resultado es: " + res);
        }else if(num==2){
            res=Math.pow(100, v);
            System.out.println("El resultado es: " + res); 
        }
        else if(num==3){
            res=(double)100/v;
            System.out.println("El resultado es: " + res); 
        }
        else{
            res=0;
            System.out.println("El resultado es: " + res); 
        }
    }
}

