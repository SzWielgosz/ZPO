package zad02;

public class FakeDatabaseConnector {
    private static FakeDatabaseConnector instance;

    private FakeDatabaseConnector() {
        System.out.println("Preparing connection to database...");
    }

    public static synchronized FakeDatabaseConnector getInstance() {
        if (instance == null) {
            instance = new FakeDatabaseConnector();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
        System.out.println("Query completed successfully.");
    }

    public void closeConnection() {
        System.out.println("Closing connection...");
        instance = null;
    }
}
