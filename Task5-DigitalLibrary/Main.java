import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== DIGITAL LIBRARY MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.addBook(
                            new Book(id, title, author)
                    );
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book Title: ");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    String issueId = sc.nextLine();
                    library.issueBook(issueId);
                    break;
                case 5:
                    System.out.print("Enter Book ID: ");
                    String returnId = sc.nextLine();
                    library.returnBook(returnId);
                    break;
                case 6:
                    System.out.print("Enter Book ID: ");
                    String deleteId = sc.nextLine();
                    library.deleteBook(deleteId);
                    break;
                case 7:
                    System.out.println("Exiting Library System...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 7);
    }
}