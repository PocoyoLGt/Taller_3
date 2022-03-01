package Cuarto;

import java.util.Scanner;

public class Punto_4 {
    private String User;
    private Scanner input;
    private int x,i;


    public void Punto_4(){
        this.input = new Scanner(System.in);
        System.out.println("Hola, ¿Como te llamas?");
        User = capturarDatoString();
        System.out.println(User+" ¿De que numero quieres la tabla?");
        x = capturarDatoInt();
        System.out.println(User+" Esta es la tabla del numero "+x);
        System.out.println("_____________");
        for (int i =0 ; i <= 10; i++){
            System.out.println("| "+i+" x "+x+" = "+i*x+" |");

        }
        System.out.println("_______________");


    }

    private int capturarDatoInt() {return this.input.nextInt();}
    private String capturarDatoString() {return this.input.nextLine();}
}
