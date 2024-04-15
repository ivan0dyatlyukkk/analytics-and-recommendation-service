package org.dtlk.analyticsandrecommendationservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book_events")
public class BookEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private String bookId;
    private Long timestamp;
    private Long returnDate;
    private String status;
}

/*
{
    userId: userId,
    bookId: bookId,
    timestamp: time,
    returnDate: returnDate,
    status: status
}
 */
