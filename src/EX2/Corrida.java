package EX2;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 *         Gonçalo Lemos (30007523@students.ual.pt).
 */
public class Corrida {
    //Construtores
    public Corrida() {
    }

    //Métodos
    public static void main(String[] args) {
        Carro C1 = new Carro();
        Carro C2 = new Carro();
        C1.setMatricula("11 - AA - 11");
        C2.setMatricula("22 - BB - 22");
        Condutor D1 = new Condutor();
        Condutor D2 = new Condutor();
        D1.setNome("António");
        D1.setIdade(25);
        D1.setDestreza(5);
        D2.setNome("Manuel");
        D2.setIdade(10);
        D2.setDestreza(95);
        C1.setCondutor(D1);
        C2.setCondutor(D2);
        if (!C1.IsOn() & !C2.IsOn()) {
            C1.ligar();
            C2.ligar();
        }
        C2.acelerar();
        C1.acelerar();
        C2.travar(10);
        C1.acelerar();
        C1.acelerar();
        C1.travar(5);
        C2.acelerar();
        System.out.println("Velocidade [Carro 1]: " + C1.getVelocidadeAtual());
        System.out.println("Velocidade [Carro 2]: " + C2.getVelocidadeAtual());
        if (C1.IsOn() & C2.IsOn()) {
            C1.desligar();
            C2.desligar();
        }
    }
}