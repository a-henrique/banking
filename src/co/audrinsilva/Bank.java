package co.audrinsilva;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String agencia;
    private List<Account> accounts;
    private int lastAccount = 1;


    public Bank(String agencia){
        this.agencia = agencia;
        this.accounts = new ArrayList<>();
    }

    // Inserção da conta na lista (Array)
    public void insertAccount(Account account){
        accounts.add(account);
    }

    public Account generateAccount(String name){
        Account account = new Account(agencia, "" + lastAccount, name);
        lastAccount++;
        return account;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void outputTotal(){
        double total = 0;
        for (Account account : accounts){
            double balance = account.getBalance();
            total+= balance;
        }
        System.out.println("Banco possui: R$ " + total);
    }
}
