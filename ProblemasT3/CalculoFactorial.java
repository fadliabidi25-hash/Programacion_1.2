import java.util.Scanner;
public class CalculoFactorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numero;
        

        do{
            System.out.print("Introduce un numero entre 1 y 20 incluidos: ");
            numero=sc.nextInt();

        }while(numero<1 || numero>20);

        long resultado=1;  
        for(int i=1; i<=numero; i++){
            resultado=i*resultado;
        }

        System.out.println("EL factorial es: " + resultado);
    }
    
}
