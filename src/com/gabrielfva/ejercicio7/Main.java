package com.gabrielfva.ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int num;
        Scanner capture = new Scanner(System.in);

        do {
            System.out.println("Digite un número: ");
            num = capture.nextInt();
        }while(num < 0);

        System.out.println("El número es: " + num);
    }
}
