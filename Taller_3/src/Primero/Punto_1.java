package Primero;

import java.util.Scanner;

public class Punto_1 {
    private int i,j,x;
    private Scanner input;

    public void Punto_1(){
        this.input = new Scanner(System.in);
        int x = 0;
        System.out.println("Ingrese un numero");
        x = capturarDatoInt();
        for (int i =0 ; i < x; i++ ){

            for (int j =0 ; j < i; j++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        System.out.print("------------------------------ ");
    }
    private int capturarDatoInt() {return this.input.nextInt();}

}
