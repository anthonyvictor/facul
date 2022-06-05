/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Thonny
 */
public class SaqueMaiorQueValorEmContaException extends Exception {
    public SaqueMaiorQueValorEmContaException(){
        super("Valor do saque excede valor em conta!");
    }
}
