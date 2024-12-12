package controller;

import org.springframework.web.bind.annotation.*;
import service.EventService;
import ticket_booking_system.model.Event;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class Event_Controller {

    private final EventService eventService;

    public Event_Controller(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }
}
