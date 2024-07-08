# JPA API Sample Example

Sample example of a JPA-based API using Spring Boot and PostgreSQL

## Tech Stack

**Back-end:** Java, Spring Boot, and PostgreSQL

## Usage

URL: http://localhost:8185/relatorio/00187832013

Content-Type: application/json

Body:
{
"dataInicial": "2019-01-01T00:00:00Z",
"dataFinal": "2022-02-01T23:59:59Z"
}


## How to Run

1. **Clone the repository:**
    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Set up the database:**
    Ensure you have PostgreSQL installed and running. Create a database named `monitoring`.

3. **Configure the application:**
    Update the `application.properties` file with your PostgreSQL database details.

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/monitoring?connectionTimeZone=America/Sao_Paulo
    spring.datasource.username=postgres
    spring.datasource.password=postgres
    spring.datasource.driver-class-name=org.postgresql.Driver

    spring.jpa.properties.hibernate.jdbc.time_zone=America/Sao_Paulo
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true

    server.port=8185
    ```

4. **Build and run the application:**
    ```sh
    ./mvnw spring-boot:run
    ```

5. **Access the application:**
    Open your browser or use a tool like Postman to access the endpoint:
    ```sh
    http://localhost:8185/relatorio/00187832013
    ```

## Example Request

```json
POST /relatorio/00187832013 HTTP/1.1
Host: localhost:8185
Content-Type: application/json

{
  "dataInicial": "2019-01-01T00:00:00Z",
  "dataFinal": "2022-02-01T23:59:59Z"
}
