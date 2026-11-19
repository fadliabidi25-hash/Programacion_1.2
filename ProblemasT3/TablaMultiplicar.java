import java.util.Scanner;
public class TablaMultiplicar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        int multiplicar;

        do { 
            System.out.println("Introduce un numero: ");
            numero=sc.nextInt();

        } while (numero<1 && numero>10);

        for(int i=1; i<=10; i++){
            multiplicar=i*numero;
            System.out.println(numero + " * " + i + " = " + multiplicar);
        }
    }

}