/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importsSystem;

/**
 *
 * @author Thonny
 */
public class Relatorios {
    public Relatorios(){
        inicio();
    }
    
    private void inicio(){
        Auxl.p("\nRelatórios:");
        Auxl.p("1 - Lista de produtos\n2 - Saldo de movimentação\n0 - Retornar");

        switch (Auxl.si()) {
            case 1: //LISTA DE PROUDUTOS
                produtos();
                break;
            case 2: //SALDO DE MOVIMENTAÇÃO
                movimentacao();
                break;
            case 0: //RETORNAR
                Menu m = new Menu();
                break;
            default:
                Auxl.p("\nOpção incorreta!! Digite uma das opções disponíveis:\n");
                inicio();
                break;
        }
    }
    
    private void produtos(){
        if(!Principal.lista.isEmpty()){
            Auxl.p("\nLista de produtos cadastrados:");
            Principal.lista.forEach((x) -> Auxl.p(x.toString()));           
        }else{
            Auxl.p("\nA lista de produtos está vazia!\n");
        }
        inicio();
    }
    
    private void movimentacao(){
        Auxl.p("\nRelatório de movimentações de produtos:");
        double entradas = 0;
        double saidas = 0;
        int tipos = 0;
        for(int i = 0; i < Principal.lista.size(); i++){
            Produto prod = Principal.lista.get(i);
            Auxl.p(prod.toString());
            Auxl.p(prod.getMovimentacao());
            entradas += prod.getEntradas();
            saidas += prod.getSaidas();
            if(prod.getQtd() > 0){tipos += 1;}
        }
        
        Auxl.p("\n\nMovimentação geral totalizada:");
        Auxl.p("Entradas: " + entradas);
        Auxl.p("Saídas: "+ saidas);
        Auxl.p("Total de produtos cadastrados: " + Principal.lista.size());
        Auxl.p("Total de produtos em estoque: " + tipos);
        Auxl.p("Quantidades em estoque: " + Double.toString(entradas - saidas));
        inicio();
    }
}
