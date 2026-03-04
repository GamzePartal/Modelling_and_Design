package WeekLab03.Example01;

public class PostGreConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}
