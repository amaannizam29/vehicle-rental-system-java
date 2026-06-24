// Helper class that calculates the rental price.
// It uses a static method, so no object is needed to call it.
public class CostCalculator {

    // Price = daily rate * number of days.
    // Rentals of 7 days or more get a 10% discount.
    public static double calculateCost(double dailyRate, int days) {
        double cost = dailyRate * days;

        if (days >= 7) {
            cost = cost - (cost * 0.10);
        }

        return cost;
    }
}
