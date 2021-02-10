package com.company;

import java.util.*;

public class TransactionRepo {

    private List<Transaction> transactions;

    public TransactionRepo(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public TransactionRepo() {
        this.transactions = new ArrayList<>();
    }

    public void add(Transaction transaction) {
        transactions.add(transaction);
        System.out.println(transactions.size());
    }

    public void printRepo() {
        if (!transactions.isEmpty()) {
            for (int i = 0; i < transactions.size(); i++) {
                Transaction currentTransaction = transactions.get(i);
                System.out.println(currentTransaction.toString());
            }
        }else{
            System.out.println("Список транзакций пуст");
            return;
        }
    }

    public void sortByAmount() {
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getAmount)
                        .thenComparing(Transaction::getId))
                .forEach(System.out::println);


    }

    public void printTransactionsThatUseUsersCardType(String cardType) {
        for (int i = 0; i < transactions.size(); i++) {
            Transaction currentTransaction = transactions.get(i);
            if (currentTransaction.getCardType().equals(cardType))
                System.out.println(currentTransaction.toString());
        }
    }

    public void printTransactionsWithUsersSurname(String surname) {
        for (int i = 0; i < transactions.size(); i++) {
            Transaction currentTransaction = transactions.get(i);
            if (currentTransaction.getSurname().equals(surname))
                System.out.println(currentTransaction.toString());
        }
    }
}

