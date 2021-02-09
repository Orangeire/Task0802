package com.company;

import java.util.Scanner;

public class TransactionsMenu {

    private Scanner in;
    private TransactionService service;

    public TransactionsMenu(){
        in = new Scanner(System.in);
        TransactionService transactionService = new TransactionService();
        printMenu();
    }

    private void printMenu() {
        System.out.println("Добро пожаловать в БаркБанк!!! ");
        System.out.println("Наши услуги: ");
        printTransactionsMenu();
    }

    private void printTransactionsMenu() {
        System.out.println("1) Вывести все транзакции по фамилии пользователя");
        System.out.println("2) Вывести все транзакции за определенный " +
                "периолд времени");
        System.out.println("3) Вывести все транзакции сумма которых " +
                "принадлежит вашемуинтервалу");
        System.out.println("4) Вывести все транзакции, проведенные " +
                "с использованием определенной карты" +
                "( Visa / Mastercard/ Maestro/ Белкарт");
        System.out.println("5) Вывести список всех транзакций," +
                " отсортированный по сумме");
        System.out.println("0) Завершить работу");

        int choice = in.nextInt();

        if( choice > -1 && choice < 7) {
            switch (choice) {
                case 1:
                    printAllTransactionsBySurname();
                    break;
                case 2:
                    printAllTransactionsForAPeriodOfATime();
                    break;
                case 3:
                    printAllTransactionsForAAmountInterval();
                    break;
                case 4:
                    printALlTransactionsByCardType();
                    break;
                case 5:
                    printTransactionsSortedByAmount();
                    break;
                case 0:
                    return;

            }
        } else {System.out.println("Неверный формат введенных данных");
        printTransactionsMenu();
        }
        printTransactionsMenu();
    }

    private void printTransactionsSortedByAmount() {
        System.out.println("hui5");
    }

    private void printALlTransactionsByCardType() {
        System.out.println("hui4");
    }

    private void printAllTransactionsForAAmountInterval() {
        System.out.println("hui3");
    }

    private void printAllTransactionsForAPeriodOfATime() {
        System.out.println("hui2");
    }

    private void printAllTransactionsBySurname() {
        System.out.println("hui1");
    }
}
