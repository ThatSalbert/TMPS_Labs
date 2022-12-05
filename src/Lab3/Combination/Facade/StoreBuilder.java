package Lab3.Combination.Facade;

import Lab3.Combination.Composite.Computer;
import Lab3.Combination.Composite.DeskPC;
import Lab3.Combination.Composite.Laptop;
import Lab3.Combination.Composite.Store;
import Lab3.Combination.Decorator.CPU;
import Lab3.Combination.Decorator.Comp;
import Lab3.Combination.Decorator.GPU;

public class StoreBuilder {
    public void genStore(){
        Computer laptop = new Laptop();
        Computer pc = new DeskPC();

        Store compStore = new Store();
        compStore.addComp(laptop);
        compStore.addComp(pc);

        compStore.assemble();

        laptop = new CPU(new Comp());
        System.out.println(laptop.component());
        pc = new GPU(new CPU(new Comp()));
        System.out.println(pc.component());

        compStore.clearStore();
    }
}
