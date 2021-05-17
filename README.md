# Project Crud Client

Esse projeto Spring Boot 2.4.5 contem um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas:

- Busca paginada de recursos

- Busca de recurso por id  

- Inserir novo recurso

- Atualizar recurso

- Deletar recurso


O projeto foi configurado acessando o banco de dados H2, foi usado Maven como gerenciador de dependência, e Java 11 como linguagem.

O cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir 


## Modelo conceitual
![Modelo Conceitual](https://github.com/igor-lourenco/crud-client/blob/main/backend/img/Screenshot_10.png)

## Padrão camadas
![Modelo Conceitual](https://github.com/igor-lourenco/projeto-spring-react-vendas/blob/main/frontend/src/assets/img/padrao_camadas.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven


# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/igor-lourenco/crud-client

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Igor Lourenço Dos Santos

https://www.linkedin.com/in/igor-lourenco-santos
