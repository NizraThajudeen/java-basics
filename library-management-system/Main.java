public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        Book book = new Book("harry potter", "j.k. rowling", "1234", false);
        Book book2 = new Book("The boy, The mole, The fox and the horse", "Charlie Mackesy", "6789", false);
        Book book3 = new Book("my book", "test", "67298", false);

        // add books
        lib.addBook(book);
        lib.addBook(book2);
        lib.addBook(book3);

//        for (Book books: lib.getBookList()) {
//            System.out.println(books);
//        }
        System.out.println(lib.getBookList());

        Member member = new Member(1, "Anne");
        Member member1 = new Member(2, "Mike");
        Member member2 = new Member(3, "Claire");

        // register Member
        lib.addMember(member);
        lib.addMember(member1);
        lib.addMember(member2);

        System.out.println(lib.getMemberList());

        // remove books
//        lib.removeBook(book3);
//        System.out.println("after removing"+ lib.getBookList());
//
        // remove Member
//        lib.removeMember(member2);
//        System.out.println("after removing member "+ lib.getMemberList());

        // borrow books
        lib.borrowBook(book2, member);
        System.out.println(lib.getBookList());
        System.out.println(lib.getMemberList());

        //return books
        lib.returnBook(book2, member);
        System.out.println("after return "+lib.getBookList());
        System.out.println("after return "+lib.getMemberList());
    }
}