package org.example;

public class ConfirmedState implements OrderState{
    public void next(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    public void prev(OrderContext context) {
        context.setState(new CreatedState());
    }

    public void printStatus() {
        System.out.println("Order Confirmed.");
    }
}
