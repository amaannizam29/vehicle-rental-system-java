// A Truck is a Vehicle with an extra field: cargo capacity in tons.
public class Truck extends Vehicle {

    double cargoCapacity;

    public Truck(int id, String model, double dailyRate, double cargoCapacity) {
        super(id, model, dailyRate);
        this.cargoCapacity = cargoCapacity;
    }

    public void displayInfo() {
        System.out.println("Truck      | id " + id + " | " + model + " | "
                + dailyRate + " EUR/day | " + cargoCapacity + " t cargo | " + statusText());
    }
}
