package Lab3.Combination.Decorator;

import Lab3.Combination.Composite.Computer;

public class ComputerDecorator implements Computer {
    protected Computer computer;

    public ComputerDecorator(Computer computer){
        this.computer = computer;
    }
    @Override
    public void assemble() {
    }

    @Override
    public String component() {
        return computer.component();
    }
}
