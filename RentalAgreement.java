// A rental agreement links one Vehicle with one Customer for a number of days.
// It stores the total price, which it gets from the CostCalculator.
public class RentalAgreement {

    int agreementId;
    Vehicle vehicle;       // the rented vehicle (object inside an object)
    Customer customer;     // the customer who rents it
    int days;
    double totalCost;

    public RentalAgreement(int agreementId, Vehicle vehicle, Customer customer, int days) {
        this.agreementId = agreementId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = CostCalculator.calculateCost(vehicle.dailyRate, days);
    }

    public void displayInfo() {
        System.out.println("Agreement #" + agreementId);
        System.out.println("  Customer: " + customer.name);
        System.out.println("  Vehicle:  " + vehicle.model + " (id " + vehicle.id + ")");
        System.out.println("  Days:     " + days);
        System.out.println("  Total:    " + totalCost + " EUR");
    }
}
