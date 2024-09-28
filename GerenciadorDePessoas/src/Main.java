public class Main {
    public static void main(String[] args) {
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        gerenciador.cadastrarPessoa1("Felipe Luccia de Lima", "123.456.789-00", 29);
        gerenciador.cadastrarPessoa2("Louhany Rodrigues de Luccia", "123.456.789-01", 30);

        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        System.out.println("Dados atualizados:");

        gerenciador.atualizarPessoa1("Oliver Rodrigues de Luccia", "123.456.789-02", 3);
        gerenciador.atualizarPessoa2(null, null, 0);

        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();


    }


}

