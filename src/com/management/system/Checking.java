package com.management.system;

public class Checking extends Account {
    //list properties specific to a checking account
    private int debitCardNumber;
    private int getDebitCardPin;

    //constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "1"+ accountNumber;
        setDebitcardDetails();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;

    }

    private void setDebitcardDetails() {
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        getDebitCardPin = (int)(Math.random()*Math.pow(10,4));
    }

    //list any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking"+" "+"Debit Card Number: "+debitCardNumber+
                " "+"Debit Card Pin: "+getDebitCardPin);

    }
}
