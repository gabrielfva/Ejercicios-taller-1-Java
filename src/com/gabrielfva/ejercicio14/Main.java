package com.gabrielfva.ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int numero;
        Scanner capture = new Scanner(System.in);

        System.out.println("Digite un número: ");
        numero = capture.nextInt();

        for(int i = numero; i <= 1000; i = (i + 2)){
            System.out.println(i);
        }
    }
}
