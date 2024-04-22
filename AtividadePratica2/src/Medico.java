public class Medico extends Pessoa {

    private String especialidade;

    public Medico() {

    }

    public Medico(String especialidade) {
        this.especialidade = especialidade;
    }

    public Medico(String id, String nome, String idade, String especialidade) {
        super(id, nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
