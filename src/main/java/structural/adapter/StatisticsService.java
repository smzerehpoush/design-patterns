package structural.adapter;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class StatisticsService {
    public StatisticsResponseModel getStatistics() {
        return new StatisticsResponseModel(1, "test-question", "test-answer");
    }
}
