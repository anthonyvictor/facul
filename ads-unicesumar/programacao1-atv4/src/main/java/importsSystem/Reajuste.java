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
public class Reajuste {

    public Reajuste() {
        inicio();
    }
    
    private float getPrecoNovo(Produto prod, float porc, int tipoReajuste){
        float precoAntigo = prod.getPreco();
                float reajuste = prod.getPreco() * (porc / 100);
                float precoNovo;
                if (tipoReajuste == 1){
                    precoNovo = precoAntigo + reajuste;
                }else{
                    precoNovo = precoAntigo - reajuste;
                }
                return precoNovo;
    }

    private void inicio() {
        boolean produtoEncontrado = false;
        Auxl.p("\nReajuste de preços:");
        Auxl.p("Digite o nome do produto que deseja realizar o reajuste percentual de preço:");
        String nome = Auxl.s();
        for (int i = 0; i < Principal.lista.size(); i++) {
            Produto prod = Principal.lista.get(i);
            if (prod.getNome().equals(nome)) {
                Auxl.p("\nProduto encontrado!\n");
                Auxl.p(prod.toString());
                produtoEncontrado = true;
                int tipoReajuste = 0;
                boolean validaTipo, validaReducao, validaPrecoNovo;
                float precoNovo = 0;
                String precoNovoRS = "";
                do {
                    Auxl.p("O reajuste será de 1: AUMENTO ou 2: REDUÇÃO? Responda somente com 1 ou 2 no teclado:");
                    tipoReajuste = Auxl.si();
                    validaTipo = tipoReajuste == 1 || tipoReajuste == 2;
                    if(!validaTipo){Auxl.p("\nResposta inválida!");}
                }while (validaTipo = false);
                
                float porc = 0;
                do {
                    Auxl.p("\nDigite a porcentagem do reajuste deste produto (Somente números e vírgula)");
                    Auxl.p("EX: 10,5 (Corresponde à 10,5% de reajuste.)");
                    porc = Auxl.sf();
                    
                    validaReducao = tipoReajuste == 1 || (tipoReajuste == 2 && porc < 100);
                    if(!validaReducao){Auxl.p("\nReajuste de redução deve ser menor que 100%!");}
                    
                    precoNovo = getPrecoNovo(prod, porc, tipoReajuste);
                    precoNovoRS = "R$ " + String.format("%3.2f", precoNovo);
                    
                    validaPrecoNovo = precoNovo > 0.1;
                    if(!validaPrecoNovo){Auxl.p("\nPreço final do produto deve ser maior que zero!");}
                    
                } while (!validaPorcentagem(porc) || !validaReducao || !validaPrecoNovo);
                 

                Auxl.p("\nO preço atual é: " + prod.getPrecoRS());
                Auxl.p("O novo preço será: " + precoNovoRS);

                Auxl.p("\nPara confirmar o reajuste do preço deste produto" + Auxl.UM + "cancelar:");
                if (Auxl.si() == 1) {
                    prod.setPreco(precoNovo);
                    Auxl.p("\nReajuste efetuado com sucesso!\n");
                    Auxl.p("Novos dados:");
                    Auxl.p(prod.toString());
                } else {
                    Auxl.p("\nReajuste cancelado!\n");
                }

                Auxl.p("Se desejar repetir a operação" + Auxl.UM + "voltar:");
                if (Auxl.si() == 1) {
                    inicio();
                } else {
                    Menu m = new Menu();
                }
                break;
            }
        }
        if(!produtoEncontrado){
            Auxl.p("\nProduto não encontrado!");
            Menu m = new Menu();
        }
    }

    
    
    private boolean validaPorcentagem(float porc) {
        if (porc <= 0) {
            Auxl.p("O valor do reajuste deve ser maior que zero!");
            return false;
        } else {
            return true;
        }
    }
}
