/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Venda {
    Funcionario fun = new Funcionario();
    Cliente cli = new Cliente();
    ItemVenda itv = new ItemVenda();
    
    int codigo;
    Date dataVenda;
    Time hora;
    Float Total;
    Funcionario funcionarioVenda;
    Cliente clienteVenda;
    
    ArrayList<ItemVenda> itVenda;
}
