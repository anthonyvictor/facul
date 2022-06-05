/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thonny
 */
public class Hospede {

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    private int codigo;
    private String nome;
    private String endereco;
    private int idade;
    
    
    public Hospede(){
        
    }
    
    public Hospede(int codigo, String nome, String endereco, int idade){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
     @Override
    public String toString(){
        return "cod." + codigo + ", Nome: " + nome + ", " + idade + " anos, endereço: " + endereco ;
    }
    
}
