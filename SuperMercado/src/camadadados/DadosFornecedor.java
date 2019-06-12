/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadadados;
//JPA
import classesbasicas.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import classesbasicas.Funcionario;
import classesbasicas.Produto;
import conexao.Conexao;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class DadosFornecedor extends Conexao {

    
    public void CadastrarFornecedor (Funcionario f) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO fornecedor (CNPJ_FOR, NOME_FOR, TELEFONE_FOR, EMAIL_FOR, ENDERECO_FOR) VALUES (? , ? ,? ,? ) ");

            stmt.setString(1, f.getCpf());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getEndereco());
            stmt.setString(4, f.getEmail());
            stmt.setString(5, f.getTelefone());
            stmt.setString(6, f.getCdCargo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public void RemoverFornecedor (Funcionario f) {

        Connection con = DadosProduto.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE Cd_pessoa = ?");
            stmt.setString(1, f.getCpf());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            DadosProduto.closeConnection(con, stmt);
        }

    }

    /*public void atualizarFornecedor(Fornecedor f) throws SQLException, Exception {
        //ERRO
        String sql = "UPDATE Fornecedor SET NOME_FOR = ?,"
                + "TELEFONE_FOR = ?,EMAIL_FOR = ?, ENDERECO_FOR = ? WHERE CNPJ_FOR = ?";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, f.getCnpj());
        preparedStatement.setString(2, f.getNome());
        preparedStatement.setString(3, f.getTelefone());
        preparedStatement.setString(4, f.getEmail());
        preparedStatement.setString(5, f.getEndereco());
        preparedStatement.executeUpdate();
        super.desconectar();
    }*/
    
    public void AtualizarFornecedor(Produto p) {

        Connection con = DadosProduto.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET Nom_Produto = ? ,Qtd_Produto = ?,Val_Produto = ? WHERE Cod_Produto = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getValor());
            stmt.setInt(4, p.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            DadosProduto.closeConnection(con, stmt);
        }
    }

    public void CadastrarFornecedor(Fornecedor f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
