package library;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	private ArrayList<Book> books;
	private HashMap<String, Book> issuedBooks;
	public Library() {
		this.books = new ArrayList<>();
		this.issuedBooks = new HashMap<>();
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void issuedBook(String bookTitle, User user) {
		for (Book book : books) {
			if(book.getTitle().equals(bookTitle) && !book.isIssued()) {
				book.setIssued(true);
				issuedBooks.put(user.getId(), book);
				System.out.println("Book issued to " + user.getName());
				return;
			}
		}
		System.out.println("Book not avilable or already issued");
	}
	public void returnBook(String userId) {
		if(issuedBooks.containsKey(userId)) {
			Book book = issuedBooks.get(userId);
			book.setIssued(false);
			issuedBooks.remove(userId);
			System.out.println("Book returned succesfully");
			
		}else {
			System.out.println("no book issued to this user");
		}
	}
	public void printBooks() {
		for(Book book: books) {
			System.out.println("Title: " + book.getTitle() + ",Author: " + book.getAuthor() + ", Issued: " + book.isIssued());
		}
	}

}

