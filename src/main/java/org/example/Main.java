package org.example;

public class Main {
    public static void main(String[] args) {
        Man joe = new Man("Joe", "Brown", 30, "Brown", false);
        Man john = new Man("John", "Doe", 65, null, true);
        Woman sarah = new Woman("Sarah", "Brown", 30, "Brown", false,"White");
        Woman lisa = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        System.out.println("Joe's BIO:");
        joe.isRetired();
        joe.registerPartnership();
        joe.deregisterPartnership();
        System.out.println();
        System.out.println("John's BIO:");
        john.isRetired();
        john.registerPartnership();
        john.deregisterPartnership();
        System.out.println();
        System.out.println("Sarahs's BIO:");
        sarah.isRetired();
        sarah.registerPartnership();
        sarah.deregisterPartnership();
        System.out.println();
        System.out.println("Lisa's BIO:");
        lisa.isRetired();
        lisa.registerPartnership();
        lisa.deregisterPartnership();
        lisa.setPartner("Doe");
        System.out.println("Lisa's updated BIO:");
        lisa.isRetired();
        lisa.registerPartnership();
        lisa.deregisterPartnership();
        john.setPartner("Yong");
        john.setDevorced(false);
        System.out.println();
        System.out.println("John's updated BIO:");
        john.isRetired();
        john.registerPartnership();
        john.deregisterPartnership();
    }
}