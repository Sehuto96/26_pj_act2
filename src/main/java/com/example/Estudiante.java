package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

   // Validación edad > 0
    public void setEdad(int edad) {

        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor a 0.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    // Validación promedio entre 0 y 5
    public void setPromedio(double promedio) {

        if (promedio >= 0 && promedio <= 5) {
            this.promedio = promedio;
        } else  {
            System.out.println("El promedio debe estar entre 0 y 5.");
        } 
    }

    private static final double NOTA_APROBACION = 3.0;
    // Método lógico (retorna boolean)
    public boolean haAprobado() {

        return promedio >= NOTA_APROBACION;
    }

    // Mostrar información
    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }

}