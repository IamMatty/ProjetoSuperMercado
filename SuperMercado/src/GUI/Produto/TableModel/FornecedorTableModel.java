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

 * @author Mateus
 */
public class FornecedorTableModel extends AbstractTableModel{
    
    private final java.util.List<Fornecedor> dados = new ArrayList<>();
    private final String[] colunas = {" CNPJ ", " Nome "," Endereço "," Email ", " Telefone ", "Sexo" };

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

 /*
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
<<<<<<< HEAD
<<<<<<< HEAD
        switch (coluna) {
=======
      switch (coluna) {
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
=======
      switch (coluna) {
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
            case 0:
                return dados.get(linha).getCnpj();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getEndereco();
            case 3:
<<<<<<< HEAD
<<<<<<< HEAD
                return dados.get(linha).getEmail();
            case 4:
                return dados.get(linha).getTelefone();
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
                 dados.get(linha).setEndereco((String)cnpj);
                 break;
            case 3:
                 dados.get(linha).setEmail((String)cnpj);
                 break;
            case 4:
                 dados.get(linha).setTelefone((String)cnpj);
                 break;
            /*case 5:
                 dados.get(linha).setSexo((String)cnpj);
                 break;*/
=======
=======
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
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
<<<<<<< HEAD
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
=======
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
<<<<<<< HEAD
<<<<<<< HEAD

    public void addRow(Fornecedor p) {
        this.dados.add(p);
=======
    public void addRow(Fornecedor f) {
        this.dados.add(f);
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
=======
    public void addRow(Fornecedor f) {
        this.dados.add(f);
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
        this.fireTableDataChanged();

    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
    
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
=======
    
>>>>>>> 191f7f7e14c0a74606d3b488b1e488a30b4a21b6
}
