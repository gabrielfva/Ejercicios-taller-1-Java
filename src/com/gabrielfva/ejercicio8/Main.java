package com.gabrielfva.ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String dia = "";
        Scanner capture = new Scanner(System.in);

        System.out.println("Escriba un día de la semana: ");
        dia = capture.next();
        dia = dia.toLowerCase();

        switch(dia){
            case "lunes":
                System.out.println("Lunes es laboral");
                break;
            case "martes":
                System.out.println("Martes es laboral");
                break;
            case "miercoles":
                System.out.println("Miércoles es laboral");
                break;
            case "jueves":
                System.out.println("Jueves es laboral");
                break;
            case "viernes":
                System.out.println("Viernes es laboral");
                break;
            case "sabado":
                System.out.println("Sábado es laboral");
                break;
            case "domingo":
                System.out.println("Domingo es laboral");
                break;
            default:
                System.out.println("El día no existe");
        }

    }
}
