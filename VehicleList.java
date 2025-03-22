package FinalTest;

import java.util.*;

public class VehicleList {

    ArrayList<Vehicle> vehicle2 = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicle2.add(v);
    }

    public boolean updateVehicleById(String id) {
        for (Vehicle v : vehicle2) {
            if (v.id.equals(id)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter brand: ");
                v.brand = sc.nextLine();
                System.out.println("Enter model: ");
                v.model = sc.nextLine();
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        return vehicle2.removeIf(v -> v.id.equals(id));
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle v : vehicle2) {
            if (v.id.equals(id)) {
                return v;
            }
        }
        return null;
    }

    public void displayAllVehicle() {
        for (Vehicle v : vehicle2) {
            v.displayDetails();
            System.out.println("------");
        }
    }
}
