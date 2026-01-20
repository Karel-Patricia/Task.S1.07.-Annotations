package level1.exercise2;

public class DeprecatedUsage {

    @SuppressWarnings("deprecation")
    public static void useDeprecatedMethods() {
        OnsiteWorker onsiteWorker = new OnsiteWorker("Anna", "Garcia", 20);
        OnlineWorker onlineWorker = new OnlineWorker("Marc", "Lopez", 18);

        System.out.println("Onsite old salary: " + onsiteWorker.calculateOldSalary(160));
        System.out.println("Online old salary: " + onlineWorker.calculateOldSalary(160));
    }

}
