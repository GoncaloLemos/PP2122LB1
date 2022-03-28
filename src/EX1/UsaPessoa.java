package EX1;

import java.util.Scanner;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 *         Gonçalo Lemos (30007523@students.ual.pt).
 */
public class UsaPessoa {
    public UsaPessoa() {
    }

    public static void main(String[] args) {
        final Scanner S = new Scanner(System.in);
        try {
            Pessoa P = new Pessoa();
            System.out.println("Nome: ");
            P.setNome(S.next());
            System.out.println("Idade: ");
            P.setIdade(S.nextInt());
            System.out.println("Género: ");
            var G = S.next();
            P.setGenero(G.charAt(0));
            System.out.println("Nome: " + P.getNome() + "; Género: " + P.getGenero() + "; Idade: " + P.getIdade() + ".");
            S.close();
        } catch (final Exception ignored) {
            System.out.println("Instrução inválida.");
            System.exit(0);
        }
    }
}