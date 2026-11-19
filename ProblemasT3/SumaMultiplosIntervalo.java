

/**
 *  Este programa suma los multiplos d eun numero entre otros dos.
 * Solicita dos numeros hasta que el primero es menor o igual que el segundo
 * y a copntinuacion suma los multiplos de tres que hay entre esos numeros
 * 
 * @author: Smahane Fadli
 * Fecha: 20261109
 */

import java.util.Scanner;
public class SumaMultiplosIntervalo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a; //primer numero
        int b; //segundo numero
        int suma=0;

        do { 
            
            System.out.print("Introduce el numero A: ");
            a=sc.nextInt();
            System.out.print("Introduce el numero B: ");
            b=sc.nextInt();

        } while (a>b);

        for(int i=a;i<=b;i++){
            if(i%3==0){  //con ternario: suma+=i%3==0?i:0; si la 
            //             condicion i%3==0 se usmara suma+=i; 
            //             sino se sumara 0
                suma+=i;
            }
        }

        System.out.println("Suma: " + suma);

    }
    
}
