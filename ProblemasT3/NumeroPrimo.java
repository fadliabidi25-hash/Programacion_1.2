import java.util.Scanner;
public class NumeroPrimo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un nnumero: ");
        int num=sc.nextInt();
        boolean esPrimo=true;
        int divisor=2;

        if(num<2){
            esPrimo=false;´
        }else {

            while(esPrimo && divisor<num){
                if(num%divisor==0){
                    esPrimo=false;
                }else {
                    divisor++;
                }
            }
            
            if(!esPrimo){
                System.out.println("No es primo");
            }else{
                System.out.println("Es primo");
            }
        }

}
}