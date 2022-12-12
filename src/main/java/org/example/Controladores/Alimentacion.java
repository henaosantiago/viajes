package org.example.Controladores;
import java.util.Scanner;

public class Alimentacion extends Hospedaje {
    private String fechaDeComida;
    private int cantidadComidas;
    private double valorComidas;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alimentacion() {
    }

    public String getFechaDeComida() {
        return this.fechaDeComida;
    }

    public void setFechaDeComida(String fechaDeComida) {
        this.fechaDeComida = fechaDeComida;
    }

    public int getCantidadComidas() {
        return this.cantidadComidas;
    }

    public void setCantidadComidas(int cantidadComidas) {
        if (cantidadComidas < 0) {
            System.out.println("ingrese un numero valido de comidas");
        } else {
            this.cantidadComidas = cantidadComidas;
        }

    }

    public double getValorComidas() {
        return this.valorComidas;
    }

    public void setValorComidas(double valorComidas) {
        if (valorComidas <= 0.0) {
            System.out.println("ingrese un valor de comidas valido");
        } else {
            this.valorComidas = valorComidas;
        }

    }

    public void agregarComidas() {
        Scanner read = new Scanner(System.in);
        System.out.println("*******DATOS DE ALIMENTACION*******");
        System.out.println("ingrese el id para los viaticos");
        this.setId(read.next());
        System.out.println("Ingrese la fecha de comida: ");
        this.setFechaDeComida(read.next());
        System.out.println("Ingrese la cantidad de comidas: ");
        this.setCantidadComidas(read.nextInt());
        System.out.println("Ingrese el valor de las comidas: ");
        this.setValorComidas(read.nextDouble());
    }
}
