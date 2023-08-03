package org.example.ch01_ticket;


/**
 * 관람객의 가방
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /** 이벤트에 당첨되지 않은 관람객은 초대장이 없다. **/
    public Bag(long amount) {
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

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
