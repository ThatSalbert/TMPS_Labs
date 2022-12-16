# Laboratory Work 4: Behavioral Pattern Designs

## Introduction
For this laboratory work, 3 behavioral patterns were implemented: Command, Iterator, Template.

## Implementation

### Command

The Command pattern is a behavioral design pattern in which an object is used to encapsulate all information 
needed to perform an action or trigger an event at a later time. This information includes the method name, 
the object that owns the method and values for the method parameters.

For this laboratory work, the Command pattern was used to implement the service of building a pc and selling it.

First, the interface Order was created, which contains the placeOrder() method.
```java
public interface Order {
    void placeOrder();
}
```

Then, the PCBuildService class was created, which will perform the services of building a pc and selling it.
```java
public class PCBuildService {
    private final String name = "Desktop PC";

    public void buildPC() {
        System.out.println("Building " + name + "(s)");
    }

    public void sellPC() {
        System.out.println("Selling " + name + "(s)");
    }
}
```

Then, the MakeOrder class was created, which implements the Order interface and contains the PCBuildService object.
It is used to register the order for building a pc, which later can be used to sell the pc.
```java
public class MakeOrder implements Order{
    private final PCBuildService pcBuildService;

    public MakeOrder(PCBuildService pcBuildService) {
        this.pcBuildService = pcBuildService;
    }
    @Override
    public void placeOrder() {
        pcBuildService.buildPC();
    }
}
```

Then, the SellOrder class was created, which implements the Order interface and contains the PCBuildService object.
It is used to sell the registered order of making a pc.
```java
public class SellOrder implements Order{
    private final PCBuildService pcBuildService;

    public SellOrder(PCBuildService pcBuildService) {
        this.pcBuildService = pcBuildService;
    }
    @Override
    public void placeOrder() {
        pcBuildService.sellPC();
    }
}
```

To have all the orders processed and to have someone build and sell the pc, the Worker class was created.
The Worker class contains the list of orders, which can be added to the list using the takeOrder() method.
The processOrders() method is used to process all the orders from the list.
```java
public class Worker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.placeOrder();
        }
        orders.clear();
    }
}
```

### Iterator

The Iterator pattern is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).
For this laboratory work, the Iterator pattern was used to implement a Music Player. The Music Player has a list of songs, which can be played using the Iterator pattern.

First of all, the Iterator interface was created, which contains the hasNext() and next() methods.
As the names suggest, hasNext() is used to check if there is a next element in the list, while next() is used to get the next element from the list.
```java
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
```

Then, the Player interface was created, which contains the createIterator() method.
```java
public interface Player {
    public Iterator createIterator();
}
```

MusicList class implements the Player interface and contains the list of songs. It also contains the
MusicIterator class, which implements the Iterator interface. It is used to iterate through the list of songs.
If there is a next song, the next() method will return the next song from the list, otherwise it will return null.
If there is a next song, the hasNext() method will return true, otherwise it will return false.
```java
public class MusicList implements Player {
    private String[] songs = {"Song1.mp3", "Song2.mp3", "Song3.mp3", "Song4.mp3", "Song5.mp3"};
    private int index = 0;

    @Override
    public Iterator createIterator() {
        return new MusicIterator();
    }

    private class MusicIterator implements Iterator {
        @Override
        public boolean hasNext() {
            if (index < songs.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return songs[index++];
            }
            return null;
        }
    }
}
```

### Template

The Template pattern is a behavioral design pattern that defines the program skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
For this laboratory work, the Template pattern was used to implement workers of a company. The company has 3 types of workers: CEO, Manager, Junior Developer.

Worker abstract class was created, which contains the template method workDay(), which is used to simulate a work day.
Inside the workDay() method, abstract methods arriveAtWork(), goToWork(), work(), goToHome(), and goToSleep() are called.
```java
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
```

Now that the template of a worker was created, now the workers with their respective roles can be created.
First - CEO class, which extends the Worker class.
```java
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
```

Then - Manager class, which extends the Worker class.
```java
public class Manager extends Worker {
    public Manager(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("I'm Manager. I'm working.");
    }

    @Override
    public void goToWork() {
        System.out.println("I'm Manager. I'm going to work.");
    }

    @Override
    public void goToHome() {
        System.out.println("I'm Manager. I'm going home.");
    }

    @Override
    public void goToSleep() {
        System.out.println("I'm Manager. I'm going to sleep.");
    }
}
```

Finally - Junior Developer class, which extends the Worker class.
```java
public class JuniorDeveloper extends Worker{
    public JuniorDeveloper(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("I'm Junior Developer. I'm working.");
    }

    @Override
    public void goToWork() {
        System.out.println("I'm Junior Developer. I'm going to work.");
    }

    @Override
    public void goToHome() {
        System.out.println("I'm Junior Developer. I'm going home.");
    }

    @Override
    public void goToSleep() {
        System.out.println("I'm Junior Developer. I'm going to sleep.");
    }
}
```

As seen above, all the workers have the same template, but they have different implementations of the abstract methods (performing different tasks during the days).