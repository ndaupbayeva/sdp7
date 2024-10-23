package org.example;

public class StatePatternUse {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
    }
}
