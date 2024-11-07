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
#### 1. Cadastrar Cliente
Permite ao usuário adicionar um novo cliente ao sistema. O ID do cliente é gerado automaticamente para evitar duplicações.

**Passo a Passo**:
- O usuário seleciona a opção de cadastro no menu.
- O sistema solicita os dados do cliente.
- O cliente é cadastrado e o sistema exibe o ID atribuído.

![image](https://github.com/user-attachments/assets/b92d1065-1064-445a-8e15-a75a7ef58b97)


#### 2. Listar Clientes
Permite ao usuário visualizar todos os clientes cadastrados. O código dessa funcionalidade está implementado no método `listarClientes` da classe `ServicosCliente`.

**Passo a Passo**:
- O usuário escolhe a opção de listagem.
- O sistema exibe as informações dos clientes cadastrados com tratativa de erro.

![image](https://github.com/user-attachments/assets/ae9afbc0-a08e-4e89-843e-97689b480b7f)

![image](https://github.com/user-attachments/assets/87299ce3-14ca-43d5-8f31-bc74af2aae36)

#### 3. Atualizar Cliente
Permite que o usuário atualize informações de um cliente específico. O sistema usa o ID para identificar o cliente, chamando o método `buscarClientePorId` para verificar sua existência. Caso exista, possibilita a edição dos dados.

![image](https://github.com/user-attachments/assets/aa3af0cf-272c-477c-8a2e-7006310b5b80)

#### 4. Remover Cliente
Permite ao usuário remover um cliente específico, utilizando o ID como parâmetro. O código dessa funcionalidade está implementado na função `removerCliente`.

![image](https://github.com/user-attachments/assets/daac6f2b-7c90-4360-8359-b130e8265b5f)

#### 5. Buscar Cliente por ID
Permite ao usuário buscar e visualizar as informações de um cliente específico, utilizando o ID como parâmetro. O método `buscarClientePorId` implementa essa funcionalidade.

![image](https://github.com/user-attachments/assets/a5f406dd-c51a-4faa-b3d2-4df640c72484)

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
