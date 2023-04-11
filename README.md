#  Calculadora-java-Junit
Este é um projeto desenvolvido para treinar testes unitários em Java. Inicialmente, será desenvolvida uma calculadora simples em Java com as operações básicas, como soma, subtração, multiplicação, divisão e potenciação. Após a implementação da calculadora, serão criados testes unitários para validar o funcionamento correto de cada método. Siga as instruções abaixo para usar a calculadora e, posteriormente, executar os testes unitários.

# Calculadora
Este é um projeto de uma calculadora simples em Java, onde o usuário pode escolher entre as seguintes operações: soma, subtração, multiplicação, divisão e potenciação.

## Como usar

1. Clone o repositório na sua máquina local.
2. Abra o projeto em sua IDE favorita.
3. Execute o arquivo "Main.java".
4. Siga as instruções no console para realizar as operações desejadas.

## Contribuindo
Se você deseja contribuir para este projeto, siga os passos abaixo:

1. Faça um fork deste repositório.
2. Crie uma branch para sua nova feature (git checkout -b feature/nova-feature).
3. Faça o commit de suas alterações (git commit -am 'Adicionando nova feature').
4. Faça o push para a branch (git push origin feature/nova-feature).
5. Crie um novo Pull Request.

# Licença

Este projeto está sob a licença MIT. Leia o arquivo "LICENSE" para mais informações.

Autor
Este projeto foi desenvolvido por [Marco Antonio Menezes Jorge ](https://github.com/MarcoAntonioMj).
# Atividade que foi pedida primeira questão : 
```
Escreva uma Calculadora em Java que contenha uma classe chamada 
Calculadora.Java .
Essa classe terá os métodos: 
somar(numeroUm + NumeroDois)
subtrair(numeroUm - NumeroDois)
multiplicar(numeroUm * numeroDois)
dividir(numeroUm / numeroDois)
potenciar(numeroUm ^ numeroDois)
Escreva os algoritmos de todos os métodos acima.
```
## Passo a Passo . 
1.  Criei uma nova classe chamada "Calculadora" com um construtor que recebe dois números como parâmetros e implementei os métodos de soma, subtração, multiplicação,       divisão e potenciação nessa classe.

2. No método main, criei um objeto da classe Scanner para ler a entrada do usuário e solicitei que ele inserisse os dois números que deseja calcular.

3. Criei um objeto da classe Calculadora com os números inseridos pelo usuário como parâmetros do construtor.

4. Utilizei um loop do-while para exibir o menu da calculadora e permitir que o usuário escolha a operação desejada.

5. Utilizei um switch-case para executar a operação selecionada pelo usuário e exibir o resultado.

6. Adicionei uma verificação para evitar a divisão por zero e exibir uma mensagem de erro ao usuário caso isso ocorra.

7. Por fim, adicionei a opção "SAIR" ao menu para permitir que o usuário encerre o programa quando desejar.

