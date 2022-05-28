package importsSystem;

import java.util.ArrayList;

/**
 *
 * @author Thonny
 */
public class Produto {

    public double getSaidas() {
        return saidas;
    }

    public double getEntradas() {
        return entradas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getPrecoRS() {
        return "R$ " + String.format("%3.2f", preco);
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    public double getQtd() {
        return qtd;
    }

    public String getQtdStr() {
        return qtd + " " + und;
    }

    public void setQtd(double qtd) {
        movimentar(qtd); //realiza toda a movimentação para cada instância desta classe
        this.qtd = qtd;
    }
    
    private void movimentar(double qtdFinal){
        double qtdAtual = this.qtd;
        if(qtdFinal > qtdAtual){
            //ENTRADA DE PRODUTO...
            entradas += qtdFinal - qtdAtual;
        }else{
            //SAIDA DE PRODUTO...
            saidas += qtdAtual - qtdFinal;
        }
    }
    
    public String getMovimentacao(){
        String e = "Nenhuma entrada.";
        String s = "Nenhuma saída.";
        if(entradas > 0){e = entradas + " entradas.";}
        if(saidas > 0){s = saidas + " saídas.";}
        return e + " | " + s;
    }

    private String nome;    //nome do produto
    private float preco; //preço unitário
    private String und; //unidade de medida
    private double qtd; //quantidade em estoque
    private double saidas;
    private double entradas;

    public Produto() {

    }

    public Produto(String nome, float preco, String und, double qtd) {
        this.nome = nome;
        this.preco = preco;
        this.und = und;
        this.qtd = qtd;
        this.entradas = qtd;
        this.saidas = 0;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + "\nPreço: " + this.getPrecoRS()
                + "\nUnidade de medida: " + this.und
                + "\nQuantidade em estoque: " + this.getQtdStr();
    }
}
