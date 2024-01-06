package org.Builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .Name("Agustín")
                .Address("Jiménez")
                .Age(23)
                .build();

        System.out.print(person);
    }
}