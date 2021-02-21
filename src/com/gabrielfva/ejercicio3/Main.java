package com.gabrielfva.ejercicio3;

import java.util.Scanner;

public class Main {

    public static final double PI = 3.1416;

    public static void main(String[] args) {
        // write your code here
        double area;
        String radioText;
        Scanner capture = new Scanner(System.in);

        System.out.println("Digite el radio del círculo: ");
        radioText = capture.next();
        double valor = Double.parseDouble(radioText);

        area = PI * Math.pow(valor, 2);

        System.out.println("El área del círculo es: " + area + " metros cuadrados");
    }
}
