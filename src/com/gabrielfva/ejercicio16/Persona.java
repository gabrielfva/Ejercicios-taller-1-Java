package com.gabrielfva.ejercicio16;

public class Persona {
    static final String SEXO = "H";
    static final int PESOIDEAL = -1;
    static final int PESOBAJO = 0;
    static final int SOBREPESO = 1;

    private String nombre = "";
    private int edad = 0;
    private String sexo = SEXO;
    private String dni;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String generarDNI() {
        String cadenaNumero = "";
        String dni = "";
        for(int i = 0; i < 8; i++){
            cadenaNumero = cadenaNumero + String.valueOf((int)(Math.random()*9 + 1));
        }
        char letra = letraDNI(Integer.parseInt(cadenaNumero));
        dni = cadenaNumero + "-" + letra;
        return dni;
    }

    public char letraDNI(int aleatorio){
        int codigoDNI;
        char [] letraDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        codigoDNI = aleatorio % 23;
        return letraDNI[codigoDNI];
    }

    public int calcularIMC(){
        int resultIMC = -2;
        double pesoIdeal = this.peso / Math.pow(this.altura, 2);
        if(pesoIdeal < 20)
            resultIMC = PESOIDEAL;
        else if(pesoIdeal >= 20 && pesoIdeal <= 25)
            resultIMC = PESOBAJO;
        else if(pesoIdeal > 25)
            resultIMC = SOBREPESO;
        return resultIMC;
    }

    public boolean esMayorDeEdad(){
        if(this.edad < 18)
            return false;
        else
            return true;
    }
    public String comprobarSexo(String sexo){
        if(sexo.compareTo("M") == 0 || sexo.compareTo("H") == 0)
            return sexo;
        else
            return SEXO;
    }

    public String toString(){

        return  ("DNI: " + this.dni + "\n" +
                 "Nombre: " + this.nombre + "\n" +
                 "Edad: " + this.edad + "\n" +
                 "Sexo: " + this.sexo + "\n" +
                 "Peso: " + this.peso + "\n" +
                 "Altura: " + this.altura);
    }
}
