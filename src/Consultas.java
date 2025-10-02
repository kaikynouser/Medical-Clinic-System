public class Consultas {
    private String data;
    private String horario;
    private String medico;
    private Pacientes pacientes;

    public Consultas(String data, String horario, String medico, Pacientes paciente) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.pacientes = paciente;
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

    public Pacientes getPaciente() {
        return pacientes;
    }

    public void setPaciente(Pacientes paciente) {
        this.pacientes = paciente;
    }
}

