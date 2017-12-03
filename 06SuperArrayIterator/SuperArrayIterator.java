import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String>{
    private int place;
    private int end;
    private String[] data;
    public SuperArrayIterator(String[] a) {
	data = a;
	place = 0;
	end = data.length;
    }
    public String next() {
	if (hasNext()) {
	    place += 1;
	}
	else {
	    System.exit(0);
	}
	return data[place];
    }
    public boolean hasNext() {
	if (place < end) {
	    return true;
	}
	return false;
    }
}
