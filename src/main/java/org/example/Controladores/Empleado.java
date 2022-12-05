package org.example.Controladores;
import java.util.Scanner;

public class Empleado extends Vuelos {
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad < 16) {
            System.out.println("Ingrese una edad valida");
        } else if (edad > 105) {
            System.out.println("Edad erronea");
        } else {
            this.edad = edad;
        }

    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("senior")) {
            this.cargo = cargo;
        } else if (cargo.equals("junior")) {
            this.cargo = cargo;
        } else {
            System.out.println("Cargo erroneo");
        }

    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Ingresa una cantidad de salario valida");
        } else {
            this.salario = salario;
        }

    }

    public void agregarEmpleado() {
        Scanner read = new Scanner(System.in);
        System.out.println("        ******BUENAS TARDES*********");
        System.out.println("       ****AGREGANDO EMPLEADO*****");
        System.out.println("Ingrese identificacion: ");
        this.setId(read.next());
        System.out.println("Ingrese nombre del empleado: ");
        this.setNombre(read.next());
        System.out.println("Ingrese el apellido del empleado: ");
        this.setApellido(read.next());
        System.out.println("Ingrese la edad del empleado: ");
        this.setEdad(read.nextInt());
        System.out.println("Ingrese el cargo del empleado: ");
        this.setCargo(read.next());
        System.out.println("Ingrese el salario del empleado: ");
        this.setSalario(read.nextDouble());
        System.out.println("0. volver atras");
        System.out.println("1. Alimentacion");
        System.out.println("2. Hospedaje");
        System.out.println("3. Trasporte");
        System.out.println("4. Vuelos");


        int opcion;
        do {
            System.out.println(" Ingrese  una  opcion del menu: ");
            opcion = read.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("****BUENAS TARDES******");
                    System.out.println("0. Salir del menu");
                    System.out.println("1. Empleado");
                    System.out.println("2. Mostrar Empleados");
                    System.out.println("3. Mostrar Viajes");
                    System.out.println("4. mostrar los datos de la comida" );
                    System.out.println("5. mostrar viajes por empleados " );
                    break;
                case 1:
                    this.agregarComidas();
                    System.out.println("0. volver atras");
                    System.out.println("1. Alimentacion");
                    System.out.println("2. Hospedaje");
                    System.out.println("3. Trasporte");
                    System.out.println("4. Vuelos");

                    break;
                case 2:
                    this.agregarHospedaje();
                    System.out.println("0. volver atras");
                    System.out.println("1. Alimentacion");
                    System.out.println("2. Hospedaje");
                    System.out.println("3. Trasporte");
                    System.out.println("4. Vuelos");
                    break;
                case 3:
                    this.agregarTransporte();
                    System.out.println("0. volver atras");
                    System.out.println("1. Alimentacion");
                    System.out.println("2. Hospedaje");
                    System.out.println("3. Trasporte");
                    System.out.println("4. Vuelos");
                    break;
                case 4:
                    this.agregarVuelo();
                    System.out.println("0. volver atras");
                    System.out.println("1. Alimentacion");
                    System.out.println("2. Hospedaje");
                    System.out.println("3. Trasporte");
                    System.out.println("4. Vuelos");
                    break;
                default:
                    System.out.println("ingresa una opcion erronea");
            }
        } while(opcion != 0);

    }

    public double bonoViejes() {
        double bonoViaje = 0.0;
        if (this.cargo.equals("junior") && this.getTipoVuelo().equals("nacional")) {
            bonoViaje = this.salario * 0.2;
        } else if (this.cargo.equals("junior") && this.getTipoVuelo().equals("internacional")) {
            bonoViaje = this.salario * 0.4;
        } else if (this.cargo.equals("senior") && this.getTipoVuelo().equals("nacional")) {
            bonoViaje = this.salario * 0.3;
        } else if (this.cargo.equals("senior") && this.getTipoVuelo().equals("internacional")) {
            bonoViaje = this.salario * 0.5;
        } else {
            System.out.println("Error de digitacion de cargo o tipo de vuelo");
        }

        return bonoViaje;
    }

    public double calcularCostosTotales() {
        double costos = this.getValorVuelo() + this.getValorComidas() + this.getValorHospedaje() + this.getCostoTrasporte();
        return costos;
    }
}