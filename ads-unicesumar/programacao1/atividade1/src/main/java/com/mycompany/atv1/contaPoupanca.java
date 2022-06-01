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
public class contaPoupanca extends conta {

    public contaPoupanca(int numero, int agencia, cliente cli) {
        super(numero, agencia, cli);
    }

    @Override
    public void sacar(double valor) {
        if(super.getSaldo() >= valor){
            System.out.println("O valor R$ " + valor + " foi sacado");
        }    
    }
    
}
