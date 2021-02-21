package com.gabrielfva.ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String frase = "";
        Scanner capture = new Scanner(System.in);

        System.out.println("Digite una frase: ");
        frase = capture.nextLine();

        System.out.println(frase.replace(" ", ""));
    }
}
