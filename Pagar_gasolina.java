import java.util.Scanner;
public class Pagar_gasolina {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        

        double gal;
        double litros;
        double Costo_Gasolina;
        double precio;


        System.out.println("dime cuantos litros de gasolina son  ");
        gal= leer.nextDouble();
        System.out.println("dime cual  es el precio de la gasolina   ");
        Costo_Gasolina= leer.nextDouble();
        litros=(gal*3.78);
        precio=(double)(litros*Costo_Gasolina);
        System.out.println("El precio es = " + precio);

        }
}