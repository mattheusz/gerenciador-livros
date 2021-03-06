/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.LivroDAO;
import Controle.MetodosAuxiliares;
import com.sun.glass.events.MouseEvent;
import java.awt.Event;
import java.awt.Image;
import java.awt.dnd.DropTarget;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JYRAYA
 */
public class Edicao extends javax.swing.JFrame {

    /**
     * Creates new form Inclusao
     */
   
    
    public Edicao(Integer id_livro,String foto, String titulo,
                  String descricao, String autor, 
                  String editora, String isbn, 
                  Integer paginas, Integer pag_lidas, String adquirido) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.jTFid.setText(Integer.toString(id_livro));
        this.jTFimagem.setText(foto);
        this.jTFtitulo.setText(titulo);
        this.jTAdescricao.setText(descricao);
        this.jTFautor.setText(autor);
        this.jTFeditora.setText(editora);
        this.jTFisbn.setText(isbn);
        this.jTFpaginas.setText(Integer.toString(paginas));
        this.jTFpg_lidas.setText(Integer.toString(pag_lidas));
        this.jTFadquirido.setText(adquirido);
        if(jTFadquirido.getText().equals("SIM")){
            this.jCBadquirido.setSelected(true);
        }else{
            this.jCBadquirido.setSelected(false);
        }
        
        String text_imagem = jTFimagem.getText();
        System.out.println(text_imagem);
        Image imagem = getToolkit().getImage(text_imagem);
        int altura = jLimagem.getHeight();
        int largura = jLimagem.getWidth();
        imagem = imagem.getScaledInstance(largura, altura, Image.SCALE_DEFAULT);
        jLimagem.setIcon(new ImageIcon(imagem));
        
     
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLtitulofoto = new javax.swing.JLabel();
        jLimagem = new javax.swing.JLabel();
        jLtitulo = new javax.swing.JLabel();
        jTFtitulo = new javax.swing.JTextField();
        jLdescricao = new javax.swing.JLabel();
        jSPdescricao = new javax.swing.JScrollPane();
        jTAdescricao = new javax.swing.JTextArea();
        jLautor = new javax.swing.JLabel();
        jTFautor = new javax.swing.JTextField();
        jLeditora = new javax.swing.JLabel();
        jTFeditora = new javax.swing.JTextField();
        jLisbn = new javax.swing.JLabel();
        jTFisbn = new javax.swing.JTextField();
        jLpaginas = new javax.swing.JLabel();
        jTFpaginas = new javax.swing.JTextField();
        jLpag_lidas = new javax.swing.JLabel();
        jTFpg_lidas = new javax.swing.JTextField();
        jLadquirido = new javax.swing.JLabel();
        jBconfirmar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jBselecionar = new javax.swing.JButton();
        jTFimagem = new javax.swing.JTextField();
        jCBadquirido = new javax.swing.JCheckBox();
        jTFid = new javax.swing.JTextField();
        jLid = new javax.swing.JLabel();
        jTFadquirido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLtitulodajanela = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLtitulofoto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLtitulofoto.setText("Foto");

        jLimagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLtitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLtitulo.setText("Título");

        jLdescricao.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLdescricao.setText("Descricão");

        jTAdescricao.setColumns(20);
        jTAdescricao.setLineWrap(true);
        jTAdescricao.setRows(5);
        jSPdescricao.setViewportView(jTAdescricao);

        jLautor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLautor.setText("Autor");

        jLeditora.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLeditora.setText("Editora");

        jLisbn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLisbn.setText("ISBN");

        jLpaginas.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLpaginas.setText("Paginas");

        jLpag_lidas.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLpag_lidas.setText("Páginas Lidas");

        jLadquirido.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLadquirido.setText("Adquirido");

        jBconfirmar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jBconfirmar.setText("Confirmar");
        jBconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmarActionPerformed(evt);
            }
        });

        jBcancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jBselecionar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jBselecionar.setText("Selecionar");
        jBselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBselecionarActionPerformed(evt);
            }
        });

        jTFimagem.setEditable(false);
        jTFimagem.setEnabled(false);
        jTFimagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFimagemActionPerformed(evt);
            }
        });

        jCBadquirido.setText("Sim / Não");
        jCBadquirido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBadquiridoActionPerformed(evt);
            }
        });

        jTFid.setEditable(false);
        jTFid.setEnabled(false);

        jLid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLid.setText("ID");

        jTFadquirido.setEditable(false);
        jTFadquirido.setEnabled(false);
        jTFadquirido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFadquiridoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLtitulodajanela.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLtitulodajanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulodajanela.setText("Editar Livros");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editBlack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLtitulodajanela, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLtitulodajanela)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLtitulofoto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBselecionar))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLdescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLtitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLid, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSPdescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(jTFtitulo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBconfirmar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLeditora)
                                    .addComponent(jLautor)
                                    .addComponent(jLisbn)
                                    .addComponent(jLpaginas)
                                    .addComponent(jLadquirido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFisbn)
                                    .addComponent(jTFeditora)
                                    .addComponent(jTFautor)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTFpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 93, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jBcancelar)
                                                    .addComponent(jLpag_lidas)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCBadquirido)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTFadquirido)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFpg_lidas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))))))
                .addGap(43, 43, 43))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLtitulo)
                                .addGap(59, 59, 59)
                                .addComponent(jLdescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSPdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLautor))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFeditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLeditora))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLisbn)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLtitulofoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFimagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBselecionar)
                        .addGap(57, 57, 57)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLpaginas)
                    .addComponent(jTFpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLpag_lidas)
                    .addComponent(jTFpg_lidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLadquirido)
                    .addComponent(jCBadquirido)
                    .addComponent(jTFadquirido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcancelar)
                    .addComponent(jBconfirmar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmarActionPerformed
        boolean validapagina = true;
        boolean validaisbn = true;
        String str = jTFisbn.getText();
         
        if (str.matches("[0-9]+") && jTFisbn.getText().length() <= 13) {
            
            
        } else {
            JOptionPane.showMessageDialog(null, "ISBN inválido! O campo de ISBN deve aceitar apenas números e no máximo 13" );
            validaisbn = false;
        }
        
        int pag_lidas = Integer.parseInt(jTFpg_lidas.getText());
        int paginas = Integer.parseInt(jTFpaginas.getText());
        
        if(pag_lidas > paginas){
            JOptionPane.showMessageDialog(null, "numero de pagians lidas maior que paginas do livro");
            jTFpg_lidas.setText("");
            validapagina = false;
        }
        
        if(validapagina == true && validaisbn == true){
            LivroDAO.editar(Integer.parseInt(jTFid.getText()), jTFimagem.getText(),
                    jTFtitulo.getText(), jTAdescricao.getText(), jTFautor.getText(),
                    jTFeditora.getText(), jTFisbn.getText(), Integer.parseInt(jTFpaginas.getText()),
                    Integer.parseInt(jTFpg_lidas.getText()), jTFadquirido.getText());
            JOptionPane.showMessageDialog(null, "Cadastro Alterado com Sucesso!"); 
            dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro não Alterado!");
        }
        
        
    }//GEN-LAST:event_jBconfirmarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBselecionarActionPerformed
        JFileChooser arquivo = new JFileChooser();
        int janela = arquivo.showOpenDialog(null);
        if (janela == JFileChooser.APPROVE_OPTION) {
            File file = arquivo.getSelectedFile();
            jTFimagem.setText(String.valueOf(file));
            Image imagem = getToolkit().getImage(jTFimagem.getText());
            String nome = file.getAbsoluteFile().getName();
            
            String os = "";
            os = System.getProperty("os.name");
            
            String ori = "";
            String des = "";
            
            if(os.equals("Windows 10")){
                ori = jTFimagem.getText();
                des = ".\\Fotos\\" + nome;
            }else{
                ori = jTFimagem.getText();
                des = ".//Fotos//" + nome;
            }
            
            try {
                MetodosAuxiliares.copiar(ori, des);
                jTFimagem.setText(des);
            } catch (IOException ex) {
                Logger.getLogger(Edicao.class.getName()).log(Level.SEVERE, null, ex);
            }
            int altura = jLimagem.getHeight();
            int largura = jLimagem.getWidth();
            imagem = imagem.getScaledInstance(largura, altura, Image.SCALE_DEFAULT);
            jLimagem.setIcon(new ImageIcon(imagem));
              
        }
    }//GEN-LAST:event_jBselecionarActionPerformed

    
    private void jTFimagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFimagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFimagemActionPerformed

    private void jTFadquiridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFadquiridoActionPerformed
        
    }//GEN-LAST:event_jTFadquiridoActionPerformed

    private void jCBadquiridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBadquiridoActionPerformed
        
        if(jCBadquirido.isSelected()){
            jTFadquirido.setText("SIM");
        }else{
            jTFadquirido.setText("NÃO");
        }
        
    }//GEN-LAST:event_jCBadquiridoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edicao().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBconfirmar;
    private javax.swing.JButton jBselecionar;
    private javax.swing.JCheckBox jCBadquirido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLadquirido;
    private javax.swing.JLabel jLautor;
    private javax.swing.JLabel jLdescricao;
    private javax.swing.JLabel jLeditora;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLimagem;
    private javax.swing.JLabel jLisbn;
    private javax.swing.JLabel jLpag_lidas;
    private javax.swing.JLabel jLpaginas;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JLabel jLtitulodajanela;
    private javax.swing.JLabel jLtitulofoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPdescricao;
    private javax.swing.JTextArea jTAdescricao;
    private javax.swing.JTextField jTFadquirido;
    private javax.swing.JTextField jTFautor;
    private javax.swing.JTextField jTFeditora;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTextField jTFimagem;
    private javax.swing.JTextField jTFisbn;
    private javax.swing.JTextField jTFpaginas;
    private javax.swing.JTextField jTFpg_lidas;
    private javax.swing.JTextField jTFtitulo;
    // End of variables declaration//GEN-END:variables
}
