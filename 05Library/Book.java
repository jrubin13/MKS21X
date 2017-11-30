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
    public void setAuthor(String writer) {
	author = writer;
    }
    public String getTitle() {
	return title;
    }
    public void setTitle(String name) {
	title = name;
    }
    public String getISBN() {
	return ISBN;
    }
    public void setISBN(String num) {
	ISBN = num;
    }
    public String toString() {
	return getTitle() + ", " + getAuthor() + ", " + getISBN();
    }

}
