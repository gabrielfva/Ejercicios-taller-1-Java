package com.gabrielfva.ejercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String frase = "";
        int conVocales = 0;
        Scanner capture = new Scanner(System.in);

        System.out.println("Digite una frase: ");
        frase = capture.nextLine();
        frase = frase.toLowerCase();

        for(int i = 0; i < frase.length(); i ++){
            if((frase.charAt(i) =='a') || (frase.charAt(i) =='e') || (frase.charAt(i) =='i')
                    || (frase.charAt(i) =='o') || (frase.charAt(i) =='u')){
                conVocales += 1;
            }
        }

        System.out.println("La longitud de la frase es " + frase.length()
                + " y la cantidad de vocales que tiene es: " + conVocales);
    }
}
