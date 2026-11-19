
import java.util.Scanner;
public class EstadisticaNumeroConocido{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double num;
            double suma=0;
            double maximo=0;
            double minimo=0;
            System.out.println("Intreoduce un numero para definir el numero de mediaciones: ");
            int m=sc.nextInt();
            if(m<=0){
                System.out.println("Error. EL numero debe de ser positivo");
            }

            for(int i=1;i<=m;i++){
                System.out.println("Introduce un numero: ");
                num=sc.nextInt();
                suma+=num;

                if(i==1){
                    maximo=num;
                    minimo=num;
                }else{
                    if(num>maximo){
                    maximo=num;
                }
                if(num<minimo){
                    minimo=num;
                }
                }
                
            }
            
            double media=suma/m;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
            System.out.println("Maximo: " + maximo);
            System.out.println("minimo: " + minimo);
    
    }
}