package Lab4.Template;

public class Main {
    public static void main(String[] args) {
        Worker worker = new JuniorDeveloper("John", "Smith", 31, 121);
        worker.displayInfo();
        worker.workDay();
        System.out.println();

        worker = new Manager("Andrew", "Maron", 25, 920);
        worker.displayInfo();
        worker.workDay();
        System.out.println();

        worker = new CEO("Kate", "Lemonet", 52, 19920);
        worker.displayInfo();
        worker.workDay();
    }
}
