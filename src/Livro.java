public class Livro extends ItemBiblioteca {
    private int numPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numPaginas = numPaginas;
    }

    // Implementação do método abstrato getTipo()
    @Override
    public String getTipo() {
        return "Livro";
    }

    // Getter específico para o número de páginas
    public int getNumPaginas() {
        return numPaginas;
    }
}
