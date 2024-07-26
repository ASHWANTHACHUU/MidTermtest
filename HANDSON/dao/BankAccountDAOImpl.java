package com.HANDSON.dao;

import com.HANDSON.config.Connection;
import com.HANDSON.dto.BankAccount;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class BankAccountDAOImpl implements BankAccountDAO {
    EntityManager em = Connection.getEntityManager();
    Query q;

    @Override
    public boolean addRecords(BankAccount bankAccount) {
        em.getTransaction().begin();
        em.persist(bankAccount);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public void updateRecord(BankAccount bankAccount) {
        em.getTransaction().begin();
        BankAccount old = em.find(BankAccount.class, 101);
        old.setActBalance(1000);
        em.getTransaction().commit();
        System.out.println("Account TrainDetails");
    }

    @Override
    public void deleteRecord(int actNumber) {
        em.getTransaction().begin();
        BankAccount bankAccount = em.find(BankAccount.class, 103);
        em.remove(bankAccount);
        em.getTransaction().commit();
    }

    @Override
    public List<BankAccount> DisplayAllRecords() {
        q = em.createQuery("select c from BankAccount as c");
        List<BankAccount> l = q.getResultList();
        return l;
    }

    @Override
    public BankAccount displayBankAccount(int actNumber) {
        em.getTransaction().begin();
        BankAccount bankAccount = em.find(BankAccount.class, 102);
        em.getTransaction().commit();
        System.out.println(bankAccount.toString());
        return bankAccount;
    }

    @Override
    public List<BankAccount> getBankAccountByACName(String customerName) {
        em.getTransaction().begin();
        q = em.createQuery("SELECT e from BankAccount AS e WHERE e.customerName = :name");
        q.setParameter("name", customerName);
        List<BankAccount> bankAccountList = q.getResultList();
        return bankAccountList;
    }

    @Override
    public List<BankAccount> getBankAccountByACBranch(int branchCode) {
        em.getTransaction().begin();
        q = em.createQuery("SELECT e from BankAccount AS e WHERE e.branchCode = :branchcode");
        q.setParameter("branchcode", branchCode);
        List<BankAccount> bankAccountList = q.getResultList();
        return bankAccountList;
    }

    @Override
    public void fetchGroupBy(BankAccount bankAccount) {

        EntityManager em = Connection.getEntityManager();
        Query query = em.createQuery("SELECT e.city,e.customerName,e.actBalance from BankAccount e group by city,customerName,actBalance");
        List<Object[]> empList = query.getResultList();
        for ( Object[] ob : empList) {
            System.out.println(ob[0] + ":" + ob[1] + ":" + ob[2].toString());
        }
    }
}
