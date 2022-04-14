package hu.models;

public class Book {
    private Author author;
    private String title;
    private int published;
    private String genre;

    public Book(){

    }

    public Book(String title, Author author, int published, String genre){
        this.author = author;
        this.title = title;
        this.published = published;
        this.genre = genre;
    }

    /*public void printBookData(){
        System.out.println("Title: " + title + "\tAuthor: " + author + "\tPublished: " + published + "\tGenre: " + genre);
    }*/

    /*public void printBookData(){
        System.out.println(toString());
    }*/

    public void printBookData(){
        System.out.println(this); //alapértelmezetten a toString() methodot hívja meg kiírásnál?
    }

    public String toString(){
        return "Title: " + title + "\tAuthor: {" + author + "}\tPublished: " + published + "\tGenre: " + genre;
    }

    public void setAuthor(Author author){
        this.author=author;
    }

    public Author getAuthor(){
        return  author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPublished(int published){
        this.published = published;
    }

    public int getPublished(){
        return published;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }
}
