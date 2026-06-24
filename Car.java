public class Car extends Vehicle {

    int numDoors;

    public Car(int id, String model, double dailyRate, int numDoors) {
        super(id, model, dailyRate);   
        this.numDoors = numDoors;
    }

    public void displayInfo() {
        System.out.println("Car        | id " + id + " | " + model + " | "
                + dailyRate + " EUR/day | " + numDoors + " doors | " + statusText());
    }
}
