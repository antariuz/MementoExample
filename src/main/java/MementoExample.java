import model.Scooter;
import model.ScooterDriverHistory;

public class MementoExample {
    public static void main(String[] args) {
        Scooter scooter = new Scooter();
        ScooterDriverHistory history = new ScooterDriverHistory();

        scooter.setDriverFullNameAndDriverID("Sponge Bob","A1356021");
        System.out.println("The first driver " + scooter + "\n");

        history.setSave(scooter.save());

        scooter.setDriverFullNameAndDriverID("Patrick Star","A1376047");
        System.out.println("The second driver " + scooter + "\n");

        scooter.loadPreviousDriver(history.getSave());
        System.out.println("The previous driver " + scooter + "\n");

    }
}
