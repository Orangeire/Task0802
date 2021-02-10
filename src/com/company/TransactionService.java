package com.company;

import java.util.Collections;

public class TransactionService {

    private TransactionRepo transactionRepo;

    public TransactionService(){
        transactionRepo = new TransactionRepo();
    }

    public void addTransaction(Transaction transaction) {
        transactionRepo.add(transaction);
    }

    public void printTransactionsSortedByAmount() {
        transactionRepo.sortByAmount();
    }

    public void printALlTransactionsByCardType() {
    }

    public void printAllTransactionsForAAmountInterval() {
    }

    public void printAllTransactionsForAPeriodOfATime() {
    }

    public void printAllTransactionsBySurname() {
    }

    public void printAllTransactions() {
        transactionRepo.printRepo();
    }
}
