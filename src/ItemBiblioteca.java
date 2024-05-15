abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // Por padrão, o item está disponível
    }

    // Métodos getters e setters para os atributos encapsulados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método abstrato para ser implementado nas subclasses
    public abstract String getTipo();
}