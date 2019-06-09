/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.TableModel;

import classesbasicas.Fornecedor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * @author mateus.franca
 */
public class FornecedorTableModel extends AbstractTableModel {

    private final java.util.List<Fornecedor> dados = new ArrayList<>();
    private final String[] colunas = {" CNPJ ", " Nome ", " Telefone ", " Email ", " Endereço "};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
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
                return dados.get(linha).getTelefone();
            case 3:
                return dados.get(linha).getEmail();
            case 4:
                return dados.get(linha).getEndereco();
            /*case 5:
                return dados.get(linha).getSexo();*/
        }
        return null;
    }

    @Override
    public void setValueAt(Object cnpj, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setNome((String) cnpj);
                break;
            case 2:
                dados.get(linha).setEndereco((String) cnpj);
                break;
            case 3:
                dados.get(linha).setEmail((String) cnpj);
                break;
            case 4:
                dados.get(linha).setTelefone((String) cnpj);
                break;
            /*case 5:
                 dados.get(linha).setSexo((String)cnpj);
                 break;*/
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
