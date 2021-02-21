package com.gabrielfva.ejercicio1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int var1 = -5;
        int var2 = -5;

        if (var1 > var2)
            System.out.println("La variable 1 es mayor que la variable 2");
        else
            if(var1 < var2)
                System.out.println("La variable 2 es mayor que la variable 1");
            else
                System.out.println("Las variables son iguales");
    }
}