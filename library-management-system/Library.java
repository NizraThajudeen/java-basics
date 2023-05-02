import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList;
    private ArrayList<Member> memberList;

    public Library(){
        this.bookList = new ArrayList<Book>();
        this.memberList = new ArrayList<Member>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        bookList.remove(book);
    }

    public void addMember(Member member){
        memberList.add(member);
    }

    public void removeMember(Member member){
        memberList.remove(member);
    }

    public void borrowBook(Book borrowBook, Member borrowingMember){
        if(borrowBook.getIsBorrowed()== false){
            borrowBook.setBorrowed(true);
            borrowingMember.getBorrowedBooks().add(borrowBook);
        }
    }

    public void returnBook(Book returnBook, Member returningMember){
        if(returnBook.getIsBorrowed() == true){
            returnBook.setBorrowed(false);
            returningMember.getBorrowedBooks().remove(returnBook);
        }
    }
}
