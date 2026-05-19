public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isIssued;
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isIssued() {
        return isIssued;
    }
    public void issueBook() {
        isIssued = true;
    }
    public void returnBook() {
        isIssued = false;
    }
    public void displayBook() {
        System.out.println("\nBook ID : " + id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        if (isIssued) {
            System.out.println("Status  : Issued");
        } else {
            System.out.println("Status  : Available");
        }
    }
}