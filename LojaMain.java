public class LojaMain {
    public static void main(String[] args) {
        // Criar clientes
        Cliente cliente1 = new Cliente("João Silva", "joao@email.com", 25);
        Cliente cliente2 = new Cliente("Maria Oliveira", "maria@email.com", 17);

        // Criar jogos
        Game jogo1 = new Game("Minecraft", 90.00, "RPG", 5);
        Game jogo2 = new Game("World of Warcraft", 200.00, "MMORPG", 12);

        // Exibir informações do cliente 1
        System.out.println("=== Cliente 1 ===");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Idade: " + cliente1.getIdade());

        // Exibir informações do jogo 1
        System.out.println("\n--- Jogo adquirido ---");
        System.out.println("Nome do jogo: " + jogo1.getNome());
        System.out.println("Categoria: " + jogo1.getCategoria());
        System.out.println("Preço: R$" + jogo1.getPreco());
        System.out.println("Classificação etária: " + jogo1.getClassificacaoEtaria());

        // Verificar se cliente 1 pode comprar o jogo
        if (cliente1.getIdade() >= jogo1.getClassificacaoEtaria()) {
            System.out.println("Status: COMPRA PERMITIDA ✅");
        } else {
            System.out.println("Status: COMPRA NEGADA ❌ (idade insuficiente)");
        }

        // Repetir para cliente 2 e jogo 2
        System.out.println("\n=== Cliente 2 ===");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Email: " + cliente2.getEmail());
        System.out.println("Idade: " + cliente2.getIdade());

        System.out.println("\n--- Jogo adquirido ---");
        System.out.println("Nome do jogo: " + jogo2.getNome());
        System.out.println("Categoria: " + jogo2.getCategoria());
        System.out.println("Preço: R$" + jogo2.getPreco());
        System.out.println("Classificação etária: " + jogo2.getClassificacaoEtaria());

        if (cliente2.getIdade() >= jogo2.getClassificacaoEtaria()) {
            System.out.println("Status: COMPRA PERMITIDA ✅");
        } else {
            System.out.println("Status: COMPRA NEGADA ❌ (idade insuficiente)");
        }
    }
}
