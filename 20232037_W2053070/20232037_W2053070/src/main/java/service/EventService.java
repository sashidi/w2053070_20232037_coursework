package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket_booking_system.model.Event;
import ticket_booking_system.repo.EventRepository;

import java.util.List;

@Service

public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }
}
