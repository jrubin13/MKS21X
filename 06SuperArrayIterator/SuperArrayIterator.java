public class SuperArrayIterator implements Iterator<String>{
    private int place;
    private int end;
    private String[] = data;
    public SuperArrayIterator(SuperArray a) {
	data = a;
	place = 0;
	end = data.length();
    }
    public Integer next() {
	if (hasNext()) {
	    place += 1;
	}
	else {
	    System.exit(0);
	}
    }
    public boolean hasNext() {
	if (place < end) {
	    return true;
	}
	return false;
    }
}
