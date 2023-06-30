class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Ex04 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        pessoa1.exibirInformacoes();
    }
}