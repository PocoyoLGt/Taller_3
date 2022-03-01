package Octavo;

import java.util.Scanner;

public class Punto_8 {
    private String Usuario, curso, tel;
    private Scanner input;
    private boolean estado;
    private int i,opcc,opc2,opc, edad;

    public void Punto_8(){
        String[] Usuarios = new String[10];
        String[] Cursos = new String[4];
        int[] Resultados = new int[10];
        this.input = new Scanner(System.in);
        this.estado = true;
        Usuarios[0]= "Andres Diaz"; Resultados[0] = 78;
        Usuarios[1]= "Alicia Muñoz"; Resultados[1] = 45;
        Usuarios[2]= "Bernado Osorio"; Resultados[2] = 98;
        Usuarios[3]= "Monica Vargas"; Resultados[3] = 89;
        Usuarios[4]= "Gabriel Pineda"; Resultados[4] = 54;
        Usuarios[5]= "Danna Guevara"; Resultados[5] = 56;
        Usuarios[6]= "Sara Gonzalez"; Resultados[6] = 78;
        Usuarios[7]= "Tom Ospina"; Resultados[7] = 67;
        Usuarios[8]= "Diana Cruz"; Resultados[8] = 32;
        Usuarios[9]= "Rodolfo Buenaventura"; Resultados[9] = 97;
        Cursos[0] = "Manejo de auto";
        Cursos[1] = "Señales de transito";
        Cursos[2] = "Reglas del manejo";
        Cursos[3] = "Leyes en la via";

        for (int i =1 ; i <= 8; i++){

            while (estado == true){
                Menu_inicial();
                this.opc = this.capturarDatoInt();
                switch (opc){
                    case 0:
                        return;
                    case 1:
                        System.out.println("¿A que curso desea inscribirse?");
                        System.out.println("1. "+Cursos[0]);
                        System.out.println("2. "+Cursos[1]);
                        System.out.println("3. "+Cursos[2]);
                        System.out.println("4. "+Cursos[3]);
                        this.opcc = this.capturarDatoInt();
                        switch (opcc){

                            case 1:
                                System.out.println(Cursos[0]);
                                Menu_cursos();
                                System.out.println(Usuario+" Ha sido inscrita al curso "+Cursos[0]);
                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            case 2:
                                System.out.println(Cursos[1]);
                                Menu_cursos();
                                System.out.println(Usuario+" Ha sido inscrita al curso "+Cursos[1]);
                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            case 3:
                                System.out.println(Cursos[2]);
                                Menu_cursos();
                                System.out.println(Usuario+" Ha sido inscrita al curso "+Cursos[2]);
                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            case 4:
                                System.out.println(Cursos[3]);
                                Menu_cursos();
                                System.out.println(Usuario+" Ha sido inscrita al curso "+Cursos[3]);
                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            default:
                                System.out.println("Opcion incorrecta");
                            return;
                        }
                    case 2:
                        System.out.println("¿De que curso deseas ver usuarios?");
                        System.out.println("1. "+Cursos[0]);
                        System.out.println("2. "+Cursos[1]);
                        System.out.println("3. "+Cursos[2]);
                        System.out.println("4. "+Cursos[3]);
                        this.opc2 = this.capturarDatoInt();
                        switch (opc2){
                            case 1:
                                System.out.println("Estos son los usuarios que han presentado el curso "+Cursos[0]);
                                System.out.println( Usuarios[1]);
                                System.out.println( Usuarios[4]);
                                System.out.println( Usuarios[6]);
                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            case 2:
                                System.out.println("Estos son los usuarios que han presentado el curso "+Cursos[1]);
                                System.out.println( Usuarios[0]);
                                System.out.println( Usuarios[9]);
                                System.out.println( Usuarios[7]);
                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            case 3:
                                System.out.println("Estos son los usuarios que han presentado el curso "+Cursos[2]);
                                System.out.println( Usuarios[2]);
                                System.out.println( Usuarios[8]);

                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            case 4:
                                System.out.println("Estos son los usuarios que han presentado el curso "+Cursos[3]);
                                System.out.println( Usuarios[5]);
                                System.out.println( Usuarios[3]);

                                System.out.println("¿Desea seguir usando la app");
                                this.estado = this.capturarBoolean();
                            default:
                                System.out.println("Opcion incorrecta");
                                return;


                        }
                    case 3:
                        System.out.println("Estos son los estudiantes que han aprobado los cursos y sus resultados");
                        System.out.println("Nombre -------------- Resultado --------  Curso");
                        System.out.println( Usuarios[0]+"------"+Resultados[0]+"---"+Cursos[1]);
                        System.out.println( Usuarios[2]+"------"+Resultados[2]+"---"+Cursos[2]);
                        System.out.println( Usuarios[6]+"------"+Resultados[6]+"---"+Cursos[0]);
                        System.out.println( Usuarios[7]+"------"+Resultados[7]+"---"+Cursos[1]);
                        System.out.println( Usuarios[9]+"------"+Resultados[9]+"---"+Cursos[1]);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Estos son los estudiantes que NO aprobaron los cursos y sus resultados");
                        System.out.println("Nombre -------------- Resultado --------  Curso");
                        System.out.println( Usuarios[1]+"------"+Resultados[1]+"---"+Cursos[0]);
                        System.out.println( Usuarios[4]+"------"+Resultados[4]+"---"+Cursos[0]);
                        System.out.println( Usuarios[5]+"------"+Resultados[5]+"---"+Cursos[3]);
                        System.out.println( Usuarios[8]+"------"+Resultados[8]+"---"+Cursos[2]);
                        System.out.println("¿Desea seguir usando la app");
                        this.estado = this.capturarBoolean();


                    default:
                        System.out.println("Opcion incorrecta");
                        return;

                }


            }



        }




    }
    private void Menu_cursos() {
        System.out.println(" Digite Nombre ");
        this.Usuario = this.capturarDatoString();
        System.out.println(" Digite edad");
        this.edad = this.capturarDatoInt();
        System.out.println(" Digite su numero de telefono ");
        this.tel = this.capturarDatoString();

    }
    private void Menu_inicial() {
        System.out.println(" Escuela Automovilistica El Maestro ");
        System.out.println(" Menu de opciones");
        System.out.println(" 1. Registrar usuario en curso");
        System.out.println(" 2. Usuarios que han presentado curso");
        System.out.println(" 3. Usuarios que han aprobado el curso");
        System.out.println(" 0. Salir");

    }


    private String capturarDatoString() {return this.input.nextLine();}
    private  boolean capturarBoolean(){

        return this.input.nextBoolean();
    }
    private int capturarDatoInt() {return this.input.nextInt();}



}
