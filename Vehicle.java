
public class Vehicle {

    int id;
    String model;
    double dailyRate;
    boolean available;

    public Vehicle(int id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    public String statusText() {
        if (available) {
            return "Available";
        } else {
            return "Rented";
        }
    }

 
    public void displayInfo() {
        System.out.println("Vehicle    | id " + id + " | " + model + " | "
                + dailyRate + " EUR/day | " + statusText());
    }
}
