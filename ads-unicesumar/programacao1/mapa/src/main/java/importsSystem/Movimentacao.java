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
public class Movimentacao {

    public Movimentacao() {
        inicio();
    }

    private void inicio() {
        Auxl.p("\nMovimentação de produtos:");
        Auxl.p("1 - Entrada\n2 - Saída\n0 - Retornar");

        switch (Auxl.si()) {
            case 1: //INSERIR NOVO
                entrada();
                break;
            case 2:
                saida();
                break;
            case 0:
                Menu m = new Menu();
                break;
            default:
                Auxl.p("\nOpção incorreta!! Digite uma das opções disponíveis:\n");
                inicio();
                break;
        }
    }

    private void entrada() {
        if (!Principal.lista.isEmpty()) {
            Auxl.p("Digite o nome do produto que está entrando no estoque:");
            String nome = Auxl.s();
            for (int i = 0; i < Principal.lista.size(); i++) {
                Produto prod = Principal.lista.get(i);
                if (prod.getNome().equals(nome)) {
                    Auxl.p("\nProduto Encontrado!\n");
                    Auxl.p(prod.toString() + "\n");

                    double qtd;
                    do {
                        Auxl.p("Insira a quantidade à inserir no estoque:");
                        qtd = Auxl.sd();
                    } while (validaEntrada(qtd) == false);

                    double novaQtd = prod.getQtd() + qtd;
                    Auxl.p("Quantidade atual: " + prod.getQtd());
                    Auxl.p("Nova quantidade: " + novaQtd);

                    Auxl.p("Para confirmar a entrada deste produto" + Auxl.UM + "cancelar:");
                    if (Auxl.si() == 1) {                                                   
                        prod.setQtd(novaQtd);
                        Auxl.p("\nInserção efetuada com sucesso!\n");
                    } else {
                        Auxl.p("\nInserção cancelada!\n");
                    }

                    Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
                    if (Auxl.si() == 1) {
                        entrada();
                    } else {
                        inicio();
                    }
                }
            }
            Auxl.p("\nProduto não localizado!\n");
            inicio();
        } else {
            Auxl.p("\nA lista de produtos está vazia!\n");
            inicio();
        }
    }

    private void saida() {
        if (!Principal.lista.isEmpty()) {
            Auxl.p("Digite o nome do produto que está saindo do estoque:");
            String nome = Auxl.s();
            for (int i = 0; i < Principal.lista.size(); i++) {
                Produto prod = Principal.lista.get(i);
                if (prod.getNome().equals(nome)) {
                    Auxl.p("\nProduto Encontrado!\n");
                    Auxl.p(prod.toString() + "\n");

                    double qtd;
                    do {
                        Auxl.p("Insira a quantidade que estará saindo do estoque:");
                        qtd = Auxl.sd();
                    } while (validaSaida(qtd, prod.getQtd()) == false);

                    double novaQtd = prod.getQtd() - qtd;
                    Auxl.p("Quantidade atual: " + prod.getQtd());
                    Auxl.p("Nova quantidade: " + novaQtd);

                    Auxl.p("Para confirmar a saída deste produto" + Auxl.UM + "cancelar:");
                    if (Auxl.si() == 1) {
                        prod.setQtd(novaQtd);
                        Auxl.p("\nSaída efetuada com sucesso!\n");
                    } else {
                        Auxl.p("\nSaída cancelada!\n");
                    }

                    Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
                    if (Auxl.si() == 1) {
                        saida();
                    } else {
                        inicio();
                    }
                }
            }
            Auxl.p("\nProduto não localizado!\n");
            inicio();
        } else {
            Auxl.p("\nA lista de produtos está vazia!\n");
            inicio();
        }
    }

    private boolean validaEntrada(double qtd) {
        if (qtd < 1) {
            Auxl.p("A quantidade deve ser maior que zero!");
            return false;
        } else {
            return true;
        }
    }

    private boolean validaSaida(double qtd, double qtdAtual) {
        if (qtd < 1) {
            Auxl.p("A quantidade deve ser maior que zero!");
            return false;
        } else if (qtd > qtdAtual) {
            Auxl.p("Este produto não possui esta quantidade!");
            Auxl.p("Quantidade atual: " + qtdAtual);
            return false;
        } else {
            return true;
        }
    }
}
