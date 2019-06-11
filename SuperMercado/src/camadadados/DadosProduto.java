/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadadados;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import classesbasicas.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Mateus
 */
public class DadosProduto extends Conexao {

    /*public void cadastrarProduto(Produto p) throws SQLException, Exception {
        String sql = " INSERT INTO produto (NOME_PRO, VALOR_PRO) ";
        sql += " VALUES (?,?) ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, p.getNome());
        preparedStatement.setDouble(2, p.getValor());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public void removerProduto(Produto p) throws SQLException, Exception {
        String sql = " DELETE FROM produto WHERE CODIGO_PRO = ? ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setInt(1, p.getCodigo());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public void AtualizarProduto(Produto p) throws SQLException, Exception {
        String sql = " UPDATE produto SET NOME_PRO = ?,VALOR_PRO = ? where CODIGO_PRO = ? ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, p.getNome());
        preparedStatement.setDouble(2, p.getValor());
        preparedStatement.setInt(3, p.getCodigo());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public ArrayList<Produto> listarProduto(Produto filtro) throws Exception {

        ArrayList<Produto> retorno = new ArrayList<>();
        String sql = " SELECT p.CODIGO_PRO, p.NOME_PRO, p.VALOR_PRO ";
        sql += " FROM produto as p ";
        sql += " WHERE p.codigo > 0 ";
        if (filtro.getCodigo() > 0) {
            sql += "AND p.produto = ?";
        }

        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        if (filtro.getCodigo() > 0) {
            preparedStatement.setInt(1, filtro.getCodigo());
        }
        ResultSet leitor = preparedStatement.executeQuery();
        while (leitor.next()) {
            Produto p = new Produto();
            p.setCodigo(leitor.getInt(" CODIGO_PRO "));
            p.setNome(leitor.getString(" NOME_PRO "));
            p.setValor(leitor.getDouble(" VALOR_PRO "));
            retorno.add(p);
        }
        super.desconectar();
        return retorno;
    }*/
    public void CadastrarProduto(Produto p) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO produto (Nom_Produto,Val_Produto,Qtd_Produto) VALUES ( ? , ? , ? )");
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getValor());
            stmt.setInt(3, p.getQuantidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public List<Produto> ListarProduto() {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();
                produto.setNome(rs.getString("Nom_Produto"));
                produto.setQuantidade(rs.getInt("Qtd_Produto"));
                produto.setValor(rs.getDouble("Val_Produto"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DadosProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public void AtualizarProduto(Produto p) {

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

    public void RemoverProduto (Produto p) {

        Connection con = DadosProduto.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, p.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            DadosProduto.closeConnection(con, stmt);
        }

    }
}
