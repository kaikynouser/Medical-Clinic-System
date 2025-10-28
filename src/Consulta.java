import java.time.LocalDateTime;

public class Consulta {
    // INFO CONSULTAS
    private LocalDateTime data;
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

    public Consulta(LocalDateTime data, LocalDateTime horario, Doutor medico, Pacientes pacientes, typo tipoConsulta) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.pacientes = pacientes;
        this.tipoConsulta = tipoConsulta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
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

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", horario=" + horario +
                ", medico=" + medico +
                ", pacientes=" + pacientes +
                ", tipoConsulta=" + tipoConsulta +
                '}';
    }
}

