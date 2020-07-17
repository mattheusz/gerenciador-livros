/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import javax.swing.JTable;

/**
 *
 * @author Lab1
 */
public class MetodosAuxiliares {
    
    public static void copiar(String origem, String destino) throws FileNotFoundException, IOException{
        
        InputStream is = null;
        OutputStream os = null;
        
        try {
            
            is = new FileInputStream(new File(origem));
            os = new FileOutputStream(new File(destino));
            System.out.println(is);
            byte[] buffer = new byte[1024];
            int length;
            
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    
    
    public static void copyFile(File source, File destination) throws IOException {
        if (destination.exists())
            destination.delete();
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen())
                sourceChannel.close();
            if (destinationChannel != null && destinationChannel.isOpen())
                destinationChannel.close();
       }
   }
    
    public static int Barra(int paginas, int pag_lidas){
        int result = (pag_lidas * 100)/paginas;
        return result;
    }
    
    public static void ajustarColunas(JTable jt){
        //ID
        jt.getColumnModel().getColumn(0).setWidth(40);
        jt.getColumnModel().getColumn(0).setMinWidth(40);
        jt.getColumnModel().getColumn(0).setMaxWidth(40);
        
        //Omitir foto
        jt.getColumnModel().getColumn(1).setWidth(0);
        jt.getColumnModel().getColumn(1).setMinWidth(0);
        jt.getColumnModel().getColumn(1).setMaxWidth(0); 
        
        //ID
        jt.getColumnModel().getColumn(2).setWidth(120);
        jt.getColumnModel().getColumn(2).setMinWidth(120);
        jt.getColumnModel().getColumn(2).setMaxWidth(120);
        
        //ID
        jt.getColumnModel().getColumn(9).setWidth(45);
        jt.getColumnModel().getColumn(9).setMinWidth(45);
        jt.getColumnModel().getColumn(9).setMaxWidth(45);
    }
    
}
