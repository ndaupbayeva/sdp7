package org.example;

public class FixedPriceStrategy implements PricingStrategy {
public double calculatePrice(double value) {
        return 20.0;  // Fixed price for any trip
        }
}
