package org.example.ch01_ticket;

/**
 * 소극장
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * [문제점1] 소극장이 관람객의 가방을 열어 초대장을 확인한다.판매원이 티켓을 발급하고, 관람객의 가방에 티켓을 넣어준다.
     * 즉, 관람객과 판매원 모두 소극장의 통제를 받는다.
     * [문제점2] 이 메서드에서 알고 있어야 하는 세부사항이 많다.(관람객 안에 가방이 있고, 가방 안에 티켓이 있다는 정보 등)
     * [문제점3] 문제점2는 즉 Audience, TicketSeller를 변경할 경우 Theater도 변경해야 한다는 의미다.
     */
//    public void enter(Audience audience) {
//        // 관람객의 가방에 초대장이 있다면,
//        // 판매원은 매표소의 티켓을 준다.
//        if(audience.getBag().hasInvitation()) {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().setTicket(ticket);
//        } else {
//            //관람객의 가방에 초대장이 없다면,
//            //티켓을 구입한다.
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
//    }
}
