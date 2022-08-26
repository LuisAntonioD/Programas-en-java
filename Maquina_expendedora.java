//31. Que calcule el cambio que debe entregarse en una máquina de snacks, teniendo en cuenta que solo
//maneja monedas de $1, $2, $5 y $10, deberá de validar inicialmente si el importe que paga el
//usuario es mayor o igual al costo del producto seleccionado, luego calcular el cambio y determinar si
//cuenta con el $ para proporcionar el cambio y qué monedas utilizará. La máquina cuenta con 10
//monedas de cada valor. Deberás mostrar por lo menos 5 productos y permitir ingresar el producto
//que se desea comprar, y la cantidad de monedas de cada denominación que se ingresarán a la máquina.

import java.util.Scanner;
public class Maquina_expendedora {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int producto;
        int cantprod;
        int cambio=0;
        int moneda1;
        int moneda2;
        int moneda5;
        int moneda10;
        int ctot=0;
        int costprod1=0;
        int costprod2=0;
        int costprod3=0;
        int costprod4=0;
        int costprod5=0;
        int costprod6=0;

        System.out.println("-------PRODUCTOS-------");
        System.out.println("[1] PAPAS           $14");
        System.out.println("[2] GALLETAS        $15");
        System.out.println("[3] JUGO            $10");
        System.out.println("[4] DONAS           $16");
        System.out.println("[5] CACAHUATES      $12");
        System.out.println("[6] GOMITAS         $5");
        System.out.println("Dime que producto deseas comprar");
        producto=leer.nextInt();
        System.out.println("Dime cuantos productos deseas de este tipo");
        cantprod=leer.nextInt();
        System.out.println("Dime con cuanto me vas a pagar");
        System.out.println("----RECUERDA QUE SOLO ACEPTO MONEDAS DE $1, $2, $5 y $10-----");
        System.out.println("¿Cuántas van a ser de $1?");
        moneda1=leer.nextInt();
        System.out.println("¿Cuántas van a ser de $2?");
        moneda2=leer.nextInt();
        System.out.println("¿Cuántas van a ser de $5?");
        moneda5=leer.nextInt();
        System.out.println("¿Cuántas van a ser de $10?");
        moneda10=leer.nextInt();


            

            if(producto == 1){
                costprod1=cantprod * 14;
                cambio= moneda1*1 + moneda2*2 + moneda5*5 + moneda10*10;
                ctot=cambio - costprod1;
                if(cambio > costprod1){
                System.out.println("Tu producto elegido va a ser unas papas");
                System.out.println("El total de tu cuenta sera:$" + costprod1 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo");
                System.out.println("Tu cambio sera:$" + ctot + " gracias por tu compra :)");

            }
            else if(cambio < costprod1){
                System.out.println("El total de tu cuenta sera:$" + costprod1 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo pero...");
                System.out.println("Lo siento pero te hace falta mas dinero :(. . . Regresa pronto");   
            }
            }
            if(producto == 2){
                costprod2=cantprod * 15;
                cambio= moneda1*1 + moneda2*2 + moneda5*5 + moneda10*10;
                ctot=cambio - costprod2;
                if(cambio > costprod2){
                System.out.println("Tu producto elegido va a ser unas galletas");
                System.out.println("El total de tu cuenta sera:$" + costprod2 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo");
                System.out.println("Tu cambio sera:$" + ctot + " gracias por tu compra :)");

            }
            else if(cambio < costprod2){
                System.out.println("El total de tu cuenta sera:$" + costprod2 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo pero...");
                System.out.println("Lo siento pero te hace falta mas dinero :(. . . Regresa pronto");   
            }
            }
            if(producto == 3){
                costprod3=cantprod * 10;
                cambio= moneda1*1 + moneda2*2 + moneda5*5 + moneda10*10;
                ctot=cambio - costprod3;
                if(cambio > costprod3){
                System.out.println("Tu producto elegido va a ser un jugo");
                System.out.println("El total de tu cuenta sera:$" + costprod3 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de 10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo");
                System.out.println("Tu cambio sera:$" + ctot + " gracias por tu compra :)");

            }
            else if(cambio < costprod3){
                System.out.println("El total de tu cuenta sera:$" + costprod3 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de 10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo pero...");
                System.out.println("Lo siento pero te hace falta mas dinero :(. . . Regresa pronto");   
            }
            }
            if(producto == 4){
                costprod4=cantprod * 16;
                cambio= moneda1*1 + moneda2*2 + moneda5*5 + moneda10*10;
                ctot=cambio - costprod4;
                if(cambio > costprod4){
                System.out.println("Tu producto elegido va a ser unas donas");
                System.out.println("El total de tu cuenta sera:$" + costprod4 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo");
                System.out.println("Tu cambio sera:$" + ctot + " gracias por tu compra :)");

            }
            else if(cambio < costprod4){
                System.out.println("El total de tu cuenta sera:$" + costprod4 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de 45   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo pero...");
                System.out.println("Lo siento pero te hace falta mas dinero :(. . . Regresa pronto");   
            }
            }
            if(producto == 5){
                costprod5=cantprod * 12;
                cambio= moneda1*1 + moneda2*2 + moneda5*5 + moneda10*10;
                ctot=cambio - costprod5;
                if(cambio > costprod5){
                System.out.println("Tu producto elegido va a ser unos cacahuates");
                System.out.println("El total de tu cuenta sera:$" + costprod5 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de 10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo");
                System.out.println("Tu cambio sera:$" + ctot + " gracias por tu compra :)");

            }
            else if(cambio < costprod5){
                System.out.println("El total de tu cuenta sera:$" + costprod5 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo pero...");
                System.out.println("Lo siento pero te hace falta mas dinero :(. . . Regresa pronto");   
            }
            }
            if(producto == 6){
                costprod6=cantprod * 5;
                cambio= moneda1*1 + moneda2*2 + moneda5*5 + moneda10*10;
                ctot=cambio - costprod6;
                if(cambio > costprod6){
                System.out.println("Tu producto elegido va a ser unas gomitas");
                System.out.println("El total de tu cuenta sera:$" + costprod6 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo");
                System.out.println("Tu cambio sera:$" + ctot + " gracias por tu compra :)");

            }
            else if(cambio < costprod6){
                System.out.println("El total de tu cuenta sera:$" + costprod6 + " pesos" );
                System.out.println("Me vas a dar " + moneda1 + " monedas de $1   " + moneda2 + " monedas de $2   " + moneda5 + " monedas de $5   " + moneda10 +  " monedas de $10");
                System.out.println("En total seran $" + cambio + " pesos lo que estoy recibiendo pero...");
                System.out.println("Lo siento pero te hace falta mas dinero :(. . . Regresa pronto");   
            }
            }
        }

    }