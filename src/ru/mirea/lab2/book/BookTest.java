package ru.mirea.lab2.book;

public class BookTest
{
    public static void main(String[] args)
    {
    Book book1 = new Book("He", "English1", 1950);
    Book book2 = new Book("She", "English2", 1951);
    Book book3 = new Book("It", "English3", 1956);
    Book book4 = new Book("They", "English4", 1999);

    BookShelf bookShelf = new BookShelf(4);

        bookShelf.AddBook(book1);
        bookShelf.AddBook(book4);
        bookShelf.AddBook(book2);
        bookShelf.AddBook(book3);
    boolean isAddedBook = bookShelf.AddBook(book4);

        System.out.println("Добавлена ли предыдущая книга: "+isAddedBook);
        System.out.print(bookShelf.ToString());

        bookShelf.SortByYearBooks();
        System.out.println("Сортировка.....");
        System.out.print(bookShelf.ToString());
    }
}
