package org.example;

public class Singleton {

    private static Singleton instance;
    private String Content;

    private Singleton(String Content) {
        this.Content = Content;
    }

    public static Singleton getInstance(String Content) {
        if (instance == null) {
            instance = new Singleton(Content);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "Content='" + Content + '\'' +
                '}';
    }
}
