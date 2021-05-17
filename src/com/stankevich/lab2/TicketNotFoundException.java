package com.stankevich.lab2;

public class TicketNotFoundException extends Throwable {

    private double num;

    TicketNotFoundException(double name) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Ticket with num " + num + " is not found";
    }
}
