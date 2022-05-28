# Unicesumar
###### CURSO: _SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS_
###### DISCENTE: _ANTHONY VICTOR RAMOS COSTA_
###### DISCIPLINA: _PROGRAMAÇÃO 1 - MÓDULO 2021/53_

### Material de avaliação prática - M.A.P.A.
 
❇️ Para a atividade mapa da disciplina, analise o estudo de caso de um **controle de estoque** e desenvolva o programa para solucionar o problema.

***O DONO DE UMA EMPRESA DE IMPORTAÇÃO*** necessita de um sistema para efetuar o controle da entrada e saída de mercadorias no estoque de sua empresa.
Para isso, ele informa que as operações diárias se resume em quatro funções que o sistema precisa contemplar, que são:
- ***Cadastro de Produtos***: consiste nas operações de inclusão, alteração, consulta e exclusão de um produto.
- ***Movimentação***: consiste nas operações de entrada e saída de produtos no estoque.
- ***Reajuste de Preços***: consiste em aumentar o preço unitário por percentual de um ou mais produtos do estoque.
- ***Relatório***: lista de Produtos.

***O DONO DE UMA EMPRESA DE IMPORTAÇÃO*** informa que é necessário um controle eficiente do estoque, que permita a sua empresa ter um planejamento melhor de suas compras, na medida em que tem condições de saber quando e quanto deverá comprar para repor suas necessidades e atender bem a demanda de seus clientes.

O **controle do estoque** é feito pela atualização das quantidades disponíveis de cada um dos itens do estoque. Isso é feito por meio de um levantamento de todos os produtos com os quais a empresa trabalha. Após o levantamento, todos os produtos deverão ser mantidos no sistema (operações de *inclusão, alteração, consulta e exclusão* de produtos), para que a partir desse momento, o sistema reflita exatamente o que existe no estoque da empresa.

A cada nova entrada ou saída de produtos do estoque (movimentação), o saldo atual do produto é atualizado.


Para ***O DONO DE UMA EMPRESA DE IMPORTAÇÃO***, existem um relatório importante:
Lista de Preços: uma relação de todos os produtos do estoque, constando o preço de cada um deles, unidade medida e quantidade.
As informações de um produto são:
- Nome;
- Preço Unitário;
- Unidade;
- Quantidade em Estoque.

#### Especificações do app
- Crie um programa que utilize a **orientação objeto** em Java.
- Deverá oferecer uma **interface de usuário** simples, com diálogos explicativos.
- O programa deverá ser desenvolvido dentro de boas técnicas de programação e utilizar a orientação a objetos (**JAVABEAN**).
- Os **relatórios** deverão ser feitos para serem exibidos no vídeo.
- Os dados deverão ser **armazenados em memória**.
- Alguns layouts de telas são representados, a seguir, como sugestão, podendo ser alterados esteticamente, desde que apresentem as informações e funcionalidades especificadas.

EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.
SISTEMA DE CONTROLE DE ESTOQUE
-

|MENU PRINCIPAL 🏠
-
|1 - CADASTRO DE PRODUTOS
|2 - MOVIMENTAÇÃO
|3 - REAJUSTE DE PREÇOS
|4 - RELATÓRIOS
|0 - FINALIZAR

>- 1 - Exibe a tela *CADASTRO DE PRODUTOS*. ✅
>- 2 - Exibe a tela *MOVIMENTAÇÃO*. ✅
>- 3 - Exibe a tela *REAJUSTE DE PREÇOS*. ✅
>- 4 - Exibe a tela *RELATÓRIOS*. ✅
>- 0 - Finaliza o app. ✅

|CADASTRO DE PRODUTOS 👕
-
|1 - INCLUSÃO
|2 - ALTERAÇÃO
|3 - CONSULTA
|4 - EXCLUSÃO
|0 - RETORNAR

>- 1 - Exibe a tela *INCLUSÃO DE PRODUTO*. ✅
>- 2 - Exibe a tela *ALTERAÇÃO DE PRODUTO*. ✅
>- 3 - Exibe a tela *CONSULTA DE PRODUTO*. ✅
>- 4 - Exibe a tela *EXCLUSÃO DE PRODUTO*. ✅
>- 0 - Retorna para a tela *MENU PRINCIPAL*. ✅

|INCLUSÃO DE PRODUTO ✔️
-
|NOME:
|PREÇO:
|UNIDADE:
|QUANTIDADE:
|CONFIRMA INCLUSÃO (S/N)? _
|REPETIR OPERAÇÃO (S/N)? _

>- Validar nome do produto, não podem existir nomes duplicados. ✅
>- O preço deve ser maior que zero. ✅
>- A quantidade deve ser maior ou igual a zero. ✅
>- Caso algum dos critérios de validação anterior não seja atendido, deve-se exibir uma mensagem de erro e solicitar a redigitação da informação errada. ✅
>- Confirmar a inclusão antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

|ALTERAÇÃO DE PRODUTO 🔁
-
|NOME:
|PREÇO:
|UNIDADE:
|QUANTIDADE:
|CONFIRMA ALTERAÇÃO (S/N)? _
|REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler as alterações. ✅
>- Não pode ser alterado o nome do produto, para tal deve-se excluí-lo e recadastrá-lo. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Confirmar a alteração antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

|CONSULTA DE PRODUTO 🔎
-
|NOME:
|PREÇO:
|UNIDADE:
|QUANTIDADE:
|REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver então deve-se exibir os seus dados. ✅
Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

|EXCLUSÃO DE PRODUTO 🚮
-
|NOME:
|PREÇO:
|UNIDADE:
|QUANTIDADE:
|CONFIRMA EXCLUSÃO (S/N)? _
|REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados. ✅
>- Confirmar exclusão antes de efetuá-la. ✅
Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

|MOVIMENTAÇÃO 🔃
-
|1 - ENTRADA
|2 - SAÍDA
|0 - RETORNAR
|OPÇÃO: _

>- 1 - Exibe a tela *MOVIMENTAÇÃO - ENTRADA DE PRODUTO*. ✅
>- 2 - Exibe a tela *MOVIMENTAÇÃO - SAÍDA DE PRODUTO*. ✅
>- 0 - Retornar para a tela *MENU PRINCIPAL*. ✅

|MOVIMENTAÇÃO - ENTRADA DE PRODUTO ⬅️
-
|PRODUTO:
|QTDE ATUAL:
|QTDE ENTRADA:
|QTDE FINAL:
|CONFIRMA ENTRADA (S/N)? _
|REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a quantidade da entrada. ✅
>- A quantidade de entrada deve ser maior que zero. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Pedir a confirmação da operação antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MOVIMENTAÇÃO* ✅

|MOVIMENTAÇÃO - SAÍDA DE PRODUTO ➡️
-
|PRODUTO:
|QTDE ATUAL:
|QTDE SAÍDA:
|QTDE FINAL:
|CONFIRMA SAÍDA (S/N)? _
|REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a quantidade da saída. ✅
>- A quantidade de saída deve ser maior que zero, e menor ou igual à quantidade atual do produto. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Pedir a confirmação da operação antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MOVIMENTAÇÃO* ✅

|REAJUSTE DE PREÇOS 💲
-
|PRODUTO:
|PREÇO ATUAL:
|PERCENTUAL DE REAJUSTE (%) _
|AUMENTO OU REDUÇÃO (1/2)? _
|NOVO PREÇO:
|CONFIRMA REAJUSTE (S/N)? _
|REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a porcentagem de reajuste. ✅
>- A porcentagem deve ser maior que zero. ✅
>- O preço final deve ser maior que zero. ✅ 
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Pedir a confirmação da operação antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MOVIMENTAÇÃO* ✅

|RELATÓRIOS 📈
-
|1 - PRODUTOS
|2 - MOVIMENTAÇÃO
|0 - RETORNAR
|OPÇÃO: _

>- 1 - Exibe a tela *RELATÓRIOS - PRODUTOS*. ✅
>- 2 - Exibe a tela *RELATÓRIOS - MOVIMENTAÇÃO*. ✅
>- 0 - Retornar para a tela *MENU PRINCIPAL*. ✅

|RELATÓRIOS - PRODUTOS 📋
-
|NOME:
|PREÇO:
|UNIDADE:
|QTDE:

>- Exibir todos os produtos cadastrados. ✅
>- Retornar à tela de *RELATÓRIOS* ✅

|RELATÓRIOS - MOVIMENTAÇÃO 💵
-
|PRODUTO:
|QTDE ENTRADAS:
|QTDE SAÍDAS:

|MOVIMENTAÇÃO TOTAL 💵
-
|QTDE ENTRADAS:
|QTDE SAÍDAS:

>- Exibir movimentações de cada produto. ✅
>- Exibir soma de todas as movimentações. ✅
>- Retornar à tela de *RELATÓRIOS* ✅


| Nota/Valor | Descrição dos critérios |
|---------|:---------------:
| 0,50 / 0,50 | 1. CLASSE PRODUTO ✅
| 3,00 / 3,00 | 2. APRESENTAÇÃO DE MENUS ✅
| 3,50 / 3,50 | Nota final ✅