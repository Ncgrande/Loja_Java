public class Cliente {
    // Atributos privados
    private String nome;
    private String email;
    private int idade;

    // Construtor com validações
    public Cliente(String nome, String email, int idade) {
        setNome(nome);
        setEmail(email);
        setIdade(idade);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    // Setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }
}
