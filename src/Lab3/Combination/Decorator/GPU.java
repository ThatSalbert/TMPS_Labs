package Lab3.Combination.Decorator;

import Lab3.Combination.Composite.Computer;

public class GPU extends ComputerDecorator{
    public GPU(Computer computer) {
        super(computer);
    }

    public String component(){
        return super.component() + "added GPU ";
    }
}
