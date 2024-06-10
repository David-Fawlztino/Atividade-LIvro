public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Hunger games","Suzanne Collins", 2008);
        Livro livro2 = new Livro("it", "Stephen King", 1986);

        livro1.exibirInformacoes();

        livro2.exibirInformacoes();

        livro1.emprestar();

        livro1.exibirInformacoes();

        livro2.emprestar();

        livro2.exibirInformacoes();
    }
}
