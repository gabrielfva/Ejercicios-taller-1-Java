package com.gabrielfva.ejercicio13;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // write your code here

        int horas;
        int minutos;
        int segundos;
        String anio;
        String mes;
        String dia;
        Date fecha = new Date();
        Calendar calendario = Calendar.getInstance();

        anio = Integer.toString(calendario.get(Calendar.YEAR));
        mes = Integer.toString(calendario.get(Calendar.MONTH));
        dia = Integer.toString(calendario.get(Calendar.DATE));
        horas = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        System.out.println("(" + anio + "/" + mes + "/" + dia + ") (" + horas + ":" + minutos + ":" + segundos + ")");
    }
}
