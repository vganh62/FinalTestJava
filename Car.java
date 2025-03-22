package FinalTest;

import java.util.*;

public class Car extends Vehicle {

    int numberOfSeats;
    String fuelType;

    public Car() {
    }

    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int retalDays, double retalPricePerDay) {
        super(id, brand, model, retalDays, retalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double calculateRentalCost() {
        double cost = retalPricePerDay * retalDays;
        if (fuelType.equalsIgnoreCase("electric")) {
            cost *= 0.9;
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats + ", Fuel type: " + fuelType);
    }
}
