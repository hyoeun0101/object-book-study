package org.example.ch01_ticket;


/**
 * 관람객의 가방
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
