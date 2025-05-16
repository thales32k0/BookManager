# 📚 BookManager API

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.5-green.svg)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-orange)

API REST simples para gerenciamento de livros usando Spring Boot.

---

## 📦 Funcionalidades

- 📖 Criar, listar, atualizar e deletar livros
- 🔎 Buscar livro por ID
- 🗃️ Banco de dados em memória (H2)

---

## 🚀 Como rodar o projeto

> Pré-requisitos:
- Java 17 instalado
- Maven (já vem no Spring Boot por padrão)
- IntelliJ Community ou outro IDE
- Git instalado

### 1. Clone o projeto

` ``bash
git clone https://github.com/seu-usuario/bookmanager.git
cd bookmanager

---

## 📬 Rotas da API

| Método | Endpoint       | Descrição                    |
|--------|----------------|------------------------------|
| GET    | `/books`       | Lista todos os livros        |
| POST   | `/books`       | Cria um novo livro           |
| GET    | `/books/{id}`  | Retorna livro por ID         |
| PUT    | `/books/{id}`  | Atualiza dados de um livro   |
| DELETE | `/books/{id}`  | Remove um livro              |

---

## 📮 Testando com Postman
Faça o download da collection Postman: bookmanager.postman_collection.json

Importe no Postman: [BookManager API.postman_collection.json](https://github.com/thales32k0/BookManager/blob/main/BookManager%20API.postman_collection.json)

- Abra o Postman

- Clique em "Import"

- Selecione o arquivo .json

Você poderá testar todos os endpoints de forma rápida!

---

## 🧪 Exemplo de requisição POST /books
json
Copiar
Editar
{
  "title": "Clean Code",
  
  "author": "Robert C. Martin",
  
  "publishedYear": 2008
}

---

## 🚀 Tecnologias utilizadas

- ☕ Java 17+
- 🌱 Spring Boot 3
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🛢️ H2 Database (em memória)
- ⚙️ Maven

---
## 📄 Licença
Este projeto está sob a licença [MIT](LICENSE).
  ## 👨‍💻 Autor

---

<table>
  <tr>
    <td><img src="https://avatars.githubusercontent.com/u/89024257?v=4" width="100"/></td>
    <td>
      <b>Thales Eduardo</b><br/>
      Aprendiz de tecnologia focado em Java ☕<br/>
      <a href="https://github.com/thales32k0">GitHub</a>
    </td>
  </tr>
</table>
