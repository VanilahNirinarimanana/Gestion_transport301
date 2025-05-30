/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestion_transport.swing.formulaires.panels;

import gestion_transport.swing.classes.Session;
import gestion_transport.swing.classes.Siege;
import gestion_transport.swing.classes.Vehicule;
import gestion_transport.swing.gestions.GestionSiege;
import gestion_transport.swing.gestions.GestionVehicule;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanilah
 */
public class PanelSiege extends javax.swing.JPanel {

    private List<Vehicule> vehiculeList = new ArrayList<>();
    /**
     * Creates new form PanelSiege
     */
    public PanelSiege() {
        initComponents();
        txtIdSiege.setVisible(false);
        //cbVehicule.setModel(new DefaultComboBoxModel<Vehicule>());
        //cbVehicule = new JComboBox<Vehicule>();
        remplirCbVehicule();
        listeToutSiege();
    }

    public void effacerChampSiege(){
        txtEtatSiege.setText("");
        txtIdSiege.setText("");
        txtIdVeh.setText("");
        txtNumSiege.setText("");
        txtRechImmat.setText("");
    }
    
    
    public void remplirCbVehicule(){
        vehiculeList.clear();
        cbVehicule.removeAllItems();
        try{
            GestionVehicule gv = new GestionVehicule();
            ResultSet rs = gv.getIdImmat();
            while(rs.next()){
                int id_veh = rs.getInt("id_veh");
                String immat = rs.getString("immatriculation");
                
                Vehicule v = new Vehicule(id_veh, immat);
                vehiculeList.add(v);
                cbVehicule.addItem(immat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void listeToutSiege(){
        String titre[] = {"Id", "Id du vehicule", "N° Siège", "Etat du siège"};
        Object enreg[][] = new Object[1][1];
        
        try {
            GestionSiege gs = new GestionSiege();
            int nbr = gs.countEnregToutSiege();
            enreg = new Object[nbr][titre.length];//nbr = ligne et titre.length = colonne
            ResultSet rst = gs.selectAllSiege();
            int i = 0;
            while (rst.next()) {
                enreg[i][0] = (Object) rst.getString("id_siege");
                enreg[i][1] = (Object) rst.getString("id_veh");
                enreg[i][2] = (Object) rst.getString("num_siege");
                enreg[i][3] = (Object) rst.getString("etat_siege");
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tableSiege.setModel(new DefaultTableModel(enreg, titre));
        jScrollPane1.setViewportView(tableSiege);
    }
    
    public void listeSiege(int id_veh){
        String titre[] = {"Id", "Id du vehicule", "N° Siège", "Etat du siège"};
        Object enreg[][] = new Object[1][1];
        
        try {
            GestionSiege gs = new GestionSiege();
            int nbr = gs.countEnregSiege(id_veh);
            enreg = new Object[nbr][titre.length];//nbr = ligne et titre.length = colonne
            ResultSet rst = gs.selectAllSiegeByIdVeh(id_veh);
            int i = 0;
            while (rst.next()) {
                enreg[i][0] = (Object) rst.getString("id_siege");
                enreg[i][1] = (Object) rst.getString("id_veh");
                enreg[i][2] = (Object) rst.getString("num_siege");
                enreg[i][3] = (Object) rst.getString("etat_siege");
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tableSiege.setModel(new DefaultTableModel(enreg, titre));
        jScrollPane1.setViewportView(tableSiege);
    }
    
    public boolean verifSiege(){
        if(txtIdVeh.getText().trim().isEmpty() || txtNumSiege.getText().trim().isEmpty() || txtEtatSiege.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Veuiller remplir tous les champs obligatoires", "Champs manquants", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(txtNumSiege.getText().trim().length() >5){
            JOptionPane.showMessageDialog(this, "Numéro de siège ne doit pas supporter plus de 5 caractères", "Erreur", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(!txtEtatSiege.getText().trim().equalsIgnoreCase("réservé") && !txtEtatSiege.getText().trim().equalsIgnoreCase("disponible")){
            JOptionPane.showMessageDialog(this, "Etat du Siège Incorrect. L'état du siège doit être 'réservé' ou 'disponible'", "Erreur", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public List<Siege> getSiegeParVehicule(int id_veh){
        List<Siege> sieges = new ArrayList<>();
        try{
            GestionSiege gs = new GestionSiege();
            ResultSet rs = gs.selectAllSiegeDispo(id_veh);
            while(rs.next()){
                int id_siege = rs.getInt("id_siege");
                String etat = rs.getString("etat_siege");
                Siege siege = new Siege(id_siege, etat);
                sieges.add(siege);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return sieges;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdSiege = new javax.swing.JTextField();
        txtIdVeh = new javax.swing.JTextField();
        txtNumSiege = new javax.swing.JTextField();
        txtEtatSiege = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSiege = new javax.swing.JTable();
        txtRechImmat = new javax.swing.JTextField();
        btnRechSiege = new javax.swing.JButton();
        btnRetourSiege = new javax.swing.JButton();
        btnAjoutSiege = new javax.swing.JButton();
        btnEffacerSiege = new javax.swing.JButton();
        btnModifSiege = new javax.swing.JButton();
        btnSuppSiege = new javax.swing.JButton();
        cbVehicule = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        txtIdSiege.setText("Id siege");

        txtIdVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVehActionPerformed(evt);
            }
        });
        txtIdVeh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdVehKeyTyped(evt);
            }
        });

        txtNumSiege.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumSiegeKeyTyped(evt);
            }
        });

        txtEtatSiege.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEtatSiegeKeyTyped(evt);
            }
        });

        jLabel1.setText("Id du Vehicule");

        jLabel2.setText("Numero du siège");

        jLabel3.setText("Etat du siège");

        tableSiege.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSiege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiegeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSiege);

        txtRechImmat.setText("Immatriculation");

        btnRechSiege.setText("Recherche");
        btnRechSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechSiegeActionPerformed(evt);
            }
        });

        btnRetourSiege.setText("Retour");
        btnRetourSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourSiegeActionPerformed(evt);
            }
        });

        btnAjoutSiege.setText("Ajouter");
        btnAjoutSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutSiegeActionPerformed(evt);
            }
        });

        btnEffacerSiege.setText("Effacer");
        btnEffacerSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerSiegeActionPerformed(evt);
            }
        });

        btnModifSiege.setText("Modifier");
        btnModifSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifSiegeActionPerformed(evt);
            }
        });

        btnSuppSiege.setText("Supprimer");
        btnSuppSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppSiegeActionPerformed(evt);
            }
        });

        cbVehicule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVehiculeActionPerformed(evt);
            }
        });

        jLabel4.setText("Choix de vehicule");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addComponent(txtIdSiege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRetourSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRechImmat, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRechSiege))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAjoutSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModifSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEffacerSiege, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSuppSiege)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdVeh)
                                    .addComponent(txtNumSiege)
                                    .addComponent(txtEtatSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRechImmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRechSiege))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdSiege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetourSiege))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumSiege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEtatSiege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAjoutSiege)
                            .addComponent(btnEffacerSiege))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSuppSiege)
                            .addComponent(btnModifSiege)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjoutSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutSiegeActionPerformed
        // TODO add your handling code here:
        if(!verifSiege()){
            return;
        }
        else{
            int id_veh = Integer.parseUnsignedInt(txtIdVeh.getText());
            String num_siege = txtNumSiege.getText();
            String etat_siege = txtEtatSiege.getText();
            Siege sg = new Siege(id_veh, num_siege, etat_siege);
            try{
                GestionSiege gs = new GestionSiege();
                int siegeMax = gs.countMaxInsert(id_veh);
                int nbr = gs.countEnregSiege(id_veh);
                if(siegeMax <= nbr){
                    JOptionPane.showMessageDialog(this, "Vous avez déja atteint la capacité maximal du véhicule !!");
                }
                else{
                    gs.insertSiege(sg);
                    listeToutSiege();
                    effacerChampSiege();
                    JOptionPane.showMessageDialog(this, "Insertion Siège réussi!!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }            
        }
    }//GEN-LAST:event_btnAjoutSiegeActionPerformed

    private void cbVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVehiculeActionPerformed
        // TODO add your handling code here:
        int index = cbVehicule.getSelectedIndex();
        if(index >= 0 && index < vehiculeList.size()){
            Vehicule v = vehiculeList.get(index);
            
            if(getSiegeParVehicule(v.getId_veh()).isEmpty()){
                JOptionPane.showMessageDialog(this, "Il n'y a pas encore de sièges pour ce véhicule !!", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            else{
                listeSiege(v.getId_veh());
            }
        }
        /*else{
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un véhicule pour voir les sièges existantes de ce dernier.", "Erreur", JOptionPane.WARNING_MESSAGE);
        }*/
        
    }//GEN-LAST:event_cbVehiculeActionPerformed

    private void btnEffacerSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerSiegeActionPerformed
        // TODO add your handling code here:
        effacerChampSiege();
    }//GEN-LAST:event_btnEffacerSiegeActionPerformed

    private void btnModifSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifSiegeActionPerformed
        // TODO add your handling code here:
        if (!verifSiege()) {
            return;
        } else {
            try {
                int id_veh = Integer.parseUnsignedInt(txtIdVeh.getText());               
                GestionSiege gs = new GestionSiege();
                Siege s = new Siege(id_veh, txtNumSiege.getText(), txtEtatSiege.getText());
                gs.updateSiege(txtIdSiege.getText(), s);
                effacerChampSiege();
                listeToutSiege();
                JOptionPane.showMessageDialog(this, "Mise à Jour réussi!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModifSiegeActionPerformed

    private void tableSiegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiegeMouseClicked
        // TODO add your handling code here:
        int ligne = tableSiege.getSelectedRow();
        txtIdSiege.setText(String.valueOf(tableSiege.getValueAt(ligne, 0)));
        txtIdVeh.setText(String.valueOf(tableSiege.getValueAt(ligne, 1)));
        txtNumSiege.setText(String.valueOf(tableSiege.getValueAt(ligne, 2)));
        txtEtatSiege.setText(String.valueOf(tableSiege.getValueAt(ligne, 3)));
    }//GEN-LAST:event_tableSiegeMouseClicked

    private void btnSuppSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppSiegeActionPerformed
        // TODO add your handling code here:
        if (!verifSiege()) {
            return;
        } else {
            int id_veh = Integer.parseUnsignedInt(txtIdVeh.getText());
            try {
                GestionSiege gs = new GestionSiege();
                JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce véhicule ? ");
                gs.deleteSiege(txtIdSiege.getText());
                effacerChampSiege();
                listeToutSiege();
                JOptionPane.showMessageDialog(this, "Suppression réussie!!");
            } catch (Exception ex) {
                Logger.getLogger(PanelTrajet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuppSiegeActionPerformed

    private void btnRechSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechSiegeActionPerformed
        // TODO add your handling code here:
         String ImmatSearch = txtRechImmat.getText().trim();
        
        if(!ImmatSearch.isEmpty()){
            try {GestionSiege gs = new GestionSiege();
                ResultSet rs = gs.selectByImmat(ImmatSearch);
                DefaultTableModel model = (DefaultTableModel) tableSiege.getModel();
                model.setRowCount(0);
                if(!rs.next()){
                    JOptionPane.showMessageDialog(this, "Aucune siège trouvé avec cette immatriculation de véhicule!!");
                    effacerChampSiege();
                }else{
                        rs.beforeFirst();
                        int i = 0;
                        while (rs.next()) {
                            int id_siege = rs.getInt("id_siege");
                            //System.out.println(id_veh);
                            int id_veh = rs.getInt("id_veh");
                            String numero = rs.getString("num_siege");                            
                            String etat = rs.getString("etat_siege");
                            i++;

                            Siege s = new Siege(id_siege, id_veh, numero, etat);
                            Object[] row = {s.getId_siege(), s.getId_veh(), s.getNum_siege(), s.getEtat_siege()};
                            model.addRow(row);
                        }
                        effacerChampSiege();
                }
                }catch (Exception ex) {
                    Logger.getLogger(PanelSiege.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Veuiller entrer l'immatriculation du véhicule à rechercher pour afficher les sièges.");
        }
    }//GEN-LAST:event_btnRechSiegeActionPerformed

    private void btnRetourSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourSiegeActionPerformed
        // TODO add your handling code here:
        listeToutSiege();
    }//GEN-LAST:event_btnRetourSiegeActionPerformed

    private void txtIdVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVehActionPerformed

    private void txtIdVehKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdVehKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdVehKeyTyped

    private void txtNumSiegeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSiegeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumSiegeKeyTyped

    private void txtEtatSiegeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEtatSiegeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != ' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtEtatSiegeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjoutSiege;
    private javax.swing.JButton btnEffacerSiege;
    private javax.swing.JButton btnModifSiege;
    private javax.swing.JButton btnRechSiege;
    private javax.swing.JButton btnRetourSiege;
    private javax.swing.JButton btnSuppSiege;
    private javax.swing.JComboBox<String> cbVehicule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSiege;
    private javax.swing.JTextField txtEtatSiege;
    private javax.swing.JTextField txtIdSiege;
    private javax.swing.JTextField txtIdVeh;
    private javax.swing.JTextField txtNumSiege;
    private javax.swing.JTextField txtRechImmat;
    // End of variables declaration//GEN-END:variables
}
