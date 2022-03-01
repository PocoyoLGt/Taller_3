package Tercero;

import java.util.Scanner;

public class Punto_3 {
    private int i,j,x,k,m;
    private boolean estado = true;

    private Scanner input;

    public void Punto_3(){
        this.input = new Scanner(System.in);


        x = 11;
        do {
            for (int i =1 ; i <= x; i++ ){

                for (int j =1 ; j <= x-i; j++){
                    System.out.print(" ");
                }
                for (int k =1 ; k <=(i*2)-1; k++){
                    System.out.print("*");
                }

                System.out.println(" ");
            }
            System.out.println("         ***         ");
            System.out.println("         ***         ");
            System.out.println("        *****       ");
            System.out.println("       *******     ");
            System.out.println(" ________________________");
            System.out.println("¿Desea repetir? escriba false si quiere continuar o true si quiere terminar");
            estado= capturarBoolean();
        }while (estado== false);









    }
    private static boolean capturarBoolean(){
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }

}
