package Lab4.Iterator;

public class Main {
    public static void main(String[] args) {
        Player musicList = new MusicList();
        Iterator iterator = musicList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
