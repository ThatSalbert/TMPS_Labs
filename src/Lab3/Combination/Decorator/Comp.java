package Lab3.Combination.Decorator;

import Lab3.Combination.Composite.Computer;

public class Comp implements Computer {
    @Override
    public void assemble() {
        return;
    }

    @Override
    public String component() {
        return "Component added: ";
    }
}
