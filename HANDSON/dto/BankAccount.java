package com.HANDSON.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class BankAccount {
    @Id
    private int actNumber;
    private String customerName;
    private double actBalance;
    private String city;
    private int branchCode;

    public BankAccount(double actBalance, int actNumber, int branchCode, String city, String customerName) {
        this.actBalance = actBalance;
        this.actNumber = actNumber;
        this.branchCode = branchCode;
        this.city = city;
        this.customerName = customerName;
    }

    public BankAccount() {
    }

    public double getActBalance() {
        return actBalance;
    }

    public void setActBalance(double actBalance) {
        this.actBalance = actBalance;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "actBalance=" + actBalance +
                ", actNumber=" + actNumber +
                ", customerName='" + customerName + '\'' +
                ", city='" + city + '\'' +
                ", branchCode=" + branchCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return actNumber == that.actNumber && Double.compare(actBalance, that.actBalance) == 0 && branchCode == that.branchCode && Objects.equals(customerName, that.customerName) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actNumber, customerName, actBalance, city, branchCode);
    }
}
