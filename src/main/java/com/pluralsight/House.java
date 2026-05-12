package com.pluralsight;

public class House extends Asset{

    protected String address;
    protected int condition;
    protected int squareFoot;
    protected int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
         int x = 1;
         double value = ((x * squareFoot) + (.25 * squareFoot));

         switch (condition){
             case 1 -> {
                 x = 180;

             }
             case 2 -> {
                 x = 130;

             }
             case 3 -> {
                 x = 90;

             }
             case 4 -> {
                 x = 80;

             }
         }
         return value;

    }

}
