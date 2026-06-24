// A Car is a Vehicle with an extra field: number of doors.
public class Car extends Vehicle {

    int numDoors;

    public Car(int id, String model, double dailyRate, int numDoors) {
        super(id, model, dailyRate);   // set the shared fields in Vehicle
        this.numDoors = numDoors;
    }

    // Own version of displayInfo that also shows the doors.
    public void displayInfo() {
        System.out.println("Car        | id " + id + " | " + model + " | "
                + dailyRate + " EUR/day | " + numDoors + " doors | " + statusText());
    }
}
