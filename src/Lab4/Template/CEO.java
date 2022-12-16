package Lab4.Template;

public class CEO extends Worker {
    public CEO(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("I'm CEO. I'm working.");
    }

    @Override
    public void goToWork() {
        System.out.println("I'm CEO. I'm going to work.");
    }

    @Override
    public void goToHome() {
        System.out.println("I'm CEO. I'm going home.");
    }

    @Override
    public void goToSleep() {
        System.out.println("I'm CEO. I'm going to sleep.");
    }
}
