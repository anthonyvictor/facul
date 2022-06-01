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
public class contaCorrente extends conta {

    public contaCorrente(int numero, int agencia, cliente cli) {
        super(numero, agencia, cli);
    }

    @Override
    public void sacar(double valor) {
        //se o saldo da conta for maior ou igual ao valor que
        //iremos sacar + 10 centavos (taxa), então, libera o saque
        System.out.println("Atenção! Para cada saque, será descontada uma taxa de R$ 0,10, deseja continuar? 1 Para Sim, 0 Para Não.");
        Scanner continuar = new Scanner(System.in);
       if(continuar.nextInt() == 1){
            if(super.getSaldo() >= valor + 0.10){
                System.out.println("O valor R$ " + valor + " foi sacado, sob uma taxa de R$ 0,10");
                super.saldo = getSaldo() - (valor + 0.10);
            }    
        }
        
    }
    
}
