# 🛍️ API Rest Produtos

## 📌 Sobre o Projeto
A **ApiRestProdutos** é uma API RESTful desenvolvida para gerenciar um catálogo de produtos, permitindo operações de CRUD (Create, Read, Update e Delete). Essa API pode ser integrada a sistemas de e-commerce, marketplaces e outras aplicações que necessitem do gerenciamento de produtos.

## 🚀 Tecnologias Utilizadas
- **Java** com **Spring Boot**
- **Maven** para gerenciamento de dependências
- **Banco de Dados** (MySQL, PostgreSQL ou outro configurável)
- **Spring Data JPA** para persistência de dados
- **Swagger** para documentação da API
- **Postman** para testes de requisições

## 📌 Funcionalidades
- 🔹 **Criar um novo produto**
- 🔹 **Listar todos os produtos**
- 🔹 **Buscar um produto por ID**
- 🔹 **Atualizar informações de um produto**
- 🔹 **Deletar um produto**

## 📦 Como Executar o Projeto
### 🔹 Pré-requisitos
Antes de iniciar, certifique-se de ter instalado:
- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL/PostgreSQL](https://www.mysql.com/downloads/ ou https://www.postgresql.org/download/)

### 🔹 Clonar o repositório
```bash
git clone https://github.com/GU1LHERMESILV4/ApiRestProdutos.git
cd ApiRestProdutos
```

### 🔹 Configurar o Banco de Dados
Edite o arquivo **`application.properties`** ou **`application.yml`** para configurar as credenciais do banco de dados:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 🔹 Executar a aplicação
```bash
mvn spring-boot:run
```
A API estará disponível em: `http://localhost:8080`

### 🔹 Testar no Swagger
Após iniciar a aplicação, acesse a documentação interativa do Swagger em:
```bash
http://localhost:8080/swagger-ui.html
```

## 🔗 Endpoints Principais
| Método | Endpoint | Descrição |
|--------|---------|------------|
| `POST` | `/produtos` | Criar um novo produto |
| `GET` | `/produtos` | Listar todos os produtos |
| `GET` | `/produtos/{id}` | Buscar produto por ID |
| `PUT` | `/produtos/{id}` | Atualizar produto |
| `DELETE` | `/produtos/{id}` | Deletar produto |

## 📄 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e contribuir!

---
👨‍💻 Desenvolvido por [Guilherme Antônio Silva](https://github.com/GU1LHERMESILV4) 🚀
