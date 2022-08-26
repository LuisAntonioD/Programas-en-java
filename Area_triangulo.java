import java.util.Scanner;
public class Area_triangulo {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        

        int base;
        int altura;
        int sup;


        System.out.println("dame la base  ");
        base= leer.nextInt();
        System.out.println("dame la altura  ");
        altura= leer.nextInt();
        sup=(base*altura)/2;
        System.out.println("La superficie es = " + sup);

        }
}