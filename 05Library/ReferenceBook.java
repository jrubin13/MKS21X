public class ReferenceBook extends LibraryBook {
    private String collection;

    public ReferenceBook(String writer, String name, String num, String callNum, String col) {
	super(writer, name, num, callNum);
	collection = col;
    }
    public String getCollection() {
	return collection;
    }
    public void setCollection(String col) {
	collection = col;
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

    public void returned() {
	System.out.println("error: reference book could not have been checked out, return impossible");
    }
    public void checkout(String patron, String due) {
	System.out.println("error: " + patron + " cannot check out a reference book");
    }
    public String circulationStatus() {
        return "error: non-circulating reference book";
    }
    public String toString() {
	return "Book title: " + getTitle() + "; Author: " + getAuthor() + "; ISBN: " + getISBN() + "; Call Number: " + getCallNumber() + "; collection: " + getCollection();
    }
}
