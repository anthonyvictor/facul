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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, int agencia, Cliente cli) {
        super(numero, agencia, cli);
    }

    @Override
    public void sacar(double valor) throws SaqueMaiorQueValorEmContaException {
        if(super.getSaldo() >= valor){
            System.out.println("O valor R$ " + valor + " foi sacado");
        }else{
            throw new SaqueMaiorQueValorEmContaException();
        }  
    }
    
    @Override
    public String toString(){
        return "Conta poupança \n" + super.toString();
    }
    
}
