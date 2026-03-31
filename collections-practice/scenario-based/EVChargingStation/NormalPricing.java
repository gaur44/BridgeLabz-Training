public class NormalPricing implements PricingStrategy {
    public double calculate(double units) {
        return units * 5;
    }
}
