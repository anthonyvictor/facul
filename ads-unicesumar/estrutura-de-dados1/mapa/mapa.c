#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <locale.h>
#include <string.h>

#define tam 5

char Lixo1[10];
char Lixo2[4];

typedef struct Atividade{
	int RaAluno;
	char Arquivo[10];
	char Extensao[4];
	int MatProfessor;
	}Atividade;
	
	
Atividade Lista[tam];

void Listar(){
		int i;
	for(i=0;i<tam;i++){
		if(Lista[i].RaAluno != 0){
			printf("\n\nRa: %d",Lista[i].RaAluno);
			printf("\nArquivo: %s",Lista[i].Arquivo);
			printf("\nExtensão: %s",Lista[i].Extensao);
			printf("\nMatrícula Professor: %d",Lista[i].MatProfessor);
		}
		
	}
	}

int ChecarPos(){
	int ret = tam;
	int i;
	for(i=0;i<tam;i++){
		if(Lista[i].RaAluno == 0){
			ret = i;
			break;
		}
	}
	return ret;
}

void Inserir(){
	
	int i = ChecarPos();
	if(i<tam){
		printf("\n\nInsira os dados da atividade:");
		printf("\nRa do aluno:");
		scanf("%d", &Lista[i].RaAluno);
		printf("\nNome do arquivo:");
		scanf("%s", &Lista[i].Arquivo);
		printf("\nExtensão do arquivo:");
		scanf("%s", &Lista[i].Extensao);
		printf("\nMatrícula do professor:");
		scanf("%d", &Lista[i].MatProfessor);
		printf("\n\nAtividade inserida na fila com sucesso!");
	}else{
		printf("\n\nLista cheia!");
	}

}

void Remover(){
	int i;
	for(i=0;i<tam;i++){
		if(i+1<tam){
			Lista[i].RaAluno = Lista[i+1].RaAluno;
			strcpy(Lista[i].Arquivo, Lista[i+1].Arquivo);
			strcpy(Lista[i].Extensao, Lista[i+1].Extensao);
			Lista[i].MatProfessor = Lista[i+1].MatProfessor;
		}else{
			Lista[i].RaAluno=0;
			strcpy(Lista[i].Arquivo, Lixo1);
			strcpy(Lista[i].Extensao, Lixo2);
			Lista[i].MatProfessor=0;
		}
		
	}
}

void Esvaziar(){
	int i;
	for(i=0;i<tam;i++){
		Lista[i].RaAluno=0;
		strcpy(Lista[i].Arquivo, Lixo1);
		strcpy(Lista[i].Extensao, Lixo2);
		Lista[i].MatProfessor=0;
	}
	}

void Encerrar(){
	printf("Encerrando...");
	system("exit");
}

void Menu(){
	printf("\n\nMenu Principal.");
	Listar();
	
	printf("\n\n1: Inserir atividade na fila");
	printf("\n2: Remover atividade da fila");
	printf("\n3: Esvaziar fila");
	printf("\n4: Encerrar o programa\n");
	
	int Resp;
	scanf("%d", &Resp);
	switch(Resp){
		case 1:
			Inserir();
			Menu();
		break;
		case 2:
			Remover();
			Menu();
		break;
		case 3:
			Esvaziar();
			Menu();
		break;
		case 4:
			Encerrar();
		break;
		default:
			printf("Opção inválida!");
			Menu();
	}
}

int main(){
	setlocale(LC_ALL,"Portuguese");
	printf("Bem-Vindo ao sistema Unicesumar!");
	Menu();
}
