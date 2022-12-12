package org.example;

import org.example.Controladores.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
                new Alimentacion();
                new Hospedaje();
                new Transporte();
                new Vuelos();
                ArrayList<Empleado> empleados = new ArrayList();
                System.out.println("**********ELIGE UNA OPCION************");

                System.out.println("          1. Empleado");
                System.out.println("          2. Mostrar Empleados");
                System.out.println("          3. Mostrar Viajes");
                System.out.println("          4. mostrar la comida  " );
                System.out.println("          5. mostrar viajes por empleados " );
                System.out.println("          6. Salir del menu");
                int opcion;
                label23:
                do {
                    System.out.println("Ingrese opcion del menu: ");
                    opcion = read.nextInt();
                    switch (opcion) {
                        case 0:
                            System.out.println("hasta luego ,vuelve pronto");
                            break;
                        case 1:
                            Empleado objetoEmpleado = new Empleado();
                            objetoEmpleado.agregarEmpleado();
                            empleados.add(objetoEmpleado);
                            break;

                        case 2:
                            Iterator var9 = empleados.iterator();

                            while(true) {
                                if (!var9.hasNext()) {
                                    continue label23;
                                }

                                Empleado empleado = (Empleado)var9.next();
                                System.out.println("*************DATOS DEL EMPLEADO*******************");
                                System.out.println("id:"+empleado.getId());
                                System.out.println("Nombre Empleado: " + empleado.getNombre());
                                System.out.println("Apellido: " + empleado.getApellido());
                                System.out.println("Cargo: " + empleado.getCargo());
                                System.out.println("Salario: " + empleado.getSalario());

                            }

                        case 3:
                            Iterator var = empleados.iterator();

                            while(true) {
                                if (!var.hasNext()) {
                                    continue label23;
                                }

                                Vuelos vuelos = (Vuelos) var.next();
                                System.out.println("*************LOS DATOS DEL  VUELO*******************");
                                System.out.println(" tipo de vuelo es:" +vuelos.getTipoVuelo ());
                                System.out.println(" el origen del vuelo es: " +vuelos.getOrigen ());
                                System.out.println(" el destino del vuelo es: " +vuelos.getDestino ());
                                System.out.println(" la fecha de salida del vuelo es : " +vuelos.getFechaDeSalida ());
                                System.out.println(" la fecha de llegada del vuelo es: " +vuelos.getFechaDeLlegada ());
                                System.out.println(" el valor del vuelo es: " +vuelos.getValorVuelo ());

                            }




                        case 4:
                            Iterator var2 = empleados.iterator();

                            while(true) {
                                if (!var2.hasNext()) {
                                    continue label23;
                                }

                                Alimentacion  Alimentacion = (Alimentacion) var2.next();
                                System.out.println("************LOS DATOS DE ALIMENTACION*******************");
                                System.out.println(" la fecha de comida es  :" +Alimentacion.getFechaDeComida ());
                                System.out.println(" cantidad de comida consumia: " +Alimentacion.getCantidadComidas ());
                                System.out.println(" valor de la alimentracion: " +Alimentacion.getValorComidas ());



                            }
                        case 5:
                            System.out.println("ingrese el id del empleado");
                            String idEmpleado = read.next();
                            for (Empleado empleado:empleados ) {

                             if (empleado.getId( ).equals(idEmpleado)){
                                 System.out.println("ya encontro el empleado");
                                 System.out.println("el nombre del empleado es:"+empleado.getNombre());
                                 System.out.println("Apellido: " + empleado.getApellido());
                                 System.out.println("Cargo: " + empleado.getCargo());
                                 System.out.println("Salario: " + empleado.getSalario());
                                 System.out.println("los vuelos del empleado son :"+empleado.getTipoVuelo());
                                 System.out.println(" el origen del vuelo es: " +empleado.getOrigen ());
                                 System.out.println(" el destino del vuelo es: " +empleado.getDestino ());
                                 System.out.println(" la fecha de salida del vuelo es : " +empleado.getFechaDeSalida ());
                                 System.out.println(" la fecha de llegada del vuelo es: " +empleado.getFechaDeLlegada ());
                                 System.out.println(" el valor del vuelo es: " +empleado.getValorVuelo ());
                             }  else {

                             }
                            }


                            break ;






                                default:
                            System.out.println("Selecciona una opción valida");
                    }
                } while(opcion != 0);

            }
        }

