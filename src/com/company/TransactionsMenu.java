package com.company;

import java.util.Scanner;

public class TransactionsMenu {

    private Scanner in;
    private TransactionService service;

    public TransactionsMenu(){
        in = new Scanner(System.in);
        service = new TransactionService();
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
        System.out.println("6) Добавить транзакцию");
        System.out.println("7) Вывести список всех транзакций");
        System.out.println("0) Завершить работу");

        int choice = in.nextInt();

        if( choice > -1 && choice < 8) {
            switch (choice) {
                case 1:
                    service.printAllTransactionsBySurname();
                    break;
                case 2:
                    service.printAllTransactionsForAPeriodOfATime();
                    break;
                case 3:
                    service.printAllTransactionsForAAmountInterval();
                    break;
                case 4:
                    service.printALlTransactionsByCardType();
                    break;
                case 5:
                    service.printTransactionsSortedByAmount();
                    break;
                case 6:
                    Transaction usersTransaction = getTransactionFromConsole();
                    service.addTransaction(usersTransaction);
                    break;
                case 7:
                    service.printAllTransactions();
                    break;
                case 0:
                    return;

            }
        } else {System.out.println("Неверный формат введенных данных");
        printTransactionsMenu();
        }
        printTransactionsMenu();
    }

    private Transaction getTransactionFromConsole() {
        Transaction transaction = new Transaction();
        System.out.println("Введите id: ");
        transaction.setId(in.next());
        System.out.println("Введите имя пользователя: ");
        transaction.setName(in.next());
        System.out.println("Введите фамилию пользователя: ");
        transaction.setSurname(in.next());
        System.out.println("Введите время проведения операции: ");
        transaction.setTime(in.next());
        System.out.println("Введите сумму опреации: ");
        transaction.setAmount(in.nextDouble());
        System.out.println("Введите тип карты: ");
        transaction.setCardType(in.next());
        System.out.println("Транзакция успешно добавлена!");
        return transaction;
    }
}
