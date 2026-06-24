// A Motorcycle is a Vehicle with an extra field: whether it has a sidecar.
public class Motorcycle extends Vehicle {

    boolean hasSidecar;

    public Motorcycle(int id, String model, double dailyRate, boolean hasSidecar) {
        super(id, model, dailyRate);
        this.hasSidecar = hasSidecar;
    }

    public void displayInfo() {
        String sidecar;
        if (hasSidecar) {
            sidecar = "with sidecar";
        } else {
            sidecar = "no sidecar";
        }
        System.out.println("Motorcycle | id " + id + " | " + model + " | "
                + dailyRate + " EUR/day | " + sidecar + " | " + statusText());
    }
}
