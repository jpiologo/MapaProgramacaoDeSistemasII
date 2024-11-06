import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicosCliente {
    Scanner scanner = new Scanner(System.in);
    private List<Cliente> clientes = new ArrayList<>();
    private int nextId = 1; // ID único para cada cliente

    public void adicionarCliente(String nome, String email, String telefone) {
        Cliente cliente = new Cliente(nome, email, telefone);
        cliente.setId(nextId++); // Configurando o ID do cliente internamente
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso. ID: " + cliente.getId());
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }

    public void atualizarCliente(int id, String nome, String email, String telefone) {
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
            System.out.println("Cliente atualizado com sucesso.");
            pausar(scanner);
        }
    }

    public void removerCliente(int id) {
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente removido com sucesso.");
            pausar(scanner);
        }
    }

    // Função para pausar e esperar a entrada do usuário
    private static void pausar(Scanner scanner) {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
