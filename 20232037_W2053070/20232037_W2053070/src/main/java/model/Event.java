package ticket_booking_system.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer tickets;

    @Column(nullable = false)
    private Integer releaseRate;
}
