//21. En un hospital se ha hecho un estudio sobre los pacientes registrados durante los últimos 10 años,
//con el objeto de hacer una aproximación de los costos de internación por paciente. Se obtuvo un
//costo promedio diario según el tipo de enfermedad que aqueja al paciente. Además se pudo
//determinar que en promedio todos los pacientes con edad entre 14 y 22 años implican un costo
//adicional del 10%. La siguiente tabla expresa los costos diarios, según el tipo de enfermedad.

import java.util.Scanner;
public class Costo_hospital {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int tenfermedad;
        int edad;
        int dias;
        double Cadicional;
        double tot;  
        double CPD=0;  

        System.out.println("¿Que edad tienes?");
        edad=leer.nextInt();
        System.out.println("¿Cuántos dias estaras internado en el hospital?");
        dias=leer.nextInt();
        System.out.println("Dame tu tipo de enfermedad deacuerdo a la tabla:");
        tenfermedad=leer.nextInt();

        
        if(tenfermedad == 1){
            CPD=dias * 25;
            System.out.println("Te vamos a cobrar $" + CPD + " por estar en el hospital internado");
        }
        else if(tenfermedad == 2){
            CPD=dias * 16;
            System.out.println("Te vamos a cobrar $" + CPD + " por estar en el hospital internado");  
        }
        else if(tenfermedad == 3){
            CPD=dias * 20;
            System.out.println("Te vamos a cobrar $" + CPD + " por estar en el hospital internado");
        }
        else if(tenfermedad == 4){
            CPD=dias * 32;
            System.out.println("Te vamos a cobrar $" + CPD + " por estar en el hospital internado");
        }
        else{
           System.out.println("Hay un error,la información proporcionada no existe...");
        }
        if(edad >=14  &&  edad<=22){
            Cadicional=CPD * 0.10;
            tot=Cadicional + CPD;
            System.out.println("Pero tiene el 10% adicional lo cual incrementa a $" + tot);
        }
    }
}
