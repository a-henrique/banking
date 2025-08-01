package co.audrinsilva;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("0001", "1234", "Seu Barriga");

        // D - Deposito
        // S - Saque
        // E - Sair
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
