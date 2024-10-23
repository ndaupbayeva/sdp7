package org.example;
abstract class OrderProcess {
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
        completeOrder();
    }

    protected abstract void checkAvailability();
    protected abstract void calculateCost();
    protected abstract void confirmOrder();

    // Optional hook method
    protected void completeOrder() {
        System.out.println("Order has been completed.");
    }
}

