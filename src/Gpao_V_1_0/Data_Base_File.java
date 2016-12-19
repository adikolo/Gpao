/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpao_V_1_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Assane Adirou
 */
public class Data_Base_File {

    /*Methode pour etablir la connexion*/
    public Connection se_connecter() {
        /* execution au moin une fois de ce bloc de try-catch au demarrage de l'application*/
        try {
            /* Chargement de l'intergiciel qui sert d'intermediaire entre, 
            l'application et la base de donnée */
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            /* Affichage de la trace du chargement de l'intergiciel*/
            System.out.print("intergiciel chargée avec succès !!! \n");
            /* le lien de creation de la base de donnée*/
            String dbURL1 = "jdbc:derby:Gpao_v_1;create=true ";
            /*Recuperation de la connexion a la base de donnée crée*/
            Connection con = DriverManager.getConnection(dbURL1);
            /*Affichage de la trace de connexion a la base de donnée*/
            if (con != null) {

                System.out.println("1-Connexion via jdbc a la base de donnée etablie !!! ");
                return con;

            }
        } catch (SQLException ex) {
            /*Affichage de la trace de l'echec de connexion a la base de donnée*/
            System.out.println("impossible de se connecter a la Bd");
        }

        return null;
    }

    /*procedure de creation des tables dans la base de donnée*/
    public void Creation() throws SQLException {
        /* recuperation de la connexion a la base de donnée avant la creation des differentes tables dans cette base*/
        Connection con = DriverManager.getConnection("jdbc:derby:Gpao_v_1 ");
        Statement stmt;
        stmt = con.createStatement();
        /*creation de la table utilisateur dans la base*/
        stmt.execute("create table utilisateur (login varchar(20), password varchar(10))");
        /*affichage de la trace d'execution de la creation de la table utilisateur*/
        System.out.println(" 2-creation de table utilisateur reussii !!!");
        /*insertion des données dans la table utilisateur dans la base*/
        stmt.execute("insert into utilisateur values ('admin','admin')");
           
               
        /*affichage de la trace d'execution de l'insertion dans table utilisateur*/
        System.out.println("3-insertion de table utilisateur reussii !!!");
        /*creation de la table article dans la base*/
        stmt.execute("create table Article ( reference varchar(30),designation varchar(30) not null,\n"
                + "type_fabrication_achat varchar(30) not null, \n"
                + "unite_achat_stock varchar(30) not null,\n"
                + "delai_en_semaine integer not null,\n"
                + "prix_standard float,\n"
                + "lot_de_reapprovisionnement integer,\n"
                + "stock_mini integer,\n"
                + "stock_maxi integer,\n"
                + "pourcentage_de_perte float,\n"
                + "inventaire integer,\n"
                + "PF_ou_MP_ou_Piece_ou_SE char(2),\n"
                + "constraint Article_pk primary key(reference),\n"
                + "constraint Article_unique unique(designation),\n"
                + "constraint Article_check check(PF_ou_MP_ou_Piece_ou_SE = 'PF' or PF_ou_MP_ou_Piece_ou_SE = 'MP' or PF_ou_MP_ou_Piece_ou_SE = 'PI' or PF_ou_MP_ou_Piece_ou_SE = 'SE') )");
        /*affichage de la trace d'execution de la creation de la table article*/
        System.out.println("4-creation de table article reussii !!!");
        /*insertion des données dans la table article*/
        stmt.execute("insert into Article values('ES000','essieu monte','fabr. par lot','unite',2,300,500,750,1500,3,1700,'SE')");
        stmt.execute("insert into Article values('CH005','chassis monte','fabr. par lot','unite',1,5,300,800,900,2,1850,'SE')");
        stmt.execute("insert into Article values ('H000','conteneur bleu','fabr. par lot','unite',1,100,150,350,800,1,2000,'SE')");
        stmt.execute("insert into Article values('H001','conteneur bleu special','fabr. a la commande','unite',1,350,150,350,4000,2,3000,'SE')");
        /*affichage de la trace d'insertion dans la table article*/
        System.out.println("5-insertion dans table article reussii !!!");
        /*creation de la table lien nomenclature dans la base*/
        stmt.execute("  create table Lien_de_nomenclature(\n"
                + "     ref_art varchar(30),\n"
                + "     des_art varchar(30),\n"
                + "	compose varchar(30),\n"
                + "	composant varchar(30),\n"
                + "	quantite_de_composition float not null,\n"
                + "	constraint Lien_de_nomenclature_pk primary key(compose,composant),\n"
                + "	constraint Lien_de_nomenclature_fk_1 foreign key(compose) references Article(reference) on delete cascade,\n"
                + "	constraint Lien_de_nomenclature_fk_2 foreign key(composant) references Article(reference) on delete cascade)");
        /*affichage de la trace de creation de la table lien de nomenclature*/
        System.out.println("6-creaton de la table nomenclature !!!");
        /*creation de la table remplacement dans la base*/
        stmt.execute("  create table Remplacement(\n"
                + "	arti_remplace varchar(30),\n"
                + "	remplace_compose varchar(30),\n"
                + "	remplace_composant varchar(30),\n"
                + "     art_rempcant varchar(30),\n"
                + " 	remplacant_compose varchar(30),\n"
                + "	remplacant_composant varchar(30),\n"
                + "	date_de_remplacement date not null,\n"
                + "	constraint Remplacement_fk_1 foreign key(remplace_compose,remplace_composant) references Lien_de_nomenclature(compose,composant) on delete cascade,\n"
                + "	constraint Remplacement_fk_2 foreign key(remplacant_compose,remplacant_composant) references Lien_de_nomenclature(compose,composant) on delete cascade)");
        /*affichage de la trace de creation de la table remplacement dans la base*/
        System.out.println("7-creation de la table remplacement reussi !!!");
        /*creation de la table Poste de charge dans la base*/
        stmt.execute("   create table Poste_de_charge( \n"
                + "     numero_section varchar(20),\n"
                + "	main_d_oeuvre_section integer not null,\n"
                + "	numero_sous_section varchar(20),\n"
                + "	main_d_oeuvre_sous_section integer not null,\n"
                + "	est_machine varchar(20) not null,\n"
                + "	main_d_oeuvre_machine integer not null,\n"
                + "	designation varchar(30) not null,\n"
                + "	taux_horaire_ou_forfait integer not null,\n"
                + "	nombre_de_postes integer not null,\n"
                + "	capacite_nominale integer not null,\n"
                + "	type_taux_horaire_ou_forfait char(2) not null,\n"
                + "	constraint Poste_de_charge_pk primary key(numero_section,numero_sous_section,est_machine),\n"
                + "	constraint Poste_de_charge_check_2 check(type_taux_horaire_ou_forfait = 'TH' or type_taux_horaire_ou_forfait = 'F'))");
        /*affichage de la trace de creation de la table poste de charge dans la base*/
        System.out.println("8-creation de la tab poste de charge reussi");
        /*creation de la table operation dans la base*/
        stmt.execute(" create table Operation(\n"
                + "	gamme_de_fabrication varchar(30),\n"
                + "	numero_operation integer,\n"
                + "	machine_numero_section integer,\n"
                + "	machine_numero_sous_section integer,\n"
                + "	machine_est_machine integer,\n"
                + "	main_d_oeuvre_numero_section integer,\n"
                + "	main_d_oeuvre_numero_sous_section integer,\n"
                + "	main_d_oeuvre_est_machine integer,\n"
                + "	temps_preparation integer,\n"
                + "	temps_execution integer,\n"
                + "	temps_transfert integer not null,\n"
                + "	libelle_operation varchar(30) not null,\n"
                + "	constraint Operation_pk primary key(gamme_de_fabrication,numero_operation))");
        /*affichage de la trace de creation de la table operation dans la base*/
        System.out.println("9-creation de la table operation reussi");
        /*creation de la table mouvement de stock dans la base*/
        stmt.execute("create table Mouvement_de_stock(\n"
                + "	reference varchar(30),\n"
                + "	numero_magasin integer,\n"
                + "	quantite integer,\n"
                + "	periode date,\n"
                + "	type char(6) not null,\n"
                + "	constraint Mouvement_de_stock_fk foreign key(reference) references Article(reference),\n"
                + "	constraint Mouvement_de_stock_check check(type = 'Entree' or type = 'Sortie'))");
        /*affichage de la trace de creation de la table mouvement de stock dans la base*/
        System.out.println("10-creation de table Mouvement de stock reussi !!!");
        /*affichage de la trace de creation,d'insertion dans toutes les tables de la base*/
        System.out.println("11-Creation et insertion dans toute le table de Gpao_V_1");

    }

}
