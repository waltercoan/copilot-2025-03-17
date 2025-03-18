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

## Exercício 7

```bash
Neste programa, crie as classes RG, Pessoa, Professor e Aluno, que herdarão atributos e métodos da
classe abstrata Pessoa.
A – Criando a classe RG
• Crie uma classe chamada RG, com os atributos privados numero do tipo int e dataNasc do tipo String;
• Crie os métodos get e set para cada atributo;
• Crie um construtor que receba um parâmetro do tipo int e um do tipo String, e os atribua a seus
respectivos atributos;
B – Criando a classe Pessoa
Crie uma classe abstrata chamada Pessoa com os seguintes atributos:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• rg do tipo construido RG.
Crie os métodos get e set para cada atributo;
Crie um construtor que receba os parâmetros a seguir e os atribua a seus respectivos atributos:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• rg do tipo construido RG.
Crie dois métodos abstratos e nomeie-os como: falar() - que receba o parâmetro fala do tipo String, e crie,
também, o método mostrarDados();
C – Criando a classe Professor
Crie uma classe com o nome Professor, que deve ser subclasse de Pessoa;
Declare os atributos privados salario - do tipo float - e disciplina do tipo String;
Crie os métodos get e set para cada atributo;
Crie um construtor que receba os seguintes parâmetros:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• numeroRG do tipo int;
• dataNasc do tipo String;
• salario do tipo float;
• disciplina do tipo String.
Dentro do construtor, a partir do mecanismo de herança entre classes, passe os parâmetros nome, idade e o
parâmetros numeroRG e dataNasc;
Atribua os parâmetros salario e disciplina a seus respectivos atributos;
Implemente o método abstrato falar() e, dentro dele, imprima uma frase contendo o atributo nome da pessoa e
o valor do parâmetro informado;
Implemente o método abstrato mostrarDados() e, dentro dele, imprima todos os atributos da classe e da
superclasse;
D – Criando a classe Aluno
Crie uma classe com o nome Aluno, que deve ser subclasse de Pessoa;
Declare os atributos privados mensalidade, do tipo float, e curso, do tipo String;
Crie os métodos get e set para cada atributo;
Crie um construtor que receba os seguintes parâmetros:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• numeroRG do tipo int;
• dataNasc do tipo String;
• mensalidade do tipo float;
• curso do tipo String.
Dentro do construtor, a partir do mecanismo de herança entre classes, passe os parâmetros nome, idade e o
parâmetros numeroRG e dataNasc;
Atribua os parâmetros mensalidade e curso a seus respectivos atributos;
Implemente o método abstrato falar() e, dentro dele, imprima uma frase contendo o atributo nome da pessoa e
o valor do parâmetro informado;
Implemente o método abstrato mostrarDados() e, dentro dele, imprima todos os atributos da classe e da
superclasse;
E – Testando todas as classes criadas
• Crie três objetos do tipo Pessoa. Para dois objetos, utilize o construtor da classe Aluno e, para o outro,
utilize o construtor da classe Professor, passando os devidos parâmetros;
• Utilize o método falar() com cada objeto e, depois, mostre os dados de cada objeto com o método
mostrarDados();
```

## Exercício 8

```bash
Desenvolver um simulador de caixa eletrônico utilizando a linguagem Java e uma interface gráfica
baseada na biblioteca Swing. O programa permitirá que um usuário realize operações bancárias
básicas, como:
• Saque
• Consulta de saldo
• Depósito
• Pagamento de contas
• Transferência entre contas
O usuário deverá inserir suas credenciais para acessar sua conta e, após a autenticação, poderá navegar por um
menu interativo para realizar as operações bancárias.
Requisitos do Sistema
1. Interface Gráfica (GUI)
A interface do caixa eletrônico deve conter:
Tela de Login (usuário e senha)
Tela Principal com botões para cada operação
Tela para cada operação (saque, depósito, etc.), onde o usuário insere os valores e confirma a
transação
Mensagens de erro e sucesso exibidas para o usuário
2. Funcionalidades do Caixa Eletrônico
Cada operação deve funcionar conforme descrito abaixo:
2.1. Login do Usuário
• O usuário deve inserir um número de conta e senha.
• Se a autenticação falhar, uma mensagem de erro deve ser exibida.
• Após o login bem-sucedido, o usuário será redirecionado para a tela principal.
2.2. Consulta de Saldo
• O sistema exibe o saldo atual da conta.
2.3. Saque
• O usuário insere um valor para sacar.
• O sistema verifica se há saldo suficiente.
• Se o saldo for suficiente, o valor é deduzido da conta e uma mensagem de sucesso é
exibida.
• Caso contrário, exibir uma mensagem de erro.
2.4. Depósito
• O usuário insere um valor para depositar.
• O valor é adicionado ao saldo da conta.
• Uma mensagem de sucesso é exibida.
2.5. Pagamento de Conta
• O usuário insere um número da conta e o valor do pagamento.
• O sistema verifica se há saldo suficiente.
• Se houver saldo, o pagamento é efetuado.
• Se não houver saldo, uma mensagem de erro é exibida.
2.6. Transferência entre Contas
• O usuário informa número da conta destino e valor da transferência.
• O sistema verifica se há saldo suficiente.
• Se houver saldo, o valor é transferido para a conta de destino.
• Caso contrário, exibir uma mensagem de erro.
3. Requisitos Técnicos
• Linguagem: Java
• Interface Gráfica: Swing
• Persistência de Dados: Pode ser feita usando um arquivo .txt, .json, ou um banco de dados como SQLite
Classes Principais:
• ContaBancaria: Armazena os dados da conta e operações bancárias.
• Usuario: Representa o titular da conta.
• CaixaEletronico: Controla a interface gráfica e as operações.
4. Fluxo do Programa
• Tela de Login
• Menu Principal (Selecionar Operação)
• Tela da Operação Escolhida (Saque, Depósito, etc.)
• Processamento da Transação
• Exibição de Mensagem de Sucesso ou Erro
• Voltar ao Menu Principal ou Encerrar Sessão
```


## Exercício 9

```bash
O desafio propõe o desenvolvimento de um SnakeGame básico que fornece as
seguintes funcionalidades:
• A Cobra pode se mover em uma determinada direção e quando come a
• comida, o comprimento da cobra aumenta.
• Quando a cobra se cruza ou quando um dos cantos da tela é atingido pela cobra o jogo acaba.
• Os alimentos serão gerados em posição aleatória.
• Idealmente, todos estes elementos de funcionalidades devem ser apresentados numa tela com interface
de usuário.
Antes de tudo, é necessário pensar nas classes. As principais classes serão - considerando que estas são as classesbase da aplicação:
1. Snake
2. Cell
3. Board
4. Game
Obs.: deve-se pensar em criar uma Enum para definir um CellType – por exemplo: se a célula esta vazia, com comida
ou, ainda, se é um snake node(um pedaço do corpo da cobra) – ainda, pode ocorrer a necessidade de criar uma
enum para tratar as direções que o personagem snake pode adotar; considerando as setas do teclado;
Também é importante identificar, com comentários, qual é a classificação e funcionalidade de cada bloco de
código.
Indicações importantes:
• A classe Game representa o corpo do programa. Ele armazena informações sobre a cobra e o tabuleiro
por onde o personagem principal circula.
• A classe Cell representa o único ponto de exibição/quadradinho. Ele contém o numero de linhas e colunas
e as informações.
• A classe Snake, que contém o corpo e a cabeça da cobra.
• Pode-se usar o recurso LinkedList para armazenar o corpo porque, dessa forma, fica mais fácil adicionar
uma célula em O(1).
• O método Grow será chamado quando ele - o personagem - comer o alimento. A classe Board representa
o display (a tela do jogo). É uma matriz de células. Possui um método de geração de alimentos que gera
o alimento em uma posição aleatória.
• A classe principal (Game) mantém as instâncias de Snake e Board. Seu método “update” precisa ser
chamado em um intervalo fixo.
Obs.: a estruturas de classe do seu projeto não precisam seguir estritamente a indicação de nomes e quantidades
de classes indicadas acima. Se for necessário, cada desenvolvedor pode nomear as classes da forma que lhe for
conveniente. Também, se preciso for, crie a quantidade de classes que você acredita ser necessária para que o
projeto funcione adequadamente.
É recomendado o uso das classes JFrame e JPanel -superclasses oferecidas pelo próprio Java - e praticar a herança
(quando necessário) para gerar gráficos e interfaces para a aplicação:
"JFrame é uma classe java que é estendida pela classe Frame. O JFrame é tratado como a janela principal. No
JFrame, diferentes elementos, como rótulos, campos de texto e botões, podem ser adicionados. Esses elementos
no JFrame criam a interface gráfica do usuário.O JFrame também é conhecido como contêiner de nível superior
Swing. Swing refere-se ao kit de ferramentas do widget da GUI para criar aplicativos em JAVA. "

@workspace gere o código necessário para movimentar a Snake no jogo
```

## Exemplo Spring Boot
[Spring Boot extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)


```bash
@workspace por favor gere as configurações necessárias no arquivo application.properties para conectar no banco de dados H2
```

## Historias de usuario
- Como um atendente eu gostaria de registrar os dados de um cliente como: nome, endereco, telefone, e-mail, estado
- Como um atendente eu gostaria de buscar um cliente pelo nome
- Como um atendente eu gostaria de alterar os dados de um cliente
- Como um atendente eu gostaria de excluir um cliente pelo nome
- Como um atendente eu gostaria de registrar os estados com os dados: nome, e pais


```bash
@workspace #sym:## Historias de usuario quais são as entidades?

por favor gere as classes em java no pacote br.com.kasolution.spring.entities para representar as entidades

@workspace por favor altere as entidades para que possam ser persistidas no banco de dados
```

[PlantUML](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml)

```bash
considerando a #sym:Cliente #sym:Estado gere um arquivo no formato plantuml representando as classes e duas associações


@workspace gere um método de consulta no ClienteRepository pelo campo de email

@workspace gere o codigo da classe controller para realizar um CRUD da entidade Cliente

@workspace gere um arquivo no padrão do rest client para invocar os endpoints da api rest
```
