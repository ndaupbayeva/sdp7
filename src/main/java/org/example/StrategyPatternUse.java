package org.example;

public class StrategyPatternUse {
    public static void main(String[] args) {
        Order order = new Order(new DistancePricingStrategy());
        System.out.println("Price by distance: " + order.calculatePrice(10));  // 10 km

        order.setPricingStrategy(new TimePricingStrategy());
        System.out.println("Price by time: " + order.calculatePrice(30));  // 30 minutes

        order.setPricingStrategy(new FixedPriceStrategy());
        System.out.println("Fixed price: " + order.calculatePrice(0));  // Fixed price
    }
}
