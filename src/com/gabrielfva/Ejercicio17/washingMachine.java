package com.gabrielfva.Ejercicio17;

public class washingMachine extends Appliance{
    public static final double CHARGE = 5;

    private double charge = CHARGE;

    public washingMachine() {
    }

    public washingMachine(int basePrice, int weight, double charge) {
        super(basePrice, weight);
        this.charge = charge;
    }

    public washingMachine(int basePrice, String color, String energyConsumption, int weight, double charge) {
        super(basePrice, color, energyConsumption, weight);
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    public double finalPrice(){

        if(charge > 30)
            this.basePrice = this.basePrice + 50;

        return basePrice;
    }
}
