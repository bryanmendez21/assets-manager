package com.pluralsight;

import java.util.ArrayList;

public class AssetsManager {
    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>();
        String message = "";

        myAssets.add( new House("beach house", "2024",1000000.00,"123 street city st", 1, 2000, 10));
        myAssets.add( new House("regular house ", "2000",1000.00,"456 street city st", 4, 20, 1));

        myAssets.add( new Vehicle("ford", "2018", 6000, "ford fusion",2014, 150000));
        myAssets.add( new Vehicle("toyota", "2025", 1000, "toyota corolla",2001, 254000));


        for (Asset a : myAssets) {
            System.out.println(a.getClass().getSimpleName());
            System.out.println(a.getDescription());
            System.out.println(a.originalCost);
            System.out.println(a.getValue());
            System.out.println("\n\n");
           // if (myAssets.get(i) instanceof House) {
              //  House house = (House) myAssets.get(i);
             //   message = "House at " + house.getAddress();
           // } else if (myAssets.get(i) instanceof Vehicle) {
            //    Vehicle vehicle = (Vehicle) myAssets.get(i);
            //    message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
           // }
        }
        System.out.println(message);
    }
}
