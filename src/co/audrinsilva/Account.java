package co.audrinsilva;

public class Account {

    private String agencia;

    private String conta;

    private String name;

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
}
