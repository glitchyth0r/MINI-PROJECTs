import java.util.*;
import java.time.LocalDate;

class Book {
    private int bookid;
    private String bookname;
    private String author;
    private boolean isAvailable;
    private String genre;

    public Book(int bookid, String bookname, String author, boolean isAvailable, String genre) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.isAvailable = isAvailable;
        this.genre = genre;
    }

    public int getBookid() {
        return bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getGenre() {
        return genre;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String tostring() {
        return "Book ID: " + bookid + ", Book Name: " + bookname + ", Author: " + author + ", Available: " + isAvailable
                + ", Genre: " + genre;
    }
}

class User {
    private int userId;
    private String userName;
    private String email;
    private List<Book> issuedBooks;

    public User(int userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.issuedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIssuedBooks(List<Book> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public String tostring() {
        return "User ID: " + userId + ", User Name: " + userName + ", Email: " + email;
    }

}

class IssueRecord {
    private int issueId;
    private Book book;
    private User user;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public IssueRecord(int issueId, Book book, User user, LocalDate issueDate, LocalDate returnDate) {
        this.issueId = issueId;
        this.book = book;
        this.user = user;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getIssueId() {
        return issueId;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String tostring() {
        return "Issue ID: " + issueId + ", Book: [" + book.tostring() + "], User: [" + user.tostring()
                + "], Issue Date: "
                + issueDate + ", Return Date: " + returnDate;
    }

}