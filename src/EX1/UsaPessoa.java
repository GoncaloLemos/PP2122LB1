package EX1;

import java.util.Scanner;

public class UsaPessoa {
    public UsaPessoa() {
    }

    public static void main(String[] args) {
        //Declara objeto pessoa1
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Camila");
        pessoa1.setGenero('F');
        pessoa1.setIdade(12);
        System.out.println("O objeto pessoa1 chama-se " + pessoa1.getNome() + ", é do sexo " + pessoa1.getGenero() + ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();
        Pessoa P2 = new Pessoa();
        Scanner S = new Scanner(System.in);
        System.out.println("Nome: ");
        Scanner.NextLine()
    }
}