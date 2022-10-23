package Lab2.Prototype;

public class Document implements Prototype{
    private String title;
    private String firstName;
    private String lastName;
    private String date;

    public Document(String _title, String _firstName, String _lastName, String _date){
        this.title = _title;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.date = _date;
    }

    @Override
    public Prototype getClone(){
        return new Document(title, firstName, lastName, date);
    }

    public void getDocument(){
        System.out.println(title + " " + firstName + " " + lastName + " " + date);
    }
}
