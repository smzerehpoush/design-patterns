package structural.adapter;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        StatisticsService statisticsService = new StatisticsService();
        StatisticsResponseModel responseModel = statisticsService.getStatistics();
        KeyValueDatabase keyValueDatabase = new KeyValueDatabase();
        keyValueDatabase.store("test", new Object());
        DatabaseAdapter database = new DatabaseAdapter();
        database.store(responseModel);
    }
}
