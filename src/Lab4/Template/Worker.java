package Lab4.Template;

public abstract class Worker {
    String name;
    String surname;
    int age;
    int salary;

    public final void workDay() {
        goToWork();
        work();
        goToHome();
        goToSleep();
    }

    public final void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    abstract void work();
    abstract void goToWork();
    abstract void goToHome();
    abstract void goToSleep();
}
