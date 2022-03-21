package EX2;

//Corrida
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
        D1.setNome("Antonio");
        D1.setIdade(25);
        D1.setDestreza(75);
        D2.setNome("Manuel");
        D2.setIdade(27);
        D2.setDestreza(65);
        C1.setCondutor(D1);
        C2.setCondutor(D2);
        C1.ligar();
        C2.ligar();
        C1.acelerar();
        C2.acelerar();
        C1.acelerar();
        C2.travar(10);
        C1.acelerar();
        C1.acelerar();
        C1.travar(5);
        C2.acelerar();
        System.out.println("Velocidade [Carro 1]: " + C1.getVelocidadeAtual());
        System.out.println("Velocidade [Carro 2]: " + C2.getVelocidadeAtual());
        C1.desligar();
        C2.desligar();
    }
}
