import java.util.Scanner;
public class Operaciones_basicas {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        // comentarios de una linea
        /*
            estos son comentarios de multiples lineas
            otra cosa
            
        */
        // datos de entrada
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        float division;
        double div;
        double potencia;
        //leer dos numeros y realizar la suma
        

        // bloque de proceso
        System.out.println("dame un numero entero");
        numero1= leer.nextInt();
        System.out.println("dame otro numero entero");
        numero2= leer.nextInt();
        suma=numero1+numero2;
        System.out.println("Suma = " + suma);

        // realizar la resta
        resta=numero1-numero2;
        System.out.println("Resta = " + resta);

        //  realizar la multiplicacion
        multiplicacion=numero1*numero2;
        System.out.println("Multiplicacion = " + multiplicacion);

        //  realizar la division entera
        division=numero1/numero2;
        System.out.println("Division = " + division);

        // realizar la division decimal (cast de datos)
        div=(double)numero1/numero2;
        System.out.println("Division decimal = " + div);
                       
        // realizar la potencia Math.pow(base, potencia)
        potencia=Math.pow(numero1, numero2);
        System.out.println("Potencia = " + potencia);

        }
}