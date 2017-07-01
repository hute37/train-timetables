package com.bddinaction.chapter2.utilities;

import java.util.Arrays;
import java.util.List;

import com.bddinaction.chapter2.web.FindArrivalTimesIntegrationTestCase;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.junit.JUnitStories;
import org.junit.runner.RunWith;

@RunWith(JUnitReportingRunner.class)
public class SimpleJBehaveRunner extends JUnitStories {

    static String[] STORIES = {
            "stories/itineraries/calculate_estimated_arrival_times.story",
            "stories/itineraries/find_next_train_departures.story",
    };

    public SimpleJBehaveRunner() {
        super();
        //this.configuredEmbedder().candidateSteps().add(new FindArrivalTimesIntegrationTestCase());
        JUnitReportingRunner.recommandedControls(configuredEmbedder());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList(STORIES);
    }
}