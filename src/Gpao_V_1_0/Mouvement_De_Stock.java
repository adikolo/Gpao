/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpao_V_1_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Assane Adirou
 */
public class Mouvement_De_Stock extends javax.swing.JFrame {

    // declaration des variables
    PreparedStatement prst;
    ResultSet rst;
    Connection conn;

    /**
     * Creates new form Mouvement_De_Stock
     */
    public Mouvement_De_Stock() {
        try {
            initComponents();
            rempli_combo_reference();
            affichage_table();

        } catch (SQLException ex) {

        }
    }

    public void vider_champs() {
        txt_quantité.setText("");

    }

    public void affichage_table() {

        try {
            conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");

            String req = "select *from Mouvement_de_stock ";
            prst = conn.prepareStatement(req);
            rst = prst.executeQuery();
            table_mouvement.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "impossible de rempli la table" + ex.getMessage());
        }

    }

    public final void rempli_combo_reference() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select reference from Article";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String mos = rst.getString("reference");
            cbx_ref.addItem(mos);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_quantité = new javax.swing.JTextField();
        cbx_type = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_enr = new javax.swing.JButton();
        btn_modif = new javax.swing.JButton();
        btn_supp = new javax.swing.JButton();
        btn_rese = new javax.swing.JButton();
        btn_prec = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();
        cbx_ref = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_mouvement = new javax.swing.JTable();
        cbx_mag = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mouvement de Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reference");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero du Magasin");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("La Quantité");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Le Type");

        cbx_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entree", "Sortie" }));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        btn_enr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_enr.setText("Enregistrer");
        btn_enr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enrActionPerformed(evt);
            }
        });

        btn_modif.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_modif.setText("Modifier");
        btn_modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifActionPerformed(evt);
            }
        });

        btn_supp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_supp.setText("Supprimer");
        btn_supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suppActionPerformed(evt);
            }
        });

        btn_rese.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_rese.setText("Reset");
        btn_rese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reseActionPerformed(evt);
            }
        });

        btn_prec.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_prec.setText("Precedent");
        btn_prec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_precActionPerformed(evt);
            }
        });

        btn_quitter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_quitter.setText("Quitter");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_enr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_rese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_modif)
                    .addComponent(btn_quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_supp)
                    .addComponent(btn_prec, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enr)
                    .addComponent(btn_modif)
                    .addComponent(btn_supp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_rese)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_prec)
                        .addComponent(btn_quitter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_mouvement.setModel(new javax.swing.table.DefaultTableModel(
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
        table_mouvement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_mouvementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_mouvement);

        cbx_mag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Periode");

        txt_date.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gpao Version 1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_quantité)
                                .addComponent(cbx_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_ref, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_mag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_mag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quantité, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enrActionPerformed

        try {
            // Pour un enregistrement dans la base de donnée:
            conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String sql = "insert into Mouvement_de_stock (reference,numero_magasin,quantite,periode,type) values(?,?,?,?,?)";
            prst = conn.prepareStatement(sql);
            prst.setString(1, (String) cbx_ref.getSelectedItem());
            prst.setString(2, (String) cbx_mag.getSelectedItem());
            prst.setString(3, txt_quantité.getText());
            prst.setString(4, ((JTextField) txt_date.getDateEditor().getUiComponent()).getText());
            prst.setString(5, (String) cbx_type.getSelectedItem());
            prst.execute();
            affichage_table();
            JOptionPane.showMessageDialog(null, "insertion Reussi !!! Merci");
            vider_champs();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insertion impossible" + ex.getMessage());
        }


    }//GEN-LAST:event_btn_enrActionPerformed

    private void btn_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifActionPerformed

        try {
            // pour modifier un operation

            conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String req = " update Mouvement_de_stock set  reference=?,  numero_magasin=?, quantite =?,  periode = ?, type=? where reference=  '" + cbx_ref.getSelectedItem() + "' ";

            prst = conn.prepareStatement(req);
            prst.setString(1, (String) cbx_ref.getSelectedItem());
            prst.setString(2, (String) cbx_mag.getSelectedItem());
            prst.setString(3, txt_quantité.getText());
            prst.setString(4, ((JTextField) txt_date.getDateEditor().getUiComponent()).getText());
            prst.setString(5, (String) cbx_type.getSelectedItem());
            prst.execute();
            affichage_table();
            JOptionPane.showMessageDialog(null, "Modification Reussi !!! Merci");
            vider_champs();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Modification impossible" + ex.getMessage());

        }

    }//GEN-LAST:event_btn_modifActionPerformed

    private void btn_suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suppActionPerformed
        // Pour supprimer dans la base de donnée

          try {
          conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
       
        } catch (SQLException ex) {
            Logger.getLogger(Suppression_Article.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (JOptionPane.showConfirmDialog(null, "attention vous voulez Supprimer un mouvement de stock, vous etes sur?",
                "Supprimer un mouvement de stock ", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

            try {
                String requete = "delete from Mouvement_de_stock  where reference=  '" + cbx_ref.getSelectedItem() + "'";
                prst = conn.prepareStatement(requete);
                prst.execute();
                table_mouvement.setModel(DbUtils.resultSetToTableModel(rst));
                affichage_table();
                vider_champs();
                JOptionPane.showMessageDialog(null, "Mouvement de stock supprimé avec succès !!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "impossible de supprimé un mouvement de stock !!!" + ex.getMessage());
            }

        }

    }//GEN-LAST:event_btn_suppActionPerformed

    private void btn_reseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reseActionPerformed
        // Pour vider es champs
        vider_champs();
    }//GEN-LAST:event_btn_reseActionPerformed

    private void btn_precActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_precActionPerformed

        // Retour en arrière
        Menu_Gpao mpr = new Menu_Gpao();
        mpr.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_btn_precActionPerformed

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
        // Pour quitter et fermer l'application directement
        this.dispose();
    }//GEN-LAST:event_btn_quitterActionPerformed

    private void table_mouvementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_mouvementMouseClicked
            // Affichage des éléments du tableaux dans les champs de saisir
       
        cbx_ref.setSelectedItem(table_mouvement.getValueAt(table_mouvement.getSelectedRow(), 0));
        cbx_mag.setSelectedItem(table_mouvement.getValueAt(table_mouvement.getSelectedRow(), 1));
        txt_quantité.setText(String.valueOf(table_mouvement.getValueAt(table_mouvement.getSelectedRow(), 2)));
        txt_date.setDate((Date) table_mouvement.getValueAt(table_mouvement.getSelectedRow(), 3));
        cbx_type.setSelectedItem(table_mouvement.getValueAt(table_mouvement.getSelectedRow(), 4));
      
    }//GEN-LAST:event_table_mouvementMouseClicked

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
            java.util.logging.Logger.getLogger(Mouvement_De_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mouvement_De_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mouvement_De_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mouvement_De_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mouvement_De_Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enr;
    private javax.swing.JButton btn_modif;
    private javax.swing.JButton btn_prec;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JButton btn_rese;
    private javax.swing.JButton btn_supp;
    private javax.swing.JComboBox<String> cbx_mag;
    private javax.swing.JComboBox<String> cbx_ref;
    private javax.swing.JComboBox<String> cbx_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_mouvement;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_quantité;
    // End of variables declaration//GEN-END:variables
}
