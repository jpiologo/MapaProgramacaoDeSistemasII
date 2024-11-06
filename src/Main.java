import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicosCliente clienteService = new ServicosCliente();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Atualizar Cliente");
            System.out.println("4. Remover Cliente");
            System.out.println("5. Buscar Cliente por ID");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    clienteService.adicionarCliente(nome, email, telefone);
                    pausar(scanner);
                    break;
                case 2:
                    clienteService.listarClientes();
                    pausar(scanner);
                    break;
                case 3:
                    System.out.print("ID do Cliente a atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Novo Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Novo Email: ");
                    email = scanner.nextLine();
                    System.out.print("Novo Telefone: ");
                    telefone = scanner.nextLine();
                    clienteService.atualizarCliente(idAtualizar, nome, email, telefone);
                    pausar(scanner);
                    break;
                case 4:
                    System.out.print("ID do Cliente a remover: ");
                    int idRemover = scanner.nextInt();
                    clienteService.removerCliente(idRemover);
                    pausar(scanner);
                    break;
                case 5:
                    System.out.print("ID do Cliente a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Cliente clienteEncontrado = clienteService.buscarClientePorId(idBuscar);
                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado: " + clienteEncontrado);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    pausar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    pausar(scanner);
            }
        }
    }

    // Função para pausar e esperar a entrada do usuário
    private static void pausar(Scanner scanner) {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
