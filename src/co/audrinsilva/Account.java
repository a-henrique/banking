package co.audrinsilva;

public class Account {

    private String agencia;

    private String conta;

    private String name;

    private double balance;

    private final static int MAX_LENGTH = 12; // Constante para criação de nomes com no máximo 12 caracteres

    public Account(String agencia, String conta, String name){
        this.agencia = agencia;
        this.conta = conta;
        // this.name = name;
        setName(name);
        // Na hora de criar o objeto precisamos passar
        // valores para estas variaveis.
    }

    public void setName(String name){
        if (name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH); // Fatia a string até o limite
        } else {
            this.name = name;
        }
        System.out.println(this.name);
    }

    public boolean withDraw(double value){
        // Decrementar o valor do balance
        if (balance < value){
            return false;
        }
        balance -= value;
        System.out.println("===> Valor a retirar: " + value + "\n===> Balanço agora é: " + balance);
        return true;
    }
}
