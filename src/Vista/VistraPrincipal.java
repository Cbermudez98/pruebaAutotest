/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Insets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Auxiliar
 */
public class VistraPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistraPrincipal
     */
    public VistraPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Base 64 Conversor");
        Foto1R.setLineWrap(true);
        Foto2R.setLineWrap(true);
        convertirFoto.setCursor(new Cursor(HAND_CURSOR));
        Exportar.setCursor(new Cursor(HAND_CURSOR));
        verFoto1.setCursor(new Cursor(HAND_CURSOR));
        VerFoto2.setCursor(new Cursor(HAND_CURSOR));
        link.setCursor(new Cursor(HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Foto1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Foto2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        convertirFoto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Foto2R = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Foto1R = new javax.swing.JTextArea();
        Exportar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        verFoto1 = new javax.swing.JLabel();
        VerFoto2 = new javax.swing.JLabel();
        link = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Foto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Foto1MouseClicked(evt);
            }
        });

        jLabel1.setText("Foto 1:");

        Foto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Foto2MouseClicked(evt);
            }
        });

        jLabel2.setText("Foto 2:");

        convertirFoto.setText("Convertir");
        convertirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirFotoActionPerformed(evt);
            }
        });

        Foto2R.setColumns(20);
        Foto2R.setRows(5);
        jScrollPane1.setViewportView(Foto2R);

        Foto1R.setColumns(20);
        Foto1R.setRows(5);
        jScrollPane2.setViewportView(Foto1R);

        Exportar.setText("Exportar");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        jLabel3.setText("Foto 1");

        jLabel4.setText("Foto 2:");

        verFoto1.setText("Ver Foto 1");
        verFoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verFoto1MouseClicked(evt);
            }
        });

        VerFoto2.setText("Ver Foto 2");
        VerFoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerFoto2MouseClicked(evt);
            }
        });

        link.setText("<html><a href='https://github.com/Cbermudez98'>Cbermudez98</a></html>");
        link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMouseClicked(evt);
            }
        });

        jLabel5.setText("Designed by");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(138, 138, 138)
                        .addComponent(convertirFoto)
                        .addGap(18, 18, 18)
                        .addComponent(Exportar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(Foto2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verFoto1)
                                .addGap(203, 203, 203)
                                .addComponent(VerFoto2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verFoto1)
                    .addComponent(VerFoto2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(convertirFoto)
                            .addComponent(Exportar))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(link))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Foto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Foto1MouseClicked
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser("C:\\MCTC\\esito\\Fotos");
        FileNameExtensionFilter fn = new FileNameExtensionFilter("Only jpg", "jpg");
        //j.addChoosableFileFilter(fn);
        j.setFileFilter(fn);
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            Foto1.setText(j.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_Foto1MouseClicked

    private void Foto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Foto2MouseClicked
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser("C:\\MCTC\\esito\\Fotos");
        FileNameExtensionFilter fn = new FileNameExtensionFilter("Only jpg", "jpg");
        //j.addChoosableFileFilter(fn);
        j.setFileFilter(fn);
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            Foto2.setText(j.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_Foto2MouseClicked

    private void convertirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirFotoActionPerformed
        // TODO add your handling code here:
        if (!Foto1.getText().equals("") && !Foto2.getText().equals("")) {
            File foto1 = new File(Foto1.getText());
            File foto2 = new File(Foto2.getText());
            Foto1R.setText(encodeFileToBase64Binary(foto1));
            Foto2R.setText(encodeFileToBase64Binary(foto2));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione foto");
        }
    }//GEN-LAST:event_convertirFotoActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        // TODO add your handling code here:
        if (!Foto1R.getText().equals("") && !Foto2R.getText().equals("")) {
            File txt = new File("C:\\MCTC\\foto1.txt");
            File txt2 = new File("C:\\MCTC\\foto2.txt");
            try {
                if (txt.exists() && txt2.exists()) {
                    txt.delete();
                    txt2.delete();
                }
                FileWriter fw = new FileWriter(txt);
                FileWriter fw2 = new FileWriter(txt2);
                PrintWriter pw = new PrintWriter(fw);
                PrintWriter pw2 = new PrintWriter(fw2);
                pw.print(Foto1R.getText());
                pw2.println(Foto2R.getText());
                pw.close();
                pw2.close();
                fw.close();
                fw2.close();
                JOptionPane.showMessageDialog(null, "Exportado con exito revisar");
                Desktop.getDesktop().open(txt);
                Desktop.getDesktop().open(txt2);
            } catch (IOException ex) {
                Logger.getLogger(VistraPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Primero convierta foto");
        }
    }//GEN-LAST:event_ExportarActionPerformed

    private void verFoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFoto1MouseClicked
        // TODO add your handling code here:
        if (!Foto2.getText().equals("")) {
            File img = new File(Foto1.getText());
            try {
                Desktop.getDesktop().open(img);
            } catch (IOException ex) {
                Logger.getLogger(VistraPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione imagen 1");
        }

    }//GEN-LAST:event_verFoto1MouseClicked

    private void VerFoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerFoto2MouseClicked
        // TODO add your handling code here:
        if (!Foto2.getText().equals("")) {
            File img = new File(Foto2.getText());
            try {
                Desktop.getDesktop().open(img);
            } catch (IOException ex) {
                Logger.getLogger(VistraPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione imagen 2");
        }

    }//GEN-LAST:event_VerFoto2MouseClicked

    private void linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMouseClicked
        // TODO add your handling code here:
        URI link;
        try {
            link = new URI("https://github.com/Cbermudez98");
            Desktop.getDesktop().browse(link);
        } catch (URISyntaxException ex) {
            Logger.getLogger(VistraPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VistraPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linkMouseClicked

    private final static String alg = "AES";
    private final static String cI = "AES/CBC/PKCS5Padding";
    String key = "v239pShjXXXXXXXXXXXXXXXXXXXXXXXX";
    String iv = "sicovcontacindra";

    private static String encodeFileToBase64Binary(File file) {
        String encodedFile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            fileInputStreamReader.read(bytes);
            encodedFile = Base64.encodeBase64String(bytes);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedFile;
    }

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
            java.util.logging.Logger.getLogger(VistraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistraPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exportar;
    private javax.swing.JTextField Foto1;
    private javax.swing.JTextArea Foto1R;
    private javax.swing.JTextField Foto2;
    private javax.swing.JTextArea Foto2R;
    private javax.swing.JLabel VerFoto2;
    private javax.swing.JButton convertirFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel link;
    private javax.swing.JLabel verFoto1;
    // End of variables declaration//GEN-END:variables
}