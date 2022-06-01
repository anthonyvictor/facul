/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.mycompany.atv1;

import java.util.Scanner;

/**
 *
 * @author Thonny
 */
public class principal {
    
    public boolean autorizar(int entrada){
        if(entrada > 0){
            return true;
        }else{
            System.out.println("Digite um valor maior que zero!");
            return false;
        }
    }
    
    public static void main(String args[]){
        contaCorrente cc;
        contaPoupanca cp;
        
        
        Scanner _numCC =  new Scanner(System.in);
        Scanner _agCC = new Scanner(System.in);
        Scanner _cpfCliCC = new Scanner(System.in);
        Scanner _nomeCliCC = new Scanner(System.in);
       
        System.out.println("Primeiro, iremos cadastrar uma conta-corrente!");
        
        int numCC;             
        do{
            System.out.println("Digite o número da conta: (Obs: Necessário ser maior que zero)");
            numCC = _numCC.nextInt();
        }while(numCC <= 0);
        
        int agCC;   
        do{
            System.out.println("Informe o número da agência: (Obs: Necessário ser maior que zero)");
            agCC = _agCC.nextInt();
        }while(agCC <= 0);
        
        System.out.println("Informe o CPF do cliente:");
        String cpfCliCC = _cpfCliCC.next();
        
        System.out.println("Informe o nome do cliente:");
        String nomeCliCC = _nomeCliCC.next();
                
        cliente cliCC = new cliente(cpfCliCC, nomeCliCC);
                
        cc = new contaCorrente(numCC, agCC, cliCC);
        
        
        System.out.println("");
        
        
        Scanner _numCP =  new Scanner(System.in);
        Scanner _agCP = new Scanner(System.in);
        Scanner _cpfCliCP = new Scanner(System.in);
        Scanner _nomeCliCP = new Scanner(System.in);
        
        System.out.println("Agora, vamos cadastrar uma conta poupança!");
        
        int numCP;
        do{
        System.out.println("Digite o número da conta: (Obs: Necessário ser maior que zero)");
        numCP = _numCP.nextInt();
        }while(numCP <= 0);
            
        int agCP;
        do{
        System.out.println("Informe o número da agência: (Obs: Necessário ser maior que zero)");
        agCP = _agCP.nextInt();
        }while(agCP <= 0);
        
        System.out.println("Informe o CPF do cliente:");
        String cpfCliCP = _cpfCliCP.next();
        
        System.out.println("Informe o nome do cliente:");
        String nomeCliCP = _nomeCliCP.next();
                
        cliente cliCP = new cliente(cpfCliCP, nomeCliCP);
                
        cp = new contaPoupanca(numCP, agCP, cliCP);
        
        System.out.println("");
        
        System.out.println("Conta Corrente nº " + cc.getNumero());
        System.out.println("Agência: " + cc.getAgencia());
        System.out.println("Cliente: " + cc.getCli().getNome());
        System.out.println("CPF: " + cc.getCli().getCpf());
        System.out.println("Saldo na conta: R$ " + cc.getSaldo());
        
        System.out.println("");
        
        System.out.println("Conta Poupança nº " + cp.getNumero());
        System.out.println("Agência: " + cp.getAgencia());
        System.out.println("Cliente: " + cp.getCli().getNome());
        System.out.println("CPF: " + cp.getCli().getCpf());
        System.out.println("Saldo na conta: R$ " + cp.getSaldo());
        
        System.out.println("");        
        System.out.print("Digite o valor à ser depositado na conta-corrente:");
        Scanner _valorD = new Scanner(System.in);
        cc.depositar(_valorD.nextDouble());
        
        System.out.println("");        
        System.out.print("Digite o valor à ser sacado da conta-corrente:");
        Scanner _valorS = new Scanner(System.in);
        cc.sacar(_valorS.nextDouble());
                            
        Scanner wait = new Scanner(System.in);
        wait.nextInt();
    }
    
 }
