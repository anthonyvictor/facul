/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atv1;

/**
 *
 * @author Thonny
 */
public abstract class conta {

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

    public cliente getCli() {
        return cli;
    }

    public void setCli(cliente cli) {
        this.cli = cli;
    }

    public double getSaldo() {
        return saldo;
    }
        
     private int numero;
     private int agencia;
     private cliente cli;
     protected double saldo;

     public conta(int numero, int agencia, cliente cli){
         this.saldo = 0;
         setNumero(numero);
         setAgencia(agencia);
         setCli(cli);
         
     }
     
     public abstract void sacar(double valor);
            
     public void depositar(double valor){
         this.saldo = saldo + valor;
     }

}
