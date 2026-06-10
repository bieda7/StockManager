# 💻 StockManager

[![Java Version](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/projects/jdk/21/)
[![Architecture](https://img.shields.io/badge/Architecture-Layered-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Multitier_architecture)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)

> Um gerenciador de estoque robusto e intuitivo, desenvolvido sob medida para lojas de informática. Tudo o que o seu negócio precisa, centralizado em um só lugar.

---

## 🎯 Sobre o Projeto

O **StockManager** nasceu com o propósito de consolidar e colocar em prática os conceitos fundamentais da linguagem **Java 21**. Trata-se de uma solução de back-end focada em resolver um problema real: a gestão centralizada de produtos (como hardwares, periféricos e computadores) para um almoxarifado ou loja de tecnologia.

Com ele, o responsável pelo estoque consegue ter controle total do fluxo de mercadorias através de operações essenciais do dia a dia.

### 🌟 Funcionalidades Principais (CRUD)
* **Cadastrar:** Adicione novos componentes de hardware com especificações detalhadas.
* **Listar:** Visualize todo o inventário atualizado em tempo real.
* **Atualizar:** Altere preços, quantidades ou detalhes de produtos cadastrados.
* **Excluir:** Remova itens do catálogo de forma segura.

---

## 🏗️ Arquitetura do Sistema

Para garantir a organização, manutenibilidade e evolução do código, o projeto foi estruturado utilizando a **Arquitetura em Camadas** (*Layered Architecture*). Essa abordagem separa rigidamente as responsabilidades do sistema:

```text
 ┌────────────────────────────────────────────────────────┐
 │                      Camada de UI                      │
 │        (Interface com o usuário / Console / API)       │
 └───────────────────────────┬────────────────────────────┘
                             ▼
 ┌────────────────────────────────────────────────────────┐
 │                    Camada de Negócio                   │
 │                (Regras de Negócio / Service)           │
 └───────────────────────────┬────────────────────────────┘
                             ▼
 ┌────────────────────────────────────────────────────────┐
 │                     Camada de Dados                    │
 │               (Persistência / Repositorio)             │
 └────────────────────────────────────────────────────────┘


