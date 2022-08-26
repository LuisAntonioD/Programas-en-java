import java.util.Scanner;
public class Area_y_volumen_circulo {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        

        int radio;
        int altura;
        double area;
        double volumen;


        System.out.println("dime cual es el radio  ");
        radio= leer.nextInt();
        System.out.println("dime cual es la altura  ");
        altura= leer.nextInt();
        volumen=3.1416 * Math.pow(radio,2) * altura;
        area= 2 * 3.1416 * radio * altura;
        System.out.println("El volumen es = " + volumen);
        System.out.println("El area es = " + area);

        }
}