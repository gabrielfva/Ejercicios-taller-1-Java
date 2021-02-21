package com.gabrielfva.ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String palabra1;
        String palabra2;
        String masLarga;
        String masCorta;
        Scanner capture = new Scanner(System.in);

        System.out.println("Digite la primera palabra: ");
        palabra1 = capture.nextLine();
        System.out.println("Digite la segunda palabra: ");
        palabra2 = capture.nextLine();

        if(palabra1.equals(palabra2))
            System.out.println("Las palabras son iguales");
        else {
            System.out.println("Las palabras son diferentes");

            if(palabra1.length() >= palabra2.length()) {
                masLarga = palabra1;
                masCorta = palabra2;
            }
            else {
                masLarga = palabra2;
                masCorta = palabra1;
            }
            String diferencia = "";
            for(int i = 0; i < masLarga.length(); i ++){
                if (i < masCorta.length()) {
                    if (masLarga.charAt(i) != masCorta.charAt(i))
                        diferencia = diferencia.concat("[" + masLarga.charAt(i) + "]");
                }
                else
                    diferencia = diferencia.concat("[" + masLarga.charAt(i) + "]");
            }
            System.out.println("La diferencia es: " + diferencia);
        }
    }
}
