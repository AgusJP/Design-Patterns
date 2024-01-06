package org.Builder;

public class Person {
    private final String name;
    private final int age;
    private final String surnames;
    private final String address;
    private final String email;
    private final int height;
    private final String gender;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.surnames = builder.surnames;
        this.address = builder.address;
        this.email = builder.email;
        this.height = builder.height;
        this.gender = builder.gender;
    }

    public String toString() {
        return "Persona{name='" + this.name + "', age=" + this.age + ", surnames='" + this.surnames + "', address='" + this.address + "', email='" + this.email + "', height=" + this.height + ", gender='" + this.gender + "'}";
    }

    public static class Builder {
        private String name;
        private int age;
        private String surnames;
        private String address;
        private String email;
        private int height;
        private String gender;

        public Builder() {
        }

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder Age(int age) {
            this.age = age;
            return this;
        }

        public Builder Surnames(String surnames) {
            this.surnames = surnames;
            return this;
        }

        public Builder Address(String address) {
            this.address = address;
            return this;
        }

        public Builder Email(String email) {
            this.email = email;
            return this;
        }

        public Builder Height(int height) {
            this.height = height;
            return this;
        }

        public Builder Gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}


