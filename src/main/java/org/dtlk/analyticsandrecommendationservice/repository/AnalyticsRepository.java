package org.dtlk.analyticsandrecommendationservice.repository;

import org.dtlk.analyticsandrecommendationservice.model.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
}
