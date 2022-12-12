package org.example.Controladores;
import java.util.Scanner;

public class Hospedaje extends Transporte {
    private String tipoHospedaje;
    private double valorHospedaje;
    private int nochesHospedaje;
    private String fechaInicioHospedaje;
    private String fechaFinalHospedaje;

    private String id;

    public String getFechaFinalHospedaje() {
        return fechaFinalHospedaje;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Hospedaje() {
    }

    public String getTipoHospedaje() {
        return this.tipoHospedaje;
    }

    public void setTipoHospedaje(String tipoHospedaje) {
        this.tipoHospedaje = tipoHospedaje;
    }

    public double getValorHospedaje() {
        return this.valorHospedaje;
    }

    public void setValorHospedaje(double valorHospedaje) {
        if (valorHospedaje < 0.0) {
            System.out.println("Ingrese un valor de hospedaje valido");
        } else {
            this.valorHospedaje = valorHospedaje;
        }

    }

    public int getNochesHospedaje() {
        return this.nochesHospedaje;
    }

    public void setNochesHospedaje(int nochesHospedaje) {
        if (nochesHospedaje < 0) {
            System.out.println("Ingrese un numero de noches valido");
        } else {
            this.nochesHospedaje = nochesHospedaje;
        }

    }

    public String getFechaInicioHospedaje() {
        return this.fechaInicioHospedaje;
    }

    public void setFechaInicioHospedaje(String fechaInicioHospedaje) {
        this.fechaInicioHospedaje = fechaInicioHospedaje;
    }

    public String getFechaFinal() {
        return this.fechaFinalHospedaje;
    }

    public void setFechaFinalHospedaje(String fechaFinalHospedaje) {
        this.fechaFinalHospedaje = fechaFinalHospedaje;
    }

    public void agregarHospedaje() {
        Scanner read = new Scanner(System.in);
        System.out.println("*****DATOS DE HOSPEDAJE*****");
        System.out.println("ingrese el id del empleado que se va a hospedar");
        this.setId(read.next());
        System.out.println("Ingrese el tipo de Hospedaje: ");
        this.setTipoHospedaje(read.next());
        System.out.println("Ingrese fecha de inicio de Hospedaje: ");
        this.setFechaInicioHospedaje(read.next());
        System.out.println("Ingrese fecha de salida de Hospedaje: ");
        this.setFechaFinalHospedaje(read.next());
        System.out.println("Ingrese numero de noches de Hospedaje:");
        this.setNochesHospedaje(read.nextInt());
        System.out.println("Ingrese el valor del Hospedaje: ");
        this.setValorHospedaje(read.nextDouble());
    }
}