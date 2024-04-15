package org.dtlk.analyticsandrecommendationservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "analytics_data")
public class Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numberOfBooks;
    private Long numberOfBookedBooks;
    private Long numberOfActiveUsers;
    private Long numberOfDeactivatedUsers;
}
