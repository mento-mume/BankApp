package com.management.system;

public class Savings extends Account {
    //list properties specific to a savings account
    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    //constructor to initialize saving account properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "2"+ accountNumber;
        setSafetyDepositBoxID();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() -.25;

    }

    private void setSafetyDepositBoxID(){
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
        getSafetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
    }


    //list any methods specific to the saving account
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Savings" + " "+ "Safety Deposit Id :"+safetyDepositBoxID+" "+"Safety Depoit Key: "+getSafetyDepositBoxKey);

    }
}
