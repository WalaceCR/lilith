# Lilith
Este projeto é uma api REST para gerenciar metas financeiras.
<br />
1 - Plug em api de filmes;<br />
2 - Plug em api de games;<br />
2 - Plug em api terceira de magic.<br />

## Pré-requisitos [EM ATUALIZAÇÃO] <br />
Java 21;<br />
Maven 3.9.9;<br />
Banco de dados no Mysql.<br />

# Documentação da API de Metas

## Endpoints

### 1. Listar Metas por ID
**Descrição:** Retorna uma meta específica pelo ID.
- **URL:** `/api/metas/{idMeta}`
- **Método:** GET
- **Parâmetros de URL:**
    - `idMeta` (number): ID da meta.

**Resposta de Sucesso:**
- **Código:** 200 OK
- **Retorno:**
  ```json
  {
      "idMeta": "number",
      "nome": "string",
      "descrição": "string",
      "valor": "number"
  }
  ```

**Resposta de Erro:**
- **Código:** 404 Not Found

---

### 2. Deletar Meta por ID
**Descrição:** Deleta uma meta específica pelo ID.
- **URL:** `/api/metas/{idMeta}/deletar`
- **Método:** DELETE
- **Parâmetros de URL:**
    - `idMeta` (number): ID da meta.

**Resposta de Sucesso:**
- **Código:** 204 No Content

---

### 3. Alterar Meta
**Descrição:** Atualiza uma meta específica pelo ID.
- **URL:** `/api/metas/{idMeta}/alterar`
- **Método:** PATCH
- **Parâmetros de URL:**
    - `idMeta` (number): ID da meta.
- **Payload da Requisição:**
  ```json
  {
      "nome": "string",
      "descrição": "string",
      "valor": "number"
  }
  ```

**Resposta de Sucesso:**
- **Código:** 200 OK

---

### 4. Deletar Todas as Metas
**Descrição:** Deleta todas as metas.
- **URL:** `/api/metas/deletar`
- **Método:** DELETE
- **Resposta de Sucesso:**
    - **Código:** 204 No Content

### 5. Consultar o H2 (Banco de dados)
**Descrição:** Validar o H2 (Banco em memória).
- **URL:** `/metas/h2-console`
- **Método:** GET
- **Resposta de Sucesso:**
    - **Código:** Tela do H2 Console
    - **Observação:** Acesse o H2 pelo navegador e use as credenciais padrão:
        - URL: `jdbc:h2:mem:testdb`
        - Usuário: `sa`
        - Senha: (deixe em branco)

### 6. Importar CSV
**Descrição:** Importa um arquivo CSV para o banco de dados.
- **URL:** `/api/metas/importar`
- **Método:** POST
- **Payload da Requisição:**
  ```json
  {
      "file": "file.csv"
  }
  ```

### 7. Exportar CSV
**Descrição:** Exporta os dados do banco de dados para um arquivo CSV.
- **URL:** `/api/metas/exportar`
- **Método:** GET
- **Resposta de Sucesso:**
    - **Código:** 200 OK
    - **Conteúdo:** Arquivo CSV com os dados exportados.
    - **Observação:** O arquivo será baixado automaticamente.
    - **Cabeçalho da Resposta:**
        - `Content-Disposition: attachment; filename="metas.csv"`
        - `Content-Type: text/csv`
        - `Content-Length: <tamanho_do_arquivo>`
        - `Content-Encoding: gzip` (se o arquivo estiver compactado)
        - `Content-Transfer-Encoding: binary` (se o arquivo estiver em binário)
        - `Accept-Ranges: bytes` (se o arquivo suportar download em partes)

### 8. Documentação da API
**Descrição:** Acesse a documentação da API gerada pelo Swagger.
- **URL:** `/swagger-ui/index.html`
- **Segunda URL funcional:** `metas/api/api-docs`
- **Método:** GET
- **Resposta de Sucesso:**
    - **Código:** 200 OK
    - **Conteúdo:** Tela do Swagger UI com a documentação da API.
    - **Observação:** Acesse a documentação pelo navegador.
    - **Cabeçalho da Resposta:**
        - `Content-Type: text/html`
        - `Content-Length: <tamanho_do_arquivo>`
        - `Content-Encoding: gzip` (se o arquivo estiver compactado)
        - `Content-Transfer-Encoding: binary` (se o arquivo estiver em binário)
        - `Accept-Ranges: bytes` (se o arquivo suportar download em partes)
        - `Cache-Control: no-cache, no-store, must-revalidate` (para evitar cache)


---

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_REPOSITORIO>
   ```

2. Compile e execute o projeto:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

3. Acesse a API:  
   A API estará disponível em `http://localhost:8080/api/metas`.

---

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.3.4
- Spring Data JPA
- H2 Database
- OpenCSV
- Lombok
- Springdoc Swagger

---

## Contato
Para mais informações, entre em contato com **RWALACE**.

---

## Collection do Insomnia
Para facilitar o uso e teste da API, você pode importar a collection do Insomnia disponível [aqui](...).