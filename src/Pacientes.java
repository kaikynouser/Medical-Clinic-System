public class Pacientes {

    //INFO PACIENTES
    private String nome;
    private String dataNascimento;
    private String endereco;
    private int numeroCelular;
    private String convenio;

    //TIPOS CONVENIO
    public enum tiposConvenios { PARTICULARES, PLANO_DE_SAUDE; }

    public Pacientes(String nome, String dataNascimento, String endereco, int numeroCelular, String convenio) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.numeroCelular = numeroCelular;
        this.convenio = convenio;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numeroCelular=" + numeroCelular +
                ", convenio='" + convenio + '\'' +
                '}';
    }
}


