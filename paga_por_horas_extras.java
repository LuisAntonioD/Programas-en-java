//20. Escriba un diagrama de flujo que permita calcular lo que hay que pagarle a un trabajador teniendo en
//cuenta su sueldo y las horas extras trabajadas. Para el pago de horas extras se toma en cuenta la
//categoría del trabajador.

import java.util.Scanner;
public class paga_por_horas_extras {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int categoria;
        double sueldo;
        int hex;
        double aumento=0;
        double sfinal=0;

        System.out.println("Dame su sueldo del trabajador: ");
        sueldo=leer.nextDouble();
        System.out.println("¿Cuántas horas extra trabajaste?");
        hex=leer.nextInt();
        System.out.println("Dame su categoria:");
        categoria=leer.nextInt();
        switch(categoria){
            case 1:categoria=1;
            aumento=hex * 30;
            sfinal=sueldo + aumento;
            break;
            case 2:categoria=2;
            aumento=hex * 38;
            sfinal=sueldo + aumento;
            break;
            case 3:categoria=3;
            aumento=hex * 50;
            sfinal=sueldo + aumento;
            break;
            case 4:categoria=4;
            aumento=hex * 70;
            sfinal=sueldo + aumento;
            break;
            default:
            System.out.println("Error, categoria no valida y no se hara ningun amuento de sueldo");                   
    }
    System.out.println("Esta es la categoria que elegiste:  " + categoria);
    System.out.println("Este es el aumento que tendra el trabajador de acuerdo a su categoria seleccionada $" + aumento + " pesos");
    System.out.println("Este es sueldo final que tendra el trabajador de acuerdo a su categoria seleccionada $" + sfinal + " pesos");
    }
}