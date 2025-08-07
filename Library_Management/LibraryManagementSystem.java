package library;
import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		library.addBook(new Book("Book1", "Author1"));
		library.addBook(new Book("Book2", "Author2") );
		
		while(true) {
			System.out.println(("\n1. Issued book"));
			System.out.println("2. Return book");
			System.out.println("3. Print book");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			  case 1:
				  System.out.println("Enter book title: ");
				  String bookTitle = scanner.nextLine();
				  System.out.println("Enter user name: ");
				  String userName = scanner.nextLine();
				  System.out.println("Enter user id: ");
				  String userId = scanner.nextLine();
				  library.issuedBook(bookTitle, new User(userName, userId));
				  break;
			  case 2:
				  System.out.println("Enter user id: ");
				  String returnUserId = scanner.nextLine();
				  library.returnBook(returnUserId);
				  break;
			  case 3:
				  library.printBooks();
				  break;
			  case 4:
				  scanner.close();
				  System.exit(0);
				  break;
			  default:
				  System.out.println("Invalid choice");
					 
				  
				  
				
				 
			}
		}
		// TODO Auto-generated method stub

	}

}

