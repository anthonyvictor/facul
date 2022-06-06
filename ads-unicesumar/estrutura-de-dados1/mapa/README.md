# Unicesumar
###### CURSO: _SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS_
###### DISCENTE: _ANTHONY VICTOR RAMOS COSTA_
###### DISCIPLINA: _ESTRUTURA DE DADOS 1 - MÓDULO 52/2021_

### Material de avaliação prática - M.A.P.A.

❇️ Olá, este MAPA tem por objetivo por em prática a ***análise e o desevolvimento*** visto durante as nossas aulas, para isso analise e implemente a situação a seguir:

Imagine que a Unicesumar está dando a oportunidade de os acadêmicos dos cursos de TI EAD participarem de soluções tecnológicas em seus processos de ensino à distância. Assim, a instituição convoca você a desenvolver um pequeno **protótipo de sistema em linguagem C**. 

Ocorre que toda atividade prática que os estudantes entregam para serem corrigidas entram em uma **fila**, de forma que o último trabalho a ser enviado por alguém, sempre é **inserido ao final**. Ainda, a equipe de correção irá corrigir por primeiro, os trabalhos que foram enviados de forma antecipada.

Assim, você parte para a mão na massa, e desenvolve um programa permite que o usuário armazene as informações que o sistema acadêmico necessita para realizar as correções de cada atividade, a saber:
- RA do aluno;
- Nome do arquivo;
- Extensão do arquivo;
- Matrícula do professor responsável pela correção.

Crie uma aplicação em linguagem C, com a estrutura de dados apresentada na ilustração a seguir:

<img src="estrutura-de-dados1_mapa_exemplo.png" 
width="300" style="display: block; margin: 0 auto;"/>

#### Especificações do app
- Ao cadastrar uma nova atividade, suas informações são adicionadas ao final da fila.
- Se o usuário desejar remover uma atividade, o programa deve ser excluir o elemento do início da fila, mantendo a estrutura de dados organizada.
- O código-fonte deve ser escrito de forma a implementar estruturas de dados estáticas. Nesse caso, nossa fila deverá ter, no máximo, 5 posições para armazenar elementos.
- A aplicação deverá ser feita em ambiente Dev C++, no padrão C ANSI.

SISTEMA DE FILA DE ATIVIDADES
-

| MENU PRINCIPAL 🏠
|-|
| 1 - INSERIR ATIVIDADE NA FILA
| 2 - REMOVER ATIVIDADE DA FILA
| 3 - ESVAZIAR FILA
| 0 - FINALIZAR

>- Exibe o conteúdo da fila (do início em direção ao fim). ✅
>- 1 - Exibe a tela *INCLUIR ATIVIDADE*. ✅
>- 2 - Retira a atividade que está na primeira posição da fila. ✅
>- Caso haja elemento para ser removido, todos os dados da respectiva atividade que será removido devem ser impressos na tela: RA do estudante, nome do arquivo, extensão do arquivo e nome do professor.
>- Se a fila estiver vazia, o usuário deve ser informado e o programa retorna ao menu principal.
>- 3 - Remove todos os elementos da fila. ✅
>- 0 - Finaliza o app. ✅

| INCLUIR ATIVIDADE ✔️ |
|-|
| RA DO ALUNO?: _
| NOME DO ARQUIVO?: _
| EXTENSÃO DO ARQUIVO?: _
| MATRÍCULA DO PROFESSOR?: _

>- Verifica se a fila já esta cheia. Se não houver mais espaço na fila, o usuário deve ser informado, e o programa volta para o menu inicial. ✅ 
>- Lê o RA do(a) aluno(a), nome do arquivo contendo a solução da atividade, a extensão do arquivo e a matrícula do professor responsável pela correção. 
>- Insere as informações no fim da fila.
>- Retorna à tela de *MENU PRINCIPAL*. ✅

| Nota/Valor | Descrição dos critérios |
|---------|:---------------
| 0,00 / 0,70 | 1. Não permitir remover um elemento quando a fila está vazia. ❌
| 0,70 / 0,70 | 2. Insere um novo elemento, com a fila vazia. ✅
| 0,70 / 0,70 | 3. Após inclusão, o programa retorna ao menu, e lista o novo elemento. ✅
| 0,70 / 0,70 | 4. Não permitir inserção de novos elementos com a fila cheia. ✅
| 0,70 / 0,70 | 5. O programa deve realizar a limpeza da fila. ✅
| 2,80 / 3,50 | Nota final 🆗
