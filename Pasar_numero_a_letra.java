//27. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.

import java.util.Scanner;
public class Pasar_numero_a_letra {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int numero;
        int uno;
        int dos;

        System.out.println("dame un número del 0 al 99 y te dire como decirlo");
        numero=leer.nextInt();

        if(10 <= numero && numero <=15){     

        switch(numero){
            case 10:
            System.out.println("Diez");
                    break;
            case 11:
            System.out.println("Once");
                    break;  
            case 12:
            System.out.println("Doce");
                    break;  
            case 13:
            System.out.println("Trece");
                    break;  
            case 14:
            System.out.println("Catorce");
                    break;
            case 15:
            System.out.println("Quince");
                    break;                  
        }
}





else{
        uno = numero % 10;
        dos = numero / 10;

        switch(dos){
                case 0:
                System.out.print(" ");
                        break;
                case 1:
                System.out.print("Dieci");
                        break;  
                case 2:
                System.out.print("Veinte");
                        break;  
                case 3:
                System.out.print("Treinta");
                        break;  
                case 4:
                System.out.print("Cuarenta");
                        break;
                case 5:
                System.out.print("Cincuenta");
                        break; 
                case 6:
                System.out.print("Sesenta");
                        break;  
                case 7:
                System.out.print("Setenta");
                        break;  
                case 8:
                System.out.print("Ochenta");
                        break;
                case 9:
                System.out.print("Noventa");
                        break;                 
            }
            if(dos != 0 && dos != 1 && uno != 0){
                System.out.print(" y ");
            }






            switch(uno){
                case 0:
                if(dos == 0){
                        System.out.println("Cero");
                    }
                        break;
                case 1:
                System.out.println("Uno");
                        break;  
                case 2:
                System.out.println("Dos");
                        break;  
                case 3:
                System.out.println("Tres");
                        break;  
                case 4:
                System.out.println("Cuatro");
                        break;
                case 5:
                System.out.println("Cinco");
                        break; 
                case 6:
                System.out.println("seis");
                        break;  
                case 7:
                System.out.println("siete");
                        break;  
                case 8:
                System.out.println("ocho");
                        break;
                case 9:
                System.out.println("nueve");
                        break;                 
            }
        }

    }
      
}

        
    
      
