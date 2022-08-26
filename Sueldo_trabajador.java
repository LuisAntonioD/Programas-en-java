//20. Escriba un diagrama de flujo que permita calcular lo que hay que pagarle a un trabajador teniendo en
//cuenta su sueldo y las horas extras trabajadas. Para el pago de horas extras se toma en cuenta la
//categoría del trabajador.

import java.util.Scanner;
public class Sueldo_trabajador {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int categoria;
        double sueldo;
        int hex;
        double aumento=0;

        System.out.println("Dame su sueldo del trabajador: ");
        sueldo=leer.nextDouble();
        System.out.println("¿Cuántas horas extra trabajaste?");
        hex=leer.nextInt();
        System.out.println("Dame su categoria:");
        categoria=leer.nextInt();
        switch(categoria){
            case 1:categoria=1;
            aumento=sueldo + (hex * 30);
            break;
            case 2:categoria=2;
            aumento=sueldo + (hex * 38);
            break;
            case 3:categoria=3;
            aumento=sueldo + (hex  * 50);
            break;
            case 4:categoria=4;
            aumento=sueldo + (hex * 70);
            break;
            default:
            System.out.println("Error, categoria no valida y no se hara ningun amuento de sueldo");                   
    }
    System.out.println("Este es la categoria que elegiste:  " + categoria);
    System.out.println("Este es el aumento que tendra el trabajador de acuerdo a su categoria seleccionada:  " + aumento + " pesos");
    System.out.println("Este es lo que se le pagara al trabajador:  " + (sueldo+aumento) + " pesos");
    }
}