/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import exceptions.SaqueMaiorQueValorEmContaException;
import java.util.Scanner;

/**
 *
 * @author Thonny
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int agencia, Cliente cli) {
        super(numero, agencia, cli);
    }

    @Override
    public void sacar(double valor) throws SaqueMaiorQueValorEmContaException {
            if(super.getSaldo() >= valor + 0.10){
                System.out.println("Atenção! Para cada saque, será descontada uma taxa de R$ 0,10, deseja continuar? 1 Para Sim, 0 Para Não.");
                Scanner continuar = new Scanner(System.in);
                if(continuar.nextInt() == 1){
                    System.out.println("O valor R$ " + valor + " foi sacado, sob uma taxa de R$ 0,10");
                    super.saldo = getSaldo() - (valor + 0.10);
                }
            }else{
                throw new SaqueMaiorQueValorEmContaException();
            }    
        
    }
    
    @Override
    public String toString(){
        return "Conta corrente \n" + super.toString();
    }
    
}
