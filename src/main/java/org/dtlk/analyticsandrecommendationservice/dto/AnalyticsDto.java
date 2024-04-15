package org.dtlk.analyticsandrecommendationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsDto {
    private Long numberOfBooks;
    private Long numberOfBookedBooks;
    private Long numberOfActiveUsers;
    private Long numberOfDeactivatedUsers;
}
