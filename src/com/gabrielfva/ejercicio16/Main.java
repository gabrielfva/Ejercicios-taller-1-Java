package com.gabrielfva.ejercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList() ;
        String nombre;
        String sexo ="";
        int edad;
        double peso;
        double altura;

        Scanner capture = new Scanner(System.in);

        System.out.println("Digite el nombre de la persona: ");
        nombre = capture.nextLine();
        System.out.println("Digite el sexo de la persona (H o M): ");
        sexo = capture.nextLine();
        System.out.println("Digite la edad de la persona: ");
        edad = capture.nextInt();
        System.out.println("Digite el peso de la persona (Kg): ");
        peso = capture.nextDouble();
        System.out.println("Digite la altura de la persona (m): ");
        altura = capture.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        personas.add(persona1);
        Persona persona2 = new Persona(nombre, edad, sexo);
        personas.add(persona2);
        Persona persona3 = new Persona();

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        sexo = persona3.comprobarSexo(sexo);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        personas.add(persona3);

        for(int i = 0; i < personas.size(); i ++){
            System.out.println("Persona " + (i + 1));
            System.out.println(personas.get(i).toString());
            System.out.println("IMC: " + mensajeIMC(personas.get(i).calcularIMC()));
            System.out.println(mensajeMayorEdad(personas.get(i).esMayorDeEdad()) + "\n");
        }
    }

    private static String mensajeIMC(int peso) {
        String mensaje = "";
        switch (peso){
            case -1:
                mensaje = "La persona está en su peso ideal";
                break;
            case 0:
                mensaje =  "La persona está por debajo de su peso ideal";
                break;
            case 1:
                mensaje = "La persona está en sobrepeso";
                break;
            default:
                mensaje = "No es posible calcular IMC";
        }
        return mensaje;
    }

    private static String mensajeMayorEdad(boolean esMayorDeEdad) {
        String mensaje = "";
        if(esMayorDeEdad){
            mensaje = "Es mayor de edad";
        }
        else{
            mensaje = "Es menor de edad";
        }
        return mensaje;
    }

}
