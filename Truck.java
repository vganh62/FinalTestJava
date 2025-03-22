package FinalTest;

import java.util.*;

public class Truck extends Vehicle {

    double loadCapacity;
    double distance;

    public Truck() {
    }

    public Truck(double loadCapacity, double distance, String id, String brand, String model, int retalDays, double retalPricePerDay) {
        super(id, brand, model, retalDays, retalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    @Override
    public double calculateRentalCost() {
        return retalPricePerDay + (distance * 5);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load capacity: " + loadCapacity + " tons, Distance: " + distance + " km");
    }
}
