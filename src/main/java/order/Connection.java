package order;

public class Connection {
    public static Connection thisConnection = new Connection();
    private Connection() {

    }
    public static Connection getConnection() {
        return thisConnection;
    }
}
