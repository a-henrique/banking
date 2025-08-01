package co.audrinsilva;

public class Account {
    private String agencia;
    private String conta;
    private String name;

    public Account(String agencia, String conta, String name){
        this.agencia = agencia;
        this.conta = conta;
        this.name = name;
        // Na hora de criar o objeto precisamos passar
        // valores para estas variaveis.
    }
}
