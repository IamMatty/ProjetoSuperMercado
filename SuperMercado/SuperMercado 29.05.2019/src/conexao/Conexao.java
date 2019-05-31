/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author professor
 */
public class Conexao {

    private Connection conn;
    //constantes com os valores para os drivers de conexão
    private final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    //constantes com os valores para os parâmetros de conexão
    private final String LOCAL_SERVIDOR = "localhost";
    private final String BANCO_DE_DADOS = "super_mercado";
    private final String PORTA_BANCO = "3306";
    private final String USUARIO = "root";
    private final String SENHA = "";

    public Connection conectar() throws Exception {
        return this.conectarMySql();
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private Connection conectarMySql() throws Exception {
        Class.forName(DRIVER_MYSQL).newInstance();
        String url = "jdbc:mysql://" + LOCAL_SERVIDOR + ":" + PORTA_BANCO + "/" + BANCO_DE_DADOS;
        conn = (Connection) DriverManager.getConnection(url, USUARIO, SENHA);
        return conn;
    }
}
