# Sistema de Gerenciamento de Clientes em Java

## Introdução
Este projeto é uma aplicação Java que implementa operações de CRUD (Create, Read, Update, Delete) para gerenciamento de clientes, utilizando uma coleção `ArrayList`. Ele permite ao usuário inserir, visualizar, atualizar, remover e buscar clientes, gerenciando dados como ID, nome, e-mail e telefone. O código fonte do sistema está disponível publicamente no repositório do projeto no GitHub, acessível pelo link:

[Repositório do Projeto](https://github.com/jpiologo/MapaProgramacaoDeSistemasII)

## Estrutura do Sistema
A aplicação foi desenvolvida utilizando uma arquitetura modular dentro da IDE IntelliJ, com as seguintes classes:

- **Cliente.java**: Define os atributos e métodos para o cadastro de clientes.
- **ServicosCliente.java**: Implementa a lógica das operações CRUD.
- **Main.java**: Gerencia a interface do usuário, apresenta o menu e chama os métodos da classe `ServicosCliente`.

## Funcionalidades
#### 3.1. Cadastrar Cliente
Permite ao usuário adicionar um novo cliente ao sistema. O ID do cliente é gerado automaticamente para evitar duplicações.

**Passo a Passo**:
- O usuário seleciona a opção de cadastro no menu.
- O sistema solicita os dados do cliente.
- O cliente é cadastrado e o sistema exibe o ID atribuído.

### 3.2. Listar Clientes
Permite ao usuário visualizar todos os clientes cadastrados. O código dessa funcionalidade está implementado no método `listarClientes` da classe `ServicosCliente`.

**Passo a Passo**:
- O usuário escolhe a opção de listagem.
- O sistema exibe as informações dos clientes cadastrados com tratativa de erro.

### 3.3. Atualizar Cliente
Permite que o usuário atualize informações de um cliente específico. O sistema usa o ID para identificar o cliente, chamando o método `buscarClientePorId` para verificar sua existência. Caso exista, possibilita a edição dos dados.

### 3.4. Remover Cliente
Permite ao usuário remover um cliente específico, utilizando o ID como parâmetro. O código dessa funcionalidade está implementado na função `removerCliente`.

### 3.5. Buscar Cliente por ID
Permite ao usuário buscar e visualizar as informações de um cliente específico, utilizando o ID como parâmetro. O método `buscarClientePorId` implementa essa funcionalidade.

## Implementação Técnica
O sistema utiliza coleções Java para armazenar dados, com destaque para o uso de `ArrayList`. As operações CRUD são implementadas na classe `ServicosCliente`.

## Repositório no GitHub
O código fonte completo do projeto está disponível no GitHub no link abaixo:

[Repositório do Projeto](https://github.com/jpiologo/MapaProgramacaoDeSistemasII)

No repositório, você encontrará:
- Código fonte completo: arquivos `.java` de todas as classes.
- Histórico de commits.

## Conclusão
A aplicação atende aos objetivos de gerenciar clientes através de um sistema CRUD básico, com implementação modular e menu interativo. O código foi estruturado para fácil entendimento e manutenção, e o repositório no GitHub permite revisões, aprimoramentos e versionamento colaborativo.

Este projeto demonstra a aplicação de conceitos de manipulação de dados em coleções e operações CRUD em Java, fornecendo uma base sólida para futuras expansões.
