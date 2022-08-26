//2.Dados los datos A, B y C que representan números enteros diferentes, construya un
//algoritmo para escribir estos números en forma descendente.
import java.util.Scanner;
public class números_en_forma_descendente {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Ingresa el número uno ");
        a=leer.nextInt();
        System.out.println("Ingresa el número dos ");
        b=leer.nextInt();
        System.out.println("Ingresa el número tres ");
        c=leer.nextInt();

        if(a>b){
            if(b>c){
                System.out.println("Los numeros en un orden descendente son:     " + a+"---"+ b+"---"+ c); 
            }
            else if(a>c){
                System.out.println("Los numeros en un orden descendente son:     " + a+"---"+ c+"---"+ b); 
            }
            else{
                System.out.println("Los numeros en un orden descendente son:     " + c+"---"+ a+"---"+ b); 
            }
        }
        else{
            if(a>c){
                System.out.println("Los numeros en un orden descendente son:     " + b+"---"+ a+"---"+ c);  
            }
            else if(c>b){
                System.out.println("Los numeros en un orden descendente son:     " + c+"---"+ b+"---"+ a);
            }
            else{
                System.out.println("Los numeros en un orden descendente son:     " + b+"---"+ c+"---"+ a);
            }
        }
        
        }
    }
