/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapa_prog2.controle;

/**
 *
 * @author Thonny
 */
import com.mycompany.mapa_prog2.exceptions.DadoConsultadoException;
import com.mycompany.mapa_prog2.exceptions.DadoDuplicadoException;
import com.mycompany.mapa_prog2.modelo.Projeto;
import java.util.List;
public interface ProjetoDAO {
    void adicionar(Projeto projeto) throws DadoDuplicadoException;
    List<Projeto> listar();
    Projeto consultarPorNome(String nome) throws DadoConsultadoException;
    Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException;
    void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException;
    void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException;
}
