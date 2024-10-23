package org.example;

public class TimePricingStrategy implements PricingStrategy {
    public double calculatePrice(double time) {
        return time * 0.75;  // Price per minute
    }
}
