/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camadanegocio;

import classesbasicas.Fornecedor;

/**
 *
 * @author Mateus
 */
public class NegocioFornecedor {

    public void cadastrarFornecedor(Fornecedor f) throws Exception {

        if (f.getCnpj().isEmpty()) {
            throw new Exception("Informar o CNPJ.");
        } else if (!f.getCnpj().matches("\\d\\d.\\d\\d\\d.\\d\\d\\d.\\d\\d\\d\\d-\\d\\d")) {
            throw new Exception("Informe o CNPJ corretamente\n EX: 00.000.000.0000-00");
        } else if (f.getNome().isEmpty()) {
            throw new Exception("Informar o NOME.");
        } else if (f.getEndereco().isEmpty()) {
            throw new Exception("Informar o ENDEREÇO.");
        } else if (!f.getTelefone().matches("\\d\\d\\s\\d\\s\\d\\d\\d\\d-\\d\\d\\d\\d")) {
            throw new Exception("Informe o TELEFONE corretamente\n EX:00 0 0000-0000");
        } else if (f.getEmail().isEmpty()) {
            throw new Exception("Informe o EMAIL.");
        }
    }

    public void removerFornecedor(Fornecedor f) throws Exception {
        if (f.getCnpj().isEmpty()) {
            throw new Exception("Informar o CNPJ.");
        } else if (!f.getCnpj().matches("\\d\\d.\\d\\d\\d.\\d\\d\\d.\\d\\d\\d\\d-\\d\\d")) {
            throw new Exception("Informe o CNPJ corretamente\n EX: 00.000.000.0000-00");
        }
    }

    public void alterarFornecedor(Fornecedor f) throws Exception {
        if (f.getCnpj().isEmpty()) {
            throw new Exception("Informar o CNPJ.");
        } else if (!f.getCnpj().matches("\\d\\d.\\d\\d\\d.\\d\\d\\d.\\d\\d\\d\\d-\\d\\d")) {
            throw new Exception("Informe o CNPJ corretamente\n EX: 00.000.000.0000-00");
        } else if (f.getNome().isEmpty()) {
            throw new Exception("Informar o NOME.");
        } else if (f.getEndereco().isEmpty()) {
            throw new Exception("Informar o ENDEREÇO.");
        } else if (!f.getTelefone().matches("\\d\\d\\s\\d\\s\\d\\d\\d\\d-\\d\\d\\d\\d")) {
            throw new Exception("Informe o TELEFONE corretamente\n EX:00 0 0000-0000");
        } else if (f.getEmail().isEmpty()) {
            throw new Exception("Informe o EMAIL.");
        }
    }
}
