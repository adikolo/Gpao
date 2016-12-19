/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpao_V_1_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.apache.derby.iapi.sql.ResultSet;

/**
 *
 * @author Assane Adirou
 */
public class Operation extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement prst;
    java.sql.ResultSet rst;

    /**
     * Creates new form Operation
     */
    /**
     * Creates new form Operation
     *
     * @throws java.sql.SQLException
     */
    
    // remplissage des element fesant reference a la designation des articles dans le combo
    
    public void rempli_combo_game_fabriation() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select designation from article";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String des = rst.getString("designation");
            cbx_gamme.addItem(des);

        }
    }

  // remplissage des element fesant reference a la main d'oeuvre de la section dans le combo

    public void rempli_combo_main_oeurvr_section() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select main_d_oeuvre_section from Poste_de_charge";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String mos = rst.getString("main_d_oeuvre_section");
            cbx_mo_section.addItem(mos);

        }
    }

      // remplissage des element fesant reference a la main d'oeuvre de la ss_section dans le combo
    public void rempli_combo_main_oeurvr_ss_section() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select main_d_oeuvre_sous_section from Poste_de_charge";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String mos = rst.getString("main_d_oeuvre_sous_section");
            cbx_moe_ss_xection.addItem(mos);

        }
    }
  // remplissage des element fesant reference au numero de la section dans le combo
    public void rempli_combo_section() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select numero_section from Poste_de_charge";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String mos = rst.getString("numero_section");
            combo_section.addItem(mos);

        }
    }

      // remplissage des element fesant reference au numero de la ss_section dans le combo
    public void rempli_combo_ss_section() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select numero_sous_section from Poste_de_charge";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String mos = rst.getString("numero_sous_section");
            combo_ss_section.addItem(mos);

        }
    }
 // remplissage des element fesant reference a la machine dans le combo
    public void rempli_combo_machine() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
        String req = "select est_machine from Poste_de_charge";

        prst = conn.prepareStatement(req);

        rst = prst.executeQuery();

        while (rst.next()) {
            String mos = rst.getString("est_machine");
            cbx_machine.addItem(mos);

        }
    }
// vider les champs
    public void vider() {
        txt_lib_op.setText("");
        txt_num_op.setText("");
        txt_temp_exec.setText("");
        txt_temp_prep.setText("");
        txt_temp_tansf.setText("");

    }
// affichage dan sla jtable
    public void affichage() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");

            String req = "select *from Operation";
            prst = conn.prepareStatement(req);
            rst = prst.executeQuery();
            table_operation.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "impossible de rempli la table" + ex.getMessage());
        }

    }
// constructeur d'objet
    public Operation() throws SQLException {
        initComponents();
        affichage();
        rempli_combo_game_fabriation();
        rempli_combo_main_oeurvr_section();
        rempli_combo_main_oeurvr_ss_section();
        rempli_combo_section();
        rempli_combo_ss_section();
        rempli_combo_machine();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbx_gamme = new javax.swing.JComboBox<>();
        txt_num_op = new javax.swing.JTextField();
        combo_ss_section = new javax.swing.JComboBox<>();
        cbx_machine = new javax.swing.JComboBox<>();
        combo_section = new javax.swing.JComboBox<>();
        cbx_machine3 = new javax.swing.JComboBox<>();
        cbx_mo_section = new javax.swing.JComboBox<>();
        cbx_moe_ss_xection = new javax.swing.JComboBox<>();
        txt_temp_prep = new javax.swing.JTextField();
        txt_temp_exec = new javax.swing.JTextField();
        txt_temp_tansf = new javax.swing.JTextField();
        txt_lib_op = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_enr = new javax.swing.JButton();
        btn_modif = new javax.swing.JButton();
        btn_supp = new javax.swing.JButton();
        btn_rese = new javax.swing.JButton();
        btn_prec = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_operation = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gamme De Fabrication ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero Operation");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Poste De Charge Section");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Poste De Charge Sous Section ");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Machine Poste de charge");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Main D'oeuvre Numero Section");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Main D'oeuvre Machine");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Temps Preparation");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Main D'oeuvre Numero Sous-Section");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Libelle Operation ");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Temps Execution ");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Temps Transfert");

        cbx_gamme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_gammeActionPerformed(evt);
            }
        });

        combo_ss_section.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        combo_ss_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ss_sectionActionPerformed(evt);
            }
        });

        cbx_machine.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        combo_section.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cbx_machine3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbx_machine3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", " " }));

        txt_temp_prep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_temp_prepActionPerformed(evt);
            }
        });

        txt_temp_exec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_temp_execActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_rese)
                        .addComponent(btn_quitter))
                    .addComponent(btn_prec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_operation.setModel(new javax.swing.table.DefaultTableModel(
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
        table_operation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_operationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_operation);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Gpao Version 1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_section, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbx_mo_section, 0, 167, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel13))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(combo_ss_section, 0, 189, Short.MAX_VALUE)
                                                .addComponent(cbx_machine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGap(66, 66, 66)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_lib_op, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_temp_exec, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_temp_tansf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbx_gamme, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_num_op, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(65, 65, 65)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_temp_prep, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbx_moe_ss_xection, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbx_machine3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cbx_gamme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(cbx_moe_ss_xection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_num_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(cbx_machine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_temp_prep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combo_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_ss_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_temp_exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbx_machine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_temp_tansf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbx_mo_section, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_lib_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_temp_prepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_temp_prepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_temp_prepActionPerformed

    private void txt_temp_execActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_temp_execActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_temp_execActionPerformed

    private void btn_enrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enrActionPerformed
        try {
            // Pour un enregistrement dans la base de donnée:

            conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String sql = "insert into operation (gamme_de_fabrication,numero_operation,machine_numero_section,machine_numero_sous_section ,machine_est_machine,main_d_oeuvre_numero_section,main_d_oeuvre_numero_sous_section,main_d_oeuvre_est_machine,temps_preparation,temps_execution,temps_transfert,libelle_operation) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            prst = conn.prepareStatement(sql);
            prst.setString(1, (String) cbx_gamme.getSelectedItem());
            prst.setString(2, txt_num_op.getText());
            prst.setString(3, (String) combo_section.getSelectedItem());
            prst.setString(4, (String) combo_ss_section.getSelectedItem());
            prst.setString(5, (String) cbx_machine.getSelectedItem());
            prst.setString(6, (String) cbx_mo_section.getSelectedItem());
            prst.setString(7, (String) cbx_moe_ss_xection.getSelectedItem());
            prst.setString(8, (String) cbx_machine3.getSelectedItem());
            prst.setString(9, txt_temp_prep.getText());
            prst.setString(10, txt_temp_exec.getText());
            prst.setString(11, txt_temp_tansf.getText());
            prst.setString(12, txt_lib_op.getText());
            prst.execute();
            affichage();
            JOptionPane.showMessageDialog(null, "insertion Reussi !!! Merci");
            vider();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "impossible d'inserer dans la base de donnée" + ex.getMessage());

        }

    }//GEN-LAST:event_btn_enrActionPerformed

    private void btn_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifActionPerformed
        try {
            // pour modifier un operation

            conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
            String req = " update Operation set gamme_de_fabrication =?,numero_operation=?,machine_numero_section=?,machine_numero_sous_section=? ,machine_est_machine=?,main_d_oeuvre_numero_section=?,main_d_oeuvre_numero_sous_section=?,main_d_oeuvre_est_machine=?,temps_preparation=?,temps_execution=?,temps_transfert=?,libelle_operation=?  where gamme_de_fabrication='" + cbx_gamme.getSelectedItem() + " '";
            prst = conn.prepareStatement(req);
            prst.setString(1, (String) cbx_gamme.getSelectedItem());
            prst.setString(2, txt_num_op.getText());
            prst.setString(3, (String) combo_section.getSelectedItem());
            prst.setString(4, (String) combo_ss_section.getSelectedItem());
            prst.setString(5, (String) cbx_machine.getSelectedItem());
            prst.setString(6, (String) cbx_mo_section.getSelectedItem());
            prst.setString(7, (String) cbx_moe_ss_xection.getSelectedItem());
            prst.setString(8, (String) cbx_machine3.getSelectedItem());
            prst.setString(9, txt_temp_prep.getText());
            prst.setString(10, txt_temp_exec.getText());
            prst.setString(11, txt_temp_tansf.getText());
            prst.setString(12, txt_lib_op.getText());
            prst.execute();
            affichage();
            JOptionPane.showMessageDialog(null, "Modification reussie");
            vider();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "modification impossible" + ex.getMessage());
        }


    }//GEN-LAST:event_btn_modifActionPerformed

    private void btn_suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suppActionPerformed
        // Pour supprimer dans la base de donnée
try {
          conn = DriverManager.getConnection("jdbc:derby:Gpao_v_1");
       
        } catch (SQLException ex) {
        }


        if (JOptionPane.showConfirmDialog(null, "attention vous voulez Supprimer une Operation,  etes vous sur?",
                "Supprimer Opération", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

            try {
                String requete = "delete from Operation  where gamme_de_fabrication ='" + cbx_gamme.getSelectedItem() +   "'";
                prst = conn.prepareStatement(requete);
                prst.execute();
                table_operation.setModel(DbUtils.resultSetToTableModel(rst));
                affichage();
                vider();
                JOptionPane.showMessageDialog(null, "Operation supprimé avec succès !!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "impossible de supprimé l'Operation !!!" + ex.getMessage());
            }

        }

    }//GEN-LAST:event_btn_suppActionPerformed

    private void btn_reseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reseActionPerformed
        // Pour vider es champs
        vider();

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

    private void combo_ss_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ss_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_ss_sectionActionPerformed

    private void table_operationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_operationMouseClicked
        // Affichage des éléments du tableaux dans les champs de saisir

        cbx_gamme.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 0)));
        txt_num_op.setText(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 1)));
        combo_section.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 2)));
        combo_ss_section.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 3)));
        cbx_machine.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 4)));
        cbx_mo_section.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 5)));
        cbx_moe_ss_xection.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 6)));
        cbx_machine3.setSelectedItem(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 7)));
        txt_temp_prep.setText(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 8)));
        txt_temp_exec.setText(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 9)));
        txt_temp_tansf.setText(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 10)));
        txt_lib_op.setText(String.valueOf(table_operation.getValueAt(table_operation.getSelectedRow(), 11)));


    }//GEN-LAST:event_table_operationMouseClicked

    private void cbx_gammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_gammeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_gammeActionPerformed

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
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Operation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JComboBox<String> cbx_gamme;
    private javax.swing.JComboBox<String> cbx_machine;
    private javax.swing.JComboBox<String> cbx_machine3;
    private javax.swing.JComboBox<String> cbx_mo_section;
    private javax.swing.JComboBox<String> cbx_moe_ss_xection;
    private javax.swing.JComboBox<String> combo_section;
    private javax.swing.JComboBox<String> combo_ss_section;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_operation;
    private javax.swing.JTextField txt_lib_op;
    private javax.swing.JTextField txt_num_op;
    private javax.swing.JTextField txt_temp_exec;
    private javax.swing.JTextField txt_temp_prep;
    private javax.swing.JTextField txt_temp_tansf;
    // End of variables declaration//GEN-END:variables
}
