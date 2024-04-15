package org.dtlk.analyticsandrecommendationservice.service;

import lombok.RequiredArgsConstructor;
import org.dtlk.analyticsandrecommendationservice.dto.AnalyticsDto;
import org.dtlk.analyticsandrecommendationservice.model.Analytics;
import org.dtlk.analyticsandrecommendationservice.model.BookEvent;
import org.dtlk.analyticsandrecommendationservice.repository.AnalyticsRepository;
import org.dtlk.analyticsandrecommendationservice.repository.BookEventsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsumeEventsServiceImpl implements ConsumeEventsService {
    private final AnalyticsRepository analyticsRepository;
    private final BookEventsRepository bookEventsRepository;

    @Override
    public AnalyticsDto createAnalytics() {
        List<BookEvent> events = bookEventsRepository.findAll();
        Analytics analytics = new Analytics();
        analytics.setNumberOfBooks(events.stream().map(BookEvent::getBookId).distinct().count());
        analytics.setNumberOfBookedBooks(events.stream().filter(event -> event.getStatus().equals("BOOKED")).count());
        analytics.setNumberOfActiveUsers(events.stream().map(BookEvent::getUserId).distinct().count());
        analytics.setNumberOfDeactivatedUsers(0L);
        analyticsRepository.save(analytics);

        return new AnalyticsDto(analytics.getNumberOfBooks(),
                analytics.getNumberOfBookedBooks(),
                analytics.getNumberOfActiveUsers(),
                analytics.getNumberOfDeactivatedUsers());
    }

    @Override
    public void saveEvent(BookEvent event) {
        bookEventsRepository.save(event);
    }
}
