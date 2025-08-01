package co.audrinsilva;

public class Account {

    private final static int MAX_LENGTH = 12; // Constante para criação de nomes com no máximo 12 caracteres

    private String agencia;

    private String conta;

    private String name;

    private double balance;

    private Log logger;

    public Account(String agencia, String conta, String name){
        this.agencia = agencia;
        this.conta = conta;
        // this.name = name;
        setName(name);
        // Na hora de criar o objeto precisamos passar
        // valores para estas variaveis.
        logger = new Log();
    }

    public void setName(String name){
        if (name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH); // Fatia a string até o limite
        } else {
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("==== DEPOSITO ====\nValor: R$ " + value + "\nSaldo atual: R$ " + balance);
    }

    public boolean withDraw(double value) {
        // Decrementar o valor do balance
        if (balance < value) {
            logger.out("==== SAQUE ====\nVocê tentou sacar: R$ " + value + "\nSaldo atual: R$ " + balance);
            return false;
        }
        balance -= value;
        logger.out("==== SAQUE ====\nValor: R$" + value + "\nSaldo Atual: R$ " + balance);
        return true;
    }

    @Override
    public String toString() {
        // String result = "A Conta " + this.name + " " + this.agencia + " / " + this.conta + "possui: R$ " + balance;
        // return result;
        return "A Conta " + this.name + " " + this.agencia + " / " + this.conta + " possui: R$ " + balance;
    }

    public double getBalance() {
        return balance;
    }
}
