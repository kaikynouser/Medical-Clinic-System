public class Paciente {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private int numeroCelular;
    private String convenio;
    private Boolean fuma;
    private Boolean bebe;
    private Boolean diabete;
    private Boolean doencaCardiaca;
    private String cirurgia;
    private String alergia;

    public Paciente(String nome, String dataNascimento, String endereco, int numeroCelular,
                    String convenio, Boolean fuma, Boolean bebe, Boolean diabete, Boolean doencaCardiaca, String cirurgia, String alergia) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.numeroCelular = numeroCelular;
        this.convenio = convenio;
        this.fuma = fuma;
        this.bebe = bebe;
        this.diabete = diabete;
        this.doencaCardiaca = doencaCardiaca;
        this.cirurgia = cirurgia;
        this.alergia = alergia;
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

    public Boolean getFuma() {
        return fuma;
    }

    public void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    public Boolean getBebe() {
        return bebe;
    }

    public void setBebe(Boolean bebe) {
        this.bebe = bebe;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public void setDiabete(Boolean diabete) {
        this.diabete = diabete;
    }

    public Boolean getDoencaCardiaca() {
        return doencaCardiaca;
    }

    public void setDoencaCardiaca(Boolean doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }
}


