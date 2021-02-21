package com.gabrielfva.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int opcion = 0;
        Scanner capture = new Scanner(System.in);

        do{
            System.out.println("\n****** GESTIÓN CINEMATOGRÁFICA ******");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELÍCULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            System.out.println("Digite la opción que desea: ");
            opcion = capture.nextInt();

            switch (opcion){
                case 8:
                    break;
                default:
                    if(opcion > 8)
                        System.out.println("OPCIÓN INCORRECTA");
            }
        }while(opcion != 8);
    }
}
