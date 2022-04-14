package hu.progmatic;

import hu.models.Author;
import hu.models.Book;

public class Main {

    public static void main(String[] args) {
        Author jkRowling = new Author("J. K. Rowling", "England", 1965);

	    Book hp1 = new Book();
        hp1.setTitle("Harry Potter és a bölcsek köve");
        hp1.setAuthor(jkRowling);
        hp1.setPublished(1997);
        hp1.setGenre("Fantasy");
        hp1.printBookData();

        Book hp2 = new Book("Harry Potter és a Titkok Kamrája", jkRowling, 1998, "Fantasy");
        hp2.printBookData();

        Book hp3 = new Book("Harry Potter és az azkabani fogoly", jkRowling, 1999, "Fantasy");
        hp3.printBookData();

        Book hp4 = new Book("Harry Potter és a Tűz Serlege", jkRowling, 2000, "Fantasy");
        hp4.printBookData();

        Book hp5 = new Book("Harry Potter és a Főnix Rendje", jkRowling, 2003, "Fantasy");
        hp5.printBookData();

        Book hp6 = new Book("Harry Potter és a Félvér Herceg", jkRowling, 2005, "Fantasy");
        hp6.printBookData();

        Book hp7 = new Book("Harry Potter és a Halál ereklyéi", jkRowling, 2007, "Fantasy");
        hp7.printBookData();

        Author ernestCline = new Author("Ernest Cline", "USA", 1972);

        Book rpo = new Book("Ready Player One", ernestCline, 2011,"Sci-Fi");
        rpo.printBookData();

        Book rpt = new Book("Ready Player Two", ernestCline, 2020, "Sci-Fi");
        rpt.printBookData();
    }
}
