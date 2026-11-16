import java.util.Scanner;
public class EstadisticaNumeroConocido{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num;
            int suma=0;
            int maximo;
            int minimo;
            System.out.println("Intreoduce un numero para definir el numero de mediaciones: ");
            int m=sc.nextInt();
            if(m<=0){
                System.out.println("Error. EL numero debe de ser positivo");
            }

            for(int i=1;i<=m;i++){
                System.out.println("Introduce un numero: ");
                num=sc.nextInt();
                maximo;
                minimo;
                suma+=num;
                if(num>maximo){
                    maximo=num;
                }
                if(num<minimo){
                    minimo=num;
                }
            }
            
            int media=suma/m;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
            System.out.println("Maximo: " + maximo);
            System.out.println("minimo: " + minimo);
    
    }
}