# Exercício Herança e Polimorfismo

Este projeto é a solução do exercício proposto pelo professor **Nélio Alves** do curso **Java COMPLETO Programação Orientada a Objetos + Projetos** na Udemy.

## 📚 Referência do Exercício

O exercício original pode ser encontrado no repositório do professor:
**https://github.com/acenelio/inheritance5-java**

**Link do curso na Udemy:**
https://www.udemy.com/course/java-curso-completo/

## 🎯 Objetivo do Exercício

Implementar um sistema de produtos utilizando os conceitos de **herança** e **polimorfismo** em Java, com três tipos diferentes de produtos:

- **Produto comum** (`Product`)
- **Produto usado** (`UsedProduct`)
- **Produto importado** (`ImportedProduct`)

## 🏗️ Estrutura do Projeto

```
src/
├── application/
│   └── Program.java           # Classe principal com menu interativo
└── entities/
    ├── Product.java           # Classe base para produtos
    ├── UsedProduct.java       # Produto usado (herda de Product)
    └── ImportedProduct.java   # Produto importado (herda de Product)
```

## 🔧 Funcionalidades

- **Produto comum**: Exibe nome e preço
- **Produto usado**: Inclui data de fabricação na etiqueta
- **Produto importado**: Adiciona taxa alfandegária e calcula preço total

## 💡 Conceitos Aplicados

- **Herança**: Classes `UsedProduct` e `ImportedProduct` herdam de `Product`
- **Polimorfismo**: Método `priceTag()` é sobrescrito nas classes filhas
- **Encapsulamento**: Uso de getters e setters para acessar atributos privados
- **Coleções**: Uso de `ArrayList` para armazenar produtos

## 🚀 Como Executar

1. Clone o repositório
2. Abra o projeto em sua IDE Java favorita
3. Execute a classe `Program.java`
4. Siga as instruções no console para cadastrar produtos

## 👨‍🏫 Créditos

Exercício desenvolvido como parte do curso **Java COMPLETO Programação Orientada a Objetos + Projetos** do professor **Nélio Alves** na plataforma Udemy.