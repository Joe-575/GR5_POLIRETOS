package seriesnumericas;

import java.util.*;

public class Gr5Serie {

    private static final Scanner entrada = new Scanner(System.in);

    public static void Gr5_crearSerieFibonacci(){
        System.out.print(" Ingrese el numero de elementos de la serie: ");
        int numero = entrada.nextInt();
        int num1 = 0, num2 = 1;

        System.out.print(num1 + " " +  num2 + " ");
        for(int i = 2; i < numero; i++){
            int  num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
    
    public void CerrarScanner(){
        entrada.close();
    }
}
