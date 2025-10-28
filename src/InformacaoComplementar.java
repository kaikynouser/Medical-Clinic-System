public class InformacaoComplementar {
    private Boolean fuma;
    private Boolean bebe;
    private Boolean diabete;
    private Boolean doencaCardiaca;
    private String cirurgia;
    private String alergia;

    public InformacaoComplementar() {}

    public InformacaoComplementar(Boolean fuma, Boolean bebe, Boolean diabete, Boolean doencaCardiaca, String cirurgia, String alergia) {
        this.fuma = fuma;
        this.bebe = bebe;
        this.diabete = diabete;
        this.doencaCardiaca = doencaCardiaca;
        this.cirurgia = cirurgia;
        this.alergia = alergia;
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

    @Override
    public String toString() {
        return "InformacaoComplementar{" +
                "fuma=" + fuma +
                ", bebe=" + bebe +
                ", diabete=" + diabete +
                ", doencaCardiaca=" + doencaCardiaca +
                ", cirurgia='" + cirurgia + '\'' +
                ", alergia='" + alergia + '\'' +
                '}';
    }
}
