/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Thonny
 */
public abstract class Ferramentas {
    
    public static int scanInt(String pergunta){
        System.out.println("\n" + pergunta);
        
        int resultado;
        
        try{
            Scanner sc = new Scanner(System.in);
            int resposta = sc.nextInt();
            resultado = resposta;
            
        }catch(Exception err){
            System.out.println("Erro! Digite um número válido!");
            resultado = scanInt(pergunta);
        }
        
        return resultado;
    }
    
}
