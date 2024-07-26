package com.HANDSON.dao;

import com.HANDSON.dto.BankAccount;

import java.util.List;

public interface BankAccountDAO {
    public boolean addRecords(BankAccount bankAccount);
    public void updateRecord(BankAccount bankAccount);//4
    public void deleteRecord(int id);//2
    public List<BankAccount> DisplayAllRecords();
    public BankAccount displayBankAccount(int actNumber);
    public List<BankAccount> getBankAccountByACName(String customerName);
    public List<BankAccount> getBankAccountByACBranch(int branchCode);
    public void fetchGroupBy(BankAccount bankAccount);
}
