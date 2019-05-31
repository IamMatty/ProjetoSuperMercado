/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadadados;
//JPA
import java.sql.PreparedStatement;
import java.sql.SQLException;
import classesbasicas.Fornecedor;
import conexao.Conexao;

/**
 *
 * @author aluno
 */
public class DadosFornecedor extends Conexao {

    public void cadastrarFornecedor(Fornecedor f) throws SQLException, Exception {
        String sql = " INSERT INTO fornecedor (CNPJ_FOR, NOME_FOR, TELEFONE_FOR, EMAIL_FOR, ENDERECO_FOR) ";
        sql += " VALUES (?,?,?,?,?) ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, f.getCnpj());
        preparedStatement.setString(2, f.getNome());
        preparedStatement.setString(3, f.getTelefone());
        preparedStatement.setString(4, f.getEmail());
        preparedStatement.setString(5, f.getEndereco());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public void removerFornecedor(Fornecedor f) throws SQLException, Exception {
        String sql = " DELETE FROM Fornecedor WHERE CNPJ_FOR = ? ";
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        preparedStatement.setString(1, f.getCnpj());
        preparedStatement.executeUpdate();
        super.desconectar();
    }

    public void atualizarFornecedor(Fornecedor f) throws SQLException, Exception {
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
    }

}
