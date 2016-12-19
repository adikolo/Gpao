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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Assane Adirou
 */
public final class Lien_Nomenclature extends javax.swing.JFrame {
// declaration des variables
    PreparedStatement prst;
    ResultSet rst;
    Connection conn = null;

    /**
     * Creates new form Lien_Nomenclature
     */
    // methode pour le remplissage des combo fesant reference aux differnts reference_articles
    public void rempli_combo_ref() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req1 = "select reference from article";

        prst = conn.prepareStatement(req1);

        rst = prst.executeQuery();

        while (rst.next()) {
            String des = rst.getString("reference");
            cbx_ref_art.addItem(des);

        }
    }
// methode pour le remplissage des combo fesant reference aux differnts designation_articles
    public void rempli_combo_design() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select designation from article";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String des = rst.getString("designation");
            cbx_desgn.addItem(des);

        }
    } 
    
    // la recherche 
    public void rempli_combo_recherche() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select designation from article";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String des = rst.getString("designation");
            cbx_rech_lien.addItem(des);

        }
    }
    // remplissage du combo de l'element compose
    public void rempli_combo_compose() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req2 = "select reference from article";

        prst = conn.prepareStatement(req2);

        rst = prst.executeQuery();

        while (rst.next()) {
            String des = rst.getString("reference");
            cbx_compo.addItem(des);

        }
    }
 // remplissage du combo de l'element composant
    public void rempli_combo_composant() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req3 = "select reference from article";

        prst = conn.prepareStatement(req3);

        rst = prst.executeQuery();

        while (rst.next()) {
            String des = rst.getString("reference");
            cbx_composant.addItem(des);

        }
    }
    
// methode pour afficher tout les liens de nomenclature
    
    public void affichage() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String req = "select *from Lien_de_nomenclature";
            prst = conn.prepareStatement(req);
            rst = prst.executeQuery();
            table_Lien_n.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException ex) {
            Logger.getLogger(Lien_Nomenclature.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
// vides les champs necessaires
    public void vider() {
        txt_qt_compo.setText(null);

    }
// constructeur
    public Lien_Nomenclature() {
        initComponents();
        try {

            rempli_combo_ref();
            rempli_combo_design();
            rempli_combo_compose();
            rempli_combo_composant();
            rempli_combo_recherche();
            affichage();

        } catch (SQLException ex) {
            Logger.getLogger(Lien_Nomenclature.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_qt_compo = new javax.swing.JTextField();
        cbx_desgn = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Btn_Sup = new javax.swing.JButton();
        btn_Enr = new javax.swing.JButton();
        btn_aff = new javax.swing.JButton();
        btn_Modif = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Prec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Lien_n = new javax.swing.JTable();
        cbx_compo = new javax.swing.JComboBox<>();
        cbx_composant = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbx_ref_art = new javax.swing.JComboBox<>();
        btn_quitter = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbx_rech_lien = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lien Nomenclature", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Designation Article");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compose");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Composant ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantite De Composition ");

        cbx_desgn.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbx_desgnPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        Btn_Sup.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Btn_Sup.setText("Supprimer");
        Btn_Sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SupActionPerformed(evt);
            }
        });

        btn_Enr.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_Enr.setText("Enregistrer");
        btn_Enr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnrActionPerformed(evt);
            }
        });

        btn_aff.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_aff.setText("Affichage");
        btn_aff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_affActionPerformed(evt);
            }
        });

        btn_Modif.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_Modif.setText("Modifier");
        btn_Modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifActionPerformed(evt);
            }
        });

        btn_Reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Prec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_Prec.setText("Precedent");
        btn_Prec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btn_Enr, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Modif, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_aff, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Prec, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Enr)
                    .addComponent(Btn_Sup)
                    .addComponent(btn_Modif))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aff)
                    .addComponent(btn_Reset)
                    .addComponent(btn_Prec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_Lien_n.setModel(new javax.swing.table.DefaultTableModel(
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
        table_Lien_n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_Lien_nMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Lien_n);

        cbx_compo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbx_compoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cbx_composant.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbx_composantPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reference Article");

        cbx_ref_art.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbx_ref_artPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btn_quitter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_quitter.setText("Quitter");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gpao Version 1.0");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reference Article");

        cbx_rech_lien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbx_rech_lien.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbx_rech_lienPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton8.setText("Rechercher");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbx_rech_lien, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cbx_rech_lien)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbx_compo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_desgn, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_ref_art, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_composant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_qt_compo))
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel14))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_quitter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_ref_art))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_desgn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbx_compo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_composant, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_qt_compo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_desgnPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbx_desgnPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cbx_desgnPopupMenuWillBecomeInvisible

    private void Btn_SupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SupActionPerformed
        // Suppression d'un lien de nomenclature dans la base de donnée
         Connection conn = null ;
            try {
          conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
      } catch (SQLException ex) {
          Logger.getLogger(Suppression_Article.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        if (JOptionPane.showConfirmDialog(null, "attention vous voulez Lien de Nomenclature, vous etes sur?",
                    "Supprimer Lien de nomenclature", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

             try {
                 String requete = "delete from Lien_de_nomenclature where compose = '" + cbx_compo.getSelectedItem()+ "' and composant ='" + cbx_composant.getSelectedItem()+"'";
                 prst = conn.prepareStatement(requete);
                 prst.execute();
                  table_Lien_n.setModel(DbUtils.resultSetToTableModel(rst));
                  affichage();
                  vider();
                 JOptionPane.showMessageDialog(null,"Lien de Nomenclature supprimé avec succès !!!");
             } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"impossible de supprimé le lien de nomenclature !!!" + ex.getMessage());
             }
        
        
    }                        
         
    }//GEN-LAST:event_Btn_SupActionPerformed

    private void btn_affActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_affActionPerformed
        // Affichage de tout les Liens de nomenclature dans la jtable
        affichage();
    }//GEN-LAST:event_btn_affActionPerformed

    private void btn_ModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifActionPerformed
        // Pour modifer un lien de nomenclature
        if (txt_qt_compo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner la case Quantité de composition pour valider la modification");
        } else {

            try {

                Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
                String req = "update Lien_de_nomenclature set ref_art =?,des_art =?,compose =?,composant=?,quantite_de_composition =? where compose = '" + cbx_compo.getSelectedItem() + "' and composant ='" + cbx_composant.getSelectedItem() + "'";

                prst = conn.prepareStatement(req);

                prst.setString(1, (String) cbx_ref_art.getSelectedItem());
                prst.setString(2, (String) cbx_desgn.getSelectedItem());
                prst.setString(3, (String) cbx_compo.getSelectedItem());
                prst.setString(4, (String) cbx_composant.getSelectedItem());
                prst.setString(5, txt_qt_compo.getText());
                prst.execute();
                affichage();
                JOptionPane.showMessageDialog(null, "Modification Reussi !!! Merci");
                vider();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ok " + ex.getMessage());
            }
        
    }//GEN-LAST:event_btn_ModifActionPerformed
         
    }
    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        // Pour reinitialiser les champs,particulièrement le champ quantité de composition 
        vider();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_PrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrecActionPerformed
        // Retour en arrière
         Menu_Gpao mpr = new Menu_Gpao();
        mpr.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_btn_PrecActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {                                         
            try {
                // Pour recherche dans la jtable en fonction de la designation d'article selectionné
                conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            } catch (SQLException ex) {
                Logger.getLogger(Lien_Nomenclature.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String req = "select * from Lien_de_nomenclature where  des_art= '" + cbx_rech_lien.getSelectedItem()+ "'";
            prst = conn.prepareStatement(req);
            rst = prst.executeQuery();
            table_Lien_n.setModel(DbUtils.resultSetToTableModel(rst));
            
        } catch (SQLException ex) {
            Logger.getLogger(Lien_Nomenclature.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cbx_ref_artPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbx_ref_artPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ref_artPopupMenuWillBecomeInvisible

    private void cbx_compoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbx_compoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_compoPopupMenuWillBecomeInvisible

    private void cbx_composantPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbx_composantPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_composantPopupMenuWillBecomeInvisible

    private void table_Lien_nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Lien_nMouseClicked
        // Selection d'un lien de nomenclature dans la jtable en vue d'affichage dans les champs de saisi

        cbx_ref_art.setSelectedItem(table_Lien_n.getValueAt(table_Lien_n.getSelectedRow(), 0));
        cbx_desgn.setSelectedItem(table_Lien_n.getValueAt(table_Lien_n.getSelectedRow(), 1));
        cbx_compo.setSelectedItem(table_Lien_n.getValueAt(table_Lien_n.getSelectedRow(), 2));
        cbx_composant.setSelectedItem(table_Lien_n.getValueAt(table_Lien_n.getSelectedRow(), 3));
        txt_qt_compo.setText(String.valueOf(table_Lien_n.getValueAt(table_Lien_n.getSelectedRow(), 4)));
    }//GEN-LAST:event_table_Lien_nMouseClicked

    private void btn_EnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnrActionPerformed
       
        // enregistrement d'un lien de nomenclature dans la base de donnée
        if (txt_qt_compo.getText().equals("")){
         JOptionPane.showMessageDialog(this, "Veuillez renseigner la case Quantité de composition"); 
        } else{
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String req = "insert into Lien_de_nomenclature(ref_art,des_art,compose,composant,quantite_de_composition) values(?,?,?,?,?)";
            prst = conn.prepareStatement(req);
            prst.setString(1, (String) cbx_ref_art.getSelectedItem());
            prst.setString(2, (String) cbx_desgn.getSelectedItem());
            prst.setString(3, (String) cbx_compo.getSelectedItem());
            prst.setString(4, (String) cbx_composant.getSelectedItem());
            prst.setString(5, txt_qt_compo.getText());
            prst.execute();
            affichage();
            JOptionPane.showMessageDialog(null, "insertion Reussi !!! Merci");
            vider();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-----" + ex.getMessage());
        }
        
        }
        
    }//GEN-LAST:event_btn_EnrActionPerformed

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
        // pour quitter la page des articles
        this.dispose();
    }//GEN-LAST:event_btn_quitterActionPerformed

    private void cbx_rech_lienPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbx_rech_lienPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_rech_lienPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(Lien_Nomenclature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lien_Nomenclature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lien_Nomenclature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lien_Nomenclature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lien_Nomenclature().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Sup;
    private javax.swing.JButton btn_Enr;
    private javax.swing.JButton btn_Modif;
    private javax.swing.JButton btn_Prec;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_aff;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JComboBox<String> cbx_compo;
    private javax.swing.JComboBox<String> cbx_composant;
    private javax.swing.JComboBox<String> cbx_desgn;
    private javax.swing.JComboBox<String> cbx_rech_lien;
    private javax.swing.JComboBox<String> cbx_ref_art;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Lien_n;
    private javax.swing.JTextField txt_qt_compo;
    // End of variables declaration//GEN-END:variables
}