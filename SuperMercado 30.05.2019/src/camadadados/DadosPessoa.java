/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadadados;

import classesbasicas.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosPessoa {

    /*public void cadastrarFuncionario(Funcionario f) throws SQLException, Exception {
        String sql = " INSERT INTO produto (NOME_FUN, CPF_FUN,ENDERECO_FUN, TELEFONE_FUN) ";
        sql       += " VALUES (?,?,?,?) ";
        PreparedStatement preparedStatement = super.conectar().pre
        preparedStatement.setString(1, f.getNome());
        preparedStatement.setString(2, f.getCpf());
        preparedStatement.setString(3, f.getEndereco());
        preparedStatement.setString(4, f.getTelefone());
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
    }

    public void cadastrarProduto(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
