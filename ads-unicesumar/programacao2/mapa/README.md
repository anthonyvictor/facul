# Unicesumar
###### CURSO: _SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS_
###### DISCENTE: _ANTHONY VICTOR RAMOS COSTA_
###### DISCIPLINA: _PROGRAMAÇÃO 2 - MÓDULO 53/2021_

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

>- Validar nome do projeto, não podem existir nomes duplicados. ✅
>- As datas devem estar no formato (dd/mm/aaaa). ✅
>- Caso algum dos critérios de validação anterior não seja atendido, deve-se exibir uma mensagem de erro. ✅
>- Confirmar a inclusão antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MENU PRINCIPAL*. ✅

| ALTERAÇÃO DE PROJETO 🔁
|-|
| OBJETIVO? _
| NECESSIDADES? _
| DATA INICIAL (dd/mm/aaaa)? _
| DATA FINAL (dd/mm/aaaa)? _
| CONFIRMA ALTERAÇÃO (S/N)? _

>- Ler o nome do projeto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler as alterações. ✅
>- Não pode ser alterado o nome do projeto, para tal deve-se excluí-lo e recadastrá-lo. ✅
>- Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro. ✅
>- Confirmar a alteração antes de efetuá-la. ✅
>- Ao final da operação deve-se retornar à tela de *MENU PRINCIPAL*. ✅

| CONSULTA DE PROJETO 🔎
|-|
| NOME: 
| OBJETIVO:
| NECESSIDADES: 
| DATA INICIAL:
| DATA FINAL:

>- Ler o nome do projeto e verificar se ele já está cadastrado. Se estiver então deve-se exibir os seus dados. ✅
Ao final da operação deve-se retornar à tela de *MENU PRINCIPAL*. ✅

| EXCLUSÃO DE PROJETO 🚮
|-|
| NOME:
| OBJETIVO:
| NECESSIDADES:
| DATA INICIAL:
| DATA FINAL:
| CONFIRMA EXCLUSÃO (S/N)? _

>- Ler o nome do projeto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados. ✅
>- Confirmar exclusão antes de efetuá-la. ✅
Ao final da operação deve-se retornar à tela de *MENU PRINCIPAL*. ✅

| LISTA DE PROJETOS 📋
|-|
| NOME:
| OBJETIVO:
| NECESSIDADES:
| DATA INICIAL:
| DATA FINAL:

>- Exibir todos os projetos cadastrados. ✅
>- Retornar à tela de *MENU PRINCIPAL* ✅

| Nota/Valor | Descrição dos critérios |
|---------|:---------------:
| 1,50 / 1,50 | 1. 5 MÉTODOS ✅
| 1,00 / 1,00 | 2. TRATATIVA DE ERROS ✅
| 1,00 / 1,00 | 2. MÉTODOS NA CLASSE PROJETOIMPL ✅
| 3,50 / 3,50 | Nota final ✅
