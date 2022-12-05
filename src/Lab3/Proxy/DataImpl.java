package Lab3.Proxy;

import java.util.HashMap;

public class DataImpl implements Data{
    private HashMap<Integer, String> messageHashMap = new HashMap<>();
    public DataImpl(){
        loadData();
    }
    @Override
    public void getData(int id) {
        System.out.println(messageHashMap.get(id));
    }

    private void loadData(){
        System.out.println("Initializing and adding data...");
        messageHashMap.put(8123, "Hello World!");
        messageHashMap.put(2391, "I am lost!");
        messageHashMap.put(1278, "This works?");
        messageHashMap.put(2012, "Some random string.");
        messageHashMap.put(1048, "You got it.");
    }
}
