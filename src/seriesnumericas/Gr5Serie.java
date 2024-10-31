package seriesnumericas;

import java.util.*;

public class Gr5Serie {

    private static final Scanner entrada = new Scanner(System.in);

    public static void Gr5_crearSerieFibonacci(){
        System.out.println("----------------------------------------------");
        System.out.print(" Ingrese el numero de elementos de la serie: ");
        int numero = entrada.nextInt();
        int num1 = 0, num2 = 1;
        
        System.out.print(" " + num1 + " " +  num2 + " ");
        for(int i = 2; i < numero; i++){
            int  num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println(" ");
    }
    
    public static void Gr5_SerieImpares() {
        System.out.println("----------------------------------------------");
        System.out.print(" Ingrese el numero de elementos de la serie: ");
        int numero = entrada.nextInt();
        for(int i = 1; i <= numero; i++){
            if(i %2 != 0){
                System.out.print(" " + i + " ");
            }else{
                System.out.print("0");   
            }
        }
        System.out.println(" ");
    }



    public void CerrarScanner(){
        entrada.close();
    }
}
