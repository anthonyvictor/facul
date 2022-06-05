/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import exceptions.SaqueMaiorQueValorEmContaException;

/**
 *
 * @author Thonny
 */
public abstract class Conta {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public double getSaldo() {
        return saldo;
    }
        
     private int numero;
     private int agencia;
     private Cliente cli;
     protected double saldo;

     public Conta(int numero, int agencia, Cliente cli){
         this.saldo = 0;
         setNumero(numero);
         setAgencia(agencia);
         setCli(cli);
         
     }
     
     public abstract void sacar(double valor) throws SaqueMaiorQueValorEmContaException;
            
     public void depositar(double valor){
         this.saldo = saldo + valor;
         System.out.println("Depósito realizado com sucesso!");
     }
     
     @Override
     public String toString(){
         return "Número: " + this.getNumero() + 
                "\nAgência: " + this.getAgencia() + 
                "\nCliente: " + this.getCli().getNome() + 
                "\nCPF: " + this.getCli().getCpf() + 
                "\nSaldo em conta: R$ " + this.getSaldo();
     }

}
