package com.pluralsight;

public class AssetsManager {
    public static void main(String[] args) {

        String message = "";
        if (myAssets.get(i) instanceof House) {
            House house = (House) myAssets.get(i);
            message = "House at " + house.getAddress();
        } else if (myAssets.get(i) instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) myAssets.get(i);
            message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
        }
    }
}
