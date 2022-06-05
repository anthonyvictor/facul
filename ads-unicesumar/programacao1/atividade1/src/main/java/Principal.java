/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import exceptions.SaqueMaiorQueValorEmContaException;
import util.IO;
import static util.IO.scanFloat;
import static util.IO.scanInt;
import static util.IO.scanStr;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thonny
 */
public class Principal {
    
    ArrayList<Conta> contas = new ArrayList<Conta>();
    
    public enum TipoConta {
        corrente,
        poupanca
    }
    public void cadastrarConta(TipoConta tipo, Cliente cliente){
        
        System.out.println("\n---------------------------------");
        System.out.println("Cadastro de conta " + tipo.name());
        System.out.println("---------------------------------");
        
        int numero, agencia;
        
        
        numero = scanInt("Digite o número da conta:", 1, -1);
        agencia = scanInt("Digite o número da agência:", 1, -1);
        
        Conta novaConta = null;
        if(tipo == TipoConta.poupanca){
            novaConta = new ContaPoupanca(numero, agencia, cliente);
        }else if(tipo == TipoConta.corrente){
            novaConta = new ContaCorrente(numero, agencia, cliente);
        }
        
        System.out.println("\n---------------------------------");
        System.out.println("Conta cadastrada com sucesso!");
        System.out.println(novaConta.toString());
        System.out.println("---------------------------------");
        
        contas.add(novaConta);
    }
    
    public static void main(String args[]){
        
        String cpf, nome;
        cpf = scanStr("Digite o CPF do cliente", 11, 11, true);
        nome = scanStr("Digite o nome do cliente:", 1, 40, false);
        
        Cliente cliente = new Cliente(cpf, nome);
        
        Principal p = new Principal();
        
        p.cadastrarConta(TipoConta.poupanca, cliente);
        p.cadastrarConta(TipoConta.corrente, cliente);
        
        p.menu();
    }
    
    public void menu(){

        int opcao = scanInt("\n -- MENU --\n"
                + "\n1. Depositar"
                + "\n2. Sacar"
                + "\n3. Listar"
                + "\n0. Encerrar sistema", 0, 3);
        
        switch(opcao){
            case 1:
                depositar();
                menu();
                break;
            case 2:
                sacar();
                menu();
                break;
            case 3:
                listar();
                menu();
                break;
            case 0:
                sair();
                break;
            default:
                System.out.println("Opção inválida!");
                menu();
        }
    }
    
    public void depositar(){
        System.out.println("\n-- DEPÓSITO --\n");
        
        double valor = scanFloat("Digite o valor do depósito:", .1, -1);
        
        String opcoes = "";
        
        for(int i = 1; i <= contas.size(); i++){
            if(opcoes == ""){
                opcoes += "\n" + i + ". " + contas.get(i - 1).toString();
            }else{
                opcoes += "\n\n" + i + ". " + contas.get(i - 1).toString();
            }
        }
        
        
        int opcao = scanInt("Selecione a conta:" + opcoes, 1, 2);
        
        contas.get(opcao - 1).depositar(valor);
    }
    
    public void sacar(){
        try{
            System.out.println("\n-- SAQUE --\n");
        
            for(int i = 0; i < contas.size(); i++){
                System.out.println("\n" + contas.get(i).toString());
            }
        
            double valor = scanFloat("\nDigite o valor do saque:", .1, -1);
        
            int opcao = scanInt("Selecione a conta (1-" + contas.size() + ")" , 1, 2);
        
            contas.get(opcao - 1).sacar(valor);
        }catch(SaqueMaiorQueValorEmContaException err){
            System.out.println(err.getMessage());
        }
    }
    
    public void listar(){
        System.out.println("\n-- LISTA --\n");
        
        for(int i = 0; i < contas.size(); i++){
            System.out.println("\n" + contas.get(i).toString());
        }
        
    }
    public void sair(){
        System.out.println("\n-- ENCERRANDO --\n");
        System.exit(0);
    }
    
 }
