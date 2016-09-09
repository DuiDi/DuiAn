/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duian;

import java.awt.Button;
import java.awt.Insets;
import javax.swing.JButton;
import java.util.Vector;

/**
 *
 * @author DydyBook
 */
public final class AppliDuiAn extends javax.swing.JFrame {
    
    
    //Variables globales
    int i = 0           ; 
    String[] queries    ;
    String[] answers    ;
    String[][] choices  ; 
    String[] help       ;
    String path = "/Users/DydyBook/NetBeansProjects/DuiAn/DuiAn/src/duian/Regions/";
    String[] regions = new String[4];
    JButton boutonTemp = new JButton();
            
    //Création objets
    Carte map = new Carte();
    Categorie cat = new Categorie();
    QCM quiz = new QCM();
    
    /**
     * Creates new form AppliDuiAn
     */
    public AppliDuiAn() {
        initComponents();
        
        //Eléments rendus invisibles
        PanelAide.setVisible(false);
        LabelAidePanda.setVisible(false);
        BoutonIndice.setVisible(false);
        jTabbedPane1.setVisible(false);
        ListeCategories.setVisible(false);
        LabelNomCategorie.setVisible(false);
        LabelReponse.setVisible(false);
        LabelNomRegion.setVisible(false);
        PanelReponse.setVisible(false);
        BoutonNextQuestion.setVisible(false);
        BoutonRevenirRegion.setVisible(false);
        BoutonValiderCategorie.setVisible(false);
        PanelReponse.setVisible(false);
        LabelQuestion.setVisible(false);
        
        //Récupération des régions
        regions = map.GetRegions();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PanelReponse = new javax.swing.JPanel();
        LabelReponse = new javax.swing.JLabel();
        LabelNomCategorie = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeChoix = new javax.swing.JList<>();
        BoutonValider = new javax.swing.JButton();
        PanelAide = new javax.swing.JPanel();
        LabelAidePanda = new javax.swing.JLabel();
        BoutonIndice = new javax.swing.JButton();
        LabelQuestion = new javax.swing.JLabel();
        LabelNomRegion = new javax.swing.JLabel();
        BoutonNord = new javax.swing.JButton();
        BoutonOuest = new javax.swing.JButton();
        BoutonSud = new javax.swing.JButton();
        BoutonEst = new javax.swing.JButton();
        BoutonNextQuestion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListeCategories = new javax.swing.JList<>();
        BoutonValiderCategorie = new javax.swing.JButton();
        BoutonRevenirRegion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jPanel7.setBackground(new java.awt.Color(255, 255, 102));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));

        PanelReponse.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelReponse.setBackground(new java.awt.Color(0, 255, 204));
        LabelReponse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelReponse.setText("Réponse");

        javax.swing.GroupLayout PanelReponseLayout = new javax.swing.GroupLayout(PanelReponse);
        PanelReponse.setLayout(PanelReponseLayout);
        PanelReponseLayout.setHorizontalGroup(
            PanelReponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReponseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelReponse, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelReponseLayout.setVerticalGroup(
            PanelReponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReponseLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(LabelReponse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        LabelNomCategorie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomCategorie.setText("Catégorie");
        LabelNomCategorie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setViewportView(ListeChoix);

        BoutonValider.setText("Valider");

        PanelAide.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout PanelAideLayout = new javax.swing.GroupLayout(PanelAide);
        PanelAide.setLayout(PanelAideLayout);
        PanelAideLayout.setHorizontalGroup(
            PanelAideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelAidePanda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAideLayout.setVerticalGroup(
            PanelAideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAideLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(LabelAidePanda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BoutonIndice.setText("Un indice ?");
        BoutonIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonIndiceActionPerformed(evt);
            }
        });

        LabelQuestion.setBackground(new java.awt.Color(255, 255, 255));
        LabelQuestion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelReponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(LabelNomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LabelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelAide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BoutonIndice)
                                        .addGap(8, 8, 8))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(BoutonValider)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelNomCategorie)
                .addGap(18, 18, 18)
                .addComponent(LabelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BoutonIndice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoutonValider)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelReponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(87, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quiz", jPanel1);

        LabelNomRegion.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        LabelNomRegion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomRegion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(153, 153, 153)));

        BoutonNord.setActionCommand("Langue");
        BoutonNord.setLabel("Langue");
        BoutonNord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonNordActionPerformed(evt);
            }
        });

        BoutonOuest.setLabel("Culture pop moderne");
        BoutonOuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonOuestActionPerformed(evt);
            }
        });

        BoutonSud.setText("Histoire et Géographie");
        BoutonSud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonSudActionPerformed(evt);
            }
        });

        BoutonEst.setText("Us et Coutumes");
        BoutonEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonEstActionPerformed(evt);
            }
        });

        BoutonNextQuestion.setText("Commencer");
        BoutonNextQuestion.setName(""); // NOI18N
        BoutonNextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonNextQuestionActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ListeCategories);

        BoutonValiderCategorie.setText("Valider");
        BoutonValiderCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonValiderCategorieActionPerformed(evt);
            }
        });

        BoutonRevenirRegion.setText("Revenir au menu");
        BoutonRevenirRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRevenirRegionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(BoutonNextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BoutonRevenirRegion)
                                .addGap(72, 72, 72)))
                        .addComponent(LabelNomRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(BoutonNord))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(BoutonValiderCategorie))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BoutonSud)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(BoutonOuest))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(BoutonEst))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(LabelNomRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BoutonNextQuestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoutonRevenirRegion)))
                .addGap(41, 41, 41)
                .addComponent(BoutonNord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(BoutonSud)
                        .addGap(18, 18, 18)
                        .addComponent(BoutonEst)
                        .addGap(18, 18, 18)
                        .addComponent(BoutonOuest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BoutonValiderCategorie)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonRevenirRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRevenirRegionActionPerformed
        SetInvisibleHorsQuiz();//Eléménts rendus invisibles

        SetBoutonsRegionsVisibles();
    }//GEN-LAST:event_BoutonRevenirRegionActionPerformed

    private void BoutonNextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonNextQuestionActionPerformed

        SetBoutonsRegionsInvisibles();
        
        BoutonNextQuestion.setText("Question suivante");

        LabelNomCategorie.setText(cat.GetNom());
        LabelQuestion.setText(queries[i]);

        LabelReponse.setText(answers[i]);
        LabelAidePanda.setText(help[i]);
        LabelAidePanda.setVisible(false);
        CreerItemChoix();

        i++;
    }//GEN-LAST:event_BoutonNextQuestionActionPerformed

    private void BoutonEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonEstActionPerformed
        SetVisibleQuiz();//Affichage des éléments nécessaires au quiz

        SetBoutonsRegionsInvisibles();

        //Récupération informations par région
        LabelNomRegion.setText(BoutonEst.getText());
        ListeCategories.setListData(map.GetRegionSpec(BoutonEst.getText()));
        ListeCategories.setVisible(true);
        
        //On récupère le bouton cliqué
        boutonTemp = BoutonEst;
    }//GEN-LAST:event_BoutonEstActionPerformed

    private void BoutonSudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonSudActionPerformed
        SetVisibleQuiz();//Affichage des éléments nécessaires au quiz
        
        SetBoutonsRegionsInvisibles();

        //Récupération informations par région
        LabelNomRegion.setText(BoutonSud.getText());
        ListeCategories.setListData(map.GetRegionSpec(BoutonSud.getText()));
        ListeCategories.setVisible(true);
        
        //On récupère le bouton cliqué
        boutonTemp = BoutonSud;
    }//GEN-LAST:event_BoutonSudActionPerformed

    private void BoutonOuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonOuestActionPerformed
        SetVisibleQuiz();//Affichage des éléments nécessaires au quiz

        SetBoutonsRegionsInvisibles();

        //Récupération informations par région
        LabelNomRegion.setText(BoutonOuest.getText());
        ListeCategories.setListData(map.GetRegionSpec(BoutonOuest.getText()));
        ListeCategories.setVisible(true);
        
        //On récupère le bouton cliqué
        boutonTemp = BoutonOuest;
    }//GEN-LAST:event_BoutonOuestActionPerformed

    private void BoutonNordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonNordActionPerformed
        SetVisibleQuiz();//Affichage des éléments nécessaires au quiz

        SetBoutonsRegionsInvisibles(); 

        //Récupération informations par région
        LabelNomRegion.setText(BoutonNord.getText());
        ListeCategories.setListData(map.GetRegionSpec(BoutonNord.getText()));
        ListeCategories.setVisible(true);
        
        //On récupère le bouton cliqué
        boutonTemp = BoutonNord;
    }//GEN-LAST:event_BoutonNordActionPerformed

    private void BoutonIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonIndiceActionPerformed
        //Eléments rendus visibles
        PanelAide.setVisible(true);
        LabelAidePanda.setVisible(true);
    }//GEN-LAST:event_BoutonIndiceActionPerformed

    private void BoutonValiderCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonValiderCategorieActionPerformed
        GetQuiz();
    }//GEN-LAST:event_BoutonValiderCategorieActionPerformed

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
            java.util.logging.Logger.getLogger(AppliDuiAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppliDuiAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppliDuiAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppliDuiAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppliDuiAn().setVisible(true);
            }
        });
    }
    
    //Permet de créer des boutons de choix
    public void CreerItemChoix(){
        ListeChoix.setListData(choices[i]);
    }
    
    //Permet de récupérer le quiz correspondant à la catégorie
    public void GetQuiz(){
        i = 0;
        //On récupère la catégorie sélectionnée
        cat.SetNom(ListeCategories.getSelectedValue());
        cat.SetPath(path+boutonTemp.getText()+"/"+cat.GetNom());
        quiz.SetQCM(cat.GetPath());
        
        //Récupération des éléments du quiz
        queries = quiz.GetQuestions();
        answers = quiz.GetReponses();
        choices = quiz.GetChoix();
        help = quiz.GetAides();
        
        LabelNomCategorie.setText(cat.GetNom());
        LabelQuestion.setText(queries[i]);

        LabelReponse.setText(answers[i]);
        LabelAidePanda.setText(help[i]);
        
        LabelAidePanda.setVisible(false);
        CreerItemChoix();
    }
    
    //Permet de rendre invisible certains éléments au menu
    public void SetInvisibleHorsQuiz(){
        BoutonNextQuestion.setVisible(false);
        LabelNomRegion.setVisible(false);
        BoutonRevenirRegion.setVisible(false);
        BoutonValiderCategorie.setVisible(false);
        BoutonIndice.setVisible(false);
        jTabbedPane1.setVisible(false);
        LabelNomCategorie.setVisible(false);
        LabelReponse.setVisible(false);
        LabelNomRegion.setVisible(false);
        PanelReponse.setVisible(false);
        LabelQuestion.setVisible(false);
    }
    
    //Permet de rendre invisible certains éléments au quiz
    public void SetInvisibleQuiz(){
      
    }
    
    //Permet de rendre visible certains éléments au menu
    public void SetVisibleHorsQuiz(){
        
    }
    
    //Permet de rendre visible certains éléments au quiz
    public void SetVisibleQuiz(){
        BoutonNextQuestion.setVisible(true);
        LabelNomRegion.setVisible(true);
        BoutonRevenirRegion.setVisible(true);
        BoutonValiderCategorie.setVisible(true);
        BoutonIndice.setVisible(true);
        jTabbedPane1.setVisible(true);
        LabelNomCategorie.setVisible(true);
        LabelReponse.setVisible(true);
        LabelNomRegion.setVisible(true);
        PanelReponse.setVisible(true);
        LabelQuestion.setVisible(true);
    }
    
    //Permet de rendre invisible les boutons des régions
    public void SetBoutonsRegionsInvisibles(){
        BoutonNord.setVisible(false);
        BoutonSud.setVisible(false);
        BoutonOuest.setVisible(false);
        BoutonEst.setVisible(false);
    }
    
    //Permet de rendre visible les boutons des régions
    public void SetBoutonsRegionsVisibles(){
        BoutonNord.setVisible(true);
        BoutonSud.setVisible(true);
        BoutonOuest.setVisible(true);
        BoutonEst.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonEst;
    private javax.swing.JButton BoutonIndice;
    private javax.swing.JButton BoutonNextQuestion;
    private javax.swing.JButton BoutonNord;
    private javax.swing.JButton BoutonOuest;
    private javax.swing.JButton BoutonRevenirRegion;
    private javax.swing.JButton BoutonSud;
    private javax.swing.JButton BoutonValider;
    private javax.swing.JButton BoutonValiderCategorie;
    private javax.swing.JLabel LabelAidePanda;
    private javax.swing.JLabel LabelNomCategorie;
    private javax.swing.JLabel LabelNomRegion;
    private javax.swing.JLabel LabelQuestion;
    private javax.swing.JLabel LabelReponse;
    private javax.swing.JList<String> ListeCategories;
    private javax.swing.JList<String> ListeChoix;
    private javax.swing.JPanel PanelAide;
    private javax.swing.JPanel PanelReponse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
