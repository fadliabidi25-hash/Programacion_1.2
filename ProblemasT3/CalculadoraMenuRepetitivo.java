import java.util.Scanner;
public class CalculadoraMenuRepetitivo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int opcion;
        int num1, num2;

        do{
            System.out.println("Menú:");
            System.out.println("1.Sumar dos numeros.");
            System.out.println("2.Restar dos numeros.");
            System.out.println("3.Multiplicar dos numeros.");
            System.out.println("4.Dividir dos numeros.");
            System.out.println("5.Terminar");

            System.out.println("Elige una opcion: ");
            opcion=sc.nextInt();
            if(opcion>5 || opcion<1){
                System.out.println("Error. No existe la opcion introducida");
            }

            switch(opcion){
            case 1:
                System.out.println("Introduce el primer numero: ");
                num1=sc.nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2=sc.nextInt();

                System.out.println("La suma es: " + (num1+num2));
                break;

            case 2: 
                System.out.println("Introduce el primer numero: ");
                num1=sc.nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2=sc.nextInt();

                System.out.println("La resta es: " + (num1-num2));
                break;

            case 3:
                System.out.println("Introduce el primer numero: ");
                num1=sc.nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2=sc.nextInt();

                System.out.println("La multiplicacion es: " + (num1*num2));
                break;

            case 4:
                System.out.println("Introduce el dividendo: ");
                double dividendo=sc.nextDouble();
                System.out.println("Introduce el divisor: ");
                double divisor=sc.nextDouble();

                if(divisor==0){
                    System.out.println("Error");
                }else{
                    System.out.println("La division es: " + (dividendo/divisor));
                    break;
                }
        }
        }while(opcion!=5);

        
    }
}
