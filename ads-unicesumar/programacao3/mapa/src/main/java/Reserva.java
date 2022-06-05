
import exceptions.QuantidadeDePessoasException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thonny
 */
public class Reserva {
    
    private ArrayList<Hospede> hospedes = new ArrayList();
    private Suite suite = new Suite();
    private int quantidadePessoas = 0;
    private int quantidadeDias = 8;
    
    public Reserva(){
        
    }
    
    public Reserva(ArrayList<Hospede> hospedes, Suite suite, int quantidadeDias) 
            throws QuantidadeDePessoasException{
        
        this.hospedes = hospedes;
        this.suite = suite;
        this.quantidadePessoas = hospedes.size();
        this.quantidadeDias = quantidadeDias;
        
        if(!verificarCapacidade()){
            throw new QuantidadeDePessoasException();
        }
    }    
    
    public double aplicarDesconto(double valor){
        
        double resultado = valor;
        
        if(quantidadeDias > 7){
            resultado = valor * 0.9;
        }
        
        return resultado;
        
    };
    
    private boolean verificarCapacidade(){
        boolean resultado = true;
        
        int quantidadePessoasAcimaDe2Anos = 0;
        
        for(Hospede hospede : hospedes){
            if(hospede.getIdade() > 2){
                quantidadePessoasAcimaDe2Anos++;
            }
        }
        
        if(quantidadePessoasAcimaDe2Anos > suite.getCapacidade()){
            resultado = false;
        }
                
        return resultado;
    }
    
    public double calcularDiaria(){
        double resultado = 0;
        
        resultado = this.suite.getValorDiaria() * this.quantidadeDias;
        
        return aplicarDesconto(resultado);
    };
    
    @Override
    public String toString(){
        String resultado = "";
        String hospedesString = "";
        String suiteString = "";
        String qtdHospedesString = "";
        String qtdDiasString = "";
        String valorFinalString = "";
        
        suiteString = "\n" + suite.toString();
        
        for(Hospede hospede : hospedes){
            if("".equals(hospedesString)){
                hospedesString = "\nHospedes: \n" + hospede.toString();
            }else{
                hospedesString = hospedesString + "\n" + hospede.toString();
            }
        }
        
        qtdHospedesString = "\nQuantidade de hóspedes: " + hospedes.size();
        
        qtdDiasString = "\nDias reservados: " + quantidadeDias;
        
        String desconto = "";
        if(quantidadeDias > 7){desconto = " (10% de desconto)";}
        valorFinalString = "\nValor final da reserva: " + calcularDiaria() + desconto;
        
        resultado = suiteString + hospedesString + 
                qtdHospedesString + qtdDiasString + valorFinalString;
        
        return resultado;
    }
    
    
}
