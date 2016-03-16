package presentation;
import java.awt.*;
import domaine.*;
import java.util.ArrayList;
import domaine.*;
import metier.*;
/**
 * 634.1 Programmation - TP P02
 *
 * Fenêtre principale de l'application de gestion des activités
 *
 * @author VOTRE NOM
 */
public class FrmMain extends java.awt.Frame {

  /** Constructeur */
  public FrmMain () {
    initComponents();
    chargerPart(ParticipantDAO.getLstParticipants()); 
    chargerAct(ActiviteDAO.getLstActivites());
    PrendPartDAO.loadPrendPart();
  } // Constructeur

  private void chargerAct(ArrayList aLstAct){
      for (int i = 0; i < aLstAct.size(); i++) {
          lstActProposees.add(aLstAct.get(i).toString());
      }
  }
  
  private void chargerPart(ArrayList aLstPart){
      for (int i = 0; i < aLstPart.size(); i++) {
          lstPart.add(aLstPart.get(i).toString());  
      }
  }
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListePart = new java.awt.Label();
        lstPart = new java.awt.List();
        lblPartCourant = new java.awt.Label();
        lblNom = new java.awt.Label();
        tfNom = new java.awt.TextField();
        lblPrenom = new java.awt.Label();
        tfPrenom = new java.awt.TextField();
        lblTelephone = new java.awt.Label();
        tfTel = new java.awt.TextField();
        lblActChoisies = new java.awt.Label();
        lstActChoisies = new java.awt.List();
        lblActProposees = new java.awt.Label();
        lstActProposees = new java.awt.List();
        btnSupprimer = new java.awt.Button();
        btnAjouter = new java.awt.Button();

        setResizable(false);
        setTitle("Gestion des activités");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblListePart.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblListePart.setText("Liste des participants");

        lstPart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstPartItemStateChanged(evt);
            }
        });

        lblPartCourant.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPartCourant.setText("Participant courant");

        lblNom.setText("Nom");

        tfNom.setEditable(false);

        lblPrenom.setText("Prénom");

        tfPrenom.setEditable(false);

        lblTelephone.setText("Téléphone");

        tfTel.setEditable(false);

        lblActChoisies.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblActChoisies.setText("Activités choisies");

        lstActChoisies.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstActChoisiesItemStateChanged(evt);
            }
        });

        lblActProposees.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblActProposees.setText("Activités proposées");

        lstActProposees.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstActProposeesItemStateChanged(evt);
            }
        });

        btnSupprimer.setEnabled(false);
        btnSupprimer.setLabel("Supprimer l'activité");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnAjouter.setEnabled(false);
        btnAjouter.setLabel("Ajouter l'activité");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListePart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstPart, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPartCourant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActChoisies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lstActChoisies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNom, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblActProposees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lstActProposees, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblListePart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(lstPart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPartCourant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(lblActChoisies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(lstActChoisies, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblActProposees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lstActProposees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  /* Terminaison de l'application */
  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    System.exit(0);
  }//GEN-LAST:event_formWindowClosing
  
  private void chargementDesChamps(){
      int ind = lstPart.getSelectedIndex();
      tfNom.setText(((Participant)ParticipantDAO.lstParticipants.get(ind)).getNom());
      tfPrenom.setText(((Participant)ParticipantDAO.lstParticipants.get(ind)).getPrenom());
      tfTel.setText(((Participant)ParticipantDAO.lstParticipants.get(ind)).getTel());
  }
  
  private void chargementListAct(){
      int noPar = ParticipantDAO.getNoPers(lstPart.getSelectedIndex()); 
      lstActChoisies.removeAll();
      ArrayList act = PrendPartDAO.getLstAct(noPar); 
      for (int i = 0; i < act.size(); i++) {
          lstActChoisies.add(((Activite)act.get(i)).toString());
      }
  }
  
    private void lstPartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstPartItemStateChanged
        chargementDesChamps();
        chargementListAct();
        majBouton(lstActChoisies,btnSupprimer);
    }//GEN-LAST:event_lstPartItemStateChanged

    private void supprimerActChoisie(){
        int noAct = PrendPartDAO.getNoAct(lstActChoisies.getSelectedIndex());
        int noPart = ParticipantDAO.getNoPers(lstPart.getSelectedIndex());
        majBouton(lstActChoisies,btnSupprimer);
        PrendPartDAO.efface(noAct, noPart);
        chargementListAct();
        
    }
    
    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        supprimerActChoisie();
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void majBouton(List lst, Button btn){
        btn.setEnabled(lst.getSelectedIndexes().length>0);
    }
    
    private void lstActChoisiesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstActChoisiesItemStateChanged
        majBouton(lstActChoisies, btnSupprimer);
    }//GEN-LAST:event_lstActChoisiesItemStateChanged

    private void lstActProposeesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstActProposeesItemStateChanged
        majBouton(lstActProposees,btnAjouter);
    }//GEN-LAST:event_lstActProposeesItemStateChanged

    private void ajouterActivitee(){
        int indAct = ActiviteDAO.getNoAct(lstActProposees.getSelectedIndex());
        int indPers = ParticipantDAO.getNoPers(lstPart.getSelectedIndex());
        try{PrendPartDAO.ajouter(indAct,indPers);} catch(Exception e){e.getMessage();}
        chargementListAct();
    }
    
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        ajouterActivitee();
        lstActProposees.deselect(lstActProposees.getSelectedIndex());
        majBouton(lstActChoisies,btnSupprimer);
    }//GEN-LAST:event_btnAjouterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAjouter;
    private java.awt.Button btnSupprimer;
    private java.awt.Label lblActChoisies;
    private java.awt.Label lblActProposees;
    private java.awt.Label lblListePart;
    private java.awt.Label lblNom;
    private java.awt.Label lblPartCourant;
    private java.awt.Label lblPrenom;
    private java.awt.Label lblTelephone;
    private java.awt.List lstActChoisies;
    private java.awt.List lstActProposees;
    private java.awt.List lstPart;
    private java.awt.TextField tfNom;
    private java.awt.TextField tfPrenom;
    private java.awt.TextField tfTel;
    // End of variables declaration//GEN-END:variables

} // FrmMain
