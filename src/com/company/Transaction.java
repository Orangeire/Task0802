package com.company;

public class Transaction {

    private String id;
    private String name;
    private String surname;
    private String time;
    private double amount;
    private String cardType;

    public Transaction(String id, String name, String surname, String time, double amount, String cardType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.time = time;
        this.amount = amount;
        this.cardType = cardType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction() {
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Транзакиця " +
                "id='" + id + '\'' +
                ", Имя - '" + name + '\'' +
                ", Фамилия -'" + surname + '\'' +
                ", проведена в '" + time + '\'' +
                ", с помощью карты'" + cardType + '\'' +
                ", сумма транзакции = " + amount + " USD";
    }
}
