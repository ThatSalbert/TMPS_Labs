package Lab3.Combination.Composite;

import java.util.ArrayList;
import java.util.List;

public class Store implements Computer {
    private List<Computer> computers = new ArrayList<Computer>();
    @Override
    public void assemble() {
        for (Computer computer: computers){
            computer.assemble();
        }
    }

    public void addComp(Computer computer){
        this.computers.add(computer);
    }

    public void removeComp(Computer computer){
        this.computers.remove(computer);
    }

    public void clearStore(){
        this.computers.clear();
    }

    @Override
    public String component() {
        return null;
    }
}
