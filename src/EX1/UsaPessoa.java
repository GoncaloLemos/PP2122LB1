package EX1;


import java.util.Scanner;

public class UsaPessoa {
    public UsaPessoa() {
    }

    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        P1.setNome("Camila");
        P1.setGenero('F');
        P1.setIdade(12);
        System.out.println("O objeto P1 chama-se " + P1.getNome() + ", é do sexo " + P1.getGenero() + ", tem " + P1.getIdade() + " anos e diz: ");
        P1.falar();
        Pessoa P2 = new Pessoa();
        Scanner S = new Scanner(System.in);
        System.out.println("Nome: ");
        P2.setNome(S.nextLine());
        P2.setIdade(S.nextInt());
        P2.setGenero(S.nextLine().charAt(0));
    }
}