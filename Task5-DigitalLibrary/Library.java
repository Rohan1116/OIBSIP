import java.util.ArrayList;
public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully");
    }
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available");
            return;
        }
        for (Book book : books) {
            book.displayBook();
        }
    }
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book Not Found");
        }
    }
    public void issueBook(String id) {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book Issued Successfully");
                } else {
                    System.out.println("Book Already Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }
    public void returnBook(String id) {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book Returned Successfully");
                } else {
                    System.out.println("Book Was Not Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }
    public void deleteBook(String id) {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                books.remove(book);
                System.out.println("Book Deleted Successfully");
                return;
            }
        }
        System.out.println("Book Not Found");
    }
}