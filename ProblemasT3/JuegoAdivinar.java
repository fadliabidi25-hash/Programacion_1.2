import java.util.Scanner;
public class JuegoAdivinar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int numero=(int)(Math.random()*100)+ 1;
        int intentos=0;
        int adivinar;

        do{
            System.out.println("Intenta adivinar el numero: ");
            adivinar=sc.nextInt();

            intentos++;

            if(numero<adivinar){
                System.out.println("El numero es menor");


            }
            if(numero>adivinar){
                System.out.println("El numero es mayor");
            }
        }while(adivinar!=numero);

        System.out.println("Bravo, lo adivinaste!!");
        System.out.println("Numero de intentos: " + intentos);

    }
}