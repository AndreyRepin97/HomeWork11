package ru.skypro;


public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("alexandr", "duma");
        Author author2 = new Author("duma", "starshij");

        Book triMushket = new Book("triMushketera", author1, 1666);
        Book twentyYearsSpustya = new Book("dwadcatLetSpustya", author2, 1777);

        System.out.println(twentyYearsSpustya.getBookName());
        System.out.println(twentyYearsSpustya.getAuthorName().getName1()+" "+twentyYearsSpustya.getAuthorName().getName2());
        twentyYearsSpustya.setData(1888);
        System.out.println(twentyYearsSpustya.getData());

        System.out.println(triMushket.getBookName());
        System.out.println(triMushket.getAuthorName().getName1()+" "+triMushket.getAuthorName().getName2());
        System.out.println(triMushket.getData());


        System.out.println(triMushket.equals(twentyYearsSpustya));
        System.out.println(triMushket.hashCode());
        System.out.println(twentyYearsSpustya.hashCode());

        System.out.println(triMushket.toString());
        System.out.println(author2.toString());

        System.out.println(author1.equals(author2));
    }
}
