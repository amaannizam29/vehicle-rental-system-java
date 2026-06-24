
public class RentalShop {

    Vehicle[] vehicles;
    Customer[] customers;
    RentalAgreement[] agreements;

    int vehicleCount;
    int customerCount;
    int agreementCount;
    int nextAgreementId;

    public RentalShop() {
        vehicles = new Vehicle[100];
        customers = new Customer[100];
        agreements = new RentalAgreement[100];
        vehicleCount = 0;
        customerCount = 0;
        agreementCount = 0;
        nextAgreementId = 1;
    }

    public void addVehicle(Vehicle v) {
        vehicles[vehicleCount] = v;
        vehicleCount++;
    }

    public void addCustomer(Customer c) {
        customers[customerCount] = c;
        customerCount++;
    }

    public void showAvailableVehicles() {
        System.out.println("--- Available Vehicles ---");
        int shown = 0;
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].available) {
                vehicles[i].displayInfo();
                shown++;
            }
        }
        if (shown == 0) {
            System.out.println("No vehicles available.");
        }
    }

    public void showAllVehicles() {
        System.out.println("--- All Vehicles ---");
        for (int i = 0; i < vehicleCount; i++) {
            vehicles[i].displayInfo();
        }
    }

    public void showCustomers() {
        System.out.println("--- Customers ---");
        if (customerCount == 0) {
            System.out.println("No customers registered.");
        }
        for (int i = 0; i < customerCount; i++) {
            customers[i].displayInfo();
        }
    }

    public Vehicle findVehicleById(int id) {
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].id == id) {
                return vehicles[i];
            }
        }
        return null;
    }

    public Customer findCustomerById(int id) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].id == id) {
                return customers[i];
            }
        }
        return null;
    }

    public void rentVehicle(int vehicleId, int customerId, int days) {
        Vehicle v = findVehicleById(vehicleId);
        Customer c = findCustomerById(customerId);

        if (v == null) {
            System.out.println("Vehicle not found.");
            return;
        }
        if (c == null) {
            System.out.println("Customer not found.");
            return;
        }
        if (!v.available) {
            System.out.println("Vehicle is already rented.");
            return;
        }

        RentalAgreement a = new RentalAgreement(nextAgreementId, v, c, days);
        agreements[agreementCount] = a;
        agreementCount++;
        nextAgreementId++;
        v.available = false;  

        System.out.println("Rental created:");
        a.displayInfo();
    }

    // Marks a vehicle as available again.
    public void returnVehicle(int vehicleId) {
        Vehicle v = findVehicleById(vehicleId);

        if (v == null) {
            System.out.println("Vehicle not found.");
            return;
        }
        if (v.available) {
            System.out.println("This vehicle is not currently rented.");
            return;
        }

        v.available = true;
        System.out.println(v.model + " (id " + v.id + ") has been returned.");
    }

    public void showAgreements() {
        System.out.println("--- Rental Agreements ---");
        if (agreementCount == 0) {
            System.out.println("No agreements yet.");
        }
        for (int i = 0; i < agreementCount; i++) {
            agreements[i].displayInfo();
        }
    }
}
