package org.example;

public class TemplatePatternUse {
    public static void main(String[] args) {
        OrderProcess orderProcess = new TaxiOrderProcess();
        orderProcess.processOrder();
    }
}
