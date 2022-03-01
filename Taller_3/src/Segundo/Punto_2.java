package Segundo;

import java.util.Scanner;

public class Punto_2 {
    private int i,j,x;
    private static boolean estado = true;
    private Scanner input;

    public void Punto_2(){
        this.input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        x = capturarDatoInt();

        while (estado == true){
            for (int i =0 ; i < x; i++ ){

                for (int j =x-1-i ; j >= 0; j--){
                    System.out.print("*");
                }

                System.out.println(" ");
                estado = false;

            }

            System.out.print("------------------------------ ");
        }



    }
    private int capturarDatoInt() {return this.input.nextInt();}

}
