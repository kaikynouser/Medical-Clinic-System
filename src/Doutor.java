public class Doutor {
    private String nome;
    private String cpf;
    private String crm;
    private String especialidade;
    private Contato contato;

    public Doutor(){}

    public Doutor(String nome, String cpf, String crm, String especialidade, Contato contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.crm = crm;
        this.especialidade = especialidade;
        this.contato = contato;
    }

    public void visualizarInfoSaude(Pacientes pacientes) {
        System.out.println("Informações médicas de " + pacientes.getNome() + ":");
        System.out.println(pacientes.getInfoSaude().toString());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Doutor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", crm='" + crm + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", contato=" + contato +
                '}';
    }
}