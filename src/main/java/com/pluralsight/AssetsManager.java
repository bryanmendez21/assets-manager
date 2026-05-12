package com.pluralsight;

import java.util.ArrayList;

public class AssetsManager {
    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>();
        String message = "";

        House beachHouse = new House("in florida", "2024",1000000.00,"123 street city st", 1, 2000, 10);
        House regularHouse = new House("in georgia ", "2000",1000.00,"456 street city st", 4, 20, 1);

        Vehicle myCar = new Vehicle("not so reliable", "2018", 6000, "ford",2014, 150000);
        Vehicle myOtherCar = new Vehicle("ol reliable", "2025", 10, "toyota",2001, 254000);

        myAssets.add(beachHouse);
        myAssets.add(regularHouse);
        myAssets.add(myCar);
        myAssets.add(myOtherCar);

        for (Asset i : myAssets) {
            if (myAssets.get(i) instanceof House) {
                House house = (House) myAssets.get(i);
                message = "House at " + house.getAddress();
            } else if (myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets.get(i);
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }
        }
        System.out.println(message);
    }
}
