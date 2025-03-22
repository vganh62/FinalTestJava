package FinalTest;

import java.util.*;

public abstract class Vehicle implements IVehicle {

    String id;
    String brand;
    String model;
    int retalDays;
    double retalPricePerDay;

    public Vehicle() {
    }

    public Vehicle(String id, String brand, String model, int retalDays, double retalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.retalDays = retalDays;
        this.retalPricePerDay = retalPricePerDay;
    }

//    public void addVehicle() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter vehicle ID: ");
//        id = sc.nextLine();
//        System.out.println("Enter brand: ");
//        brand = sc.nextLine();
//        System.out.println("Enter model: ");
//        model = sc.nextLine();
//        System.out.println("Enter retal days: ");
//        retalDays = sc.nextInt();
//        System.out.println("Enter retal price per day: ");
//        retalPricePerDay = sc.nextInt();
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRetalDays() {
        return retalDays;
    }

    public void setRetalDays(int retalDays) {
        this.retalDays = retalDays;
    }

    public double getRetalPricePerDay() {
        return retalPricePerDay;
    }

    public void setRetalPricePerDay(double retalPricePerDay) {
        this.retalPricePerDay = retalPricePerDay;
    }

    public void displayDetails() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Retal days: " + retalDays);
        System.out.println("Retal price per day: " + retalPricePerDay);
    }
}
