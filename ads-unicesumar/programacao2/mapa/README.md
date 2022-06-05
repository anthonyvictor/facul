# Unicesumar
###### CURSO: _SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS_
###### DISCENTE: _ANTHONY VICTOR RAMOS COSTA_
###### DISCIPLINA: _PROGRAMAÇÃO 1 - MÓDULO 2021/53_

### Material de avaliação prática - M.A.P.A.
 
❇️ Para a atividade mapa da disciplina, analise o estudo de caso de um **controle de |estoque** e desenvolva o programa para solucionar o problema.

O ***Gestor da empresa que você trabalha***, necessita manter um registro dos **projetos de TI**. Este controle, atualmente, não existe... as informações e iniciativas estão de forma informal em troca de e-mails e mensagens.

Nesta primeira versão, o gestor solicita que você registre os seguintes dados dos projetos:
- Nome;
- Objetivo;
- Necessidades;
- Data de início (data no formato dd/mm/aaaa);
- Data Final (data no formato dd/mm/aaaa);
- Status.
  
O objetivo desta primeira versão é que seja possível *incluir*, *alterar*, *listar* todos, *buscar* por nome e *excluir* os dados. Possibilitando um registro **único** de cada projeto, no qual para identificar se é único consiste em não existir projetos com **nomes duplicados**.


#### Especificações do app
- A aplicação deve conter **tratamento dos erros** para os cenários possíveis.
- Deverá oferecer uma **interface de usuário** simples, com diálogos explicativos.
- As funcionalidades de *listar* e *consultar* deverá exibir os **dados do projeto**.
- Complete o programa em **Java** para que possa controlar o cadastro por meio de uma Collection.
- Implemente a **classe** *“ProjetoImpl”* para que resolva as funcionalidades que se espera no programa.​

SISTEMA DE CONTROLE DE PROJETOS
-

| MENU PRINCIPAL 🏠
|-|
| 1 - CADASTRAR
| 2 - ALTERAR
| 3 - LISTAR
| 4 - BUSCAR POR NOME
| 5 - EXCLUIR
| 0 - FINALIZAR

>- 1 - Exibe a tela *INCLUSÃO DE PROJETO*. ✅
>- 2 - Exibe a tela *ALTERAR PROJETO*. ✅
>- 3 - Exibe a tela *EXCLUIR PROJETO*. ✅
>- 4 - Exibe a tela *LISTA DE PROJETOS*. ✅
>- 5 - Exibe a tela *BUSCAR PROJETO*. ✅
>- 0 - Finaliza o app. ✅

| INCLUSÃO DE PROJETO ✔️
|-|
| NOME? _
| OBJETIVO? _
| NECESSIDADES? _
| DATA INICIAL (dd/mm/aaaa)? _
| DATA FINAL (dd/mm/aaaa)? _
| CONFIRMA INCLUSÃO (S/N)? _
| REPETIR OPERAÇÃO (S/N)? _

>- Validar nome do projeto, não podem existir nomes duplicados. ✅
>- As datas devem estar no formato (dd/mm/aaaa). ✅
>- A data final deve ser posterior à data inicial. ✅
>- Caso algum dos critérios de validação anterior não seja atendido, deve-se exibir uma mensagem de erro e solicitar a redigitação da informação errada. ✅
>- Confirmar a inclusão antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MENU PRINCIPAL*. ✅

| ALTERAÇÃO DE PROJETO 🔁
|-|
| OBJETIVO? _
| NECESSIDADES? _
| DATA INICIAL (dd/mm/aaaa)? _
| DATA FINAL (dd/mm/aaaa)? _
| CONFIRMA ALTERAÇÃO (S/N)? _
| REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler as alterações. ✅
>- Não pode ser alterado o nome do produto, para tal deve-se excluí-lo e recadastrá-lo. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Confirmar a alteração antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

| CONSULTA DE PRODUTO 🔎
|-|
| NOME:
| PREÇO:
| UNIDADE:
| QUANTIDADE:
| REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver então deve-se exibir os seus dados. ✅
Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

| EXCLUSÃO DE PRODUTO 🚮
|-|
| NOME:
| PREÇO:
| UNIDADE:
| QUANTIDADE:
| CONFIRMA EXCLUSÃO (S/N)? _
| REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados. ✅
>- Confirmar exclusão antes de efetuá-la. ✅
Ao final da operação deve-se retornar à tela de *CADASTRO DE PRODUTOS*. ✅

| MOVIMENTAÇÃO 🔃
|-|
| 1 - ENTRADA
| 2 - SAÍDA
| 0 - RETORNAR
| OPÇÃO: _

>- 1 - Exibe a tela *MOVIMENTAÇÃO - ENTRADA DE PRODUTO*. ✅
>- 2 - Exibe a tela *MOVIMENTAÇÃO - SAÍDA DE PRODUTO*. ✅
>- 0 - Retornar para a tela *MENU PRINCIPAL*. ✅

| MOVIMENTAÇÃO - ENTRADA DE PRODUTO ⬅️
|-|
| PRODUTO:
| QTDE ATUAL:
| QTDE ENTRADA:
| QTDE FINAL:
| CONFIRMA ENTRADA (S/N)? _
| REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a quantidade da entrada. ✅
>- A quantidade de entrada deve ser maior que zero. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Pedir a confirmação da operação antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MOVIMENTAÇÃO* ✅

| MOVIMENTAÇÃO - SAÍDA DE PRODUTO ➡️
|-|
| PRODUTO:
| QTDE ATUAL:
| QTDE SAÍDA:
| QTDE FINAL:
| CONFIRMA SAÍDA (S/N)? _
| REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a quantidade da saída. ✅
>- A quantidade de saída deve ser maior que zero, e menor ou igual à quantidade atual do produto. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Pedir a confirmação da operação antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MOVIMENTAÇÃO* ✅

| REAJUSTE DE PREÇOS 💲
|-|
| PRODUTO:
| PREÇO ATUAL:
| PERCENTUAL DE REAJUSTE (%) _
| AUMENTO OU REDUÇÃO (1/2)? _
| NOVO PREÇO:
| CONFIRMA REAJUSTE (S/N)? _
| REPETIR OPERAÇÃO (S/N)? _

>- Ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a porcentagem de reajuste. ✅
>- A porcentagem deve ser maior que zero. ✅
>- O preço final deve ser maior que zero. ✅ 
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada. ✅
>- Pedir a confirmação da operação antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MOVIMENTAÇÃO* ✅

| RELATÓRIOS 📈
|-|
| 1 - PRODUTOS
| 2 - MOVIMENTAÇÃO
| 0 - RETORNAR
| OPÇÃO: _

>- 1 - Exibe a tela *RELATÓRIOS - PRODUTOS*. ✅
>- 2 - Exibe a tela *RELATÓRIOS - MOVIMENTAÇÃO*. ✅
>- 0 - Retornar para a tela *MENU PRINCIPAL*. ✅

| RELATÓRIOS - PRODUTOS 📋
|-|
| NOME:
| PREÇO:
| UNIDADE:
| QTDE:

>- Exibir todos os produtos cadastrados. ✅
>- Retornar à tela de *RELATÓRIOS* ✅

| RELATÓRIOS - MOVIMENTAÇÃO 💵
|-|
| PRODUTO:
| QTDE ENTRADAS:
| QTDE SAÍDAS:

| MOVIMENTAÇÃO TOTAL 💵
|-|
| QTDE ENTRADAS:
| QTDE SAÍDAS:

>- Exibir movimentações de cada produto. ✅
>- Exibir soma de todas as movimentações. ✅
>- Retornar à tela de *RELATÓRIOS* ✅


| Nota/Valor | Descrição dos critérios |
|---------|:---------------:
| 0,50 / 0,50 | 1. CLASSE PRODUTO ✅
| 3,00 / 3,00 | 2. APRESENTAÇÃO DE MENUS ✅
| 3,50 / 3,50 | Nota final ✅
