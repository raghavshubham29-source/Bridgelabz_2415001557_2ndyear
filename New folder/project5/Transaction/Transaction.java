package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book b, Member m) {
        if (!b.isIssued) {
            b.isIssued = true;
            System.out.println("Book \"" + b.title + "\" issued to " + m.name);
        } else {
            System.out.println("Book \"" + b.title + "\" is already issued!");
        }
    }

    public void returnBook(Book b, Member m) {
        if (b.isIssued) {
            b.isIssued = false;
            System.out.println("Book \"" + b.title + "\" returned by " + m.name);
        } else {
            System.out.println("Book \"" + b.title + "\" was not issued!");
        }
    }
}
