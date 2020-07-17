/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab1
 */
public class TableModelLivro extends AbstractTableModel {
    
    private ArrayList<Livro> lista;
    private String[] colunas = {"ID", "Foto", "Título", "Descrição", "Autor", "Editora", "ISBN", "Paginas", "Pag Lidas", "Adquirido"}; 
    
    public TableModelLivro(){
        this.lista = new ArrayList();
    }

    public void addLivro(Livro l){
        this.lista.add(l);
        fireTableDataChanged();
    }
    
    public void remove(int rowIndex){
        this.lista.remove(rowIndex);
    }
    
    public Livro getContato(int rowIndex){
        return this.lista.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return this.lista.get(rowIndex).getId_livro();
            case 1:
                return this.lista.get(rowIndex).getFoto();
            case 2:
                return this.lista.get(rowIndex).getTitulo();
            case 3:
                return this.lista.get(rowIndex).getDescricao();
            case 4: 
                return this.lista.get(rowIndex).getAutor();
            case 5:
                return this.lista.get(rowIndex).getEditora();
            case 6: 
                return this.lista.get(rowIndex).getIsbn();
            case 7: 
                return this.lista.get(rowIndex).getPaginas();
            case 8: 
                return this.lista.get(rowIndex).getPag_lidas();
            case 9: 
                return this.lista.get(rowIndex).getAdquirido();
            default:
                return this.lista.get(rowIndex);
        }
    }
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
    
}

