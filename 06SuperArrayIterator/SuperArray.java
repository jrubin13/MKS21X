//Rubin, Jeremy
//APCS Period 9
//SuperArray Lab
import java.util.Iterator;
public class SuperArray implements Iterable<String>{
    private String[] data = new String[10];
    private int size = 0;
    public SuperArray() {
	data = new String[10];
	size = 0;
    }
    public SuperArray(int capacity) {
	data = new String[capacity];
	size = 0;
    }
    public SuperArray(String[] ary) {
	for (int i = 0; i < ary.length; i++) {
	    add(ary[i]);
	}
    }
    public String[] getData() {
	return data;
    }
    public int getSize() {
	return size;
    }
    public void clear() {
	data = new String[10];
	size = 0;
    }
    public int size() {
	return getSize();
    }
    public boolean isEmpty() {
	return true;
    }
    public boolean add(String element) {
	if (size() == data.length) {
	    resize();
	}
	data[getSize()] = element;
	size += 1;
	return true;
    }
    public String get(int index) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	else {
	    return data[index];
	}
    }
    public String set(int index, String element) {
	if (index < 0 || index >= size()) {
	    throw new UnsupportedOperationException();
	}
	String old = data[index];
	data[index] = element;
	return old;
    }
    public String toString() {
	if (getSize() == 0) {
	    return "[]";
	}
	String ans = "[" + data[0];
	for (int i = 1; i < getSize();i++){
	    ans += ", " +  data[i];
	}
	ans += "]";
	return ans;
    }
    private void resize() {
	String[] data1 = new String[size()*2+1];
	for (int i = 0; i < size(); i++) {
	    data1[i] = data[i];
	}
	data = data1;
    }
    public boolean contains(String element) {
	for (int i = 0; i < size(); i++) {
	    if (get(i).equals( element)) {
		return true;
	    }
	}
	return false;
    }
    public void add (int index, String element) {
	if (index < 0 || index > size()) {
	    throw new IndexOutOfBoundsException();
	}
	else {
	    if (size() == data.length) {
		resize();
	    }
	    for (int i = size(); i > index; i-=1) {
		data[i] = data[i-1];
	    }
	    data[index] = element;
	    size += 1;
	}
    }
    public int indexOf(String element) {
	for (int i = 0; i < size(); i++) {
	    if (data[i].equals(element)) {
		return i;
	    }
	}
	return -1;
    }
    public int lastIndexOf(String element) {
	int place = -1;
	for (int i = 0; i < size(); i++) {
	    if (data[i].equals(element)) {
		place = i;
	    }
	}
	return place;
    }
    public String remove (int index) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	String old = data[index];
	for (int i = index; i < size(); i++) {
	    data[i] = data[i+1];
	}
	size -= 1;
	return old;
    }
    public boolean remove (String element) {
	for (int i = 0; i < size(); i++) {
	    if (data[i].equals(element)) {
		for (int x = i; x < size(); x++) {
		    data[x] = data[x+1];
		}
		size -= 1;
		return true;
	    }
	}
	return false;
    }
    public Iterator<String> Iterable() {
	return new SuperArrayIterator(data);
    }
}
