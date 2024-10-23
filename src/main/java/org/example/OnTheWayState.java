package org.example;

public class OnTheWayState implements OrderState{
    public void next(OrderContext context) {
    context.setState(new FinishedState());
}

    public void prev(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    public void printStatus() {
        System.out.println("Taxi is on the way.");
    }
}
