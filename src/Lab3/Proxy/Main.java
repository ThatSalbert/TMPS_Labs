package Lab3.Proxy;

public class Main {
    public static void main(String[] args) {
        Data data = new DataProxy();
        data.getData(8123);
        data.getData(1278);
    }
}
