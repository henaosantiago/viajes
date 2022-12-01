package org.example.Controladores;

import java.util.Scanner;

public class Transporte {
    private String tipoTransporte;
    private double costoTrasporte;
    private String fechaInicioTrasporte;
    private String fechaFinDeTrasporte;

    public Transporte() {
    }

    public String getTipoTransporte() {
        return this.tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getCostoTrasporte() {
        return this.costoTrasporte;
    }

    public void setCostoTrasporte(double costoTrasporte) {
        if (costoTrasporte < 0.0) {
            System.out.println("Ingrese un valor de transporte valido");
        } else {
            this.costoTrasporte = costoTrasporte;
        }

    }

    public String getFechaInicioTrasporte() {
        return this.fechaInicioTrasporte;
    }

    public void setFechaInicioTrasporte(String fechaInicioTrasporte) {
        this.fechaInicioTrasporte = fechaInicioTrasporte;
    }

    public String getFechaFinDeTrasporte() {
        return this.fechaFinDeTrasporte;
    }

    public void setFechaFinDeTrasporte(String fechaFinDeTrasporte) {
        this.fechaFinDeTrasporte = fechaFinDeTrasporte;
    }

    public void agregarTransporte() {
        Scanner read = new Scanner(System.in);
        System.out.println("*****DATOS DEL TRASPORTE*****");
        System.out.println("Ingrese el tipo de transporte: ");
        this.setTipoTransporte(read.next());
        System.out.println("Ingrese la fecha de inicio del transporte: ");
        this.setFechaInicioTrasporte(read.next());
        System.out.println("Ingrese la fecha final del transporte: ");
        this.setFechaFinDeTrasporte(read.next());
        System.out.println("Ingrese el costo del transporte: ");
        this.setCostoTrasporte(read.nextDouble());
    }
}