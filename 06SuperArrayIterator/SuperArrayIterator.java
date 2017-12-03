import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String>{
    private int place;
    private int end;
    private String[] data;
    public SuperArrayIterator(String[] a, int begin, int finish) {
	data = a;
	place = begin;
	end = finish;
    }
    public String next() {
	if (hasNext()) {
	    place += 1;
	}
	else {
	    System.exit(0);
	}
	return data[place-1];
    }
    public boolean hasNext() {
	if (place < end) {
	    return true;
	}
	return false;
    }
}
