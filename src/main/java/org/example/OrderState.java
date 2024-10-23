package org.example;

interface OrderState {
    void next(OrderContext context);
    void prev(OrderContext context);
    void printStatus();
}