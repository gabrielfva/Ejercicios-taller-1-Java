package com.gabrielfva.Ejercicio17;

public class tvSet extends Appliance {
    private double resolution = 20;
    private boolean tdtTuner = false;

    public tvSet() {
    }

    public tvSet(int basePrice, int weight) {
        super(basePrice, weight);
    }

    public tvSet(int basePrice, String color, String energyConsumption, int weight, double resolution, boolean tdtTuner) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tdtTuner = tdtTuner;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isTdtTuner() {
        return tdtTuner;
    }

    public double finalPrice(){
        if(this.resolution >  40)
            this.basePrice = this.basePrice + (this.basePrice * 0.3);
        if (this.tdtTuner)
            this.basePrice = this.basePrice + 50;

        return this.basePrice;
    }
}
