package level1.exercise2;

public class OnsiteWorker extends Worker{

    public static double fuel = 50;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * super.getPricePerHour()) + fuel;
    }

    @Deprecated
    public double calculateOldSalary(int hoursWorked) {
        return hoursWorked * super.getPricePerHour();
    }


}
