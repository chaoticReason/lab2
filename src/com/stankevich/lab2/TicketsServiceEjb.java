package com.stankevich.lab2;

import javax.ejb.Stateless;
import java.util.ArrayList;

@Stateless
public class TicketsServiceEjb {
    private final Ticket[] tickets = {
            new Ticket(1, 111111, true),
            new Ticket(200, 120021, true),
            new Ticket(8, 132101, false),
            new Ticket(30, 142001, false),
            new Ticket(50, 120031, true),
    };

    public boolean isLucky(int index) throws TicketNotFoundException {
        if(index >= tickets.length)
            throw new TicketNotFoundException(index);

        long number = tickets[index].getNum();

        long leftHalf = (number/100000)
                + (number/10000 % 10) * 10
                + (number/1000 %10) * 100;

        return leftHalf == (number % 1000);
    }


    public Ticket getTicket(int index){
        return tickets[index];
    }


    public ArrayList<Ticket> getTicketsWithBiggerWin(int value) {
        ArrayList<Ticket> newTickets = new ArrayList<>();

        for (Ticket ticket : tickets) {
            if (ticket.getWin() > value) {
                newTickets.add(ticket);
            }
        }

        return newTickets;
    }
}
