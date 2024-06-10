public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void emprestar(){
        if(!emprestado){
            this.emprestado = true;
            System.out.println("O livro\"" + titulo + "\" foi emprestado.");
        }else{
            System.out.println("O livro\"" + titulo + "\" ja esta emprestado.");
        }
    }

    public void devolver(){
        if(!emprestado){
            this.emprestado = false;
            System.out.println("O livro\"" + titulo + "\" foi devolvido.");
        }else{
            System.out.println("O livro\"" + titulo + "\" ja foi devolvido.");
        }
    }

    public void exibirInformacoes(){
        String status = emprestado ? "emprestado\n" : "disponivel\n";
        System.out.println("Info Livro\n");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicacao: " + anoPublicacao);
        System.out.println("Disponibilidade: \n" + status);
    }
    
}