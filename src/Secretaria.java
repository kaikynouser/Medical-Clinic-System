public class Secretaria {
    private String nome;
    private String cpf;
    private String matricula;
    private Contato contato;
    private PacienteRepository pacienteRepo;
    private ConsultaRepository consultaRepo;

    public Secretaria() {}

    public Secretaria(String nome, String cpf, String matricula, Contato contato, PacienteRepository pacienteRepo, ConsultaRepository consultaRepo) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.contato = contato;
        this.pacienteRepo = pacienteRepo;
        this.consultaRepo = consultaRepo;
    }

    public void cadastrarPaciente(Pacientes paciente) {
        pacienteRepo.adicionarPaciente(paciente);
    }

    public void atualizarPaciente(Pacientes paciente) {
        pacienteRepo.atualizarPaciente(paciente);
    }

    public void removerPaciente(String cpf) {
        pacienteRepo.removerPaciente(cpf);
    }

    public void cadastrarConsulta(Consulta consulta) {
        consultaRepo.adicionarConsulta(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        consultaRepo.removerConsulta(consulta);
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public PacienteRepository getPacienteRepo() {
        return pacienteRepo;
    }

    public void setPacienteRepo(PacienteRepository pacienteRepo) {
        this.pacienteRepo = pacienteRepo;
    }

    public ConsultaRepository getConsultaRepo() {
        return consultaRepo;
    }

    public void setConsultaRepo(ConsultaRepository consultaRepo) {
        this.consultaRepo = consultaRepo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", contato=" + contato +
                '}';
    }
}
