abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String callNumber;

    public LibraryBook(String author, String title, String ISBN, String callNum) {
	super(author, title, ISBN);
	callNumber = callNum;
    }
    public String getAuthor() {
	return super(getAuthor());
    }
    public void setAuthor(String writer) {
	
