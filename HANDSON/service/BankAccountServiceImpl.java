package com.HANDSON.service;

import com.HANDSON.dao.BankAccountDAO;
import com.HANDSON.dao.BankAccountDAOImpl;
import com.HANDSON.dto.BankAccount;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService{
    BankAccountDAO dao=new BankAccountDAOImpl();
    @Override
    public boolean addRecords(BankAccount bankAccount) {
        return dao.addRecords(bankAccount);
    }

    @Override
    public void updateRecord(BankAccount bankAccount) {
        dao.updateRecord(bankAccount);
    }

    @Override
    public void deleteRecord(int id) {
        dao.deleteRecord(103);
    }

    @Override
    public List<BankAccount> DisplayAllRecords() {
        return dao.DisplayAllRecords();
    }

    @Override
    public BankAccount displayBankAccount(int actNumber) {
        return dao.displayBankAccount(10);
    }

    @Override
    public List<BankAccount> getBankAccountByACName(String customerName) {
        return dao.getBankAccountByACName("Naveen");
    }

    @Override
    public List<BankAccount> getBankAccountByACBranch(int branchCode) {
        return dao.getBankAccountByACBranch(642128);
    }

    @Override
    public void fetchGroupBy(BankAccount bankAccount) {
         dao.fetchGroupBy(bankAccount);
    }


}
