public class CirculatingBook extends LibraryBook {
    private String currentHolder;
    private String dueDate;
    public CirculatingBook(String writer, String name, String num, String callNum) {
	super(writer, name, num, callNum);
	curentHolder = null;
	dueDate = null;
    }
    public String getCollection() {
	return super.getCollection();
    }
    public void setCollection(String col) {
	super.setCollection(col);
    }
    public String getCallNumber() {
	return super.getCallNumber();
    }
    public void setCallNumber(String num) {
	super.setCallNumber(num);
    }
    public String getAuthor() {
	return super.getAuthor();
    }
    public void setAuthor(String writer) {
	super.setAuthor(writer);
    }
    public String getTitle() {
	return super.getTitle();
    }
    public void setTitle(String name) {
	super.setTitle(name);
    }
    public String getISBN() {
	return super.getISBN();
    }
    public void setISBN(String num) {
	super.setISBN(num);
    }
    public String getCurrentHolder() {
	return currentHolder;
    }
    public void setCurrentHolder(String name) {
	currentHolder = name;
    }
    public String getDueDate() {
	return dueDate;
    }
    public void setDueDate(String day) {
	dueDate = day;
    }
    public void checkout(String patron, String due) {
	currentHolder = patron;
	dueDate = due;
    }
    public void returned() {
	currentHolder = null;
	dueDate = null;
    }
    public String circulationStatus() {
	if (currentHolder != null) {
	    return "patron " + currentHolder + "; return date " + dueDate;
	}
	else {
	    return "book available on shelves";
	}
    }
    public String toString() {
	String ans = "Book title: " + getTitle() + "; Author: " + getAuthor() + "; ISBN: " + getISBN() + "; Call Number: " + getCallNumber() + "; collection: " + getCollection();
	if (currentHolder != null) {
	    ans = ans + "; Holder: " + getCurrentHolder();
	}
	if (dueDate != null) {
	    ans = ans + "; Due Date: " + getDueDate();
	}
    }
}
