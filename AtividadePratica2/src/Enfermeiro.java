public class Enfermeiro extends Pessoa {

    private String setor;

    public Enfermeiro() {

    }

    public Enfermeiro(String setor) {
        this.setor = setor;
    }

    public Enfermeiro(String id, String nome, String idade, String setor) {
        super(id, nome, idade);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}