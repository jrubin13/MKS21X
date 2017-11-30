abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String callNumber;

    public LibraryBook(String author, String title, String ISBN, String callNum) {
	super(author, title, ISBN);
	callNumber = callNum;
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
    public String getCallNumber() {
	return callNumber;
    }
    public void setCallNumber(String num) {
	callNumber = num;
    }
    
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    public int compareTo (LibraryBook other) {
	return getCallNumber().compareTo(other.getCallNumber());
    }

    public String toString() {
	return getTitle() + ", " + getAuthor() + ", " + getISBN() + ", " + circulationStatus() + ", " + getCallNumber();
    }
}
    
