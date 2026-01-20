package level1.exercise1;

public class OnsiteWorker extends Worker{

    public static double fuel = 50;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * super.getPricePerHour()) + fuel;
    }
}
