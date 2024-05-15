import java.util.ArrayList;

class Biblioteca {
    private ArrayList<ItemBiblioteca> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    // Método para emprestar um item da biblioteca
    public void emprestarItem(ItemBiblioteca item) {
        if (item.isDisponivel()) {
            item.setDisponivel(false);
            System.out.println("Item " + item.getTipo() + " \"" + item.getTitulo() + "\" emprestado com sucesso.");
        } else {
            System.out.println("Item " + item.getTipo() + " \"" + item.getTitulo() + "\" não está disponível para empréstimo.");
        }
    }

    // Método para listar todos os itens da biblioteca
    public void listarItens() {
        System.out.println("Itens na biblioteca:");
        for (ItemBiblioteca item : itens) {
            System.out.println("- " + item.getTipo() + ": " + item.getTitulo() + " (Autor: " + item.getAutor() + ")");
        }
    }
}