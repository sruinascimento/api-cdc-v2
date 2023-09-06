# CDC API

Api para simular a [Casa do código](https://www.casadocodigo.com.br/) com o objetivo de estudar Spring Boot e Spring
MVC.
Os desafios foram propostos pelo [Dev_Eficiente](https://deveficiente.com/).

## Implementar cadastro de um Autor.

### Requisitos:

É necessário cadastrar um novo autor no sistema. Todo autor tem um nome, email e uma descrição. Também queremos saber o
instante exato que ele foi registrado.

**Restrições**

- O instante não pode ser nulo.
- o email é obrigatório.
- o email tem que ter formato válido.
- o nome é obrigatório.
- a descrição é obrigatória e não pode passar de 400 caracteres.

Um novo autor ao ser criado deve retornar o status 200.

