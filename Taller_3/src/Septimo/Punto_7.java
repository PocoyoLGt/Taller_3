package Septimo;

import java.util.Scanner;

public class Punto_7 {
    private Scanner input;
    private boolean estado;
    private int i,opc,tel;
    private String placa, cliente, marca;


    public void Punto_7(){
        String[] Placas = new String[5];
        String[] Clientes = new String[5];
        int [] Telefonos = new int[5];
        String[] Marcas = new String[3];
        this.input = new Scanner(System.in);
        Placas[0]= "DLC-32E"; Clientes[0]= "Luisa Neira"; Telefonos[0]= 321-8503784; Marcas[0]= "Toyota";
        Placas[1]= "FTD-59V"; Clientes[1]= "Julian Correa"; Telefonos[1]= 311-7804285 ; Marcas[1]= "Mazda";
        Placas[2]= "CJG-76S"; Clientes[2]= "Gonzalo Valencia"; Telefonos[2]= 310-46095455; Marcas[2]= "Audi";
        Placas[3]= "ERL-19S"; Clientes[3]= "Alejandra Ramirez"; Telefonos[3]= 320-6109768 ;
        Placas[4]= "CBC-29E"; Clientes[4]= "Diana Perez"; Telefonos[4]= 321-2059345;
        this.estado = true;

        for(int i=1; i<= 5 ; i++){
            do {
                this.Menu_Principal();
                this.opc = this.capturarDatoInt();
                switch (opc){
                    case 0:
                    System.out.println("Hasta luego");
                    return;
                    case 1:
                        System.out.println("Registre nombre completo");
                        this.cliente = this.capturarDatoString();
                        System.out.println("Registre placa");
                        this.placa = this.capturarDatoString();
                        if (placa.equals(Placas[0])){System.out.println("Esta placa ya esta en el parqueadero");}
                        if (placa.equals(Placas[1])){System.out.println("Esta placa ya esta en el parqueadero");}
                        if (placa.equals(Placas[2])){System.out.println("Esta placa ya esta en el parqueadero");}
                        if (placa.equals(Placas[3])){System.out.println("Esta placa ya esta en el parqueadero");}
                        if (placa.equals(Placas[4])){System.out.println("Esta placa ya esta en el parqueadero");}
                        System.out.println("Registre marca");
                        this.marca = this.capturarDatoString();
                        System.out.println("Registre numero de telefono");
                        this.tel = this.capturarDatoInt();

                        System.out.println("------------------------------------");
                        System.out.println("Nuevo Registro");
                        System.out.println("Usuario: "+cliente);
                        System.out.println("Placa: "+placa);
                        System.out.println("Marca: "+marca);
                        System.out.println("Telefono: "+tel);
                        System.out.println("------------------------------------");
                        System.out.println("¿Desea continuar en el sistema?");
                        this.estado = this.capturarBoolean();
                        return;
                    case 2:
                        System.out.println("¿Que carro desea retirar?, digite la placa");
                        this.placa = this.capturarDatoString();
                        if (placa.equals(Placas[0])){System.out.println("La placa ha sido retirada del parquedero con exito");}
                        if (placa.equals(Placas[1])){System.out.println("La placa ha sido retirada del parquedero con exito");}
                        if (placa.equals(Placas[2])){System.out.println("La placa ha sido retirada del parquedero con exito");}
                        if (placa.equals(Placas[3])){System.out.println("La placa ha sido retirada del parquedero con exito");}
                        if (placa.equals(Placas[4])){System.out.println("La placa ha sido retirada del parquedero con exito");}
                        else {System.out.println("Esta placa no se encontro en el parqueadero");}

                        System.out.println("¿Desea continuar en el sistema?");
                        this.estado = this.capturarBoolean();
                        return;
                    case 3:
                        System.out.println("¿Que carro desea buscar?, digite la placa");
                        this.placa = this.capturarDatoString();
                        if (placa.equals(Placas[0])){
                            System.out.println("El vehiculo se encutra en el parqueadero");
                            System.out.println("Dueño del vehiculo: "+Clientes[0]);
                            System.out.println("Placa: "+Placas[0]);
                            System.out.println("Marca: "+Marcas[0]);
                            System.out.println("Telefono: "+Telefonos[0]);
                        }
                        if (placa.equals(Placas[1])){
                            System.out.println("El vehiculo se encutra en el parqueadero");
                            System.out.println("Dueño del vehiculo: "+Clientes[1]);
                            System.out.println("Placa: "+Placas[1]);
                            System.out.println("Marca: "+Marcas[1]);
                            System.out.println("Telefono: "+Telefonos[1]);

                        }
                        if (placa.equals(Placas[2])){
                            System.out.println("El vehiculo se encutra en el parqueadero");
                            System.out.println("Dueño del vehiculo: "+Clientes[2]);
                            System.out.println("Placa: "+Placas[2]);
                            System.out.println("Marca: "+Marcas[2]);
                            System.out.println("Telefono: "+Telefonos[2]);

                        }
                        if (placa.equals(Placas[3])){
                            System.out.println("El vehiculo se encutra en el parqueadero");
                            System.out.println("Dueño del vehiculo: "+Clientes[3]);
                            System.out.println("Placa: "+Placas[3]);
                            System.out.println("Marca: "+Marcas[1]);
                            System.out.println("Telefono: "+Telefonos[3]);

                        }
                        if (placa.equals(Placas[4])){
                            System.out.println("El vehiculo se encutra en el parqueadero");
                            System.out.println("Dueño del vehiculo: "+Clientes[4]);
                            System.out.println("Placa: "+Placas[4]);
                            System.out.println("Marca: "+Marcas[2]);
                            System.out.println("Telefono: "+Telefonos[4]);

                        }
                        else {System.out.println("Esta placa no se encontro en el parqueadero");}

                        System.out.println("¿Desea continuar en el sistema?");
                        this.estado = this.capturarBoolean();
                        return;
                    default:
                        System.out.println("Opcion incorrecta");
                        return;


                }

            }while (estado== false);



        }





    }



    private String capturarDatoString() {return this.input.nextLine();}
    private  boolean capturarBoolean(){

        return this.input.nextBoolean();
    }
    private int capturarDatoInt() {return this.input.nextInt();}

    private void Menu_Principal(){
        System.out.println("----------------------------");
        System.out.println("MENU DE OPCIONES -- PARQUEADERO EL GUARDIAN ");
        System.out.println("1. Ingresar al parquedero ");
        System.out.println("2. Retirar del parqueadero");
        System.out.println("3. Consultar vehiculo");
        System.out.println("4. Salir del sistema");
    }

}
