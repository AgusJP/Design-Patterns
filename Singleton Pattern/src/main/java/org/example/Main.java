package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Texto de ejemplo");
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance("Texto de ejemplo2");
        System.out.println(singleton2);

    }
}