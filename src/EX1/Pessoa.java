package EX1;

class Pessoa {
    private String nome;
    private char genero;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String n, char g) {
        this.nome = n;
        this.genero = g;
    }

    public Pessoa(String n, char g, int i) {
        this(n, g); // usa o construtor anterior
        this.idade = i;
    }
}