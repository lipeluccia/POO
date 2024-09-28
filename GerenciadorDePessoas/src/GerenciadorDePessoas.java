public class GerenciadorDePessoas {
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    // Métodos para cadastrar as pessoas.
    public void cadastrarPessoa1(String nome, String cpf, int idade) {
        pessoa1 = new Pessoa(nome, cpf, idade);
    }
    public void cadastrarPessoa2(String nome, String cpf, int idade) {
        pessoa2 = new Pessoa(nome, cpf, idade);
    }

    // Métodos de atualização das pessoas
    public void atualizarPessoa1(String nome, String cpf, int idade){
        pessoa1.setNome(nome);
        pessoa1.setCpf(cpf);
        pessoa1.setIdade(idade);
    }

    public void atualizarPessoa2(String nome, String cpf, int idade){
        pessoa2.setNome(nome);
        pessoa2.setCpf(cpf);
        pessoa2.setIdade(idade);
    }

    // Métodos de impressão
    public void exibirPessoa1(){
        if (pessoa1.getNome() == null) { // Verifica se os dados existem.
            System.out.println("Pessoa 1 sem cadastro ativo!");
        } else {
            System.out.println("Dados da pessoa 1");
            System.out.println("Nome: " + pessoa1.getNome());
            System.out.println("CPF: " + pessoa1.getCpf());
            System.out.println("Idade: " + pessoa1.getIdade() + " anos");
            System.out.println();
            }
        }
    public void exibirPessoa2(){
        if (pessoa2.getNome() == null){ // Verifica se os dados existem.
            System.out.println("Pessoa 2 sem cadastro ativo!");
        } else {
            System.out.println("Dados da pessoa 2");
            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("CPF: " + pessoa2.getCpf());
            System.out.println("Idade: " + pessoa2.getIdade() + " anos");
            System.out.println();
        }
    }
}