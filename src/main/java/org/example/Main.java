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
                System.out.println("0. Salir del menu");
                System.out.println("1. Empleado");
                System.out.println("2. Mostrar Empleados");

                int opcion;
                label23:
                do {
                    System.out.println(" Ingrese opción del menu: ");
                    opcion = read.nextInt();
                    switch (opcion) {
                        case 0:
                            System.out.println("Has salido del sistema");
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
                                System.out.println("*******************************");
                                System.out.println("Nombre Empleado: " + empleado.getNombre());
                                System.out.println("Apellido: " + empleado.getApellido());
                                System.out.println("Cargo: " + empleado.getCargo());
                                System.out.println("Salario: " + empleado.getSalario());
                                System.out.println("Tipo de Vuelo: " + empleado.getTipoVuelo());
                                System.out.println("Gastos totales: " + empleado.calcularCostosTotales());
                                System.out.println("Bono: " + empleado.bonoViejes());
                                System.out.println("*******************************");
                            }
                        default:
                            System.out.println("Selecciona una opción valida");
                    }
                } while(opcion != 0);

            }
        }

