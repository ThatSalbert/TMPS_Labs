package Lab3.Proxy;

public class DataProxy implements Data{
    private static DataImpl object;


    @Override
    public void getData(int id) {
        if(object == null){
            object = new DataImpl();
        }
        object.getData(id);
    }
}
