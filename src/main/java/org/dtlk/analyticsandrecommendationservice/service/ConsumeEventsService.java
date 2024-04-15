package org.dtlk.analyticsandrecommendationservice.service;

import org.dtlk.analyticsandrecommendationservice.dto.AnalyticsDto;
import org.dtlk.analyticsandrecommendationservice.model.BookEvent;

public interface ConsumeEventsService {
    AnalyticsDto createAnalytics();

    void saveEvent(BookEvent event);
}
