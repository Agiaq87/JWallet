/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwalletGUI;

import JWalletGUIUtil.Messenger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jwallet.*;
/**
 *
 * @author alessandrogiaquinto
 */
public class MainWallet extends javax.swing.JFrame {

    /**
     * Creates new form MainWallet
     */
    public MainWallet() {
        initComponents();
        this.infoCenter = new Messenger(this.messageLabel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelRecap = new javax.swing.JPanel();
        panelIncome = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIncome = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nameFixText = new javax.swing.JTextField();
        valueFixText = new javax.swing.JTextField();
        timeFixedComboBok = new javax.swing.JComboBox<>();
        insertFixIncomeButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nameVarText = new javax.swing.JTextField();
        valueVarText = new javax.swing.JTextField();
        descriptionVarText = new javax.swing.JTextField();
        insertVarIncomeButton = new javax.swing.JButton();
        panelOutcome = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelSalut = new javax.swing.JLabel();
        labelDateTime = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelRecapLayout = new javax.swing.GroupLayout(panelRecap);
        panelRecap.setLayout(panelRecapLayout);
        panelRecapLayout.setHorizontalGroup(
            panelRecapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        panelRecapLayout.setVerticalGroup(
            panelRecapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riepilogo", panelRecap);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabella entrate"));
        jScrollPane1.setToolTipText("Elenco di tutte le entrate registrate e inserite in questa sessione");

        tableIncome.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        tableIncome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo entrata", "Nome", "Valore"
            }
        ));
        tableIncome.setToolTipText("Tabella di visualizzazione per tutte le entrate, sia fisse che variabili");
        jScrollPane1.setViewportView(tableIncome);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fissi"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuova entrata fissa"));
        jPanel2.setToolTipText("<html>\n<p>In questo contesto è possibile inserire le entrate <b>previste</b> o <b>già note</b></p>\n</html>");

        nameFixText.setBackground(new java.awt.Color(230, 228, 230));
        nameFixText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameFixText.setToolTipText("Inserire qui il nome dell'entrata fissa");
        nameFixText.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        nameFixText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFixTextActionPerformed(evt);
            }
        });

        valueFixText.setBackground(new java.awt.Color(230, 228, 230));
        valueFixText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valueFixText.setToolTipText("<html>\n<p>Inserire qui il valore della nuova entrata fissa</p></br>\n<p>E' possibile indicare i centesimi con il punto o con la virgola\n</html>");
        valueFixText.setBorder(javax.swing.BorderFactory.createTitledBorder("Valore in €"));
        valueFixText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueFixTextActionPerformed(evt);
            }
        });

        timeFixedComboBok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giornaliera", "Settimanale", "Bisettimanale", "Mensile", "Bimestrale", "Semestrale", "Annuale" }));
        timeFixedComboBok.setToolTipText("<html>\n<p>Indicare ogni quanto si presenta l'entrata:</p> </br>\n<p><b>Giornaliera</b>: Si presenta ogni giorno</p></br>\n<p><b>Feriale</b>: Si presenta solo dal Lunedì al Venerdì</p></br>\n<p><b>Festiva</b>: Si presenta solo dal Sabato alla Domenica</p></br>\n<p>etc...</p>\n</html>\n");
        timeFixedComboBok.setBorder(javax.swing.BorderFactory.createTitledBorder("Occorrenza nuova entrata"));
        timeFixedComboBok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFixedComboBokActionPerformed(evt);
            }
        });

        insertFixIncomeButton.setText("Inserisci");
        insertFixIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertFixIncomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeFixedComboBok, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameFixText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueFixText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertFixIncomeButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameFixText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueFixText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeFixedComboBok, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(insertFixIncomeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Variabili"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuova entrata variabile"));
        jPanel5.setToolTipText("<html>\n<p>In questo contesto è possibile inserire le entrate <b>inattese</b> o <b>non prevedibili a priori</b></p>\n</html>");

        nameVarText.setBackground(new java.awt.Color(230, 228, 230));
        nameVarText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameVarText.setToolTipText("Inserire qui il nome dell'entrata");
        nameVarText.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        valueVarText.setBackground(new java.awt.Color(230, 228, 230));
        valueVarText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valueVarText.setToolTipText("Inserire qui il valore dell'entrata");
        valueVarText.setBorder(javax.swing.BorderFactory.createTitledBorder("Valore in €"));

        descriptionVarText.setBackground(new java.awt.Color(230, 228, 230));
        descriptionVarText.setToolTipText("E' consigliato aggiungere una motivazione");
        descriptionVarText.setBorder(javax.swing.BorderFactory.createTitledBorder("Motivazione (opzionale)"));

        insertVarIncomeButton.setText("Inserisci");
        insertVarIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertVarIncomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(nameVarText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueVarText))
                    .addComponent(descriptionVarText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertVarIncomeButton)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameVarText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueVarText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionVarText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertVarIncomeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelIncomeLayout = new javax.swing.GroupLayout(panelIncome);
        panelIncome.setLayout(panelIncomeLayout);
        panelIncomeLayout.setHorizontalGroup(
            panelIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIncomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelIncomeLayout.setVerticalGroup(
            panelIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                    .addGroup(panelIncomeLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Entrate", panelIncome);

        javax.swing.GroupLayout panelOutcomeLayout = new javax.swing.GroupLayout(panelOutcome);
        panelOutcome.setLayout(panelOutcomeLayout);
        panelOutcomeLayout.setHorizontalGroup(
            panelOutcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        panelOutcomeLayout.setVerticalGroup(
            panelOutcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Uscite", panelOutcome);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelSalut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSalut.setText(" Benvenuto in JWallet!");
        labelSalut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDateTime.setText("DateTime ");

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText(" ");
        messageLabel.setToolTipText("Qui vengono visualizzate tutte le info");
        messageLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSalut, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelSalut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(messageLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFixTextActionPerformed

    private void valueFixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueFixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueFixTextActionPerformed

    private void timeFixedComboBokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFixedComboBokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFixedComboBokActionPerformed

    private void insertFixIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertFixIncomeButtonActionPerformed
        String name= "";
        double value = 0.0;
        
        if (this.nameFixText.getText().isEmpty() || this.nameFixText.getText().isBlank()) {
            JOptionPane.showMessageDialog(panelIncome, "E' richiesto l'inserimento del nome", "Errore", JOptionPane.ERROR_MESSAGE);
            this.infoCenter.setErrorMessage("E' richiesto l'inserimento del nome");
            return;
        } else {
            name = this.nameFixText.getText();
            System.out.println(name);
        } 
            
        if (this.valueFixText.getText().isEmpty() || this.valueFixText.getText().isBlank()) {
            JOptionPane.showMessageDialog(panelIncome, "E' richiesto l'inserimento del valore", "Errore", JOptionPane.ERROR_MESSAGE);
            this.infoCenter.setErrorMessage("E' richiesto l'inserimento del valore");
            return;
        } else {
            this.valueFixText.setText(this.valueFixText.getText().replace(",", ".").replace("€", "").replace("$", ""));
            try {
                value = Double.parseDouble(this.valueFixText.getText()); 
            } catch(NumberFormatException ne) {
                JOptionPane.showMessageDialog(panelIncome, "Il valore inserito non è corretto", "Errore", JOptionPane.ERROR_MESSAGE);
                this.infoCenter.setErrorMessage("E' stato inserito un valore non numerico");
                this.flushFixedData();
                return;
            }
            
            System.out.println(value);
        }
        
        //VariableIncome t = new VariableIncome(name, value, description);
        
        //System.err.println(t.toString());
        
        // TODO Insert into array 
        // save into database
        DefaultTableModel table = (DefaultTableModel)this.tableIncome.getModel();
        table.addRow(new Object[]{"Variabile", name, "+ " + value});
        
        this.infoCenter.setPositiveMessage("Nuova entrata variabile inserita, +" + value + "€");
        
        this.flushFixedData();
    }//GEN-LAST:event_insertFixIncomeButtonActionPerformed

    private void insertVarIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertVarIncomeButtonActionPerformed
        String name = "", description = "";
        double value = 0.0;
        
        if (this.nameVarText.getText().isEmpty() || this.nameVarText.getText().isBlank()) {
            JOptionPane.showMessageDialog(panelIncome, "E' richiesto l'inserimento del nome", "Errore", JOptionPane.ERROR_MESSAGE);
            this.infoCenter.setErrorMessage("E' richiesto l'inserimento del nome");
            return;
        } else {
            name = this.nameVarText.getText();
            System.out.println(name);
        } 
            
        if (this.valueVarText.getText().isEmpty() || this.valueVarText.getText().isBlank()) {
            JOptionPane.showMessageDialog(panelIncome, "E' richiesto l'inserimento del valore", "Errore", JOptionPane.ERROR_MESSAGE);
            this.infoCenter.setErrorMessage("E' richiesto l'inserimento del valore");
            return;
        } else {
            this.valueVarText.setText(this.valueVarText.getText().replace(",", ".").replace("€", "").replace("$", ""));
            try {
                value = Double.parseDouble(this.valueVarText.getText()); 
            } catch(NumberFormatException ne) {
                JOptionPane.showMessageDialog(panelIncome, "Il valore inserito non è corretto", "Errore", JOptionPane.ERROR_MESSAGE);
                this.infoCenter.setErrorMessage("E' stato inserito un valore non numerico");
                this.flushVariableData();
                return;
            }
            
            System.out.println(value);
        }
        
        if (!this.descriptionVarText.getText().isEmpty()){
            description = this.descriptionVarText.getText();
        }
        
        VariableIncome t = new VariableIncome(name, value, description);
        
        System.err.println(t.toString());
        
        // TODO Insert into array 
        // save into database
        DefaultTableModel table = (DefaultTableModel)this.tableIncome.getModel();
        table.addRow(new Object[]{"Variabile", name, "+ " + value});
        
        this.infoCenter.setPositiveMessage("Nuova entrata variabile inserita, +" + value + "€");
        
        this.flushVariableData();
    }//GEN-LAST:event_insertVarIncomeButtonActionPerformed

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
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descriptionVarText;
    private javax.swing.JButton insertFixIncomeButton;
    private javax.swing.JButton insertVarIncomeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelDateTime;
    private javax.swing.JLabel labelSalut;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField nameFixText;
    private javax.swing.JTextField nameVarText;
    private javax.swing.JPanel panelIncome;
    private javax.swing.JPanel panelOutcome;
    private javax.swing.JPanel panelRecap;
    private javax.swing.JTable tableIncome;
    private javax.swing.JComboBox<String> timeFixedComboBok;
    private javax.swing.JTextField valueFixText;
    private javax.swing.JTextField valueVarText;
    // End of variables declaration//GEN-END:variables
    private Messenger infoCenter;
    
    private void flushVariableData() {
        this.nameVarText.setText("");
        this.valueVarText.setText("");
        this.descriptionVarText.setText("");
    }
    
    private void flushFixedData() {
        this.nameFixText.setText("");
        this.valueFixText.setText("");
        this.timeFixedComboBok.setSelectedIndex(0);
    }
}
