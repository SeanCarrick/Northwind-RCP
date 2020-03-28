/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.northwind.accounting.view;

import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.swing.table.TableColumnModel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.swing.etable.ETableColumn;
import org.netbeans.swing.etable.ETableColumnModel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.view.OutlineView;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.pekinsoft.northwind.accounting.view//GL//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "GLTopComponent",
        iconBase = "com/pekinsoft/northwind/accounting/view/Script.png",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.pekinsoft.northwind.accounting.view.GLTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_GLAction",
        preferredID = "GLTopComponent"
)
@Messages({
    "CTL_GLAction=GL",
    "CTL_GLTopComponent=General Ledger",
    "HINT_GLTopComponent=This is the General Ledger"
})
public final class GLTopComponent extends TopComponent {
    private final String className = GLTopComponent.class.getName();
    private String method;
    private final Logger log = Logger.getLogger(className);
    private LogRecord record;

    public GLTopComponent() {
        record = new LogRecord(Level.INFO, "Entering constructor.");
        record.setSourceClassName(className);
        record.setSourceMethodName("GLTopComponent()");
        log.log(record);
        
        record.setMessage("Initializing components...");
        log.log(record);
        initComponents();
        
        record.setMessage("Setting the name and tooltip text for the window...");
        log.log(record);
        setName(Bundle.CTL_GLTopComponent());
        setToolTipText(Bundle.HINT_GLTopComponent());
        
        record.setMessage("Setting up the OutlineView object...");
        record.setLevel(Level.CONFIG);
        log.log(record);
        OutlineView ov = (OutlineView)glOutlineView;
        record.setMessage("Setting the columns of the outline view for the "
                + "General Ledger window, using the name of the property "
                + "followed by the text to be displayed in the column header.");
        record.setLevel(Level.INFO);
        log.log(record);
        ov.setPropertyColumns(
                "entryType", "Entry Type",
                "entryDate", "Date",
                "checkNumber", "Check #",
                "description", "Description",
                "fromAcct", "From Account",
                "toAcct", "To Account",
                "amount", "Amount",
                "taxDeduct", "Tax Deduct.",
                "balanced", "Balanced");
        
        record.setMessage("Hide the root node, since we only care about the "
                + "children.");
        log.log(record);
        ov.getOutline().setRootVisible(false);
        TableColumnModel columnModel = ov.getOutline().getColumnModel();
        ETableColumn column = (ETableColumn) columnModel.getColumn(0);
        ((ETableColumnModel) columnModel).setColumnHidden(column, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glOutlineView = new org.openide.explorer.view.OutlineView();
        jPanel1 = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        cboType = new javax.swing.JComboBox<>();
        lblDate = new javax.swing.JLabel();
        spinDate = new javax.swing.JSpinner();
        lblCheckNumber = new javax.swing.JLabel();
        txtCheckNumber = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblFromAcct = new javax.swing.JLabel();
        cboFromAcct = new javax.swing.JComboBox<>();
        lblToAcct = new javax.swing.JLabel();
        cboToAcct = new javax.swing.JComboBox<>();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JFormattedTextField();
        chkTaxDeductible = new javax.swing.JCheckBox();
        chkBalanced = new javax.swing.JCheckBox();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.jPanel1.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblType, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblType.text")); // NOI18N

        cboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash Pmt", "Debit Card", "Check", "ATM", "Teller", "E-Payment", "Credit Card", "Other" }));
        cboType.setSelectedIndex(1);

        org.openide.awt.Mnemonics.setLocalizedText(lblDate, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblDate.text")); // NOI18N

        spinDate.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1427156460000L), null, java.util.Calendar.DAY_OF_MONTH));

        org.openide.awt.Mnemonics.setLocalizedText(lblCheckNumber, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblCheckNumber.text")); // NOI18N

        txtCheckNumber.setText(org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.txtCheckNumber.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblDescription, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblDescription.text")); // NOI18N

        txtDescription.setText(org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.txtDescription.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblFromAcct, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblFromAcct.text")); // NOI18N

        cboFromAcct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(lblToAcct, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblToAcct.text")); // NOI18N

        cboToAcct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(lblAmount, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.lblAmount.text")); // NOI18N

        txtAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        txtAmount.setText(org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.txtAmount.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkTaxDeductible, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.chkTaxDeductible.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkBalanced, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.chkBalanced.text")); // NOI18N

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pekinsoft/northwind/accounting/view/cancel.png"))); // NOI18N
        btnCancel.setMnemonic('C');
        org.openide.awt.Mnemonics.setLocalizedText(btnCancel, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.btnCancel.text")); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelClicked(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pekinsoft/northwind/accounting/view/add.png"))); // NOI18N
        btnSave.setMnemonic('A');
        org.openide.awt.Mnemonics.setLocalizedText(btnSave, org.openide.util.NbBundle.getMessage(GLTopComponent.class, "GLTopComponent.btnSave.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCheckNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFromAcct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFromAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblToAcct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboToAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTaxDeductible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkBalanced))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate)
                    .addComponent(spinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckNumber)
                    .addComponent(txtCheckNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFromAcct)
                    .addComponent(cboFromAcct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblToAcct)
                    .addComponent(cboToAcct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount)
                    .addComponent(chkTaxDeductible)
                    .addComponent(chkBalanced))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glOutlineView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(glOutlineView, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CancelClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelClicked
        record = new LogRecord(Level.INFO, "Entering CancelClicked()");
        record.setSourceClassName(className);
        record.setSourceMethodName("CancelClicked()");
        record.setParameters(new Object[] {evt});
        log.log(record);
        
        record.setMessage("Clearing all fields without saving the data...");
        log.log(record);
        clearFields();
        
        record.setMessage("Exiting " + record.getSourceMethodName());
        log.log(record);
    }//GEN-LAST:event_CancelClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboFromAcct;
    private javax.swing.JComboBox<String> cboToAcct;
    private javax.swing.JComboBox<String> cboType;
    private javax.swing.JCheckBox chkBalanced;
    private javax.swing.JCheckBox chkTaxDeductible;
    private org.openide.explorer.view.OutlineView glOutlineView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCheckNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFromAcct;
    private javax.swing.JLabel lblToAcct;
    private javax.swing.JLabel lblType;
    private javax.swing.JSpinner spinDate;
    private javax.swing.JFormattedTextField txtAmount;
    private javax.swing.JTextField txtCheckNumber;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
    
    void clearFields() {
        record = new LogRecord(Level.INFO, "Entering clearFields()");
        record.setSourceClassName(className);
        record.setSourceMethodName("clearFields()");
        log.log(record);
        
        this.cboType.setSelectedIndex(1);
//        this.spinDate.setValue(LocalDate.now());
        this.txtCheckNumber.setText("");
        this.txtDescription.setText("");
        this.cboFromAcct.setSelectedIndex(0);
        this.cboToAcct.setSelectedIndex(0);
        this.txtAmount.setText("");
        this.chkBalanced.setSelected(false);
        this.chkTaxDeductible.setSelected(false);
    }
}
