package hu.models;

public class Author {
    private String name;
    private String country;
    private int birthYear;

    public Author(){}

    public Author(String name, String country, int birthYear){
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    public String toString(){
        return "Name: " + name + "\tCountry: " + country + "\tBirth year: " + birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String county){
        this.country = country;
    }

    public String getCountry(){
        return  country;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return birthYear;
    }

}
