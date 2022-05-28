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
public class Menu {
    
    public Menu(){
        inicio();
    }
    
    private void inicio() {
        Auxl.p("\nMenu Principal:");
        Auxl.p("1 - Cadastro de produtos\n" +
            "2 - Movimentação\n" +
            "3 - Reajuste de preços\n" +
            "4 - Relatórios\n" +
            "0 - Finalizar");

        switch (Auxl.si()) {
            case 1:
                Cadastro cd = new Cadastro();
                break;
            case 2:
                Movimentacao mv = new Movimentacao();
                break;
            case 3:
                Reajuste rj = new Reajuste();
                break;
            case 4:
                Relatorios rl = new Relatorios();
            case 0:
                Auxl.p("Finalizando o sistema...");
                System.exit(0);
                break;
            default:
                Auxl.p("\nOpção incorreta!! Digite uma das opções disponíveis:\n");
                inicio();
                break;

        }
    }
}
