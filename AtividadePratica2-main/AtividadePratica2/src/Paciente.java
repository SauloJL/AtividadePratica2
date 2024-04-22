public class Paciente extends Pessoa {
    
    private String diagnostico;

    public Paciente(){
        
    }

    public Paciente(String id, String nome, String idade, String diagnostico) {
        super(id, nome, idade);
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDiagnostico: " + diagnostico;
    }

}
