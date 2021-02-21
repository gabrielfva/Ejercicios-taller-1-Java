package com.gabrielfva.Ejercicio17;

public class Appliance {
    private static final String COLORBLANCO = "Blanco";
    private static final String ENERGYCONSUMPTION = "F";
    private static final double BASEPRICE = 100;
    private static final int WEIGHT = 5;

    protected double basePrice = BASEPRICE;
    protected String color = COLORBLANCO;
    protected String energyConsumption = ENERGYCONSUMPTION;
    protected int weight = WEIGHT;

    public Appliance() {
        this.basePrice = BASEPRICE;
        this.color = COLORBLANCO;
        this.energyConsumption = ENERGYCONSUMPTION;
        this.color = COLORBLANCO;
    }

    public Appliance(int basePrice, int weight) {
        this.basePrice = basePrice;
        this.weight = weight;
        this.energyConsumption = ENERGYCONSUMPTION;
        this.color = COLORBLANCO;
    }

    public Appliance(int basePrice, String color, String energyConsumption, int weight) {
        this.basePrice = basePrice;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public int getWeight() {
        return weight;
    }


    public double consumoEnergetico(int position){
        int [] precio = {100, 80, 60, 50, 30, 10};

        return precio[position];
    }
}
