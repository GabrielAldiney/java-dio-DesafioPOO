public class Revista extends ItemBiblioteca {
    private int numEdicao;

    public Revista(String titulo, String autor, int anoPublicacao, int numEdicao) {
        super(titulo, autor, anoPublicacao);
        this.numEdicao = numEdicao;
    }

    // Implementação do método abstrato getTipo()
    @Override
    public String getTipo() {
        return "Revista";
    }

    // Getter específico para o número da edição
    public int getNumEdicao() {
        return numEdicao;
    }
}