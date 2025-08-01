package co.audrinsilva;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank("0001");
        // C = Criar Conta
        // E = Sair
        while (true){
            System.out.println("O que deseja fazer? C = Criar Conta, E=Sair do programa");
            String op = scanner.nextLine();
            if (op.equals("C")){
                System.out.println("Digite o seu nome: ");
                String name = scanner.nextLine();
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);

                operateAccount(account);
            } else if (op.equals("E")){
                break;
            } else {
                System.out.println("Comando Inválido");
            }
        }

        List<Account> accountList = santander.getAccounts();
        for (Account conta : accountList){
            System.out.println(conta);
        }
        santander.outputTotal();
    }

    static void operateAccount(Account account) {
        // D - Deposito
        // S - Saque
        // E - Sair

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("O que deseja fazer?\nD - Deposito\nS - Saque\nE - Sair");
            String op = scanner.nextLine();
            if (op.equals("D")){
                System.out.println("qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")){
                System.out.println("Qual valor deseja sacar?");
                double value = scanner.nextDouble();
                if (!account.withDraw(value)){
                    System.out.println("Não foi possível sacar o valor " + value);
                }
            } else if (op.equals("E")){
                break;
            } else {
                System.out.println("Comando Inválido, tente novamente!");
            }
            scanner = new Scanner(System.in);
        }
    }
}
