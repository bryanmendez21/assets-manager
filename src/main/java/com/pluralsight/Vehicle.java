package com.pluralsight;

import java.time.LocalDate;
import java.time.Year;

public class Vehicle extends Asset{

    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int ageOfVehicle = LocalDate.now().getYear() - year;
        double finalValue = this.originalCost;

            if (ageOfVehicle <= 3) {
                finalValue *= Math.pow(0.97,ageOfVehicle);
            } else if (ageOfVehicle <= 6) {
                finalValue *= Math.pow(0.94,ageOfVehicle);
            } else if (ageOfVehicle <= 10) {
                finalValue *= Math.pow(0.92,ageOfVehicle);
            } else {
                finalValue = 1000;
            }

        if ((odometer > 100000) && !(this.makeModel.contains("Honda") || this.makeModel.contains("Toyota"))) {
            finalValue = finalValue * .75;
        }
        return finalValue;
    }
}
