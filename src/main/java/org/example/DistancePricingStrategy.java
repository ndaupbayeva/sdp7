package org.example;

public class DistancePricingStrategy implements PricingStrategy {
    public double calculatePrice(double distance) {
        return distance * 1.5;  // Price per km
    }
}
