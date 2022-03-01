import Cuarto.Punto_4;
import Octavo.Punto_8;
import Primero.Punto_1;
import Quinto.Punto_5;
import Segundo.Punto_2;
import Septimo.Punto_7;
import Sexto.Punto_6;
import Tercero.Punto_3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static boolean bandera = true;
    private static int opcion;
    public static void main(String[] args) throws IOException, InterruptedException {


        do {

            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while(bandera);


    }
    private static void menu() {
        System.out.println("Escoja el taller que desea ver");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("6. Punto #6");
        System.out.println("7. Punto #7");
        System.out.println("8. Punto #8");

        System.out.println("0. Salir del taller");
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static boolean capturarBoolean(){
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch(opcion) {
            case 0:
                return false;
            case 1:
                Punto_1 p1 = new Punto_1();
                p1.Punto_1();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 2:
                Punto_2 p2 = new Punto_2();
                p2.Punto_2();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 3:
                Punto_3 p3 = new Punto_3();
                p3.Punto_3();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 4:
                Punto_4 p4=new Punto_4();
                p4.Punto_4();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 5:
                Punto_5 p5 = new Punto_5();
                p5.Punto_5();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 6:
                Punto_6 p6 = new Punto_6();
                p6.Punto_6();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 7:
                Punto_7 p7 = new Punto_7();
                p7.Punto_7();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;
            case 8:
                Punto_8 p8 = new Punto_8();
                p8.Punto_8();
                System.out.print("¿Desea continuar? ");
                bandera= capturarBoolean();
                return bandera;


            default:
                System.out.println("Opción incorrecta");
                System.in.read();
                return true;

        }

    }
}
