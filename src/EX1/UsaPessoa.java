package exercicio1;

public class UsaPessoa {
    // construtor default para objetos da classe
    // UsaPessoa este construtor existe mesmo se não
    // for explicitamente declarado
    public UsaPessoa() {
    }

    public static void main(String[] args) {
        //Declara objeto pessoa1
        Pessoa pessoa1;
 /*Cria o objeto pessoa1 que é instância da classe 
 Pessoa */
        pessoa1 = new Pessoa();
        //Define os valores para os atributos de pessoa1
        pessoa1.setNome("Camila");
        pessoa1.setGenero('F');
        pessoa1.setIdade(12);
        System.out.println(
                "O objeto pessoa1 chama-se " + pessoa1.getNome() +
                        ", é do sexo " + pessoa1.getGenero() +
                        ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();
    }
}
