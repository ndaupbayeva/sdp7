package org.example;

public class FinishedState implements OrderState {
    public void next(OrderContext context) {
    System.out.println("The order is already finished.");
}

    public void prev(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    public void printStatus() {
        System.out.println("Order Completed.");
    }
}
