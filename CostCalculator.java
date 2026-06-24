
public class CostCalculator {

    public static double calculateCost(double dailyRate, int days) {
        double cost = dailyRate * days;

        if (days >= 7) {
            cost = cost - (cost * 0.10);
        }

        return cost;
    }
}
