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
public class Cadastro {
    
    public Cadastro() {
        inicio();
    }
    
    private void inicio(){
        Auxl.p("\nCadastro de produtos:");
        Auxl.p("1 - Inclusão\n2 - Alteração\n"
                + "3 - Consulta\n4 - Exclusão\n0 - Retornar");

        switch (Auxl.si()) {
            case 1: //INSERIR NOVO
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                consultar();
                break;
            case 4:
                excluir();
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
    
     public void inserir() {
        Produto p = readProduto(true);
        Auxl.p("Para confirmar a criação deste produto" + Auxl.UM + "cancelar:");
        if (Auxl.si() == 1) {
            Principal.lista.add(p);
            Auxl.p("\nProduto criado com sucesso!\n");
        } else {
            Auxl.p("\nCriação de produto cancelada!\n");
        }

        Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
        if (Auxl.si() == 1) {
            inserir();
        } else {
            inicio();
        }

    }

    public void alterar() {
        if (!Principal.lista.isEmpty()) {
            Auxl.p("Digite o nome do produto que deseja alterar:");
            Auxl.p("(Obs* Não será possível alterar o nome de um produto.)");
            String nome = Auxl.s();
            for (int i = 0; i < Principal.lista.size(); i++) {
                Produto prodAntigo = Principal.lista.get(i);
                if (prodAntigo.getNome().equals(nome)) {
                    Auxl.p("\nProduto Encontrado!\n");
                    Auxl.p(prodAntigo.toString() + "\n");
                    Produto prodNovo = readProduto(false);
                    prodNovo.setNome(prodAntigo.getNome());
                    Auxl.p("Para confirmar a alteração deste produto" + Auxl.UM + "cancelar:");
                    if (Auxl.si() == 1) {
                        Principal.lista.set(Principal.lista.indexOf(prodAntigo), prodNovo);
                        Auxl.p("\nAlteração efetuada com sucesso!\n");
                        Auxl.p("Novos dados:");
                        Auxl.p(prodNovo.toString());
                    } else {
                        Auxl.p("\nAlteração cancelada!\n");
                    }

                    Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
                    if (Auxl.si() == 1) {
                        alterar();
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
    
    public void consultar(){
        if (!Principal.lista.isEmpty()) {
            Auxl.p("Digite o nome do produto que deseja consultar:");
            String nome = Auxl.s();
            for (int i = 0; i < Principal.lista.size(); i++) {
                Produto prod = Principal.lista.get(i);
                if (prod.getNome().equals(nome)) {
                    Auxl.p("\nProduto Encontrado!\n");
                    Auxl.p(prod.toString() + "\n");
                    
                    Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
                    if (Auxl.si() == 1) {
                        consultar();
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
    
    public void excluir(){
        if (!Principal.lista.isEmpty()) {
            Auxl.p("Digite o nome do produto que deseja excluir:");
            String nome = Auxl.s();
            for (int i = 0; i < Principal.lista.size(); i++) {
                Produto prod = Principal.lista.get(i);
                if (prod.getNome().equals(nome)) {
                    Auxl.p("\nProduto Encontrado!\n");
                    Auxl.p(prod.toString() + "\n");
                    Auxl.p("Para confirmar a exclusão deste produto" + Auxl.UM + "cancelar:");
                    if (Auxl.si() == 1) {
                        Principal.lista.remove(prod);
                        Auxl.p("\nExclusão efetuada com sucesso!\n");
                    } else {
                        Auxl.p("\nExclusão cancelada!\n");
                    }

                    Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
                    if (Auxl.si() == 1) {
                        excluir();
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
    
    private boolean validaNome(String nome) {
        for (int i = 0; i < Principal.lista.size(); i++) {
            if (Principal.lista.get(i).getNome().equals(nome)) {
                Auxl.p("Este nome já se encontra na lista!");
                return false;
            }
        }
        return true;
    }

    private boolean validaPreco(float preco) {
        if (preco <= 0) {
            Auxl.p("O preço deve ser maior que zero!");
            return false;
        } else {
            return true;
        }
    }

    private boolean validaQtd(double qtd) {
        if (qtd < 0) {
            Auxl.p("A quantidade em estoque deve ser maior ou igual a zero!");
            return false;
        } else {
            return true;
        }
    }

    private Produto readProduto(boolean lerNome) {
        String nome = "";
        if (lerNome) {
            do {
                Auxl.p("Insira o nome do produto:");
                nome = Auxl.s();
            } while (validaNome(nome) == false);
        }

        float preco;
        do {
            Auxl.p("Insira o preço do produto (somente números e vírgula)");
            preco = Auxl.sf();
        } while (validaPreco(preco) == false);

        double qtd;
        do {
            Auxl.p("Insira a quantidade atual deste produto no estoque");
            qtd = Auxl.sd();
        } while (validaQtd(qtd) == false);

        Auxl.p("Insira a unidade de medida (kg, und, ml, cm)");
        String und = Auxl.s();

        return new Produto(nome, preco, und, qtd);
    }
}
