// A customer who can rent vehicles.
public class Customer {

    int id;
    String name;
    String licenseNumber;

    public Customer(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void displayInfo() {
        System.out.println("Customer " + id + ": " + name
                + " (License: " + licenseNumber + ")");
    }
}
