// Base class for every vehicle in the rental shop.
// Car, Truck and Motorcycle inherit from this class.
public class Vehicle {

    int id;
    String model;
    double dailyRate;
    boolean available;

    // Constructor: a new vehicle always starts as available.
    public Vehicle(int id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    // Returns a readable status word based on the boolean.
    public String statusText() {
        if (available) {
            return "Available";
        } else {
            return "Rented";
        }
    }

    // Prints the basic vehicle data. Subclasses replace this
    // with their own version that adds their extra field.
    public void displayInfo() {
        System.out.println("Vehicle    | id " + id + " | " + model + " | "
                + dailyRate + " EUR/day | " + statusText());
    }
}
