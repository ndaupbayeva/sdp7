package org.example;

public class CreatedState implements OrderState{
    public void next(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    public void prev(OrderContext context) {
        System.out.println("The order is in its initial state.");
    }

    public void printStatus() {
        System.out.println("Order Created.");
    }
}
