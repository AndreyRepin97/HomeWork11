package ru.skypro;


import java.util.Objects;

public class Author {
    private String name1;
    private String name2;

    public Author(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;

    }
    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name1.equals(author.name1) && name2.equals(author.name2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name1, name2);
    }
}


