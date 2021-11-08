# Unidade 3
## Exercícios - 5,0 pontos se entregar até 21/11/2021
### Exercícios de Java e Exceptions
#### Coloque as classes no *package br.com.ap3.u3.primeiroNome1900101010;*. Substitua *primeiroNome1900101010* pelo seu primeiro nome e número de matrícula.

---

## Questao 1 (2,0 pontos):
Escreva uma classe *Contato* que contenha nome, telefone e um identificador. Esse identificador deve ser gerado automaticamente pela classe com o uso de um contador (cada vez que um novo Contato for criado o contador é incrementado e atribuído ao identificador).

Crie uma classe *Agenda* que irá funcionar para gerenciar os *Contatos*. Essa classe precisa ter um método para adicionar um contato e para consultar contatos. Use uma coleção de java para armazenar os *Contatos*.

Crie uma classe TestaAgenda que implemente as funcionalidades:

1. Consultar *Contato*.
2. Adicionar *Contato*.
3. Sair.

- Informe as funcionalidades em um menu para o usuário.

- Se o contato pesquisado não existir, o programa deve lançar uma ContatoInexistenteException.

- Caso a agenda esteja cheia (com mais de 50 contatos), o programa deve lançar uma AgendaCheiaException.

- Trate as exceptions de entradas de dados do usuário.

## Questao 2 (2,0 pontos):
Faça um programa que grave e recupere todos os contatos da Agenda descritos na Questão 1 em um arquivo no disco rígido de forma persistente, usando *streams* de Java. Na aula foram vistos as classes que manipulam texto. A gravação e leitura de objetos em bytes é *parecida*.

## Questao 3 (1,0 ponto):
Escreva um programa que armazene em um vetor os nomes dos meses do ano, em seguida peça ao usuário que digite um valor inteiro. Após isso, mostre o nome do mês correspondente ao número digitado. O programa deve finalizar quando for digitado o valor zero. Trate com *exceptions* digitação inválida e o índice do mês inválido.
