package com.gabrielfva.ejercicio4;

import java.util.Scanner;

public class Main {

    public static final double IVA = 0.21;

    public static void main(String[] args) {
        // write your code here
        double precio;
        Scanner capture = new Scanner(System.in);

        System.out.println("Digite el precio: ");
        precio = capture.nextDouble();

        double precioIVA = precio * IVA;
        precio = precio + (precio * IVA);

        System.out.println("IVA es: " + precioIVA);
        System.out.println("Precio con IVA incluido: " + precio);
    }
}
