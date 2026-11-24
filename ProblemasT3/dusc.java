import java.util.Scanner;
public class dusc {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int limite, contadorPerfectos = 0;

        do {
            System.out.print("Introduce el límite: ");
            limite = sc.nextInt();
        } while ( limite < 2 );

        for ( int i = 2; i <= limite; i++ ){
            int suma = 0;
            for ( int j = 1; j < i; j++ ){
                if ( i % j == 0 )
                    suma += j;
            }
            if ( i == suma ){
                contadorPerfectos++;
                System.out.println(i);
            } 
        }
        System.out.println("Cantidad de números perfectos encontrados: " + contadorPerfectos);
    }
}

