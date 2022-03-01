package Quinto;

import java.util.Scanner;

public class Punto_5 {
    private String Usuario;
    private boolean estado = true;
    private Scanner input;
    public void Punto_5(){
        this.input = new Scanner(System.in);
        do {
            System.out.println("Menu de usuario");
            System.out.println("¿Como te llamas?");
            this.Usuario = this.capturarDatoString();
            System.out.println("¡¡Hola!! "+Usuario);
            System.out.println("Para salir escriba true");
            this.estado = this.capturarBoolean();

        }while (estado == false);


    }


    private String capturarDatoString() {return this.input.nextLine();}
    private  boolean capturarBoolean(){

        return this.input.nextBoolean();
    }
}
