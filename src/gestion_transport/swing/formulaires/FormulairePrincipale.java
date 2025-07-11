/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_transport.swing.formulaires;

import java.awt.Image;
import javax.swing.ImageIcon;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Vanilah
 */
public class FormulairePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FormulairePrincipale
     */
    public FormulairePrincipale() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        //CENTRAGE DU PANEL
        panelConteneur.setLayout(new BorderLayout());
        panelConteneur.add(lblTitre, BorderLayout.CENTER);
        JPanel panelDeuxBoutons = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        panelDeuxBoutons.add(panelCoop);
        panelDeuxBoutons.add(panelPassager);
        panelConteneur.add(panelDeuxBoutons, BorderLayout.CENTER);
        panelCoop.setPreferredSize(new Dimension(450, 400));
        panelPassager.setPreferredSize(new Dimension(450, 400));
        //panelConteneur.setPreferredSize(new Dimension(1200, 1200));
        JPanel wrapper = new JPanel(new GridBagLayout());
        wrapper.add(panelConteneur);
        getContentPane().add(wrapper, BorderLayout.CENTER);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/images.jpeg"));
        Image img = icon.getImage().getScaledInstance(lblImageCoop.getWidth(), lblImageCoop.getHeight(), Image.SCALE_SMOOTH);
        lblImageCoop.setIcon(new ImageIcon(img));
        
        ImageIcon iconImg = new ImageIcon(getClass().getResource("/images/imgPassager.png"));
        Image imgP = iconImg.getImage().getScaledInstance(lblPassagerImg.getWidth(), lblPassagerImg.getHeight(), Image.SCALE_SMOOTH);
        lblPassagerImg.setIcon(new ImageIcon(imgP));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConteneur = new javax.swing.JPanel();
        panelPassager = new javax.swing.JPanel();
        btnPassagerPrin = new javax.swing.JButton();
        lblPassagerImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelCoop = new javax.swing.JPanel();
        btnCoopPrin = new javax.swing.JButton();
        lblImageCoop = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTitre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gare routière Fianarantsoa");

        panelPassager.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPassagerPrin.setText("PASSAGER");
        btnPassagerPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassagerPrinActionPerformed(evt);
            }
        });

        lblPassagerImg.setText("jLabel2");

        jLabel3.setText("Faite vos réservation en ligne et gagner");

        jLabel4.setText("plus de temps à ranger vos baguages.");

        javax.swing.GroupLayout panelPassagerLayout = new javax.swing.GroupLayout(panelPassager);
        panelPassager.setLayout(panelPassagerLayout);
        panelPassagerLayout.setHorizontalGroup(
            panelPassagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPassagerLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(panelPassagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPassagerLayout.createSequentialGroup()
                        .addComponent(lblPassagerImg, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPassagerLayout.createSequentialGroup()
                        .addComponent(btnPassagerPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPassagerLayout.createSequentialGroup()
                        .addGroup(panelPassagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(108, 108, 108))))
        );
        panelPassagerLayout.setVerticalGroup(
            panelPassagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPassagerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblPassagerImg, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(btnPassagerPrin)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelCoop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCoopPrin.setText("COOPERATIVE");
        btnCoopPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoopPrinActionPerformed(evt);
            }
        });

        lblImageCoop.setText("jLabel2");

        jLabel2.setText("Gerer votre coopérative plus facilement avec notre application. ");

        javax.swing.GroupLayout panelCoopLayout = new javax.swing.GroupLayout(panelCoop);
        panelCoop.setLayout(panelCoopLayout);
        panelCoopLayout.setHorizontalGroup(
            panelCoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCoopLayout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
            .addGroup(panelCoopLayout.createSequentialGroup()
                .addGroup(panelCoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCoopLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblImageCoop, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCoopLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCoopPrin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCoopLayout.setVerticalGroup(
            panelCoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCoopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblImageCoop, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(btnCoopPrin)
                .addGap(42, 42, 42))
        );

        lblTitre.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblTitre.setText("BIENVENUE AU GARE ROUTIERE DE FIANARANTSOA");

        javax.swing.GroupLayout panelConteneurLayout = new javax.swing.GroupLayout(panelConteneur);
        panelConteneur.setLayout(panelConteneurLayout);
        panelConteneurLayout.setHorizontalGroup(
            panelConteneurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteneurLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelCoop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelPassager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panelConteneurLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(lblTitre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConteneurLayout.setVerticalGroup(
            panelConteneurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteneurLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelConteneurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPassager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(panelConteneur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panelConteneur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoopPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoopPrinActionPerformed
        // TODO add your handling code here:
        new FormulairePassageAdminCoop().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCoopPrinActionPerformed

    private void btnPassagerPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassagerPrinActionPerformed
        // TODO add your handling code here:
        new FormulaireReservationPassager().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPassagerPrinActionPerformed

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
            java.util.logging.Logger.getLogger(FormulairePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulairePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulairePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulairePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        }
        catch(Exception ex){
            System.err.println("Erreur Flatlaf");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulairePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoopPrin;
    private javax.swing.JButton btnPassagerPrin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblImageCoop;
    private javax.swing.JLabel lblPassagerImg;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JPanel panelConteneur;
    private javax.swing.JPanel panelCoop;
    private javax.swing.JPanel panelPassager;
    // End of variables declaration//GEN-END:variables
}
