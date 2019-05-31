/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadanegocio;

import classesbasicas.Funcionario;
import classesbasicas.Cliente;

/**
 *
 * @author Mateus
 */
public class NegocioPessoa {

    public void cadastrarFuncionario(Funcionario f) throws Exception {

        if (f.getNome().isEmpty()) {
            throw new Exception("Informar o NOME.");
        } else if (f.getCpf().isEmpty()) {
            throw new Exception("Informar o CPF.");
        } else if (!f.getCpf().matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d")) {
            throw new Exception("Informe o CPF corretamente\n EX: 00.000.000.0000-00");
        } else if (f.getEndereco().isEmpty()) {
            throw new Exception("Informar o ENDEREÇO.");
        } else if (f.getTelefone().isEmpty()) {
            throw new Exception("Informar o Telefone.");
        } else if (!f.getTelefone().matches("\\d\\d\\s\\d\\s\\d\\d\\d\\d-\\d\\d\\d\\d")) {
            throw new Exception("Informe o TELEFONE corretamente\n EX:00 0 0000-0000");
        }
        /*DadosPessoa dados = new DadosPessoa();
        dados.cadastrarFuncionario;*/

    }
    
    public void cadastrarCliente(Cliente c) throws Exception {

        if (c.getNome().isEmpty()) {
            throw new Exception("Informar o NOME.");
        } else if (c.getCpf().isEmpty()) {
            throw new Exception("Informar o CPF.");
        } else if (!c.getCpf().matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d")) {
            throw new Exception("Informe o CPF corretamente\n EX: 00.000.000.0000-00");
        } else if (c.getEndereco().isEmpty()) {
            throw new Exception("Informar o ENDEREÇO.");
        } else if (c.getTelefone().isEmpty()) {
            throw new Exception("Informar o Telefone.");
        } else if (!c.getTelefone().matches("\\d\\d\\s\\d\\s\\d\\d\\d\\d-\\d\\d\\d\\d")) {
            throw new Exception("Informe o TELEFONE corretamente\n EX:00 0 0000-0000");
        }
        /*DadosPessoa dados = new DadosPessoa();
        dados.cadastrarFuncionario;*/

    }
}
