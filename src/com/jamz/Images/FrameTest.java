
package com.jamz.Images;

import java.awt.Color;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/** -------------------------------------------
        @author: JAMZ    

        File: FrameTest.java
        Date: 4/09/2020 
        Time: 09:34:40 AM
        
        Purpose:

   
    -------------------------------------------*/ 

public class FrameTest extends javax.swing.JFrame {

    /** Creates new form FrameTest */

    private final reScale instance = new reScale();
    private JFileChooser fileChooser;
    private final FileNameExtensionFilter filter;
    private JLabel[] imagesContainer;
    private ImageIcon[] images;
    private File[] files;
    
    public FrameTest() {
        filter = new FileNameExtensionFilter("Images","png","jpg");
        initComponents();
        setFrameLocation();
    }

    /** Put the frame on the middle of the screen*/
    private void setFrameLocation(){ this.setLocationRelativeTo(null);}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabed = new javax.swing.JTabbedPane();
        Panel = new javax.swing.JPanel();
        btn_open = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        btn_open.setText("Selecionar imagen");
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });

        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 514, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabed.addTab("Redimensionar una imagen", Panel);

        Panel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_add.setText("Seleccionar imagenes");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.GridLayout());
        scrollPane.setViewportView(container);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane)
                .addContainerGap())
        );

        Tabed.addTab("Redimensionar varias imagenes", Panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabed)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabed)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
       fileChooser = new JFileChooser();
       fileChooser.setDialogTitle("Select a image file");
       fileChooser.setFileFilter(filter);
       if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
       {
           img.setIcon(instance.scaleImageIcon(fileChooser.getSelectedFile(),img.getWidth(),img.getHeight()));
       }
    }//GEN-LAST:event_btn_openActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       fileChooser = new JFileChooser();
       fileChooser.setDialogTitle("Select a image file");
       fileChooser.setMultiSelectionEnabled(true);
       fileChooser.setFileFilter(filter);
       if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
       {
           files = new File[fileChooser.getSelectedFiles().length];
           int cantFiles = files.length;
           images = new ImageIcon[cantFiles];
           for(int i = 0; i <= cantFiles - 1; i++)
           {
               files = fileChooser.getSelectedFiles();
               imagesContainer = new JLabel[cantFiles];
               imagesContainer[i] = new JLabel();
               imagesContainer[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
               images[i] = new ImageIcon();
               images[i] = instance.scaleImagesIcons(files, 128, 128)[i];
               imagesContainer[i].setIcon(images[i]);
               container.add(imagesContainer[i]);
               container.updateUI();
           }
       }
    }//GEN-LAST:event_btn_addActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        String os = System.getProperty("sun.desktop");
        if(os.equals("windows")){
           try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(FrameTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                 }
        }else{
             try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                        }
                    }   
                 }
                catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(FrameTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTabbedPane Tabed;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_open;
    private javax.swing.JPanel container;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

}
