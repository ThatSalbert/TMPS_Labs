package Lab3.Combination.Decorator;

import Lab3.Combination.Composite.Computer;

public class CPU extends ComputerDecorator{
    public CPU(Computer computer) {
        super(computer);
    }

    public String component(){
        return super.component() + "added CPU ";
    }
}
