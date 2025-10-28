public class Pacientes {

    //INFO PACIENTES
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;
    private Contato contato;
    private String convenio;
    private InformacaoComplementar infoSaude;

    public void adicionarPaciente(Pacientes paciente) {
    }

    //TIPOS CONVENIO
    public enum tiposConvenios { PARTICULARES, PLANO_DE_SAUDE; }

    public Pacientes(String nome, String dataNascimento, Endereco endereco, Contato contato, String convenio, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cpf = cpf;
        this.convenio = convenio;
        this.contato = contato;
        this.infoSaude = new InformacaoComplementar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public InformacaoComplementar getInfoSaude() {
        return infoSaude;
    }

    public void setInfoSaude(InformacaoComplementar infoSaude) {
        this.infoSaude = infoSaude;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", convenio='" + convenio + '\'' +
                '}';
    }
}


