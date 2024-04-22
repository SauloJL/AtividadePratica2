public class Pessoa {
    
    private String id;
    private String nome;
    private String idade;
    
    public Pessoa() {

    }

    public Pessoa(String id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "\nId: " + id + 
        "\nNome: " + nome + 
        "\nIdade: " + idade;
    }


}
