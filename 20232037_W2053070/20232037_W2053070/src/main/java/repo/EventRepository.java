package ticket_booking_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket_booking_system.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
