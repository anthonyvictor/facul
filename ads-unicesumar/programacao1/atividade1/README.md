# Unicesumar
###### CURSO: _SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS_
###### DISCENTE: _ANTHONY VICTOR RAMOS COSTA_
###### DISCIPLINA: _PROGRAMAÇÃO 1 - MÓDULO 2021/53_

### Atividade 01.


❇️ O desenvolvimento de aplicação em Java utiliza a Orientação a Objetos para reduzir códigos e aumentar a produtividade dos desenvolvedores. Nesta atividade, crie uma aplicação utilizando as práticas de ***encapsulamento, abstração, herança, polimorfismo e Javabeans***.

Crie um **controle bancário** para gerenciar uma conta corrente e conta poupança. Onde deverá ter as seguintes classes:

##### Conta 
- Deverá ser abstrata e toda a conta possui número, agência, cliente e saldo;
- Número da conta e agência deverá ser maior que 0;
- Deverá ter um construtor com número, agência e cliente;
- Deverá iniciar um saldo 0;
- Deverá ter um método de sacar e depositar;
- O atributo saldo deverá ter apenas método get;
- O método sacar deverá ser abstrato;
##### Cliente:
- Deverá ter um nome e cpf, ambos String;
- Deverá ter um construtor com todos os atributos;
- Deverá ter apenas métodos gets;
##### Conta corrente
- Deverá herdar de conta;
- Deverá retirar do saldo 0,10 a cada saque;
- Não deverá permitir sacar um valor superior ao saldo;
##### Conta poupança
- Deverá herdar de conta;
- Não deverá permitir sacar um valor superior ao saldo;
##### Principal
- Deverá ter uma classe Principal que terá o método main;
- Deverá instanciar um objeto conta corrente;
- Deverá instanciar um objeto conta poupança;
- Deverá exibir todas as informações de todos os atributos de conta corrente e poupança;
 

| Nota/Valor | Descrição dos critérios |
|---------|:---------------:
| 3,50 / 3,50 | Nota final ✅
