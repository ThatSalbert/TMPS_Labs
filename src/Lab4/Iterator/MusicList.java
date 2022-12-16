package Lab4.Iterator;

public class MusicList implements Player {
    private String[] songs = {"Song1.mp3", "Song2.mp3", "Song3.mp3", "Song4.mp3", "Song5.mp3"};
    private int index = 0;

    @Override
    public Iterator createIterator() {
        return new MusicIterator();
    }

    private class MusicIterator implements Iterator {
        @Override
        public boolean hasNext() {
            if (index < songs.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return songs[index++];
            }
            return null;
        }
    }
}
