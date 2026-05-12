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
        double x = 1;
        double ogValue = 1;
        double value = (ogValue * x);
        double finalValue = 0;

        if (makeModel.equalsIgnoreCase("Honda") || makeModel.equalsIgnoreCase("Toyota") || (odometer < 100000)) {
            if (ageOfVehicle <= 3) {
                x = .97;
            } else if (ageOfVehicle <= 6) {
                x = .94;
            } else if (ageOfVehicle <= 10) {
                x = .92;
            } else {
                ogValue = ogValue - 1000;
            }
        } else {
            if (ageOfVehicle <= 3) {
                x = .97;
            } else if (ageOfVehicle <= 6) {
                x = .94;
            } else if (ageOfVehicle <= 10) {
                x = .92;
            } else {
                ogValue = ogValue - 1000;
            }
            finalValue = value * .75;
        }
        return finalValue;
    }


}
