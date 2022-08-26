//Construya un diagrama de flujo tal que dado como datos la categoría y el sueldo de un
//trabajador, calcule el aumento correspondiente teniendo en cuenta la siguiente tabla.
//Categoria  ||  Aumento
//    1            15%
//    2            10%
//    3            8%
//    4            7%
//Imprima la categoría del trabajador y su nuevo sueldo.
import java.util.Scanner;
public class Aumento_sueldo_trabajador {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int categoria;
        double sueldo;
        double aumento=0;

        System.out.println("Dame su sueldo del trabajador: ");
        sueldo=leer.nextDouble();
        System.out.println("Dame su categoria: ");
        categoria=leer.nextInt();
        switch(categoria){
            case 1:categoria=1;
            aumento=sueldo * 0.15;
            break;
            case 2:categoria=2;
            aumento=sueldo * 0.10;
            break;
            case 3:categoria=3;
            aumento=sueldo * 0.08;
            break;
            case 4:categoria=4;
            aumento=sueldo * 0.07;
            break;
            default:
            System.out.println("Error, categoria no valida y no se hara ningun amuento de sueldo");                   
    }
    System.out.println("Este es el aumento que tendra el trabajador de acuerdo a su categoria seleccionada:  " + aumento + " pesos");
    System.out.println("Este es lo que se le pagara al trabajador:  " + (sueldo+aumento) + " pesos");
    System.out.println("Este es la categoria que elegiste:  " + categoria);
    }
}
