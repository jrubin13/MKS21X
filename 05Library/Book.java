public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book(){

    }
    public Book(String writer, String name, String num) {
	author = writer;
	title = name;
	ISBN = num;
    }
    public String getAuthor() {
	return author;
    }
    public String getTitle() {
	return title;
    }
    public String getISBN() {
	return ISBN;
    }
    public String toString() {
	return getTitle() + ", " + getAuthor() + ", " + getISBN();
    }

}
