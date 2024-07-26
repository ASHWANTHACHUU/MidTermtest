package com.HANDSON.io;

import com.HANDSON.dto.BankAccount;
import com.HANDSON.service.BankAccountService;
import com.HANDSON.service.BankAccountServiceImpl;

import java.util.List;

public class BankAccountMain {
    private static BankAccountService bs=new BankAccountServiceImpl();
    public static void main(String[] args) {
        //addRecord(); //C
        //displayRecords();//R
        //updateRecord(); //U
        deleteRecord(); //D
        //getParticularRecordsByNumber();
//        getParticularRecords();
        //getParticularRecordsByName();
        //byBranchCode();
        //fetch();
    }
    public static void addRecord(){
        BankAccount bankAccount=new BankAccount(1006000.0,111,642128,"udumalpet","Mahendran");
        boolean res= bs.addRecords(bankAccount);
        if(res){
            System.out.println("Accounts Record added");
        }
        else{
            System.out.println("Accounts Record not added");
        }
    }
    public static void displayRecords() {
        List<BankAccount> l1= bs.DisplayAllRecords();
        l1.forEach(System.out::println);
    }
    public static void updateRecord() {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setActNumber(101);
        bs.updateRecord(bankAccount);
    }
    public static void deleteRecord() {
        bs.deleteRecord(103);
    }
    public static void getParticularRecordsByNumber() {
        BankAccount bankAccount=bs.displayBankAccount(102);
    }
    public static void getParticularRecordsByName() {
        BankAccount bankAccount=new BankAccount();
        List<BankAccount> ls=bs.getBankAccountByACName("Naveen");
        ls.forEach(System.out::println);;
    }
    public static void byBranchCode(){
        BankAccount bankAccount=new BankAccount();
        List<BankAccount> ls= bs.getBankAccountByACBranch(642128);
        ls.forEach(System.out::println);

    }
    public static void fetch(){
        BankAccount account=new BankAccount();
        bs.fetchGroupBy(account);
        System.out.println(bs.toString());
    }

}
