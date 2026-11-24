import java.util.Scanner;
public class NumerosPerfectosLimite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int numeroLimite;
        int suma=0;
        
        int numerosPerfectos=0;

        System.out.print("Introduce un numero: ");
        numeroLimite=sc.nextInt();

        for(int i=2; i<=numeroLimite; i++){
            int sumaDivisoresPropios=0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sumaDivisoresPropios+=j;
                }

            }
            if(sumaDivisoresPropios==i){
                numerosPerfectos++;
                System.out.println(i);
            
            }
        }

        System.out.println("Cantidad de numeros perfectos: " + numerosPerfectos);
    }
}
