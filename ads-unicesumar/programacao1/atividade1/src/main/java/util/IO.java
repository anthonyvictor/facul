/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import exceptions.MaxCaracteresException;
import exceptions.MinCaracteresException;
import exceptions.ValorInferiorAoValorMinimoException;
import exceptions.ValorSuperiorAoValorMaximoException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Thonny
 */
public abstract class IO {
    
    public static int scanInt(String msg, int min, int max){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            int resp = sc.nextInt();
            
            if(resp < min) throw new ValorInferiorAoValorMinimoException();
            if(max > -1 && resp > max) throw new ValorSuperiorAoValorMaximoException();
            
            return resp;
        }catch(InputMismatchException err){
            System.out.println("Insira um número válido!");
            return scanInt(msg, min, max);
        }catch(ValorInferiorAoValorMinimoException err){
            System.out.println("Valor inferior a " +  min);
            return scanInt(msg, min, max);
        }catch(ValorSuperiorAoValorMaximoException err){
            System.out.println("Valor superior a " +  max);
            return scanInt(msg, min, max);
        }
    }
    
    public static double scanFloat(String msg, double min, double max){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            double resp = sc.nextFloat();
            
            if(resp < min) throw new ValorInferiorAoValorMinimoException();
            if(max > -1 && resp > max) throw new ValorSuperiorAoValorMaximoException();
            
            return resp;
        }catch(InputMismatchException err){
            System.out.println("Insira um número válido!");
            return scanFloat(msg, min, max);
        }catch(ValorInferiorAoValorMinimoException err){
            System.out.println("Valor inferior a " +  min);
            return scanFloat(msg, min, max);
        }catch(ValorSuperiorAoValorMaximoException err){
            System.out.println("Valor superior a " +  max);
            return scanFloat(msg, min, max);
        }
    }
    
    
    public static String scanStr(String msg, int minCaracteres, int maxCaracteres, boolean somenteNumeros){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            String resp = sc.next().trim();
            
            if(somenteNumeros) resp = resp.replaceAll("[^0-9]", "");
            
            if(resp.length() < minCaracteres) throw new MinCaracteresException();
            if(resp.length() > maxCaracteres) throw new MaxCaracteresException();
            
            return resp;
        }catch(MinCaracteresException err){
            System.out.println("\nO valor digitado deve ter no mínimo " + minCaracteres + " caracteres!\n");
            return scanStr(msg, minCaracteres, maxCaracteres, somenteNumeros);
        }catch(MaxCaracteresException err){
            System.out.println("\nNumero de caracteres excede o limite máximo! (max: " + maxCaracteres + ")\n");
            return scanStr(msg, minCaracteres, maxCaracteres, somenteNumeros);
        }
    }
    
}
