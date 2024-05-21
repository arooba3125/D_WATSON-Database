/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import org.bson.*;
import com.mongodb.*;
import java.awt.event.*;
import com.mongodb.client.*;
import java.util.*;
public class Main extends JFrame {
    private MongoDatabase database;
    private MongoCollection<Document> employeeCollection;
    private MongoCollection<Document> inventoryCollection;
    private MongoCollection<Document> branchCollection;
    private MongoCollection<Document> doctorCollection;
    private MongoCollection<Document> supplierCollection;
    private MongoCollection<Document> medicineCollection;
    private MongoCollection<Document> paymentCollection;
    private MongoCollection<Document> customerCollection;
    private MongoCollection<Document> prescriptionCollection;
    private MongoCollection<Document> transactionCollection;
    public Main() {
        initComponents();
          connectToDatabase();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        addEmployeeButton2 = new javax.swing.JButton();
        viewEmployeeButton1 = new javax.swing.JButton();
        updateEmployeeButton1 = new javax.swing.JButton();
        deleteEmployeeButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        viewInventoryButton = new javax.swing.JButton();
        updateinventoryButton = new javax.swing.JButton();
        deleteInventoryButton = new javax.swing.JButton();
        addInventoryButton = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        addBranchButton = new javax.swing.JButton();
        viewBranchButton = new javax.swing.JButton();
        updateBranchButton = new javax.swing.JButton();
        deleteBranchButton = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        addCustomerButton = new javax.swing.JButton();
        viewCustomerButton = new javax.swing.JButton();
        updateCustomerButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        addPrescriptionButton = new javax.swing.JButton();
        viewPrescriptionButton = new javax.swing.JButton();
        updatePrescriptionButton = new javax.swing.JButton();
        deletePrescriptionButton = new javax.swing.JButton();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        addDoctorButton = new javax.swing.JButton();
        viewDoctorButton = new javax.swing.JButton();
        updateDoctorButton = new javax.swing.JButton();
        deleteDoctorButton = new javax.swing.JButton();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        addMedicineButton = new javax.swing.JButton();
        viewMedicineButton = new javax.swing.JButton();
        updateMedicineButton = new javax.swing.JButton();
        deleteMedicineButton = new javax.swing.JButton();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        addTransactionButton = new javax.swing.JButton();
        viewTransactionButton = new javax.swing.JButton();
        updateTransactionButton = new javax.swing.JButton();
        deleteTransactionButton = new javax.swing.JButton();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        addSupplierButton = new javax.swing.JButton();
        viewSupplierButton = new javax.swing.JButton();
        updateSupplierButton = new javax.swing.JButton();
        deleteSupplierButton = new javax.swing.JButton();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        addPaymentButton = new javax.swing.JButton();
        viewPaymentButton = new javax.swing.JButton();
        updatePaymentButton = new javax.swing.JButton();
        deletePaymentButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 20, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("D.Watson");

        jTabbedPane2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addEmployeeButton2.setText("ADD EMPLOYEE");
        addEmployeeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButton2ActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("ADD", addEmployeeButton2);

        viewEmployeeButton1.setText("VIEW EMPLOYEE");
        viewEmployeeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeeButton1ActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("VIEW", viewEmployeeButton1);

        updateEmployeeButton1.setText("UPDATE EMPLOYEE");
        updateEmployeeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeButton1ActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("UPDATE", updateEmployeeButton1);

        deleteEmployeeButton1.setText("DELETE EMPLOYEE");
        deleteEmployeeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeButton1ActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("DELETE", deleteEmployeeButton1);

        jTabbedPane1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        viewInventoryButton.setText("VIEW INVENTORY");
        viewInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryButtonActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("VIEW", viewInventoryButton);

        updateinventoryButton.setText("UPDATE INVENTORY");
        updateinventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinventoryButtonActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("UPDATE", updateinventoryButton);

        deleteInventoryButton.setText("DELETE INVENTORY");
        deleteInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInventoryButtonActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("DELETE", deleteInventoryButton);

        addInventoryButton.setText("ADD INVENTORY");
        addInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryButtonActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("ADD", addInventoryButton);

        jTabbedPane3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addBranchButton.setText("ADD  BRANCH");
        addBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchButtonActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("ADD", addBranchButton);

        viewBranchButton.setText("VIEW BRANCH");
        viewBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBranchButtonActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("VIEW", viewBranchButton);

        updateBranchButton.setText("UPDATE BRANCH");
        updateBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBranchButtonActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("UPDATE", updateBranchButton);

        deleteBranchButton.setText("DELETE BRANCH");
        deleteBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBranchButtonActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("DELETE", deleteBranchButton);

        jTabbedPane4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addCustomerButton.setText("ADD CUSTOMER");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });
        jTabbedPane4.addTab("ADD", addCustomerButton);

        viewCustomerButton.setText("VIEW CUSTOMER");
        viewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerButtonActionPerformed(evt);
            }
        });
        jTabbedPane4.addTab("VIEW", viewCustomerButton);

        updateCustomerButton.setText("UPDATE CUSTOMER");
        updateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerButtonActionPerformed(evt);
            }
        });
        jTabbedPane4.addTab("UPDATE", updateCustomerButton);

        deleteCustomerButton.setText("DELETE CUSTOMER");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });
        jTabbedPane4.addTab("DELETE", deleteCustomerButton);

        jTabbedPane5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addPrescriptionButton.setText("ADD PRESCRIPTION");
        addPrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrescriptionButtonActionPerformed(evt);
            }
        });
        jTabbedPane5.addTab("ADD", addPrescriptionButton);

        viewPrescriptionButton.setText("VIEW PRESCRIPTION");
        viewPrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrescriptionButtonActionPerformed(evt);
            }
        });
        jTabbedPane5.addTab("VIEW", viewPrescriptionButton);

        updatePrescriptionButton.setText("UPDATE PRESCRIPTION");
        updatePrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePrescriptionButtonActionPerformed(evt);
            }
        });
        jTabbedPane5.addTab("UPDATE", updatePrescriptionButton);

        deletePrescriptionButton.setText("DELETE PRESCRIPTION");
        deletePrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePrescriptionButtonActionPerformed(evt);
            }
        });
        jTabbedPane5.addTab("DELETE", deletePrescriptionButton);

        jTabbedPane6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addDoctorButton.setText("ADD  DOCTOR");
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });
        jTabbedPane6.addTab("ADD", addDoctorButton);

        viewDoctorButton.setText("VIEW DOCTOR");
        viewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorButtonActionPerformed(evt);
            }
        });
        jTabbedPane6.addTab("VIEW", viewDoctorButton);

        updateDoctorButton.setText("UPDATE DOCTOR");
        updateDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDoctorButtonActionPerformed(evt);
            }
        });
        jTabbedPane6.addTab("UPDATE", updateDoctorButton);

        deleteDoctorButton.setText("DELETE DOCTOR");
        deleteDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDoctorButtonActionPerformed(evt);
            }
        });
        jTabbedPane6.addTab("DELETE", deleteDoctorButton);

        jTabbedPane7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addMedicineButton.setText("ADD  MEDICINE");
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });
        jTabbedPane7.addTab("ADD", addMedicineButton);

        viewMedicineButton.setText("VIEW MEDICINE");
        viewMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicineButtonActionPerformed(evt);
            }
        });
        jTabbedPane7.addTab("VIEW", viewMedicineButton);

        updateMedicineButton.setText("UPDATE MEDICINE");
        updateMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMedicineButtonActionPerformed(evt);
            }
        });
        jTabbedPane7.addTab("UPDATE", updateMedicineButton);

        deleteMedicineButton.setText("DELETE MEDICINE");
        deleteMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMedicineButtonActionPerformed(evt);
            }
        });
        jTabbedPane7.addTab("DELETE", deleteMedicineButton);

        jTabbedPane8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addTransactionButton.setText("ADD TRANSACTION");
        addTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransactionButtonActionPerformed(evt);
            }
        });
        jTabbedPane8.addTab("ADD", addTransactionButton);

        viewTransactionButton.setText("VIEW TRANSACTION");
        viewTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransactionButtonActionPerformed(evt);
            }
        });
        jTabbedPane8.addTab("VIEW", viewTransactionButton);

        updateTransactionButton.setText("UPDATE TRANSACTION");
        updateTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTransactionButtonActionPerformed(evt);
            }
        });
        jTabbedPane8.addTab("UPDATE", updateTransactionButton);

        deleteTransactionButton.setText("DELETE TRANSACTION");
        deleteTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTransactionButtonActionPerformed(evt);
            }
        });
        jTabbedPane8.addTab("DELETE", deleteTransactionButton);

        jTabbedPane9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addSupplierButton.setText("ADD  SUPPLIER");
        addSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierButtonActionPerformed(evt);
            }
        });
        jTabbedPane9.addTab("ADD", addSupplierButton);

        viewSupplierButton.setText("VIEW SUPPLIER");
        viewSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSupplierButtonActionPerformed(evt);
            }
        });
        jTabbedPane9.addTab("VIEW", viewSupplierButton);

        updateSupplierButton.setText("UPDATE SUPPLIER");
        updateSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupplierButtonActionPerformed(evt);
            }
        });
        jTabbedPane9.addTab("UPDATE", updateSupplierButton);

        deleteSupplierButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteSupplierButton.setText("DELETE SUPPLIER");
        deleteSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierButtonActionPerformed(evt);
            }
        });
        jTabbedPane9.addTab("DELETE", deleteSupplierButton);

        jTabbedPane10.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N

        addPaymentButton.setText("ADD  PAYMENT");
        addPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPaymentButtonActionPerformed(evt);
            }
        });
        jTabbedPane10.addTab("ADD", addPaymentButton);

        viewPaymentButton.setText("VIEW PAYMENT");
        viewPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPaymentButtonActionPerformed(evt);
            }
        });
        jTabbedPane10.addTab("VIEW", viewPaymentButton);

        updatePaymentButton.setText("UPDATE PAYMENT");
        updatePaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePaymentButtonActionPerformed(evt);
            }
        });
        jTabbedPane10.addTab("UPDATE", updatePaymentButton);

        deletePaymentButton.setText("DELETE PAYMENT");
        deletePaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePaymentButtonActionPerformed(evt);
            }
        });
        jTabbedPane10.addTab("DELETE", deletePaymentButton);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      CHEMIST & SUPER STORE");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Developed By Ms.Warda (Talented Students)");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("      COPYRIGHTS PROTECTED @D.Watson");

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setPreferredSize(new java.awt.Dimension(100, 56));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane7)
                            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTabbedPane9))
                        .addGap(12, 12, 12))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(451, 451, 451))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(422, 422, 422)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletePaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePaymentButtonActionPerformed
        deletePayment();
    }//GEN-LAST:event_deletePaymentButtonActionPerformed

    private void updatePaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePaymentButtonActionPerformed
        updatePayment();
    }//GEN-LAST:event_updatePaymentButtonActionPerformed

    private void viewPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPaymentButtonActionPerformed
        displayPaymentData();
    }//GEN-LAST:event_viewPaymentButtonActionPerformed

    private void addPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPaymentButtonActionPerformed
        addPayment();
    }//GEN-LAST:event_addPaymentButtonActionPerformed

    private void deleteSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierButtonActionPerformed
        deleteSupplier();
    }//GEN-LAST:event_deleteSupplierButtonActionPerformed

    private void updateSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupplierButtonActionPerformed
        updateSupplier();
    }//GEN-LAST:event_updateSupplierButtonActionPerformed

    private void viewSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSupplierButtonActionPerformed
        displaySupplierData();
    }//GEN-LAST:event_viewSupplierButtonActionPerformed

    private void addSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierButtonActionPerformed
        addSupplier();
    }//GEN-LAST:event_addSupplierButtonActionPerformed

    private void deleteTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTransactionButtonActionPerformed
        deleteTransaction();
    }//GEN-LAST:event_deleteTransactionButtonActionPerformed

    private void updateTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTransactionButtonActionPerformed
        updateTransaction();
    }//GEN-LAST:event_updateTransactionButtonActionPerformed

    private void viewTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransactionButtonActionPerformed
        displayTransactionData();
    }//GEN-LAST:event_viewTransactionButtonActionPerformed

    private void addTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransactionButtonActionPerformed
        addTransaction();
    }//GEN-LAST:event_addTransactionButtonActionPerformed

    private void deleteMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMedicineButtonActionPerformed
        deleteMedicine();
    }//GEN-LAST:event_deleteMedicineButtonActionPerformed

    private void updateMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMedicineButtonActionPerformed
        updateMedicine();
    }//GEN-LAST:event_updateMedicineButtonActionPerformed

    private void viewMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicineButtonActionPerformed
        displayMedicineData();
    }//GEN-LAST:event_viewMedicineButtonActionPerformed

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        addMedicine();
    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void deleteDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDoctorButtonActionPerformed
        // TODO add your handling code here:
        deleteDoctor();
    }//GEN-LAST:event_deleteDoctorButtonActionPerformed

    private void updateDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDoctorButtonActionPerformed
        updateDoctor();
    }//GEN-LAST:event_updateDoctorButtonActionPerformed

    private void viewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorButtonActionPerformed
        // TODO add your handling code here:
        displayDoctorData();
    }//GEN-LAST:event_viewDoctorButtonActionPerformed

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        // TODO add your handling code here:
        addDoctor();
    }//GEN-LAST:event_addDoctorButtonActionPerformed

    private void deletePrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePrescriptionButtonActionPerformed
        deletePrescription();
    }//GEN-LAST:event_deletePrescriptionButtonActionPerformed

    private void updatePrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePrescriptionButtonActionPerformed
        updatePrescription();
    }//GEN-LAST:event_updatePrescriptionButtonActionPerformed

    private void viewPrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrescriptionButtonActionPerformed
        displayPrescriptionData();
    }//GEN-LAST:event_viewPrescriptionButtonActionPerformed

    private void addPrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrescriptionButtonActionPerformed
        addPrescription();
    }//GEN-LAST:event_addPrescriptionButtonActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void updateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerButtonActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updateCustomerButtonActionPerformed

    private void viewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerButtonActionPerformed
        displayCustomerData();
    }//GEN-LAST:event_viewCustomerButtonActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        addCustomer();
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void deleteBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBranchButtonActionPerformed
        // TODO add your handling code here:
        deleteBranch();
    }//GEN-LAST:event_deleteBranchButtonActionPerformed

    private void updateBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBranchButtonActionPerformed
        // TODO add your handling code here:
        updateBranch();
    }//GEN-LAST:event_updateBranchButtonActionPerformed

    private void viewBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBranchButtonActionPerformed
        // TODO add your handling code here:
        displayBranchData();
    }//GEN-LAST:event_viewBranchButtonActionPerformed

    private void addBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchButtonActionPerformed
        // TODO add your handling code here:
        addBranch();
    }//GEN-LAST:event_addBranchButtonActionPerformed

    private void addInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryButtonActionPerformed
        addInventory();
    }//GEN-LAST:event_addInventoryButtonActionPerformed

    private void deleteInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInventoryButtonActionPerformed
        updateInventory();
    }//GEN-LAST:event_deleteInventoryButtonActionPerformed

    private void updateinventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinventoryButtonActionPerformed
        displayInventoryData();
    }//GEN-LAST:event_updateinventoryButtonActionPerformed

    private void viewInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryButtonActionPerformed
        deleteInventory();
    }//GEN-LAST:event_viewInventoryButtonActionPerformed

    private void deleteEmployeeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeButton1ActionPerformed
        deleteEmployee();
    }//GEN-LAST:event_deleteEmployeeButton1ActionPerformed

    private void updateEmployeeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeButton1ActionPerformed
        updateEmployee();
    }//GEN-LAST:event_updateEmployeeButton1ActionPerformed

    private void viewEmployeeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeButton1ActionPerformed
        displayEmployeeData();
    }//GEN-LAST:event_viewEmployeeButton1ActionPerformed

    private void addEmployeeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButton2ActionPerformed
        addEmployee();
    }//GEN-LAST:event_addEmployeeButton2ActionPerformed
private void connectToDatabase() {
        com.mongodb.client.MongoClient mongoClient = com.mongodb.client.MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("dwatson");
        employeeCollection = database.getCollection("employees");
        inventoryCollection = database.getCollection("inventory");
        branchCollection = database.getCollection("branches");
        doctorCollection = database.getCollection("doctors");
        supplierCollection = database.getCollection("supplier");
        paymentCollection = database.getCollection("payment");
        medicineCollection = database.getCollection("medicine");
        transactionCollection = database.getCollection("transaction");
        prescriptionCollection = database.getCollection("prescription");
        customerCollection = database.getCollection("customer");
    }
private void displayEmployeeData() {
    textArea.setText("Employee Data:\n");
    textArea.append(String.format("%-20s %-20s %-20s %-10s %-20s %-10s\n", "Name", "Position", "Contact", "ID", "Schedule", "Salary"));
    MongoCursor<Document> cursor = employeeCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String name = document.getString("name");
        String position = document.getString("position");
        String contact = document.getString("contact");
        String id = document.getString("id");
        String schedule = document.getString("schedule");
        String salary = document.getString("salary");
        textArea.append(String.format("%-20s %-20s %-20s %-10s %-20s %-10s\n", name, position, contact, id, schedule, salary));
    }
    cursor.close();
}
private void displayInventoryData() {
    textArea.setText("Inventory Data:\n");
    textArea.append(String.format("%-20s %-20s %-20s %-20s %-20s\n", "Medicine ID", "Quantity on Hand", "Reorder Level", "Supplier ID", "Expiry Date"));
    MongoCursor<Document> cursor = inventoryCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String medicineID = document.getString("medicineID");
        String quantityOnHand = document.getString("quantityOnHand");
        String reorderLevel = document.getString("reorderLevel");
        String supplierID = document.getString("supplierID");
        String expiryDate = document.getString("expiryDate");
        textArea.append(String.format("%-20s %-20s %-20s %-20s %-20s\n", medicineID, quantityOnHand, reorderLevel, supplierID, expiryDate));
    }
    cursor.close();
}
private void displayBranchData() {
    textArea.setText("Branch Data:\n");
    textArea.append(String.format("%-20s %-20s %-20s %-20s %-20s\n", "Branch ID", "Address", "Contact", "Manager Name", "Operating Hours"));
    MongoCursor<Document> cursor = branchCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String branchID = document.getString("branchID");
        String address = document.getString("address");
        String contact = document.getString("contact");
        String managerName = document.getString("managerName");
        String operatingHours = document.getString("operatingHours");
        textArea.append(String.format("%-20s %-20s %-20s %-20s %-20s\n", branchID, address, contact, managerName, operatingHours));
    }
    cursor.close();
}
private void displayDoctorData() {
    textArea.setText("Doctor Data:\n");
    textArea.append(String.format("%-20s %-20s %-20s %-20s %-20s\n", "Doctor Name", "Specialty", "Contact", "License Number", "Clinic Address"));
    MongoCursor<Document> cursor = doctorCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String doctorName = document.getString("doctorName");
        String specialty = document.getString("specialty");
        String contact = document.getString("contact");
        String licenseNumber = document.getString("licenseNumber");
        String clinicAddress = document.getString("clinicAddress");
        textArea.append(String.format("%-20s %-20s %-20s %-20s %-20s\n", doctorName, specialty, contact, licenseNumber, clinicAddress));
    }
    cursor.close();
}
private void addEmployee() {
        String name = JOptionPane.showInputDialog(this, "Enter employee name:");
        String position = JOptionPane.showInputDialog(this, "Enter employee position:");
        String contact = JOptionPane.showInputDialog(this, "Enter employee contact:");
        String id = JOptionPane.showInputDialog(this, "Enter employee ID:");
        String schedule = JOptionPane.showInputDialog(this, "Enter employee schedule:");
        String salary = JOptionPane.showInputDialog(this, "Enter employee salary:");
        Document employeeDocument = new Document("name", name)
                                    .append("position", position)
                                    .append("contact", contact)
                                    .append("id", id)
                                    .append("schedule", schedule)
                                    .append("salary", salary);
        employeeCollection.insertOne(employeeDocument);
        JOptionPane.showMessageDialog(this, "Employee added successfully.");
        displayEmployeeData();
    }
private void updateEmployee() {
        String idToUpdate = JOptionPane.showInputDialog(this, "Enter the ID of the employee to update:");
        Document query = new Document("id", idToUpdate);
        Document existingEmployee = employeeCollection.find(query).first();
        if (existingEmployee != null) {
            String name = JOptionPane.showInputDialog(this, "Enter updated name:");
            String position = JOptionPane.showInputDialog(this, "Enter updated position:");
            String contact = JOptionPane.showInputDialog(this, "Enter updated contact:");
            String schedule = JOptionPane.showInputDialog(this, "Enter updated schedule:");
            String salary = JOptionPane.showInputDialog(this, "Enter updated salary:");
            Document updatedEmployee = new Document("name", name)
                                        .append("position", position)
                                        .append("contact", contact)
                                        .append("schedule", schedule)
                                        .append("salary", salary);
            employeeCollection.updateOne(query, new Document("$set", updatedEmployee));
            JOptionPane.showMessageDialog(this, "Employee updated successfully.");
            displayEmployeeData();
        } else {
            JOptionPane.showMessageDialog(this, "Employee not found.");
        }
    }
private void deleteEmployee() {
        String idToDelete = JOptionPane.showInputDialog(this, "Enter the ID of the employee to delete:");
        Document query = new Document("id", idToDelete);
        employeeCollection.deleteOne(query);
        JOptionPane.showMessageDialog(this, "Employee deleted successfully.");
        displayEmployeeData();
    }
private void addInventory() {
        String medicineID = JOptionPane.showInputDialog(this, "Enter medicine ID:");
        String quantityOnHand = JOptionPane.showInputDialog(this, "Enter quantity on hand:");
        String reorderLevel = JOptionPane.showInputDialog(this, "Enter reorder level:");
        String supplierID = JOptionPane.showInputDialog(this, "Enter supplier ID:");
        String expiryDate = JOptionPane.showInputDialog(this, "Enter expiry date:");
        Document inventoryDocument = new Document("medicineID", medicineID)
                                    .append("quantityOnHand", quantityOnHand)
                                    .append("reorderLevel", reorderLevel)
                                    .append("supplierID", supplierID)
                                    .append("expiryDate", expiryDate);
        inventoryCollection.insertOne(inventoryDocument);
        JOptionPane.showMessageDialog(this, "Inventory added successfully.");
        displayInventoryData();
    }
private void updateInventory() {
        String medicineIDToUpdate = JOptionPane.showInputDialog(this, "Enter the ID of the medicine to update:");
        Document query = new Document("medicineID", medicineIDToUpdate);
        Document existingInventory = inventoryCollection.find(query).first();
        if (existingInventory != null) {
            String quantityOnHand = JOptionPane.showInputDialog(this, "Enter updated quantity on hand:");
            String reorderLevel = JOptionPane.showInputDialog(this, "Enter updated reorder level:");
            String supplierID = JOptionPane.showInputDialog(this, "Enter updated supplier ID:");
            String expiryDate = JOptionPane.showInputDialog(this, "Enter updated expiry date:");
            Document updatedInventory = new Document("quantityOnHand", quantityOnHand)
                                        .append("reorderLevel", reorderLevel)
                                        .append("supplierID", supplierID)
                                        .append("expiryDate", expiryDate);
            inventoryCollection.updateOne(query, new Document("$set", updatedInventory));
            JOptionPane.showMessageDialog(this, "Inventory updated successfully.");
            displayInventoryData();
        } else {
            JOptionPane.showMessageDialog(this, "Inventory not found.");
        }
    }
private void deleteInventory() {
        String medicineIDToDelete = JOptionPane.showInputDialog(this, "Enter the ID of the medicine to delete:");
        Document query = new Document("medicineID", medicineIDToDelete);
        inventoryCollection.deleteOne(query);
        JOptionPane.showMessageDialog(this, "Inventory deleted successfully.");
        displayInventoryData();
    }
private void addBranch() {
        String branchID = JOptionPane.showInputDialog(this, "Enter branch ID:");
        String address = JOptionPane.showInputDialog(this, "Enter branch address:");
        String contact = JOptionPane.showInputDialog(this, "Enter branch contact:");
        String managerName = JOptionPane.showInputDialog(this, "Enter branch manager name:");
        String operatingHours = JOptionPane.showInputDialog(this, "Enter branch operating hours:");
        Document branchDocument = new Document("branchID", branchID)
                                    .append("address", address)
                                    .append("contact", contact)
                                    .append("managerName", managerName)
                                    .append("operatingHours", operatingHours);
        branchCollection.insertOne(branchDocument);
        JOptionPane.showMessageDialog(this, "Branch added successfully.");
        displayBranchData();
    }
private void updateBranch() {
        String branchIDToUpdate = JOptionPane.showInputDialog(this, "Enter the ID of the branch to update:");
        Document query = new Document("branchID", branchIDToUpdate);
        Document existingBranch = branchCollection.find(query).first();
        if (existingBranch != null) {
            String address = JOptionPane.showInputDialog(this, "Enter updated address:");
            String contact = JOptionPane.showInputDialog(this, "Enter updated contact:");
            String managerName = JOptionPane.showInputDialog(this, "Enter updated manager name:");
            String operatingHours = JOptionPane.showInputDialog(this, "Enter updated operating hours:");
            Document updatedBranch = new Document("address", address)
                                        .append("contact", contact)
                                        .append("managerName", managerName)
                                        .append("operatingHours", operatingHours);
            branchCollection.updateOne(query, new Document("$set", updatedBranch));
            JOptionPane.showMessageDialog(this, "Branch updated successfully.");
            displayBranchData();
        } else {
            JOptionPane.showMessageDialog(this, "Branch not found.");
        }
    }
private void deleteBranch() {
        String branchIDToDelete = JOptionPane.showInputDialog(this, "Enter the ID of the branch to delete:");
        Document query = new Document("branchID", branchIDToDelete);
        branchCollection.deleteOne(query);
        JOptionPane.showMessageDialog(this, "Branch deleted successfully.");
        displayBranchData();
    }
private void addDoctor() {
        String doctorName = JOptionPane.showInputDialog(this, "Enter doctor name:");
        String specialty = JOptionPane.showInputDialog(this, "Enter doctor specialty:");
        String contact = JOptionPane.showInputDialog(this, "Enter doctor contact:");
        String licenseNumber = JOptionPane.showInputDialog(this, "Enter doctor license number:");
        String clinicAddress = JOptionPane.showInputDialog(this, "Enter doctor clinic address:");
        Document doctorDocument = new Document("doctorName", doctorName)
                                    .append("specialty", specialty)
                                    .append("contact", contact)
                                    .append("licenseNumber", licenseNumber)
                                    .append("clinicAddress", clinicAddress);
        doctorCollection.insertOne(doctorDocument);
        JOptionPane.showMessageDialog(this, "Doctor added successfully.");
        displayDoctorData();
    }
private void updateDoctor() {
        String doctorNameToUpdate = JOptionPane.showInputDialog(this, "Enter the name of the doctor to update:");
        Document query = new Document("doctorName", doctorNameToUpdate);
        Document existingDoctor = doctorCollection.find(query).first();
        if (existingDoctor != null) {
            String specialty = JOptionPane.showInputDialog(this, "Enter updated specialty:");
            String contact = JOptionPane.showInputDialog(this, "Enter updated contact:");
            String licenseNumber = JOptionPane.showInputDialog(this, "Enter updated license number:");
            String clinicAddress = JOptionPane.showInputDialog(this, "Enter updated clinic address:");
            Document updatedDoctor = new Document("specialty", specialty)
                                        .append("contact", contact)
                                        .append("licenseNumber", licenseNumber)
                                        .append("clinicAddress", clinicAddress);
            doctorCollection.updateOne(query, new Document("$set", updatedDoctor));
            JOptionPane.showMessageDialog(this, "Doctor updated successfully.");
            displayDoctorData();
        } else {
            JOptionPane.showMessageDialog(this, "Doctor not found.");
        }
    }
private void deleteDoctor() {
        String doctorNameToDelete = JOptionPane.showInputDialog(this, "Enter the name of the doctor to delete:");
        Document query = new Document("doctorName", doctorNameToDelete);
        doctorCollection.deleteOne(query);
        JOptionPane.showMessageDialog(this, "Doctor deleted successfully.");
        displayDoctorData();
    }
private void displaySupplierData() {
    textArea.setText("Supplier Data:\n");
    textArea.append(String.format("%-30s %-30s %-20s %-50s %-50s\n", "Name", "Contact Person", "Contact Information", "Address", "List Of Supplied Medications"));
    MongoCursor<Document> cursor = supplierCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String name = document.getString("Name");
        String contactPerson = document.getString("ContactPerson");
        String contactInformation = document.getString("ContactInformation");
        String address = document.getString("Address");
        String medications = document.getString("ListOfSuppliedMedications");
        String medicationList = String.join(", ", medications);
        textArea.append(String.format("%-30s %-30s %-20s %-50s %-50s\n", name, contactPerson, contactInformation, address, medicationList));
    }
    cursor.close();
}
private void addSupplier() {
    String name = JOptionPane.showInputDialog(this, "Enter supplier name:");
    String contactPerson = JOptionPane.showInputDialog(this, "Enter contact person:");
    String contactInformation = JOptionPane.showInputDialog(this, "Enter contact information:");
    String address = JOptionPane.showInputDialog(this, "Enter address:");
    String medication = JOptionPane.showInputDialog(this, "Enter supplied medications (comma separated):");
    Document supplierDocument;
        supplierDocument = new Document("Name", name)
                .append("ContactPerson", contactPerson)
                .append("ContactInformation", contactInformation)
                .append("Address", address)
                .append("ListOfSuppliedMedications", medication);
    supplierCollection.insertOne(supplierDocument);
    JOptionPane.showMessageDialog(this, "Supplier added successfully.");
    displaySupplierData();
}
private void updateSupplier() {
    String nameToUpdate = JOptionPane.showInputDialog(this, "Enter the name of the supplier to update:");
    Document query = new Document("Name", nameToUpdate);
    Document existingSupplier = supplierCollection.find(query).first();
    if (existingSupplier != null) {
        String contactPerson = JOptionPane.showInputDialog(this, "Enter updated contact person:");
        String contactInformation = JOptionPane.showInputDialog(this, "Enter updated contact information:");
        String address = JOptionPane.showInputDialog(this, "Enter updated address:");
        String medication = JOptionPane.showInputDialog(this, "Enter updated supplied medications (comma separated):");
        Document updatedSupplier = new Document("ContactPerson", contactPerson)
                                   .append("ContactInformation", contactInformation)
                                   .append("Address", address)
                                   .append("ListOfSuppliedMedications", medication);
        supplierCollection.updateOne(query, new Document("$set", updatedSupplier));
        JOptionPane.showMessageDialog(this, "Supplier updated successfully.");
        displaySupplierData();
    } else {
        JOptionPane.showMessageDialog(this, "Supplier not found.");
    }
}
private void deleteSupplier() {
    String nameToDelete = JOptionPane.showInputDialog(this, "Enter the name of the supplier to delete:");
    Document query = new Document("Name", nameToDelete);
    supplierCollection.deleteOne(query);
    JOptionPane.showMessageDialog(this, "Supplier deleted successfully.");
    displaySupplierData();
}
private void displayMedicineData() {
    textArea.setText("Medicine Data:\n");
    textArea.append(String.format("%-20s %-20s %-20s %-20s %-10s %-15s %-10s %-15s %-20s\n", 
                                  "Name", "Brand", "Generic Name", "Dosage Form", "Strength", "Quantity", 
                                  "Unit Price", "Expiry Date", "Manufacturer"));
    MongoCursor<Document> cursor = medicineCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String name = document.getString("Name");
        String brand = document.getString("Brand");
        String genericName = document.getString("GenericName");
        String dosageForm = document.getString("DosageForm");
        String strength = document.getString("Strength");
        int quantityOnHand = document.getInteger("QuantityOnHand");
        double unitPrice = document.getDouble("UnitPrice");
        String expiryDate = document.getString("ExpiryDate");
        String manufacturer = document.getString("Manufacturer");
        textArea.append(String.format("%-20s %-20s %-20s %-20s %-10s %-15s %-10s %-15s %-20s\n", 
                                      name, brand, genericName, dosageForm, strength, quantityOnHand, 
                                      unitPrice, expiryDate, manufacturer));
    }
    cursor.close();
}
private void addMedicine() {
    String name = JOptionPane.showInputDialog(this, "Enter medicine name:");
    String brand = JOptionPane.showInputDialog(this, "Enter brand:");
    String genericName = JOptionPane.showInputDialog(this, "Enter generic name:");
    String dosageForm = JOptionPane.showInputDialog(this, "Enter dosage form:");
    String strength = JOptionPane.showInputDialog(this, "Enter strength:");
    int quantityOnHand = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity on hand:"));
    double unitPrice = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter unit price:"));
    String expiryDate = JOptionPane.showInputDialog(this, "Enter expiry date (YYYY-MM-DD):");
    String manufacturer = JOptionPane.showInputDialog(this, "Enter manufacturer:");
    Document medicineDocument = new Document("Name", name)
                                  .append("Brand", brand)
                                  .append("GenericName", genericName)
                                  .append("DosageForm", dosageForm)
                                  .append("Strength", strength)
                                  .append("QuantityOnHand", quantityOnHand)
                                  .append("UnitPrice", unitPrice)
                                  .append("ExpiryDate", expiryDate)
                                  .append("Manufacturer", manufacturer);
    medicineCollection.insertOne(medicineDocument);
    JOptionPane.showMessageDialog(this, "Medicine added successfully.");
    displayMedicineData();
}
private void updateMedicine() {
    String nameToUpdate = JOptionPane.showInputDialog(this, "Enter the name of the medicine to update:");
    Document query = new Document("Name", nameToUpdate);
    Document existingMedicine = medicineCollection.find(query).first();
    if (existingMedicine != null) {
        String brand = JOptionPane.showInputDialog(this, "Enter updated brand:");
        String genericName = JOptionPane.showInputDialog(this, "Enter updated generic name:");
        String dosageForm = JOptionPane.showInputDialog(this, "Enter updated dosage form:");
        String strength = JOptionPane.showInputDialog(this, "Enter updated strength:");
        int quantityOnHand = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter updated quantity on hand:"));
        double unitPrice = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter updated unit price:"));
        String expiryDate = JOptionPane.showInputDialog(this, "Enter updated expiry date (YYYY-MM-DD):");
        String manufacturer = JOptionPane.showInputDialog(this, "Enter updated manufacturer:");
        Document updatedMedicine = new Document("Brand", brand)
                                     .append("GenericName", genericName)
                                     .append("DosageForm", dosageForm)
                                     .append("Strength", strength)
                                     .append("QuantityOnHand", quantityOnHand)
                                     .append("UnitPrice", unitPrice)
                                     .append("ExpiryDate", expiryDate)
                                     .append("Manufacturer", manufacturer);
        medicineCollection.updateOne(query, new Document("$set", updatedMedicine));
        JOptionPane.showMessageDialog(this, "Medicine updated successfully.");
        displayMedicineData();
    } else {
        JOptionPane.showMessageDialog(this, "Medicine not found.");
    }
}
private void deleteMedicine() {
    String nameToDelete = JOptionPane.showInputDialog(this, "Enter the name of the medicine to delete:");
    Document query = new Document("Name", nameToDelete);
    medicineCollection.deleteOne(query);
    JOptionPane.showMessageDialog(this, "Medicine deleted successfully.");
    displayMedicineData();
}
private void displayPaymentData() {
    textArea.setText("Payment Data:\n");
    textArea.append(String.format("%-15s %-15s %-10s %-15s %-20s %-20s %-20s\n", 
                                  "Payment ID", "Transaction ID", "Amount", "Payment Method", 
                                  "Date & Time", "Customer Name", "Employee Name"));
    MongoCursor<Document> cursor = paymentCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String paymentID = document.getString("PaymentID");
        String transactionID = document.getString("TransactionID");
        double amountPaid = document.getDouble("AmountPaid");
        String paymentMethod = document.getString("PaymentMethod");
        String dateTime = document.getString("DateTime");
        String customerName = document.getString("CustomerName");
        String employeeName = document.getString("EmployeeName");
        textArea.append(String.format("%-15s %-15s %-10.2f %-15s %-20s %-20s %-20s\n", 
                                      paymentID, transactionID, amountPaid, paymentMethod, 
                                      dateTime, customerName, employeeName));
    }
    cursor.close();
}
private void addPayment() {
    String paymentID = JOptionPane.showInputDialog(this, "Enter payment ID:");
    String transactionID = JOptionPane.showInputDialog(this, "Enter transaction ID:");
    double amountPaid = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter amount paid:"));
    String paymentMethod = JOptionPane.showInputDialog(this, "Enter payment method:");
    String dateTime = JOptionPane.showInputDialog(this, "Enter date and time (YYYY-MM-DDTHH:MM:SS):");
    String customerName = JOptionPane.showInputDialog(this, "Enter customer name:");
    String employeeName = JOptionPane.showInputDialog(this, "Enter employee name:");
    Document paymentDocument = new Document("PaymentID", paymentID)
                               .append("TransactionID", transactionID)
                               .append("AmountPaid", amountPaid)
                               .append("PaymentMethod", paymentMethod)
                               .append("DateTime", dateTime)
                               .append("CustomerName", customerName)
                               .append("EmployeeName", employeeName);
    paymentCollection.insertOne(paymentDocument);
    JOptionPane.showMessageDialog(this, "Payment added successfully.");
    displayPaymentData();
}
private void updatePayment() {
    String paymentIDToUpdate = JOptionPane.showInputDialog(this, "Enter the payment ID to update:");
    Document query = new Document("PaymentID", paymentIDToUpdate);
    Document existingPayment = paymentCollection.find(query).first();
    if (existingPayment != null) {
        String transactionID = JOptionPane.showInputDialog(this, "Enter updated transaction ID:");
        double amountPaid = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter updated amount paid:"));
        String paymentMethod = JOptionPane.showInputDialog(this, "Enter updated payment method:");
        String dateTime = JOptionPane.showInputDialog(this, "Enter updated date and time (YYYY-MM-DDTHH:MM:SS):");
        String customerName = JOptionPane.showInputDialog(this, "Enter updated customer name:");
        String employeeName = JOptionPane.showInputDialog(this, "Enter updated employee name:");
        Document updatedPayment = new Document("TransactionID", transactionID)
                                  .append("AmountPaid", amountPaid)
                                  .append("PaymentMethod", paymentMethod)
                                  .append("DateTime", dateTime)
                                  .append("CustomerName", customerName)
                                  .append("EmployeeName", employeeName);
        paymentCollection.updateOne(query, new Document("$set", updatedPayment));
        JOptionPane.showMessageDialog(this, "Payment updated successfully.");
        displayPaymentData();
    } else {
        JOptionPane.showMessageDialog(this, "Payment not found.");
    }
}
private void deletePayment() {
    String paymentIDToDelete = JOptionPane.showInputDialog(this, "Enter the payment ID to delete:");
    Document query = new Document("PaymentID", paymentIDToDelete);
    paymentCollection.deleteOne(query);
    JOptionPane.showMessageDialog(this, "Payment deleted successfully.");
    displayPaymentData();
}
private void displayCustomerData() {
    textArea.setText("Customer Data:\n");
    textArea.append(String.format("%-20s %-30s %-15s %-30s %-50s %-30s %-15s\n", 
                                  "Name", "Address", "Phone Number", "Email", 
                                  "Prescription History", "Insurance Info", "Date of Birth"));
    MongoCursor<Document> cursor = customerCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String name = document.getString("Name");
        String address = document.getString("Address");
        String phoneNumber = document.getString("PhoneNumber");
        String email = document.getString("Email");
        String prescriptionHistory = document.getString("PrescriptionHistory");
        String insuranceInformation = document.getString("InsuranceInformation");
        String dateOfBirth = document.getString("DateOfBirth");
        textArea.append(String.format("%-20s %-30s %-15s %-30s %-50s %-30s %-15s\n", 
                                      name, address, phoneNumber, email, 
                                      String.join(", ", prescriptionHistory), insuranceInformation, dateOfBirth));
    }
    cursor.close();
}
private void addCustomer() {
    String name = JOptionPane.showInputDialog(this, "Enter customer name:");
    String address = JOptionPane.showInputDialog(this, "Enter address:");
    String phoneNumber = JOptionPane.showInputDialog(this, "Enter phone number:");
    String email = JOptionPane.showInputDialog(this, "Enter email:");
    String prescriptionHistory = JOptionPane.showInputDialog(this, "Enter prescription history (comma separated):");
    String insuranceInformation = JOptionPane.showInputDialog(this, "Enter insurance information:");
    String dateOfBirth = JOptionPane.showInputDialog(this, "Enter date of birth (YYYY-MM-DD):");
    Document customerDocument = new Document("Name", name)
                               .append("Address", address)
                               .append("PhoneNumber", phoneNumber)
                               .append("Email", email)
                               .append("PrescriptionHistory", prescriptionHistory)
                               .append("InsuranceInformation", insuranceInformation)
                               .append("DateOfBirth", dateOfBirth);
    customerCollection.insertOne(customerDocument);
    JOptionPane.showMessageDialog(this, "Customer added successfully.");
    displayCustomerData();
}
private void updateCustomer() {
    String nameToUpdate = JOptionPane.showInputDialog(this, "Enter the name of the customer to update:");
    Document query = new Document("Name", nameToUpdate);
    Document existingCustomer = customerCollection.find(query).first();
    if (existingCustomer != null) {
        String address = JOptionPane.showInputDialog(this, "Enter updated address:");
        String phoneNumber = JOptionPane.showInputDialog(this, "Enter updated phone number:");
        String email = JOptionPane.showInputDialog(this, "Enter updated email:");
        String prescriptionHistory = JOptionPane.showInputDialog(this, "Enter updated prescription history (comma separated):");
        String insuranceInformation = JOptionPane.showInputDialog(this, "Enter updated insurance information:");
        String dateOfBirth = JOptionPane.showInputDialog(this, "Enter updated date of birth (YYYY-MM-DD):");
        Document updatedCustomer = new Document("Address", address)
                                  .append("PhoneNumber", phoneNumber)
                                  .append("Email", email)
                                  .append("PrescriptionHistory", prescriptionHistory)
                                  .append("InsuranceInformation", insuranceInformation)
                                  .append("DateOfBirth", dateOfBirth);
        customerCollection.updateOne(query, new Document("$set", updatedCustomer));
        JOptionPane.showMessageDialog(this, "Customer updated successfully.");
        displayCustomerData();
    } else {
        JOptionPane.showMessageDialog(this, "Customer not found.");
    }
}
private void deleteCustomer() {
    String nameToDelete = JOptionPane.showInputDialog(this, "Enter the name of the customer to delete:");
    Document query = new Document("Name", nameToDelete);
    customerCollection.deleteOne(query);
    JOptionPane.showMessageDialog(this, "Customer deleted successfully.");
    displayCustomerData();
}
private void displayPrescriptionData() {
    textArea.setText("Prescription Data:\n");
    textArea.append(String.format("%-20s %-20s %-20s %-30s %-30s %-15s %-15s\n", 
                                  "Prescription No.", "Patient Name", "Doctor Name", "Medicines Prescribed", 
                                  "Dosage Instructions", "Issue Date", "Expiry Date"));
    MongoCursor<Document> cursor = prescriptionCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String prescriptionNumber = document.getString("PrescriptionNumber");
        String patientName = document.getString("PatientName");
        String doctorName = document.getString("DoctorName");
        String medicinesPrescribed = document.getString("MedicinesPrescribed");
        String dosageInstructions = document.getString("DosageInstructions");
        String issueDate = document.getString("IssueDate");
        String expiryDate = document.getString("ExpiryDate");
        textArea.append(String.format("%-20s %-20s %-20s %-30s %-30s %-15s %-15s\n", 
                                      prescriptionNumber, patientName, doctorName, 
                                      String.join(", ", medicinesPrescribed), dosageInstructions, issueDate, expiryDate));
    }
    cursor.close();
}
private void addPrescription() {
    String prescriptionNumber = JOptionPane.showInputDialog(this, "Enter prescription number:");
    String patientName = JOptionPane.showInputDialog(this, "Enter patient name:");
    String doctorName = JOptionPane.showInputDialog(this, "Enter doctor name:");
    String medicinesPrescribed = JOptionPane.showInputDialog(this, "Enter medicines prescribed (comma separated):");
    String dosageInstructions = JOptionPane.showInputDialog(this, "Enter dosage instructions:");
    String issueDate = JOptionPane.showInputDialog(this, "Enter issue date (YYYY-MM-DD):");
    String expiryDate = JOptionPane.showInputDialog(this, "Enter expiry date (YYYY-MM-DD):");
    Document prescriptionDocument = new Document("PrescriptionNumber", prescriptionNumber)
                                   .append("PatientName", patientName)
                                   .append("DoctorName", doctorName)
                                   .append("MedicinesPrescribed", medicinesPrescribed)
                                   .append("DosageInstructions", dosageInstructions)
                                   .append("IssueDate", issueDate)
                                   .append("ExpiryDate", expiryDate);
    prescriptionCollection.insertOne(prescriptionDocument);
    JOptionPane.showMessageDialog(this, "Prescription added successfully.");
    displayPrescriptionData();
}
private void updatePrescription() {
    String prescriptionNumberToUpdate = JOptionPane.showInputDialog(this, "Enter the prescription number to update:");
    Document query = new Document("PrescriptionNumber", prescriptionNumberToUpdate);
    Document existingPrescription = prescriptionCollection.find(query).first();
    if (existingPrescription != null) {
        String patientName = JOptionPane.showInputDialog(this, "Enter updated patient name:");
        String doctorName = JOptionPane.showInputDialog(this, "Enter updated doctor name:");
        String medicinesPrescribed = JOptionPane.showInputDialog(this, "Enter updated medicines prescribed (comma separated):");
        String dosageInstructions = JOptionPane.showInputDialog(this, "Enter updated dosage instructions:");
        String issueDate = JOptionPane.showInputDialog(this, "Enter updated issue date (YYYY-MM-DD):");
        String expiryDate = JOptionPane.showInputDialog(this, "Enter updated expiry date (YYYY-MM-DD):");

        Document updatedPrescription = new Document("PatientName", patientName)
                                      .append("DoctorName", doctorName)
                                      .append("MedicinesPrescribed", medicinesPrescribed)
                                      .append("DosageInstructions", dosageInstructions)
                                      .append("IssueDate", issueDate)
                                      .append("ExpiryDate", expiryDate);
        prescriptionCollection.updateOne(query, new Document("$set", updatedPrescription));
        JOptionPane.showMessageDialog(this, "Prescription updated successfully.");
        displayPrescriptionData();
    } else {
        JOptionPane.showMessageDialog(this, "Prescription not found.");
    }
}
private void deletePrescription() {
    String prescriptionNumberToDelete = JOptionPane.showInputDialog(this, "Enter the prescription number to delete:");
    Document query = new Document("PrescriptionNumber", prescriptionNumberToDelete);
    prescriptionCollection.deleteOne(query);
    JOptionPane.showMessageDialog(this, "Prescription deleted successfully.");
    displayPrescriptionData();
}
private void displayTransactionData() {
    textArea.setText("Transaction Data:\n");
    textArea.append(String.format("%-15s %-20s %-20s %-20s %-20s %-30s %-10s %-15s\n", 
                                  "Transaction ID", "Date & Time", "Customer Name", "Employee Name", 
                                  "Prescription No.", "Medications Sold", "Total Amount", "Payment Method"));
    MongoCursor<Document> cursor = transactionCollection.find().iterator();
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String transactionID = document.getString("TransactionID");
        String dateTime = document.getString("DateTime");
        String customerName = document.getString("CustomerName");
        String employeeName = document.getString("EmployeeName");
        String prescriptionNumber = document.getString("PrescriptionNumber");
        String medicationsSold = document.getString("MedicationsSold");
        double totalAmount = document.getDouble("TotalAmount");
        String paymentMethod = document.getString("PaymentMethod");
        textArea.append(String.format("%-15s %-20s %-20s %-20s %-20s %-30s %-10.2f %-15s\n", 
                                      transactionID, dateTime, customerName, employeeName, 
                                      prescriptionNumber, String.join(", ", medicationsSold), totalAmount, paymentMethod));
    }
    cursor.close();
}
private void addTransaction() {
    String transactionID = JOptionPane.showInputDialog(this, "Enter transaction ID:");
    String dateTime = JOptionPane.showInputDialog(this, "Enter date and time (YYYY-MM-DDTHH:MM:SS):");
    String customerName = JOptionPane.showInputDialog(this, "Enter customer name:");
    String employeeName = JOptionPane.showInputDialog(this, "Enter employee name:");
    String prescriptionNumber = JOptionPane.showInputDialog(this, "Enter prescription number:");
    String medicationsSold = JOptionPane.showInputDialog(this, "Enter medications sold (comma separated):");
    double totalAmount = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter total amount:"));
    String paymentMethod = JOptionPane.showInputDialog(this, "Enter payment method:");
    Document transactionDocument = new Document("TransactionID", transactionID)
                                  .append("DateTime", dateTime)
                                  .append("CustomerName", customerName)
                                  .append("EmployeeName", employeeName)
                                  .append("PrescriptionNumber", prescriptionNumber)
                                  .append("MedicationsSold", medicationsSold)
                                  .append("TotalAmount", totalAmount)
                                  .append("PaymentMethod", paymentMethod);
    transactionCollection.insertOne(transactionDocument);
    JOptionPane.showMessageDialog(this, "Transaction added successfully.");
    displayTransactionData();
}
private void updateTransaction() {
    String transactionIDToUpdate = JOptionPane.showInputDialog(this, "Enter the transaction ID to update:");
    Document query = new Document("TransactionID", transactionIDToUpdate);
    Document existingTransaction = transactionCollection.find(query).first();
    if (existingTransaction != null) {
        String dateTime = JOptionPane.showInputDialog(this, "Enter updated date and time (YYYY-MM-DDTHH:MM:SS):");
        String customerName = JOptionPane.showInputDialog(this, "Enter updated customer name:");
        String employeeName = JOptionPane.showInputDialog(this, "Enter updated employee name:");
        String prescriptionNumber = JOptionPane.showInputDialog(this, "Enter updated prescription number:");
        String medicationsSold = JOptionPane.showInputDialog(this, "Enter updated medications sold (comma separated):");
        double totalAmount = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter updated total amount:"));
        String paymentMethod = JOptionPane.showInputDialog(this, "Enter updated payment method:");
        Document updatedTransaction = new Document("DateTime", dateTime)
                                     .append("CustomerName", customerName)
                                     .append("EmployeeName", employeeName)
                                     .append("PrescriptionNumber", prescriptionNumber)
                                     .append("MedicationsSold", medicationsSold)
                                     .append("TotalAmount", totalAmount)
                                     .append("PaymentMethod", paymentMethod);
        transactionCollection.updateOne(query, new Document("$set", updatedTransaction));
        JOptionPane.showMessageDialog(this, "Transaction updated successfully.");
        displayTransactionData();
    } else {
        JOptionPane.showMessageDialog(this, "Transaction not found.");
    }
}
private void deleteTransaction() {
    String transactionIDToDelete = JOptionPane.showInputDialog(this, "Enter the transaction ID to delete:");
    Document query = new Document("TransactionID", transactionIDToDelete);
    transactionCollection.deleteOne(query);
    JOptionPane.showMessageDialog(this, "Transaction deleted successfully.");
    displayTransactionData();
}
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        Main main = new Main();
        main.setVisible(true);
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBranchButton;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addEmployeeButton2;
    private javax.swing.JButton addInventoryButton;
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JButton addPaymentButton;
    private javax.swing.JButton addPrescriptionButton;
    private javax.swing.JButton addSupplierButton;
    private javax.swing.JButton addTransactionButton;
    private javax.swing.JButton deleteBranchButton;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JButton deleteDoctorButton;
    private javax.swing.JButton deleteEmployeeButton1;
    private javax.swing.JButton deleteInventoryButton;
    private javax.swing.JButton deleteMedicineButton;
    private javax.swing.JButton deletePaymentButton;
    private javax.swing.JButton deletePrescriptionButton;
    private javax.swing.JButton deleteSupplierButton;
    private javax.swing.JButton deleteTransactionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton updateBranchButton;
    private javax.swing.JButton updateCustomerButton;
    private javax.swing.JButton updateDoctorButton;
    private javax.swing.JButton updateEmployeeButton1;
    private javax.swing.JButton updateMedicineButton;
    private javax.swing.JButton updatePaymentButton;
    private javax.swing.JButton updatePrescriptionButton;
    private javax.swing.JButton updateSupplierButton;
    private javax.swing.JButton updateTransactionButton;
    private javax.swing.JButton updateinventoryButton;
    private javax.swing.JButton viewBranchButton;
    private javax.swing.JButton viewCustomerButton;
    private javax.swing.JButton viewDoctorButton;
    private javax.swing.JButton viewEmployeeButton1;
    private javax.swing.JButton viewInventoryButton;
    private javax.swing.JButton viewMedicineButton;
    private javax.swing.JButton viewPaymentButton;
    private javax.swing.JButton viewPrescriptionButton;
    private javax.swing.JButton viewSupplierButton;
    private javax.swing.JButton viewTransactionButton;
    // End of variables declaration//GEN-END:variables
}
