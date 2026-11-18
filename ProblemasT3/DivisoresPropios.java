
import java.util.Scanner;
public class DivisoresPropios{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        int suma=0;
        int divisoresEncontrados=0;

        do { 
            System.out.print("Introduce un numero: ");
            num=sc.nextInt();
        } while (num<=0);

       
        for(int i=1; i<num; i++){
            if(num%i==0){
                divisoresEncontrados++;
                System.out.println(i);
                suma+=i;
            }
        }

            if(divisoresEncontrados<=1){
                System.out.println("Solo hay un divisor y es el 1");
            }

            System.out.println("La suma d elos divisores es: " + suma);
        }
    }

