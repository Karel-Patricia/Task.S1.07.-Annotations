package level1.exercise1;

public class Worker {
    private String name;
    private String surname;
    private double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return this.pricePerHour;
    }

    public double calculateSalary(int hoursWorked){
        return hoursWorked + this.pricePerHour;
    }

    @Override
    public String toString() {
        return "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", pricePerHour=" + this.pricePerHour ;
    }
}
