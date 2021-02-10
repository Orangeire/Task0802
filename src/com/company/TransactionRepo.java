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
            System.out.println(transactions.size());
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
}

