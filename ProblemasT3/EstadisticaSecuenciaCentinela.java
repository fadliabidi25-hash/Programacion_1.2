

import java.util.Scanner;
public class EstadisticaSecuenciaCentinela {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final int CENTINELA=0;
        int suma=0;
        int positivos=0;
        int negativos=0;
        double media;

        System.out.print("Introduce un numero (o " + CENTINELA + " para finalizar): ");
        int num=sc.nextInt();

        while(num!=CENTINELA){
            suma+=num;
            if(num>0){
                positivos++;
            }else{
                negativos++;
            }

             System.out.print("Introduce un numero (o " + CENTINELA + " para finalizar): ");
             num=sc.nextInt();
        }

        if(positivos>0 || negativos>0){
             media=(double)suma/(positivos+negativos);

             System.out.println("Cantidad de datos introducidos: " + (positivos+negativos));
             System.out.println("Suma: " + suma);
             System.out.println("Positivos: " + positivos);
             System.out.println("Negativos: " + negativos);
             System.out.println("Media: " + media);


        }

         
        
    }
}
