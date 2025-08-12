public class Game {
    // Atributos privados (encapsulados)
    private String nome;
    private double preco;
    private String categoria;
    private int classificacaoEtaria;

    // Construtor com parâmetros
    public Game(String nome, double preco, String categoria, int classificacaoEtaria) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setCategoria(categoria);
        this.setClassificacaoEtaria(classificacaoEtaria);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    // Setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void setClassificacaoEtaria(int idade) {
        if (idade >= 0 && idade <= 18) {
            this.classificacaoEtaria = idade;
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criar objetos Game
        Game jogo = new Game("Minecraft", 90.00, "Rpg", 5);
        Game jogo2 = new Game("WOW", 200.00, "Morpg", 12);

        // Testar nome e categoria
        System.out.println("Nome do jogo: " + jogo.getNome());
        System.out.println("Categoria: " + jogo.getCategoria());
        System.out.println("Preço do jogo: R$" + jogo.getPreco());
        System.out.println("Classificação etária: " + jogo.getClassificacaoEtaria());

        System.out.println("Nome do jogo: " + jogo2.getNome());
        System.out.println("Categoria: " + jogo2.getCategoria());
        System.out.println("Preço do jogo: R$" + jogo2.getPreco());
        System.out.println("Classificação etária: " + jogo2.getClassificacaoEtaria());

        // Testar classificação etária inválida
        jogo.setClassificacaoEtaria(25); // Não deve alterar
        System.out.println("Tentativa de classificação inválida: " + jogo.getClassificacaoEtaria());
    }
}
