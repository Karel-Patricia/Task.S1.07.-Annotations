package level1.exercise2;

public class Main {
    public static void main(String[] args) {

        Worker onsiteWorker = new OnsiteWorker("Anna", "Garcia", 20);
        Worker onlineWorker = new OnlineWorker("Marc", "Lopez", 18);

        System.out.println("Onsite worker salary: " + onsiteWorker.calculateSalary(160));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(160));

        DeprecatedUsage.useDeprecatedMethods();
    }

}



