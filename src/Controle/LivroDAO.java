/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * Trabalho de JAVA 
 * Autores: Guilherme Muniz / Mateus Justino
 */

import Modelo.*;
import Visao.TrabalhoJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LivroDAO {
     private static Connection conn;
    private static PreparedStatement psmt;
    private static ResultSet rs;
    
    public static void conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_trabalhojava", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public static void incluir(/*int id_livro, */String foto, String titulo,
                                String descricao, String autor, String editora, 
                                String isbn, int paginas, int pag_lidas, String adquirido){
        try {            
            Livro l = new Livro(/*id_livro, */foto, titulo, descricao, autor, 
                                editora, isbn, paginas, pag_lidas, adquirido);
            
            
            conectar();
            String sql = "INSERT INTO Livro (foto, titulo, descricao, autor," +
                    "editora, isbn, paginas, pag_lidas, Adquirido) VALUES("
                    /*+ l.getId_livro() + ", '"*/
                    + "?" + ", '"
                    + l.getTitulo() + "', '"
                    + l.getDescricao() + "', '"
                    + l.getAutor() + "', '"
                    + l.getEditora() + "', '"
                    + l.getIsbn() + "', "
                    + l.getPaginas() + ", "
                    + l.getPag_lidas() + ", '"
                    + l.getAdquirido()+ "' )"; 
            
            
            System.out.println(sql);
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, l.getFoto());
            
            psmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(TrabalhoJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void editar(int id_livro, String foto, String titulo,
                                String descricao, String autor, String editora, 
                                String isbn, int paginas, int pag_lidas, String adquirido){
        try {
            Livro l = new Livro(id_livro, foto, titulo,
                                descricao, autor, editora, 
                                isbn, paginas, pag_lidas, adquirido);
            conectar();
           
            psmt = conn.prepareStatement("UPDATE Livro SET foto = " + "?"+ 
                                        ", titulo = '" + l.getTitulo()+ 
                                        "', descricao = '" + l.getDescricao()+
                                        "', autor = '" + l.getAutor()+
                                        "', editora = '" + l.getEditora()+
                                        "', isbn = '" + l.getIsbn()+
                                        "', paginas = " + l.getPaginas()+
                                        ", pag_lidas = " + l.getPag_lidas()+
                                        ", adquirido = '" + l.getAdquirido()+
                                        "' WHERE id_livro = " + l.getId_livro());
            psmt.setString(1, l.getFoto());
            psmt.execute();
            } catch (SQLException ex) {
            Logger.getLogger(TrabalhoJava.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public static void excluir(int id_livro){
        try {
            Livro l = new Livro();
            l.setId_livro(id_livro);
            conectar();
            psmt = conn.prepareStatement("DELETE FROM Livro WHERE id_livro= '" + l.getId_livro()+ "'");
            psmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TrabalhoJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int totalLivros(){
        int total = 0;
        try {            
         
            conectar();
            
            psmt = conn.prepareStatement("SELECT * FROM Livro");
            rs = psmt.executeQuery();
            while(rs.next()){
                total++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrabalhoJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("" + total);
        return total;
    }
    
    public static int livrosAdquiridos(){
        int adquirido = 0;
        try {            
         
            conectar();
            
            psmt = conn.prepareStatement("SELECT * FROM Livro");
            rs = psmt.executeQuery();
            while(rs.next()){
                if(rs.getString("adquirido").equals("SIM")){
                    adquirido++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrabalhoJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("" + adquirido);
        return adquirido;
    }
     
     
    public static TableModelLivro listarTM(String filtro){
        TableModelLivro tableModelLivro = new TableModelLivro();
        try {
            conectar();
            if(filtro.equals(""))
                psmt = conn.prepareStatement("SELECT * FROM Livro");
            else 
                psmt = conn.prepareStatement(
                    "SELECT * FROM Livro WHERE titulo Like '%" + filtro + "%'");
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                Livro l = new Livro(rs.getInt(1), rs.getString(2),
                                    rs.getString(3), rs.getString(4), 
                                    rs.getString(5), rs.getString(6),
                                    rs.getString(7), rs.getInt(8),
                                    rs.getInt(9), rs.getString(10));
                tableModelLivro.addLivro(l);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tableModelLivro;
    }
     
    
}
