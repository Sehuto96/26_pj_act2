package com.example;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.mostrarDetalles();
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();
        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        CuentaBancaria cuenta = new CuentaBancaria("Maria", 400);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficientes

        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo(); // Debería indicar REPROBADO
    }

    
}