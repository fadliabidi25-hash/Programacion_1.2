import java.util.Scanner;
public class NumerosPerfectosLimite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Introduce un numero como limite: ");
        int numeroLimite=sc.nextInt();

        //Comprobar si el numero introducido es correcto
        if(numeroLimite<2)
            System.out.println("Error");

        //Contador de numeros perfectos
        int numerosPerfectos=0;

        for(int i=2; i<=numeroLimite; i++){ //for que recorre los numeros desde el 2 hasta el limite para ver si es perfecto o no
            int suma=0; //variable en la que almacenaremos la suma de todos los divisores propios para comproba si es perfecto luego
            for(int j=1; j<i; j++){ //for que recorre los numeros desde el 1 hasta la i para ver sus divisores propios
                if(i%j==0) //si es divisor propio se aslmacena en la suma
                    suma+=j;

            }

            if(suma==i){ //si la suma de los divisores propios es = a el numero entonces es perfecto asi q se incrementa el contador de numeros perfectos y se imprime es enumero
                numerosPerfectos++;
                System.out.println(i);
            }

        }

        System.out.println("Numeros perfectos encontrados: " + numerosPerfectos);




    }
}
