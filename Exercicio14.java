public class CadastroDeLivro {

    public static void main(String[] args) {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numPaginas = 96;
        double preco = 39.90;
        char categoria = 'F';

        // Validação simples da categoria
        String nomeCategoria;
        switch (categoria) {
            case 'F': nomeCategoria = "Ficção"; break;
            case 'N': nomeCategoria = "Não-ficção"; break;
            case 'T': nomeCategoria = "Tecnologia"; break;
            case 'H': nomeCategoria = "História"; break;
            default: nomeCategoria = "Categoria desconhecida"; break;
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + numPaginas + " pág");
        System.out.println("Categoria selecionada: " + nomeCategoria);
        System.out.println("Preço: R$ " + preco);
    }
}
