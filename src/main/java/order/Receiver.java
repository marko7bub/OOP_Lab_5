package order;

public class Receiver implements User {
    private static int id_counter = 0;
    private String id;
    public Receiver() {
        id_counter += 1;
        this.id = String.valueOf(this.id_counter) + "r";
    }
    @Override
    public void update(String status) {
        System.out.println("Dear Client (" + this.id + ")! " + status);
    }
}
