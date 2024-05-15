public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando alguns itens à biblioteca
        Livro livro1 = new Livro("titulo 1", "autor 1", 1899, 256);
        Livro livro2 = new Livro("titulo 2", "autor 2", 1954, 1178);
        Revista revista1 = new Revista("titulo 3", "autor 3", 2021, 12);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(revista1);

        // Listando os itens da biblioteca
        biblioteca.listarItens();

        // Emprestando um item
        biblioteca.emprestarItem(livro1);

        // Tentando emprestar o mesmo item novamente
        biblioteca.emprestarItem(livro1);
    }
}
