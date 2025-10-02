public class Consultas {
    private String data;
    private String horario;
    private String medico;
    private Paciente paciente;

    public Consultas(String data, String horario, String medico, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}

