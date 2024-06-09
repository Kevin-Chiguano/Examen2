package org.kevin.examenmvc;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double sueldoMensual;
    private double monto;
    private int plazo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double sueldoMensual, double monto, int plazo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldoMensual = sueldoMensual;
        this.monto = monto;
        this.plazo = plazo;
    }

    // Getters and Setters for all attributes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double calcularTotal() {
        double interes = 0;
        switch (plazo) {
            case 12:
                interes = 0.25;
                break;
            case 24:
                interes = 0.45;
                break;
            case 36:
                interes = 0.60;
                break;
            case 60:
                interes = 0.75;
                break;
        }
        return monto * (1 + interes);
    }

    public double calcularPagoMensual() {
        return calcularTotal() / plazo;
    }
}
