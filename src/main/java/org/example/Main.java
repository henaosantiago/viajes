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
                ArrayList<Empleado> Empleadó = new ArrayList();
                System.out.println("**********ELIGE UNA OPCION************");
                System.out.println("          0. Salir del menu");
                System.out.println("          1. Empleado");
                System.out.println("          2. Mostrar Empleados");
                System.out.println("          3. Mostrar Viajes");
                System.out.println("          4. mostrar la comida  " );
                System.out.println("          5. mostrar viajes por empleados " );
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
                            Empleadó.add(objetoEmpleado);
                            break;
                        case 2:
                            Iterator var9 = Empleadó.iterator();

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
                            Iterator var = Empleadó.iterator();

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
                            Iterator var2 = Empleadó.iterator();

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





                                default:
                            System.out.println("Selecciona una opción valida");
                    }
                } while(opcion != 0);

            }
        }

