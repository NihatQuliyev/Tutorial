import static connected.ConnectedBase.statement;
public class Main {
    public static void main(String[] args) {
        try {
            statement("Nihat");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}