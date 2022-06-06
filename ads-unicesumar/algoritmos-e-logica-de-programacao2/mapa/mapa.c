#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<locale.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

typedef struct cliente {
      int cod;
      char nome[35], telefone[11], email[50];
}cliente;

cliente lista[4];
int count = 0;

void inserir() {
     if (count < 5) 
	 {
        printf("\nDigite nome, telefone e e-mail do cliente respectivamente (um item por linha) \n");
        char _nome[35], _telefone[11], _email[50];
        
        scanf("%s", &_nome);
        fflush(stdin);
        scanf("%s", &_telefone);
        fflush(stdin);
        scanf("%s", &_email);
        fflush(stdin);
        
        
        lista[count].cod = count + 1;
        strcpy(lista[count].nome, _nome);
        strcpy(lista[count].telefone, _telefone);
        strcpy(lista[count].email, _email);
        count = count + 1;
        printf("\nCliente cadastrado com sucesso!\n");
     }
	 else 
	 {
	  	printf("\nLista lotada! Impossível inserir mais um registro.\n");
	 }
     menu();
} 


void listar(){
    if(count > 0){
    	printf("\\nLista de clientes:\n");
    	int i;
    	for(i = 0; i < count; i++){
        	printf("\niD: %d, Nome: %s\nTelefone: %s\nE-mail: %s \n", &lista[i].cod, &lista[i].nome, &lista[i].telefone, &lista[i].email);
    	}
 	}else{
		printf("\nLista vazia!\n");
    }
   menu();
}

void menu() {
 	int opcao = -1;
    printf("\nDigite o número correspondente à opção desejada:\n");
    printf("1: - Inserir novo cliente.\n");
    printf("2: - Mostrar lista de clientes.\n");
    printf("0: - Encerrar. \n");
    scanf("%d", &opcao);
    fflush(stdin);
    switch (opcao) {
      case 1:
          inserir();
          break;
      case 2:
          listar();
          break;
      case 0:
          printf("\nEncerrando o programa...\n");
          exit(0);
          break;
      default:
          printf("\nOpção incorreta!\n");
          fflush(stdin);
          menu();
          break;
   } 
} 

int main(void) {
	setlocale(LC_ALL, "portuguese-brazilian");
	printf("Seja bem vindo ao sistema de cadastro\n");
	menu();
	
}
