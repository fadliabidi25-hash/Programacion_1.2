import java.util.Scanner;
public class MinimoComunMultiplo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numeroA, numeroB;
        do{
            System.out.println("Introduce el numero A: ");
            numeroA=sc.nextInt();
        }while(numeroA<=0);

         do{
            System.out.println("Introduce el numero B: ");
            numeroB=sc.nextInt();
        }while(numeroB<=0);

        int a=numeroA;
        int b=numeroB;

        while(b>0){
            int resto=a%b;
            a=b;
            b=resto;
        }

        int mcd=a;

        int mcm;
        mcm=(numeroA*numeroB)/mcd;

        System.out.println("El minimo comun multiplo es: " + mcm);
    }    
}
