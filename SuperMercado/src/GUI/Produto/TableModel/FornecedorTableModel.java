/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Produto.TableModel;

import classesbasicas.Fornecedor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mateus.franca
 */
public class FornecedorTableModel extends AbstractTableModel {

    private final java.util.List<Fornecedor> dados = new ArrayList<>();
    private final String[] colunas = {" CNPJ ", " Nome ", " Endereço ", " Telefone ", " Email "};

    @Override
    public String getColumnName(int column) {
        return colunas [column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
      switch (coluna) {
            case 0:
                return dados.get(linha).getCnpj();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getEndereco();
            case 3:
                return dados.get(linha).getTelefone();
            case 4:
                return dados.get(linha).getEmail();
        }
        return null;  
    }
    
     @Override
    public void setValueAt(Object CNPJ, int linha, int coluna) {
        switch (coluna) {
            case 0:
                 dados.get(linha).setNome((String)CNPJ);
                 break;
            case 1:
                 dados.get(linha).setEndereco((String)CNPJ);
                 break;
            case 2:
                 dados.get(linha).setTelefone((String)CNPJ);
                 break;
            case 3:
                 dados.get(linha).setEmail((String)CNPJ);
                 break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(Fornecedor f) {
        this.dados.add(f);
        this.fireTableDataChanged();

    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
