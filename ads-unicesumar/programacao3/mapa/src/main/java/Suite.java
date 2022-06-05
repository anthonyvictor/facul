/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thonny
 */

public class Suite {
    
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria; 
    }
    
    public Suite(int numero, String tipo, int capacidade, double valorDiaria){
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
        
    }
    
    public Suite(){
        
    }
    
    @Override
    public String toString(){
        return "Suite " + tipo + " nº " + numero + " (até " + capacidade + " hóspedes) diária: R$ " + valorDiaria;
    }
   
    
}
