package co.audrinsilva;

public class App {
    public static void main (String[] args){
        System.out.println("Olá mundo");
        // Classe inicial, "main" para execução do programa

        Account account = new Account("0001", "1234", "");

        boolean succeed = account.withDraw(200);
        if (!succeed){
            System.out.println("Você não tem saldo suficiente para sacar");
        }
        // Done: 1. Criar uma conta (Agencia, conta, nome) (OK)
        // Done: limitar o nome = 12 caracteres

        // Done: 2. Sacar valores
        //          Um usuário não pode sacar
        //          mais do que tem

        // ToDo: 3. Depositar

        // ToDo: 4. Extrato
        //      Informar para o usuario as operações (saque, deposito)
    }
}
