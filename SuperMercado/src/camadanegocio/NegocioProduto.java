/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadanegocio;

import classesbasicas.Produto;

/**
 *
 * @author Mateus
 */
public class NegocioProduto {

    public void cadastrarProduto(Produto p) throws Exception {
        if (p.getNome().isEmpty()) {
            throw new Exception ("Informar o nome do produto.");
        }
    }
    
    public void removerProduto (Produto p) throws Exception {
        
    }
}
