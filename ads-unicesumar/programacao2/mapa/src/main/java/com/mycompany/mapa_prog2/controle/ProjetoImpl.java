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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProjetoImpl implements ProjetoDAO {

    //Collection que irá armazenar todos os projetos
    private static Set<Projeto> projetos = new HashSet<>();

    @Override
    public void adicionar(Projeto projeto) throws DadoDuplicadoException {
        Projeto p = procurar(projeto);
        if (p == null) {
            projetos.add(projeto);
        } else {
            throw new DadoDuplicadoException();
        }
    }

    @Override
    public List<Projeto> listar() {
        ArrayList<Projeto> lista = new ArrayList<Projeto>(projetos);
        return lista;
    }

    @Override
    public Projeto consultarPorNome(String nome) throws DadoConsultadoException {
        Projeto p = procurar(nome);
        if (p == null) {
            throw new DadoConsultadoException();
        } else {
            return p;
        }
    }

    @Override
    public Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException {
        Projeto p = procurar(nome);
        if (p == null) {
            throw new DadoConsultadoException();
        } else {
            Projeto projetoNovo = new Projeto();
            projetoNovo.substituir(projeto);
            projetos.remove(p);
            projetos.add(projetoNovo);
            return p;
        }
    }

    @Override
    public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
        Projeto p = procurar(projeto);
        if (p == null) {
            throw new DadoConsultadoException();
        } else {
            projetos.remove(p);
        }
    }

    @Override
    public void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException {
        Projeto p = procurar(nome);
        if (p == null) {
            throw new DadoConsultadoException();
        } else {
            projetos.remove(p);
        }
    }

    private Projeto procurar(Projeto procurado) {
        for (Projeto i : projetos) {
            if (i.equals(procurado)) {
                return i;
            }
        }
        return null;
    }

    private Projeto procurar(String nome) {
        for (Projeto i : projetos) {
            if (i.getNome().equals(nome)) {
                return i;
            }
        }
        return null;
    }
}
