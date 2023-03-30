package com.company;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String nombre, String apellido, int dni, String email, String direccion, double salario, String turno) {
        super(nombre, apellido, dni, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double salarioAnual()
    {
        return salario*12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
