package ru.mirea.lab2.Author;

public class TestAuthor
{
    public static  void main(String[] args)
    {
        Author author = new Author("Тимошка", "auch@gmail.ru", 'M');
        System.out.println(String.format("%s %s %s",author.GetName(), author.GetEmail(), author.GetGender()));

        author.SetEmail("he@mail.ru");

        System.out.println(author.ToString());
    }
}