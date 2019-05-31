/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadadados;

import classesbasicas.Funcionario;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosPessoa extends Conexao {

    public void cadastrarFuncionario(Funcionario f) throws SQLException, Exception {
        String sql = " INSERT INTO produto (NOME_FUN, CPF_FUN, ENDERECO_FUN, TELEFONE_FUN, SEXO_FUN) ";
        sql += " VALUES (?,?,?,?) ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, f.getNome());
        preparedStatement.setString(2, f.getCpf());
        preparedStatement.setString(3, f.getEndereco());
        preparedStatement.setString(4, f.getTelefone());
        preparedStatement.setString(5, f.getSexo());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public void removerProduto(Funcionario f) throws SQLException, Exception {
        String sql = " DELETE FROM produto WHERE CODIGO_PRO = ? ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setInt(1, f.getCodigo());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public void AtualizarProduto(Funcionario f) throws SQLException, Exception {
        String sql = " UPDATE produto SET NOME_FUN = ? CPF_FUN = ? ENDERECO_FUN = ? TELEFONE_FUN = ? SEXO_FUN = ? where CODIGO_FUN = ? ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, f.getNome());
        preparedStatement.setString(2, f.getCpf());
        preparedStatement.setString(3, f.getEndereco());
        preparedStatement.setString(4, f.getTelefone());
        preparedStatement.setString(5, f.getSexo());
        preparedStatement.executeUpdate();
        super.desconectar();

        /*public void cadastrarCliente(Cliente c) throws SQLException, Exception {
         String sql = " INSERT INTO produto (NOME_FUN, CPF_FUN, ENDERECO_FUN, TELEFONE_FUN, SEXO_FUN) ";
         sql += " VALUES (?,?,?,?) ";
         PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
         preparedStatement.setString(1, c.getNome());
         preparedStatement.setString(2, c.getCpf());
         preparedStatement.setString(3, c.getEndereco());
         preparedStatement.setString(4, c.getTelefone());
         preparedStatement.setString(5, c.getSexo());
         preparedStatement.executeUpdate();
         super.desconectar();
         }

         public void removerCliente(Cliente c) throws SQLException, Exception {
         String sql = " DELETE FROM produto WHERE CODIGO_PRO = ? ";
         PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
         preparedStatement.setInt(1, c.getCodigo());
         preparedStatement.executeUpdate();
         super.desconectar();
         }

         public void AtualizarCliente(Cliente c) throws SQLException, Exception {
         String sql = " UPDATE produto SET NOME_FUN = ? CPF_FUN = ? ENDERECO_FUN = ? TELEFONE_FUN = ? SEXO_FUN = ? where CODIGO_FUN = ? ";
         PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
         preparedStatement.setString(1, c.getNome());
         preparedStatement.setString(2, c.getCpf());
         preparedStatement.setString(3, c.getEndereco());
         preparedStatement.setString(4, c.getTelefone());
         preparedStatement.setString(5, c.getSexo());
         preparedStatement.executeUpdate();
         super.desconectar();

         }*/
    }
}
