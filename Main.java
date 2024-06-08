package LibraryProject;

import LibraryProject.items.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        CD cd1 = new CD("Thriller", "Michael Jackson");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        Periodical periodical1 = new Periodical("Time", "Various Authors");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(cd1);
        library.addItem(dvd1);
        library.addItem(periodical1);

        library.listItems();

        library.removeItem(book2);

        library.listItems();

        library.borrowItem(book1);
        library.borrowItem(periodical1);

        library.listItems();

        library.returnItem(book1);

        library.listItems();
    }
}

