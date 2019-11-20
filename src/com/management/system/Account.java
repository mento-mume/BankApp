package com.management.system;

public abstract class Account implements IBaseRate {
    //list common properties for saving and checking account
    private String name;
    private String sSN;
    private double balance;
   private static int index = 1000;
   protected String accountNumber;
   protected double rate;

    //constructor to set base properties and initialize the account

    public Account(String name,String sSN, double initDeposit) {
        this.name = name;
        this.sSN =sSN;
        balance = initDeposit;

        //set the account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();


    }
    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    public void compound(){
        double accruedInterest = balance *(rate/100);
        System.out.println("Accrued Interest is "+accruedInterest);
        balance = balance +accruedInterest;
        printBalance();
    }


    //list common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing "+amount);
        printBalance();

    }
    public void withdraw(double amount){
        balance = balance- amount;
        System.out.println("withdrawing "+amount);
        printBalance();
    }
    public void transfer(String toWhere,double amount){
        balance = balance-amount;
        System.out.println("Transfering N: "+amount+" "+"to "+ toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is :"+balance);
    }
    public void showInfo(){
        System.out.println("Name: "+name +" "+"Account Number :"+accountNumber+" "+"Balance :"+balance
                +" "+"Rate: "+rate+"%");
    }
}
