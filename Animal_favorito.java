//30. Escribe un programa que pida al usuario ingrese su animal favorito, si coloca ‘Tortuga’, ‘tortuga’,
//‘TORTUGA’ o cualquier otra variante de la palabra entonces mostrar en pantalla “También me
//gustan las tortugas”. En caso contrario mostrar el mensaje “Ese animal es genial, pero prefiero las tortugas”.

import java.util.Scanner;
public class Animal_favorito {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        String animal=" ";

        System.out.println("Dame el nombre de tu animal favorito");
        animal=leer.nextLine();

        if(animal.equalsIgnoreCase("Tortuga")){
            System.out.println("También me gustan las tortugas");
        }
        else{
            System.out.println("Ese animal es genial, pero prefiero las tortugas");  
        }
        
    }
      
}
