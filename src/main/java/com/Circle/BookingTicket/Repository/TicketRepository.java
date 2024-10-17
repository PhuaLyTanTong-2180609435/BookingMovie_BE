package com.Circle.BookingTicket.Repository;

import com.Circle.BookingTicket.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    // Có thể thêm các phương thức tùy chỉnh tại đây
}
