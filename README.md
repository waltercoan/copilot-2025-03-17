# Curso Copilot 17/03/2025

[Assinaturas](https://docs.github.com/en/copilot/about-github-copilot/subscription-plans-for-github-copilot)

[Codex](https://openai.com/index/openai-codex/)

[Cheat Sheets](https://docs.github.com/en/copilot/using-github-copilot/copilot-chat/github-copilot-chat-cheat-sheet?tool=vscode)

## Configuração do ambiente local

[VSCode](https://code.visualstudio.com/)

[Download JDK](https://adoptium.net/)

[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

[GitHub Copilot](https://marketplace.visualstudio.com/items?itemName=GitHub.copilot)

[Atalhos Github Copilot](https://docs.github.com/en/copilot/managing-copilot/configure-personal-settings/configuring-github-copilot-in-your-environment?tool=jetbrains)

## Exercicio 2
```bash
@workspace por favor, defina uma função para gerar um arquivo .csv com alguns dados

por favor gere um método que receba uma URL de uma API REST, e faça uma chamada HTTP e em seguida imprima o retorno em formato de texto

@workspace /explain por favor explique o método chamarAPIRest

@workspace /explain por favor gere a documentação no código para o método chamarApiRest

@workspace /explain por favor gere a documentação no código linha a linha para o método chamarApiRest, sem modificar o código fonte

@workspace por favor, gere um novo método no #file:Main.java que receba um número inteiro e retorne o texto se ele é par ou impar

@workspace por favor insira a dependencia do junit jupiter

@workspace por favor gere um teste de unidade para o método verificarParOuImpar na pasta de test do projeto seguindo o mesmo pacote.
```

## Exercício 3
```bash
definir um método para criar validação para email. O método deve ser chamado validarEmail e deve receber um parâmetro do tipo String com o email a ser validado. O método deve retornar um boolean indicando se o email é válido ou não. O método main deve chamar o método validarEmail e passar o email. Ao começar a digitar a função ‘validarEmail’, o Copilot pode sugerir o uso de expressões regulares para validação. 
```

## Exercício 4
```bash
definir um método para criar uma validação para CPF. O método deve ser chamado validarCPF e deve receber um parâmetro do tipo String com o CPF a ser validado. O método deve retornar um boolean indicando se o CPF é válido ou não. O método main deve chamar o método validarCPF e passar o CPF "123.456.789-10" como parâmetro. O Copilot pode ajudar a sugerir a criação do método para validação de CPF 
```

## Exercício 5
```bash
definir um método para gerenciar a conexão com um banco de dados SQL Server. O método deve ser chamado conectarBanco e deve receber um parâmetro do tipo String com a URL de conexão. O método deve retornar um objeto do tipo Connection. O método main deve chamar o método conectarBanco e passar a URL de conexão "jdbc:sqlserver://localhost:1433;databaseName=exemplo" como parâmetro.

@workspace considerando o método conectarBanco gere uma versão do código em c#
```

## Exercício 5 SQL
- Tabela Usuário possui os campos: nome, telefone, endereco, numero
- Tabela Publicacao possui os campos: texto, usuario associado, data e numero de likes
- Tabela Comentario possui os campos: publicacao associada, texto data

```bash
@workspace #sym:## Exercício 5 SQL  por favor gere o códiog na linguagem SQL para o banco de dados SQL Server
```
## Exercício 6

```bash
Crie um programa que simule o funcionamento de um caixa de supermercado. O caixa fica aberto até
o fim do expediente e pode processar a compra de vários clientes. Cada cliente pode comprar vários itens. Ao ler
cada item deve ser exibida uma mensagem para o operador do caixa perguntando se há mais itens a serem
processados. Ao final, exiba quanto a compra custou ao cliente. E então solicite do operador do caixa a
informação se deseja fechar o caixa. Encerre o algoritmo quando o usuário informar que deseja fechar o caixa
O programa deve ser composto pelos seguintes recursos:
1. Classe para representar um item do supermercado (nome e preço). Retornar 1 se `n` for 0 ou 1.
2. Classe para armazenar os itens comprados e calcular o total.
3. Classe para iniciar o programa e gerenciar o caixa.
4. Classe principal que gerencia o fluxo do caixa e interage com o operador.
```