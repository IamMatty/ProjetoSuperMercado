/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.TableModel;

import classesbasicas.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateus
 */
public class ProdutoTableModel extends AbstractTableModel {
     
    private final java.util.List<Produto> dados = new ArrayList<>();
    private final String[] colunas = {" Codigo ", " Nome ", " Valor Unitario ", " Quantidade "};

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
                return dados.get(linha).getCodigo();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getValor();
            case 3:
                return dados.get(linha).getQuantidade();
        }
        return null;
    }

    @Override
    public void setValueAt(Object codigo, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setNome((String) codigo);
                break;
            case 1:
                dados.get(linha).setQuantidade(Integer.parseInt((String) codigo));
                break;
            case 2:
                dados.get(linha).setValor(Double.parseDouble((String) codigo));
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(Produto p) {
        this.dados.add(p);
        this.fireTableDataChanged();

    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
