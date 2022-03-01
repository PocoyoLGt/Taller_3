package Sexto;

import java.util.Scanner;

public class Punto_6 {
    private String nombre, tel, org, tel1,eliminar, tel2;
    private int i,op;
    private boolean estado, eli;

    private Scanner input;
    public void Punto_6(){

        this.input = new Scanner(System.in);
        this.estado = true;
        this.Menu_principal();
        this.op = this.capturarDatoInt();
        switch (op){
            case 1:
                while (estado == true){

                    for (int i =1 ; i <= 1; i++){
                        Menu_2();
                        this.nombre = this.capturarDatoString();
                        System.out.println(" Digite el numero del contacto  ");
                        this.tel = this.capturarDatoString();
                        System.out.println("  Digite la organizacion que pertenece ");
                        this.org = this.capturarDatoString();
                        System.out.println("  ------------------------------------");
                        System.out.println("  Nuevo contacto: "+nombre);
                        System.out.println("  Numero de telefono: "+tel);
                        System.out.println("  Organizacion: "+org);

                    }
                    System.out.println("  ------------------------------------");
                    System.out.println("  ¿Desea seguir agregando contactos? ");
                    this.estado = this.capturarBoolean();
                    for (int i =1 ; i <= 1; i++){
                        Menu_2();
                        this.nombre = this.capturarDatoString();
                        System.out.println(" Digite el numero del contacto  ");
                        this.tel1 = this.capturarDatoString();
                        if (tel1.equals(tel)){
                            System.out.println(" Este numero ya esta en la lista, digite uno nuevo ");
                        }
                        System.out.println("  Digite la organizacion que pertenece ");
                        this.org = this.capturarDatoString();
                        System.out.println("  ------------------------------------");
                        System.out.println("  Nuevo contacto: "+nombre);
                        System.out.println("  Numero de telefono: "+tel1);
                        System.out.println("  Organizacion: "+org);

                    }
                    System.out.println("  ------------------------------------");
                    System.out.println("  ¿Desea seguir agregando contactos? ");
                    this.estado = this.capturarBoolean();
                    for (int i =1 ; i <= 1; i++){
                        Menu_2();
                        this.nombre = this.capturarDatoString();
                        System.out.println(" Digite el numero del contacto  ");
                        this.tel2 = this.capturarDatoString();
                        if (tel2.equals(tel1)&& tel2.equals(tel)){
                            System.out.println(" Este numero ya esta en la lista, digite uno nuevo ");
                        }
                        System.out.println("  Digite la organizacion que pertenece ");
                        this.org = this.capturarDatoString();
                        System.out.println("  ------------------------------------");
                        System.out.println("  Nuevo contacto: "+nombre);
                        System.out.println("  Numero de telefono: "+tel2);
                        System.out.println("  Organizacion: "+org);

                    }
                    System.out.println("  ¿Desea seguir agregando contactos? ");
                    this.estado = this.capturarBoolean();

                }



            case 2:
                System.out.println("  ¿Que contacto desea eliminar? ");
                this.eliminar = this.capturarDatoString();
                System.out.println("  ¿Seguro desea eliminar a "+ eliminar+" ?");
                this.eli = this.capturarBoolean();
                if (eli == true){
                    System.out.println("  El contacto "+ eliminar+" ha sido eliminado");
                }else {
                    System.out.println("El contacto no fue eliminado");
                }

            case 3:
                System.out.println("Usted ha salido de la aplicacion");
                return;

            default:

                System.out.println("Opción incorrecta");
                return;







        }

    }
    private void Menu_2(){
        System.out.println(" Añadir nuevo contacto  ");
        System.out.println("  Digite nombre del contacto ");
    }

    private void Menu_principal(){
        System.out.println("Menu de opciones ");
        System.out.println(" 1. Agregar contactos");
        System.out.println(" 2. Eliminar Contacto");
        System.out.println(" 3. Salir");
    }

    private String capturarDatoString() {return this.input.nextLine();}
    private  boolean capturarBoolean(){

        return this.input.nextBoolean();
    }
    private int capturarDatoInt() {return this.input.nextInt();}


}
