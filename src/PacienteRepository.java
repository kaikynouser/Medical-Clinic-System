import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    private List<Pacientes> pacientes;

    public PacienteRepository() {
        this.pacientes = new ArrayList<>();
    }

    // Adiciona um paciente
    public void adicionarPaciente(Pacientes paciente) {
        pacientes.add(paciente);
    }

    // Atualiza um paciente pelo CPF
    public void atualizarPaciente(Pacientes paciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(paciente.getCpf())) {
                pacientes.set(i, paciente);
                return;
            }
        }
        System.out.println("Paciente não encontrado!");
    }

    // Remove um paciente pelo CPF
    public void removerPaciente(String cpf) {
        pacientes.removeIf(p -> p.getCpf().equals(cpf));
    }

    // Retorna todos os pacientes
    public List<Pacientes> listarPacientes() {
        return pacientes;
    }

    // Buscar paciente pelo CPF
    public Pacientes buscarPorCpf(String cpf) {
        for (Pacientes p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }
}
