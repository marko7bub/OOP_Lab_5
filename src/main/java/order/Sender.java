package order;

public class Sender implements User {
    private static int id_counter = 0;
    private String id;
    public Sender() {
        id_counter += 1;
        this.id = String.valueOf(this.id_counter) + "s";
    }
    @Override
    public void update(String status) {
        System.out.println("Dear Seller (" + this.id + ")! " + status);
    }
}
