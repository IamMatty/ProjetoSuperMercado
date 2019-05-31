/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ItemVenda {

    private Produto prd = new Produto();
    private Venda vnd = new Venda();
    ArrayList<Produto> pro = new ArrayList<>();
    
    private int quantidade;
    private Float Preco;
    private Produto produto;
    private Venda vendas;

    /**
     * @return the prd
     */
    public Produto getPrd() {
        return prd;
    }

    /**
     * @param prd the prd to set
     */
    public void setPrd(Produto prd) {
        this.prd = prd;
    }

    /**
     * @return the vnd
     */
    public Venda getVnd() {
        return vnd;
    }

    /**
     * @param vnd the vnd to set
     */
    public void setVnd(Venda vnd) {
        this.vnd = vnd;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the Preco
     */
    public Float getPreco() {
        return Preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(Float Preco) {
        this.Preco = Preco;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the vendas
     */
    public Venda getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(Venda vendas) {
        this.vendas = vendas;
    }

}
