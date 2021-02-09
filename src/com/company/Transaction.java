package com.company;

public class Transaction {

    private String id;
    private String name;
    private String surname;
    private String time;
    private String cardType;
    private double amount;

    public Transaction(String id, String name, String surname, String time, String cardType, double amount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.time = time;
        this.cardType = cardType;
        this.amount = amount;
    }


}
