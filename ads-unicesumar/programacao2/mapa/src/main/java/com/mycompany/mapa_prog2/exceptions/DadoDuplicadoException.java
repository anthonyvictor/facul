/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapa_prog2.exceptions;

/**
 *
 * @author Thonny
 */
public class DadoDuplicadoException extends Exception {
    public DadoDuplicadoException(){
        super("Impossível cadastrar o projeto, pois há outro com o mesmo nome.");
    }
}
