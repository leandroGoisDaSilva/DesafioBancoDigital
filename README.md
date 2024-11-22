Banco Digital
Este projeto é um sistema de gerenciamento bancário digital que simula operações básicas de contas correntes e poupança. Ele foi desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO) e boas práticas de design.

📝 Funcionalidades
O sistema permite realizar as seguintes operações:

Criar contas correntes e poupança.
Associar contas a clientes.
Depositar valores em contas.
Sacar valores com suporte a cheque especial (para contas correntes configuradas como especiais).
Transferir valores entre contas.
Imprimir extratos detalhados de contas.
Além disso, o projeto inclui validações como saldo insuficiente para saques e transferências, utilizando o mecanismo de exceções personalizadas.

🛠️ Tecnologias utilizadas
Java 17: Linguagem de programação principal.
IntelliJ IDEA: IDE usada no desenvolvimento.
POO (Programação Orientada a Objetos):
Classes abstratas
Interfaces
Exceções personalizadas
Polimorfismo
📁 Estrutura do Projeto
O projeto segue uma estrutura simples, organizada da seguinte maneira:

plaintext
Copiar código
BancoDigital/
│
├── src/
│   ├── Conta.java                      # Classe abstrata para contas
│   ├── ContaCorrente.java              # Classe para conta corrente
│   ├── ContaPoupanca.java              # Classe para conta poupança
│   ├── Cliente.java                    # Classe para clientes
│   ├── Banco.java                      # Classe que gerencia o banco e os clientes
│   ├── IConta.java                     # Interface para operações bancárias
│   ├── SaldoInsuficienteException.java # Exceção personalizada para saldo insuficiente
│   ├── TesteBanco.java                 # Classe principal para testar as funcionalidades
│
└── README.md                           # Documentação do projeto
🚀 Como executar o projeto
Pré-requisitos:

🧪 Testes disponíveis
Testes implementados na classe TesteBanco:
Criar clientes e contas:
Simula a criação de dois clientes com contas corrente e poupança.

Depósito, saque e transferência:

Realiza operações básicas, incluindo:
Saques com e sem cheque especial.
Transferências entre contas.
Testa cenários de falha, como saldo insuficiente.
Listagem de clientes e extratos:
Exibe informações detalhadas das contas de cada cliente, incluindo o saldo atualizado.

🔧 Melhoria sugerida
Implementar persistência de dados (por exemplo, usando arquivos ou um banco de dados relacional).
Adicionar suporte a múltiplos tipos de conta.
Criar uma interface gráfica (GUI) ou API REST para interagir com o sistema.
Criar testes unitários utilizando JUnit.
📜 Licença
Este projeto é livre para uso e distribuição.

👨‍💻 Autor
Leandro Góis
Desenvolvedor iniciante em Java com foco em POO e construção de sistemas robustos e organizados.
