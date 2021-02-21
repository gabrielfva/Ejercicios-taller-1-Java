package com.gabrielfva.ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int var1 = 0;
        int var2 = 0;
        Scanner capture = new Scanner(System.in);

        System.out.println("Escriba el primer número: ");
        var1 = capture.nextInt();
        System.out.println("Escriba el segundo número: ");
        var2 = capture.nextInt();

        if (var1 > var2)
            System.out.println("El número 1 es mayor que el número 2");
        else
            if(var1 < var2)
                System.out.println("El número 2 es mayor que el número 1");
            else
                System.out.println("Los números son iguales");
    }
}