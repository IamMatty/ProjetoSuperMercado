/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;


import camadadados.DadosProduto;
import classesbasicas.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TesteConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Produto p = new Produto();
            p.setNome("Feijão");
            p.setValor(5.50);
          
            DadosProduto dp = new DadosProduto();
            dp.cadastrarProduto(p);
            JOptionPane.showMessageDialog(null, "Cadastrou");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

}
