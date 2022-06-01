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
public class cliente {

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    private String nome;
    private String cpf;
    
    
    public cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
}
