//Rubin, Jeremy
//APCS Period 9
//OrderedSuperArray Lab
public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super();
    }
    public OrderedSuperArray(int capacity) {
	super(capacity);
    }
    public OrderedSuperArray(String[] ary) {
	super(ary);
    }
    /*call the proper add.*/
    public void add(int index, String value){
	add(value);
    }

    /*Write this method and any
      appropriate helper methods.*/
    public boolean add(String value){
	int index = findIndex(value);
	if (index == -1) {
	    index = size();
	}
	super.add(index,value);
	return true;
    }
    public int indexOf(String element) {
	return findIndex(element);
    }
    public int indexOfBinary(String element) {
	int start = 0;
	int end = size();
	int place = findIndexBinary(element);
	if (place == 0) {
	    return place;
	}
	while (getData()[place].equals(getData()[place-1])) {
	    place -= 1;
	    if (place == 0) {
		return place;
	    }
	}
	return place;
    }
    public int lastIndexOf(String element) {
	int start = 0;
	int end = size();
	int place = findIndexBinary(element);
	if (place == size()) {
	    return place;
	}
	while (getData()[place].equals(getData()[place+1])) {
	    place += 1;
	    if (place == size()) {
		return place;
	    }
	}
	return place;
    }
    private int findIndex(String value) {
	for (int i = 0; i < size(); i++) {
	    if (value.compareTo(getData()[i]) <= 0) {
		return i;
	    }
	}
        return -1;	
    }
    private int findIndexBinary(String value) {
	int start = 0;
	int end = size();
	int mid = end/2;
	if (size() == 0) {
	    return 0;
	}
	if (size() == 1) {
	    if (value.compareTo(getData()[0]) >= 0) {
		return 1;
	    }
	    else {
		return 0;
	    }
	}
	while (start != mid) {
	    if (value.compareTo(getData()[mid]) >= 0) {
		start = mid;
		mid = (start+end)/2;
	    }
	    else {
		end = mid;
		mid = (start+end)/2;
	    }
	}
	return mid;
    }
}
