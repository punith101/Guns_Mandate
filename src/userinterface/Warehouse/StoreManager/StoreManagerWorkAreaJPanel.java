/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Warehouse.StoreManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.PDEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.StoreManager.Customer;
import Business.StoreManager.CustomerDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.StoreManagerWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author punit
 */
public class StoreManagerWorkAreaJPanel extends javax.swing.JPanel {
    
    
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;
    WorkQueue workqueue;
    Network network;
    EnterpriseDirectory enterpriseDirectory;
    Customer customer;
    CustomerDirectory customerDirectory;

    /**
     * Creates new form StoreManagerWorkAreaJPanel
     */
    public StoreManagerWorkAreaJPanel( JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise=enterprise;
       this.workqueue=workqueue;
       this.network=network;
       this.organization=organization;
       //this.enterpriseDirectory=enterpriseDirectory;
       this.customerDirectory=customerDirectory;
       
    }
    
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();
        
        model.setRowCount(0);
        for(Customer customer : business.getCustomerList().getCustomerList())
        {
            
            Object[] row = new Object[7];
            row[0] = customer;
            row[1] = customer.getCustomerId();
            row[2] = customer.getSex();
            row[3] = customer.getAge();
            row[4] = customer.getContactNumber();
            row[5] = customer.getAddress();
            row[6] = customer.getEmail();
            
            model.addRow(row);
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

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        receiveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        delBtn = new javax.swing.JButton();

        requestTestJButton.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel1.setText("Message:");

        backJButton.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        receiveButton.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        receiveButton.setText("Receive");
        receiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveButtonActionPerformed(evt);
            }
        });

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "ID", "Sex", "Age", "Contact Number", "Address", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        delBtn.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        delBtn.setText("Delete Details");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253)
                .addComponent(receiveButton)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestTestJButton)
                            .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiveButton)
                    .addComponent(delBtn))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents
@SuppressWarnings("empty-statement")
    
    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = messageJTextField.getText();
        if(message.equals("") || message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        StoreManagerWorkRequest request = new StoreManagerWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");

        Enterprise org = null;
        if(network.getEnterpriseDirectory()==null)
        {
            network.setEnterpriseDirectory(new EnterpriseDirectory());
            
        }
       for (Enterprise orn : network.getEnterpriseDirectory().getEnterpriseList()){
          if (orn instanceof PDEnterprise){
                   
                    orn.getWorkQueue().getWorkRequestList().add(request);
                    
                org = orn;
                            }
        }
      
          
        account.getWorkQueue().getWorkRequestList().add(request);
       
    
        JOptionPane.showMessageDialog(null, "Request message sent");

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCustomerJPanel dwjp = (ManageCustomerJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void receiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveButtonActionPerformed
        // TODO add your handling code here:
        
        populateTable();
        
    }//GEN-LAST:event_receiveButtonActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Confirm delete?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){

            int selectedrow = userJTable.getSelectedRow();

            if(selectedrow >= 0)
            {
                Customer customer = (Customer) userJTable.getValueAt(selectedrow, 0);

                customerDirectory.removeCustomer(customer);
                

                JOptionPane.showMessageDialog(null, "Record has been deleted..");
                populateTable();

            }

            else

            JOptionPane.showMessageDialog(null,"Please select any row.");
        }
    }//GEN-LAST:event_delBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton receiveButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
