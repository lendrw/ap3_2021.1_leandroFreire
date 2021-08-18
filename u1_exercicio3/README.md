# AP3 - Unidade 1
## Exercício 3 - 3,0 pontos se entregar até 12/09/2021
#### Coloque as classes no *package br.com.ap3.u1.ex3.primeiroNome1900101010;*.
#### Substitua *primeiroNome1900101010* pelo seu primeiro nome e número de matrícula.

---

## Questão 1 (0,5 ponto):
Faça uma classe em Java que exiba a soma dos números inteiros digitados pelo usuário. Encerre a execução quando o usuário digitar um número negativo. Faça uma classe com o método *main()* que teste a funcionalidade.

---

## Questão 2 (0,5 ponto):
O programa a seguir sempre exibe na saída padrão a mensagem: “A distância é: 1.0”.
```java
package br.com.ap3.u1.distancia;
import java.util.Scanner;

public class Distancia {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double x1, y1, x2, y2, distancia = 1.0;

    System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
    x1 = teclado.nextFloat();
    y1 = teclado.nextFloat();
    x2 = teclado.nextFloat();
    y2 = teclado.nextFloat();

    distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 1 / 2);

    System.out.println("A distância é: " + distancia);
		teclado.close();
  }
}
```
Corrija o problema e faça com que a classe exiba a distância entre dois pontos de forma correta. Coloque a classe corrigida (.java) no seu repositório da disciplina.

---

## Questão 3 (0,5 ponto):
Faça uma classe em Java que exibe 10000 vezes a seguinte mensagem: "Hoje é dia diaX de mêsY!". O dia e mês devem vir do sistema.

---

## Questão 4 (0,5 ponto):
Escreva uma classe em Java que tem como atributo o nome e a idade de uma pessoa. Faça uma outra classe com o método *main()*, na qual o usuário deverá preencher os dados da pessoa. Exiba o nome e quantos dias a pessoa viveu. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida, então a saida seria: Joaninha, você viveu 6935 dias. Lembre-se que estamos em uma disciplina sobre orientação a objetos...

---

## Questão 5 (1,0 ponto):
Implemente uma classe Carro, com os seguintes atributos na classe: Modelo, Cor, Ano, Marca, Chassi, Velocidade máxima, Velocidade atual, Nr de portas, tem teto solar?, Nr Marchas, tem cambio automatico?, Volume de combustível.
Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h
Implemente o método freia, que para o carro – Velocidade = 0 km/h
Implemete o método troca marcha
Implemente o método reduz a marcha
A marcha ré nao pode ser engatada se o a velocidade for superior a 0 km/h
O atributo Marca de um carro deve ser uma classe separada, com nome, nrDeModelos, ano de lançamento e código identificador.
Implemente um método que calcule a autonomia de viagem do veículo com base no consumo médio passado como parâmetro
Faça uma outra classe com o método *main()*, na qual o usuário deverá preencher os dados de três Carros distintos. Exiba os dados dos três Carros usando o método *toString()*.
