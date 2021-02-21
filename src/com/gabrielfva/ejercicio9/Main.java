package com.gabrielfva.ejercicio9;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String frase = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println("Frase original: " + frase);

        frase = frase.replace('a', 'e');
        frase = frase.concat(". Esté siempre dispuesto a regalar una sonrisa :)");
        System.out.println("Nueva frase es: " + frase);
    }
}
