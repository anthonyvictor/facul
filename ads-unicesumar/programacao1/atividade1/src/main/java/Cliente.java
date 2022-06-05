/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Thonny
 */
public class Cliente {

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    private String nome;
    private String cpf;
    
    
    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
}
