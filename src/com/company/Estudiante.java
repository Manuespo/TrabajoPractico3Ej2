package com.company;

public class Estudiante extends Persona{
    private int ingreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String nombre, String apellido, int dni, String email, String direccion, int ingreso, double cuotaMensual, String carrera) {
        super(nombre, apellido, dni, email, direccion);
        this.ingreso = ingreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ingreso=" + ingreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
