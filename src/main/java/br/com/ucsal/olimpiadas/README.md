# Refatoração com SOLID

## Objetivo
Refatorar o sistema legado de Olimpíadas aplicando princípios SOLID sem alterar o comportamento original.

## SRP (Single Responsibility Principle)
A lógica de cálculo de nota foi removida da classe App e movida para CorrecaoService, deixando cada classe com uma única responsabilidade.

## OCP (Open/Closed Principle)
Foi criada a interface CorrecaoService, permitindo adicionar novas regras de correção sem modificar o código existente.

## LSP (Liskov Substitution Principle)
As implementações de CorrecaoService podem ser substituídas sem impactar o funcionamento do sistema.

## ISP (Interface Segregation Principle)
A interface CorrecaoService é simples e possui apenas um método, evitando dependências desnecessárias.

## DIP (Dependency Inversion Principle)
A classe App passou a depender de uma abstração (CorrecaoService) ao invés de implementar diretamente a lógica de cálculo.