package com.gabrielfva.Ejercicio17;

import com.gabrielfva.ejercicio16.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String [] AVALIABLECOLOURS = {"blanco", "negro", "rojo", "azul", "gris"};
    private static final String [] LETTERS = {"A", "B", "C", "D", "E", "F"};

    public static void main(String[] args) {
        // write your code here
        ArrayList<Persona> personas = new ArrayList() ;
        Appliance appliance = new Appliance();
        String letter;
        boolean letterExists = false, colorExists = false;
        double basePrice, peso;
        String color;
        Appliance [] arrayAppliance = new Appliance[10];

        Scanner capture = new Scanner(System.in);

        System.out.println("Digite el precio base: ");
        basePrice = capture.nextDouble();

        do{
            System.out.println("Digite el color [blanco, negro, rojo, azul, gris]: ");
            color = capture.nextLine().toLowerCase();
            colorExists = checkColor(color);
        }while(!colorExists);

        do{
            System.out.println("Digite el consumo energético (Letras entre A y F): ");
            letter = capture.nextLine().toUpperCase();
            letterExists = checkEnergyConsumption(letter);
        }while(!letterExists);

        System.out.println("Digite el peso: ");
        peso = capture.nextDouble();
    }

    private static boolean checkEnergyConsumption(String letter){
        boolean letterExists = false;

        if(letter.compareTo("A") == 0 || letter.compareTo("B") == 0 || letter.compareTo("C") == 0 ||
                letter.compareTo("D") == 0 || letter.compareTo("E") == 0 || letter.compareTo("F") == 0){
            letterExists = true;
        }
        else {
            letterExists = false;
        }
        return letterExists;
    }

    private static int letterPosition(String letter){
        int position = 0;
        for(int i = 0; i < LETTERS.length; i ++){
            position =  i;
        }
        return position;
    }

    public static boolean checkColor(String color){
        boolean result = false;

        for (String avaliableColor : AVALIABLECOLOURS) {
            if (avaliableColor.compareTo(color) == 0) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}