# Unicesumar
###### CURSO: _SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS_
###### DISCENTE: _ANTHONY VICTOR RAMOS COSTA_
###### DISCIPLINA: _PROGRAMAÇÃO 3 - MÓDULO 51/2022_

### Material de avaliação prática - M.A.P.A.
 
❇️ Imagine que você é um desenvolvedor de sistemas freelancer, que possui uma ampla carteira de clientes. Como você não gosta dos sistemas existentes, você decide que irá criar sua própria aplicação de ***registro e manutenção de clientes***.
Para isso, você deverá programar uma ***agenda*** em versão beta (versão de teste), que permite armazenar o cadastro de, no máximo, 5 (cinco) clientes por vez. 

A aplicação deverá armazenar, para cada cliente:
- Código único, gerado automaticamente pelo sistema;
- Nome;
- Telefone;
- Email.

#### Especificações do app
- A sua aplicação deve ser entregue em um arquivo de código fonte para linguagem C (extensão .c).
- Caso o programa já tenha armazenado o número máximo de clientes (cinco), deverá ser exibida a mensagem “Agenda lotada!”. 
- O código de um cadastro deve ser preenchido automaticamente pelo sistema e o usuário não deve ter a opção de alterar esse código.
- A opção *LISTAR* deverá mostrar na tela **apenas** os dados dos clientes cadastrados. 
- Caso seja impressa alguma informação sobressalente ou faltem informações, será considerado um erro de programação. 
- Caso nenhum cliente tenha sido cadastrado, o programa deverá exibir a mensagem “Agenda vazia!”.
- Caso o usuário escolha uma opção que não conste no menu, o programa deverá exibir uma mensagem de erro como, por exemplo: “Erro: opção inválida!”.
- 
SISTEMA DE CONTROLE DE CLIENTES
-

| MENU PRINCIPAL 🏠
|-|
| 1 - INSERIR NOVO CLIENTE
| 2 - LISTAR TODOS OS CADASTROS
| 0 - FINALIZAR

>- 1 - Exibe a tela *CADASTRO DE CLIENTE*. ✅
>- 0 - Finaliza o app. ✅

| CADASTRO DE CLIENTE 👨‍💼 |
|-|
| NOME?: _
| TELEFONE?: _
| EMAIL?: _

Algumas funções que serão úteis durante o desenvolvimento do programa:
 
* ```system(“pause”)``` – chamada de sistema que “pausa” o programa e o faz aguardar pelo usuário;
* ```system(“cls”)``` – chamada de sistema que limpa os caracteres que foram impressos na tela anteriormente;
* ```fflush(stdin)``` – limpar o buffer do teclado. Essa função deve sempre ser utilizada após ter utilizado alguma função de entrada de dados como o scanf, gets, etc. Isso se dá pois em algumas situações o buffer do teclado mantém “lixo de memória”, prejudicando a próxima operação de entrada do programa;
* A função ```setlocale(LC_ALL, "Portuguese")``` da biblioteca ```locale.h``` pode ser útil, caso você queira que os acentos e pontuações da língua portuguesa sejam impressos corretamente.

| Nota/Valor | Descrição dos critérios |
|---------|:---------------|
| 0,20 / 0,20 | Apresentação do Menu
| 0,20 / 0,20 | Finalização do Programa
| 0,40 / 0,40 | Mensagem de erro
| 0,40 / 0,40 | Cadastro
| 0,20 / 0,20 | Código único automático
| 0,40 / 0,40 | Exibir cadastros
| 0,20 / 0,20 | Extensão do arquivo
| 2,00 / 2,00 | Nota final ✅
