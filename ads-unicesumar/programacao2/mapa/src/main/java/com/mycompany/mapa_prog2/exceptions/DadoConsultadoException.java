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
public class DadoConsultadoException extends Exception {
    public DadoConsultadoException() {
        super("Item não encontrado.");
    }
}
