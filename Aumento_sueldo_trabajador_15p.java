//Dado como dato el sueldo de un trabajador, aplíquele un aumento del 15% si su sueldo es
//inferior a $1000. Imprima en este caso el nuevo sueldo del trabajador.
import java.util.Scanner;
public class Aumento_sueldo_trabajador_15p {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        double sueldo;
        double aumento;
        double sueldo_nuevo;

        System.out.println("Dame el sueldo del trabajador ");
        sueldo=leer.nextDouble();
        if(sueldo<1000){
        aumento=sueldo*0.15;
         
        sueldo_nuevo=sueldo+aumento;
        System.out.println("Esto es lo que va a aumentar a su sueldo: " + aumento);
        System.out.println("Este sera el sueldo final a pagar : " + sueldo_nuevo);
        }
    }
}
  

