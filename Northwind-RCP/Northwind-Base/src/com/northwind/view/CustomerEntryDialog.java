/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.view;

import com.northwind.api.CustomerManagerInterface;
import com.northwind.api.exceptions.ValidationException;
import com.northwind.api.model.Customer;
import com.northwind.utils.ScreenUtils;
import com.northwind.view.verifiers.EmailNotRequiredInputVerifier;
import com.northwind.view.verifiers.PostalCodeInputVerifier;
import com.northwind.view.verifiers.StateOrProvinceInputVerifier;
import com.northwind.view.verifiers.TextRequiredInputVerifier;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
public class CustomerEntryDialog extends javax.swing.JDialog {

    private final Customer record;
    private final CustomerManagerInterface mgr =
            Lookup.getDefault().lookup(CustomerManagerInterface.class);
    
    /**
     * Creates new form CustomerEntryDialog
     */
    public CustomerEntryDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocation(ScreenUtils.centerDialog(this));
        
        this.record = new Customer();
        
        this.txtCity.setInputVerifier(new TextRequiredInputVerifier());
        this.txtCompanyName.setInputVerifier(new TextRequiredInputVerifier());
        this.txtEmail.setInputVerifier(new EmailNotRequiredInputVerifier());
        this.txtState.setInputVerifier(new StateOrProvinceInputVerifier());
        this.txtStreetAddress.setInputVerifier(new TextRequiredInputVerifier());
        this.txtZipCode.setInputVerifier(new PostalCodeInputVerifier());
    }
    
    public CustomerEntryDialog(java.awt.Frame parent, boolean modal,
            Customer customer) {
        super(parent, modal);
        initComponents();
        
        this.setLocation(ScreenUtils.centerDialog(this));
        
        this.record = customer;
        
        this.txtCity.setInputVerifier(new TextRequiredInputVerifier());
        this.txtCompanyName.setInputVerifier(new TextRequiredInputVerifier());
        this.txtEmail.setInputVerifier(new EmailNotRequiredInputVerifier());
        this.txtState.setInputVerifier(new TextRequiredInputVerifier());
        this.txtStreetAddress.setInputVerifier(new TextRequiredInputVerifier());
        this.txtZipCode.setInputVerifier(new TextRequiredInputVerifier());
                
        loadData();
    }
    
    private void loadData() {
        
        this.chkActive.setSelected(record.isActive());
        this.txtCity.setText(record.getCity());
        this.txtCompanyName.setText(record.getCompanyName());
        this.txtContact.setText(record.getContactName());
        this.txtEmail.setText(record.getEmailAddress());
        this.txtFax.setText(record.getFaxNumber());
        this.txtID.setText(String.valueOf(record.getId()));
        this.txtNotes.setText(record.getNotes());
        this.txtPhone.setText(record.getPhoneNumber());
        this.txtState.setText(record.getState().toUpperCase());
        this.txtStreetAddress.setText(record.getStreetAddress());
        this.txtSuite.setText(record.getSuiteNumber());
        this.txtZipCode.setText(record.getZipCode());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLabel = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        companyNameLabel = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        streetLabel = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        suiteLabel = new javax.swing.JLabel();
        txtSuite = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        zipCodeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        phoneLabel = new javax.swing.JLabel();
        txtPhone = new javax.swing.JFormattedTextField();
        txtFax = new javax.swing.JFormattedTextField();
        faxLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        notesPanel = new org.jdesktop.swingx.JXPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        commandPanel = new javax.swing.JPanel();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        jXButton2 = new org.jdesktop.swingx.JXButton();
        jXStatusBar1 = new org.jdesktop.swingx.JXStatusBar();
        tipsLabel = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        chkActive = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        org.openide.awt.Mnemonics.setLocalizedText(idLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.idLabel.text")); // NOI18N

        txtID.setEditable(false);
        txtID.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtID.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(companyNameLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.companyNameLabel.text")); // NOI18N

        txtCompanyName.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtCompanyName.text")); // NOI18N
        txtCompanyName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCompanyNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(streetLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.streetLabel.text")); // NOI18N

        txtStreetAddress.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtStreetAddress.text")); // NOI18N
        txtStreetAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStreetAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(suiteLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.suiteLabel.text")); // NOI18N

        txtSuite.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtSuite.text")); // NOI18N
        txtSuite.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSuiteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cityLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.cityLabel.text")); // NOI18N

        txtCity.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtCity.text")); // NOI18N
        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(stateLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.stateLabel.text")); // NOI18N

        txtState.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtState.text")); // NOI18N
        txtState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(zipCodeLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.zipCodeLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(phoneLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.phoneLabel.text")); // NOI18N

        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        try {
            txtFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(faxLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.faxLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(emailLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.emailLabel.text")); // NOI18N

        txtEmail.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtEmail.text")); // NOI18N
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(contactLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.contactLabel.text")); // NOI18N

        txtContact.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtContact.text")); // NOI18N
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });

        notesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.notesPanel.border.title"))); // NOI18N

        txtNotes.setColumns(20);
        txtNotes.setLineWrap(true);
        txtNotes.setRows(5);
        txtNotes.setWrapStyleWord(true);
        txtNotes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNotesFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtNotes);

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(notesPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
            .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(notesPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jXButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/northwind/icons/cancel.png"))); // NOI18N
        jXButton1.setMnemonic('n');
        org.openide.awt.Mnemonics.setLocalizedText(jXButton1, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.jXButton1.text")); // NOI18N
        jXButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doCancel(evt);
            }
        });

        jXButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/northwind/icons/add.png"))); // NOI18N
        jXButton2.setMnemonic('S');
        org.openide.awt.Mnemonics.setLocalizedText(jXButton2, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.jXButton2.text")); // NOI18N
        jXButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doSave(evt);
            }
        });

        javax.swing.GroupLayout commandPanelLayout = new javax.swing.GroupLayout(commandPanel);
        commandPanel.setLayout(commandPanelLayout);
        commandPanelLayout.setHorizontalGroup(
            commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commandPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jXButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        commandPanelLayout.setVerticalGroup(
            commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commandPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.openide.awt.Mnemonics.setLocalizedText(tipsLabel, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.tipsLabel.text")); // NOI18N
        jXStatusBar1.add(tipsLabel);

        txtZipCode.setText(org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.txtZipCode.text")); // NOI18N
        txtZipCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtZipCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resetTip(evt);
            }
        });
        txtZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZipCodeKeyTyped(evt);
            }
        });

        chkActive.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(chkActive, org.openide.util.NbBundle.getMessage(CustomerEntryDialog.class, "CustomerEntryDialog.chkActive.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXStatusBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cityLabel)
                            .addComponent(idLabel)
                            .addComponent(companyNameLabel)
                            .addComponent(streetLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompanyName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtStreetAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suiteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSuite, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zipCodeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkActive))))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailLabel)
                            .addComponent(phoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(faxLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContact))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(commandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameLabel)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suiteLabel)
                    .addComponent(txtSuite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeLabel)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactLabel)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(notesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(commandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXStatusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doCancel
        this.dispose();
    }//GEN-LAST:event_doCancel

    private void doSave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doSave
        // Place data saving code here.
        if ( this.record != null ) {
            this.record.setActive(this.chkActive.isSelected());
            this.record.setCity(this.txtCity.getText());
            this.record.setCompanyName(this.txtCompanyName.getText());
            this.record.setContactName(this.txtContact.getText());
            this.record.setEmailAddress(this.txtEmail.getText());
            this.record.setFaxNumber(this.txtFax.getText());
            this.record.setNotes(this.txtNotes.getText());
            this.record.setPhoneNumber(this.txtPhone.getText());
            this.record.setState(this.txtState.getText());
            this.record.setStreetAddress(this.txtStreetAddress.getText());
            this.record.setSuiteNumber(this.txtSuite.getText());
            this.record.setZipCode(this.txtZipCode.getText());
            
            try {
                this.mgr.addCustomer(record);
            } catch (ValidationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        
        // KEEP AS LAST LINE:
        doCancel(evt);
    }//GEN-LAST:event_doSave

    private void txtCompanyNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCompanyNameFocusGained
        this.txtCompanyName.selectAll();
        
        this.tipsLabel.setText("<html><strong>Company Name</strong>: The name "
                + "of the customer's company. <strong><em>REQUIRED</em>"
                + "</strong>");
    }//GEN-LAST:event_txtCompanyNameFocusGained

    private void resetTip(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resetTip
        this.tipsLabel.setText("Watch here for tips...");
    }//GEN-LAST:event_resetTip

    private void txtStreetAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStreetAddressFocusGained
        this.txtStreetAddress.selectAll();
        
        this.tipsLabel.setText("<html><strong>Street Address</strong>: The "
                + "street number, direction and name. <strong><em>REQUIRED</em>"
                + "</strong>");
    }//GEN-LAST:event_txtStreetAddressFocusGained

    private void txtSuiteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSuiteFocusGained
        this.txtSuite.selectAll();
        
        this.tipsLabel.setText("<html><strong>Suite</strong>: This is the suite"
                + " number of the company. <em>Optional</em>");
    }//GEN-LAST:event_txtSuiteFocusGained

    private void txtCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusGained
        this.txtCity.selectAll();
        
        this.tipsLabel.setText("<html><strong>City</strong>: This is the city "
                + "in which the customer is located. <strong><em>REQUIRED</em>"
                + "</strong>");
    }//GEN-LAST:event_txtCityFocusGained

    private void txtStateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStateFocusGained
        this.txtState.selectAll();
        
        this.tipsLabel.setText("<html><strong>State</strong>: This is the State"
                + " or Province (abbreviation) in which the customer is located"
                + ". <strong><em>REQUIRED</em></strong>");
    }//GEN-LAST:event_txtStateFocusGained

    private void txtZipCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtZipCodeFocusGained
        this.txtZipCode.selectAll();
        
        this.tipsLabel.setText("<html><strong>Zip Code</strong>: This is the "
                + "<em>Postal Code</em> for the customer. <strong><em>REQUIRED"
                + "</em></strong>");
    }//GEN-LAST:event_txtZipCodeFocusGained

    private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
        this.txtPhone.selectAll();
        
        this.tipsLabel.setText("<html><strong>Phone Number</strong>: The compa"
                + "ny's phone number. <em>Optional</em>");
    }//GEN-LAST:event_txtPhoneFocusGained

    private void txtFaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFaxFocusGained
        this.txtFax.selectAll();
        
        this.tipsLabel.setText("<html><strong>Fax Number</strong>: The company'"
                + "s fax number. <em>Optional</em>");
    }//GEN-LAST:event_txtFaxFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        this.txtEmail.selectAll();
        
        this.tipsLabel.setText("<html><strong>Email Address</strong>: Email "
                + "address for the company contact. <em>Optional</em>");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        this.txtContact.selectAll();
        
        this.tipsLabel.setText("<html><strong>Contact</strong>: The name of "
                + "your point of contact at the company. <em>Optional</em>");
    }//GEN-LAST:event_txtContactFocusGained

    private void txtNotesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNotesFocusGained
        this.txtNotes.select(this.txtNotes.getText().length(), 
                this.txtNotes.getText().length());
        
        this.tipsLabel.setText("<html><strong>Notes</strong>: This field can be"
                + " used for any other information. <em>Optional</em>");
    }//GEN-LAST:event_txtNotesFocusGained

    private void txtZipCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipCodeKeyTyped
        // Because the RegEx for Canadian Postal Codes requires that the letters
        //+ in the code be capitalized, we need to do so in this field for the
        //+ user, incase their CapsLock key is not on or they do not press the
        //+ Shift key.
        
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_txtZipCodeKeyTyped

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
            java.util.logging.Logger.getLogger(CustomerEntryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerEntryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerEntryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerEntryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerEntryDialog dialog = new CustomerEntryDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JPanel commandPanel;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel faxLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXButton jXButton1;
    private org.jdesktop.swingx.JXButton jXButton2;
    private org.jdesktop.swingx.JXStatusBar jXStatusBar1;
    private org.jdesktop.swingx.JXPanel notesPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JLabel suiteLabel;
    private javax.swing.JLabel tipsLabel;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFax;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtSuite;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JLabel zipCodeLabel;
    // End of variables declaration//GEN-END:variables
}
