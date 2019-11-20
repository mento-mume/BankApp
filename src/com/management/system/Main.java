package com.management.system;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        Checking checking = new Checking("sade wilson","0123456789",1500);

        Savings savings = new Savings("uduak chris","9876543210",2000);

        savings.compound();
        savings.showInfo();

        savings.deposit(5000);
        savings.withdraw(2000);
        savings.transfer("kevman",1000);
        System.out.println("************************");
        checking.showInfo();
        checking.deposit(5000);
        checking.withdraw(2000);
        checking.transfer("kevman",1000);

         */
        List<Account>
                accounts =
                new LinkedList<>();
        String
                file =
                "C:\\Users\\NDUKEABASI\\IdeaProjects\\BankApp\\newAccountHolders.csv";
        List<String[]>
                newAccountHolders =
                utilities.CSV.read(file);
        for (String[] accountholder : newAccountHolders) {
            String
                    name =
                    accountholder[0];
            String
                    sSN =
                    accountholder[1];
            String
                    accountType =
                    accountholder[2];
            double
                    initDeposit =
                    Double.parseDouble(accountholder[3]);

            if (accountType.equals("Savings")) {

                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {

                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Error Reading Account Type");
            }

        }

        for (Account acc : accounts) {
            System.out.println("*********************************");
            acc.showInfo();
        }


    }
}