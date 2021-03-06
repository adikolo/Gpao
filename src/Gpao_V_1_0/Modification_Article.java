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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Assane Adirou
 */
public class Modification_Article extends javax.swing.JFrame {
 // declaration des variables
    
    Connection con = null;
    Statement st;
    ResultSet rst;
    PreparedStatement prst;

    /**
     * Creates new form Modifier_Article
     */
    public Modification_Article() {
        initComponents();
        
        affichage();
    }
// methode d'affichage des articles
    public void affichage() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String req = "select *from article";
            prst = conn.prepareStatement(req);
            rst = prst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException ex) {
            Logger.getLogger(Modification_Article.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
// vider les champs 
    public void vider() {

        txt_ref.setText(null);
        txt_des.setText(null);
        txt_fab.setText(null);
        txt_unit.setText(null);
        txt_delai.setText(null);
        txt_stand.setText(null);
        txt_lot.setText(null);
        txt_mini.setText(null);
        txt_maxi.setText(null);
        txt_pourecntage.setText(null);
        txt_inv.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_ref = new javax.swing.JTextField();
        txt_des = new javax.swing.JTextField();
        txt_fab = new javax.swing.JTextField();
        txt_unit = new javax.swing.JTextField();
        txt_delai = new javax.swing.JTextField();
        txt_stand = new javax.swing.JTextField();
        txt_lot = new javax.swing.JTextField();
        txt_mini = new javax.swing.JTextField();
        txt_maxi = new javax.swing.JTextField();
        txt_pourecntage = new javax.swing.JTextField();
        txt_inv = new javax.swing.JTextField();
        btn_modifier = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_precdent = new javax.swing.JButton();
        btn_rech = new javax.swing.JButton();
        cbx_arti = new javax.swing.JComboBox<>();
        btn_affich = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cbx_rech = new javax.swing.JComboBox<>();
        txt_recher = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modification_Article", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gpao Version 1.0");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Reference");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("designation");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Type Fabrication Achat");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Unite Achat Stock");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Delai En Semaine");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Prix Standard ");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Lot De Reapprovisionnement");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Stock Minimum");
        jLabel22.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Stock Maximum");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Pourcentage De Perte ");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Inventaire");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Etat Article");

        txt_ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_refActionPerformed(evt);
            }
        });

        txt_mini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_miniActionPerformed(evt);
            }
        });

        txt_maxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maxiActionPerformed(evt);
            }
        });

        btn_modifier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_modifier.setText("Modifer");
        btn_modifier.setToolTipText("");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_precdent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_precdent.setText("Precedent");
        btn_precdent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_precdentActionPerformed(evt);
            }
        });

        btn_rech.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_rech.setText("Rechercher");
        btn_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechActionPerformed(evt);
            }
        });

        cbx_arti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PF", "MP", "SE", "PI", " " }));

        btn_affich.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_affich.setText("Affichage");
        btn_affich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_affichActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        cbx_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reference", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_stand, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txt_delai)
                            .addComponent(txt_unit)
                            .addComponent(txt_fab)
                            .addComponent(txt_des)
                            .addComponent(txt_ref)
                            .addComponent(txt_pourecntage)
                            .addComponent(txt_maxi)
                            .addComponent(txt_mini)
                            .addComponent(txt_lot)
                            .addComponent(txt_inv)
                            .addComponent(cbx_arti, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_precdent, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_rech)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(cbx_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_recher, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)))
                        .addGap(210, 210, 210))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_affich, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_rech, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_recher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_affich))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_fab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_delai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txt_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_lot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_mini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_maxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txt_pourecntage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txt_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_modifier)
                                    .addComponent(btn_reset)
                                    .addComponent(btn_precdent)
                                    .addComponent(jButton1)))
                            .addComponent(cbx_arti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_refActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_refActionPerformed

    private void txt_miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_miniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_miniActionPerformed

    private void txt_maxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maxiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maxiActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
     // verification des champs si elle contiennent des informations
        if (txt_ref.getText().equals("") || txt_des.getText().equals("") || txt_fab.getText().equals("")
                || txt_unit.getText().equals("") || txt_unit.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations oblgatoire sur les cases a étoile");
        } else {
            try {

                Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
                //  String requete = "update article set designation= '" + txt_des.getText() + "', type_fabrication_achat='" + txt_fab.getText() + "' ,unite_achat_stock= '" + txt_unit.getText() + "',delai_en_semaine='" + txt_delai.getText() + "', prix_standard ='" + txt_stand.getText() + "', lot_de_reapprovisionnement ='" + txt_lot.getText() + "',stock_mini ='" + txt_mini.getText() + "',stock_maxi='" + txt_maxi.getText() + "',pourcentage_de_perte ='" + txt_pourecntage.getText() + "',inventaire='" + txt_inv.getText() + "',PF_ou_MP_ou_Piece_ou_SE='" + cbx_arti.getSelectedItem() + "'  where reference ='" + txt_ref.getText() + "' ";
                String requete = "update article set reference =?,designation =?,type_fabrication_achat =?,unite_achat_stock=?,delai_en_semaine  =?,prix_standard  =?,lot_de_reapprovisionnement  =?,stock_mini=?,stock_maxi=?,pourcentage_de_perte =?,inventaire=?, PF_ou_MP_ou_Piece_ou_SE= ? where  reference ='" + txt_ref.getText() + "'";
                prst = conn.prepareStatement(requete);
                prst.setString(1, txt_ref.getText());
                prst.setString(2, txt_des.getText());
                prst.setString(3, txt_fab.getText());
                prst.setString(4, txt_unit.getText());
                prst.setString(5, txt_delai.getText());
                prst.setString(6, txt_stand.getText());
                prst.setString(7, txt_lot.getText());
                prst.setString(8, txt_mini.getText());
                prst.setString(9, txt_maxi.getText());
                prst.setString(10, txt_pourecntage.getText());
                prst.setString(11,txt_inv.getText());
                prst.setString(12, (String) cbx_arti.getSelectedItem());
                prst.execute();
                  JOptionPane.showMessageDialog(null, "Modification avec succès");
                  table.setModel(DbUtils.resultSetToTableModel(rst));
                  affichage();
                  vider();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ok " + ex.getMessage());
            }

    }//GEN-LAST:event_btn_modifierActionPerformed
    }
    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // vider les champs
        vider();

    }//GEN-LAST:event_btn_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // pour quitter la page des articles
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_precdentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_precdentActionPerformed
        // Pour revenir 
         Gestion_Article gs = new Gestion_Article();
        gs.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_btn_precdentActionPerformed

    private void btn_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechActionPerformed
// pour faire une recherche
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        } catch (SQLException ex) {
            Logger.getLogger(Modification_Article.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txt_recher.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer une information de recherche");
        } else if (cbx_rech.getSelectedItem().equals("Reference")) {
            try {
                String sql = "select * from article where reference = '" + txt_recher.getText() + "'";

                prst = conn.prepareStatement(sql);
                rst = prst.executeQuery();
                table.setModel(DbUtils.resultSetToTableModel(rst));
            } catch (SQLException ex) {
                Logger.getLogger(Modification_Article.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btn_rechActionPerformed


    private void btn_affichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_affichActionPerformed
      // appelle de la methode d'affichage
        affichage();
    }//GEN-LAST:event_btn_affichActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         /*remplissage de tout les champs de l'interface article lorsque 
        l'utilsateur selectionne un article dans la liste de jtable */
        txt_ref.setText((String) table.getValueAt(table.getSelectedRow(), 0));
        txt_des.setText((String) table.getValueAt(table.getSelectedRow(), 1));
        txt_fab.setText((String) table.getValueAt(table.getSelectedRow(), 2));
        txt_unit.setText((String) table.getValueAt(table.getSelectedRow(), 3));
        txt_delai.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 4)));
        txt_stand.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 5)));
        txt_lot.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 6)));
        txt_mini.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 7)));
        txt_maxi.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 8)));
        txt_pourecntage.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 9)));
        txt_inv.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 10)));
        cbx_arti.setSelectedItem(table.getValueAt(table.getSelectedRow(), 11));
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Modification_Article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modification_Article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modification_Article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modification_Article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modification_Article().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_affich;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_precdent;
    private javax.swing.JButton btn_rech;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox<String> cbx_arti;
    private javax.swing.JComboBox<String> cbx_rech;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_delai;
    private javax.swing.JTextField txt_des;
    private javax.swing.JTextField txt_fab;
    private javax.swing.JTextField txt_inv;
    private javax.swing.JTextField txt_lot;
    private javax.swing.JTextField txt_maxi;
    private javax.swing.JTextField txt_mini;
    private javax.swing.JTextField txt_pourecntage;
    private javax.swing.JTextField txt_recher;
    private javax.swing.JTextField txt_ref;
    private javax.swing.JTextField txt_stand;
    private javax.swing.JTextField txt_unit;
    // End of variables declaration//GEN-END:variables
}
