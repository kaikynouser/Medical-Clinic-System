import java.time.LocalDateTime;

public class Consultas {
    // INFO CONSULTAS
    private String data;
    private LocalDateTime horario;
    private Doutor medico;
    private Pacientes pacientes;


    public enum typo { NORMAL, RETORNO;}
    private typo tipoConsulta;

    // metodo para calcular o tipo de consulta, se é consulta normal retorna horario 1h
    // se não retorna horario 30m
    public LocalDateTime calcularTipo (){
        if (tipoConsulta == typo.NORMAL) return horario.plusHours(1);
        else return horario.plusMinutes(30);
    }

    public Consultas(String data, LocalDateTime horario, Doutor medico, Pacientes pacientes, typo tipoConsulta) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.pacientes = pacientes;
        this.tipoConsulta = tipoConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Pacientes getPaciente() {
        return pacientes;
    }

    public void setPaciente(Pacientes paciente) {
        this.pacientes = paciente;
    }

    public Doutor getMedico() {
        return medico;
    }

    public void setMedico(Doutor medico) {
        this.medico = medico;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public typo getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(typo tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}

