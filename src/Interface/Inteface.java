package Interface;

import Data.Father;
import Domain.Persona;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdom.Element;
import org.jdom.JDOMException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ste98mora@gmail.com
 */
public class Inteface extends javax.swing.JFrame {

    Persona persona = new Persona();
     


    /**
     * Creates new form Inteface
     */
    public Inteface() {
        initComponents();
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
        lblName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txfFirstLastName = new javax.swing.JTextField();
        lblFirstLastName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfIDParent = new javax.swing.JTextField();
        lblIDParents = new javax.swing.JLabel();
        lblSecondLastname = new javax.swing.JLabel();
        txfID = new javax.swing.JTextField();
        tfxName = new javax.swing.JTextField();
        txfSecondLastName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tflBirth = new javax.swing.JTextField();
        tflCountry = new javax.swing.JTextField();
        btnDeleted = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lblName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name:");

        lblFirstLastName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFirstLastName.setForeground(new java.awt.Color(0, 0, 0));
        lblFirstLastName.setText("First Lastname");

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "FirstLastName", "SecondLastName", "Country", "ID", "Parents ID", "Birth"
            }
        ));
        tblList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblListAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblList);

        lblID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("ID");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Country");

        txfIDParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIDParentActionPerformed(evt);
            }
        });

        lblIDParents.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblIDParents.setForeground(new java.awt.Color(0, 0, 0));
        lblIDParents.setText("ID Parents");

        lblSecondLastname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSecondLastname.setForeground(new java.awt.Color(0, 0, 0));
        lblSecondLastname.setText("Second Lastname");

        txfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIDActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Birthday");

        btnDeleted.setText("Deleted");
        btnDeleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(btnAdd)
                            .addGap(445, 445, 445))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID)
                                    .addComponent(lblIDParents)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(txfID, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfxName, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(txfIDParent))))
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstLastName)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tflCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txfFirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblSecondLastname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txfSecondLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleted)
                            .addComponent(tflBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID)
                            .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(tflBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDParents)
                            .addComponent(txfIDParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstLastName)
                            .addComponent(txfFirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSecondLastname)
                            .addComponent(txfSecondLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tflCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDeleted))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfIDParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIDParentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIDParentActionPerformed

    private void txfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIDActionPerformed
public void fill()throws JDOMException, IOException{
         Father father = new Father("./data/my_people.xml");
           if (txfIDParent.getText().isEmpty() || tfxName.getText().isEmpty() || txfFirstLastName.getText().isEmpty()
                || txfSecondLastName.getText().isEmpty() || tflCountry.getText().isEmpty() || txfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene todo los espacios");
        }
//        person.setNombre(tfxName.getText());
//        person.setApellido1(txfFirstLastName.getText());
//        person.setApellido2(txfSecondLastName.getText());
//        person.setFechaDeNacimiento(tflBirth.getText());
//        person.setCedula(Integer.parseInt(txfID.getText()));
//        person.setCedulaPadre(Integer.parseInt(txfIDParent.getText()));
//        person.setPais(tflCountry.getText());

        DefaultTableModel modelo;
        Object fila[] = new Object[7];

        modelo = (DefaultTableModel) tblList.getModel();
        try {
            String name = tfxName.getText();
            String firstLastName = txfFirstLastName.getText();
            String secondLastName = txfSecondLastName.getText();
            String birthday = tflBirth.getText();
            String country = tflCountry.getText();
            int ID = Integer.parseInt(txfID.getText());
            int IDParentes = Integer.parseInt(txfIDParent.getText());

             persona = new Persona(name, firstLastName, secondLastName, birthday, country, ID, IDParentes);

            fila[0] = persona.getNombre();
            fila[1] = persona.getApellido1();
            fila[2] = persona.getApellido2();
            fila[3] = persona.getPais();
            fila[4] = persona.getCedula();
            fila[5] = persona.getCedulaPadre();
            fila[6] = persona.getFechaDeNacimiento();
         
            father.insertPerson(persona);
           
tfxName.setText("");
txfFirstLastName.setText("");
txfSecondLastName.setText("");
tflCountry.setText("");
tflBirth.setText("");
txfID.setText("");
txfIDParent.setText("");

            modelo.addRow(fila);
            tblList.setModel(modelo);
    
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error, por favor ingrese un valor númerico");
        }
}
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            fill();
        } catch (JDOMException ex) {
            Logger.getLogger(Inteface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inteface.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblListAncestorAdded

    }//GEN-LAST:event_tblListAncestorAdded
public void delete()throws JDOMException, IOException{
    Father father = new Father("./data/my_people.xml");

    int IDdeleted = Integer.parseInt(JOptionPane.showInputDialog("Write the ID to be deleted"));

 
      
            father.deletePerson(persona.getCedula());
        


   
}
    private void btnDeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletedActionPerformed
 
        try {
            delete();
        } catch (JDOMException ex) {
            Logger.getLogger(Inteface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inteface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletedActionPerformed

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
            java.util.logging.Logger.getLogger(Inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inteface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFirstLastName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDParents;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSecondLastname;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField tflBirth;
    private javax.swing.JTextField tflCountry;
    private javax.swing.JTextField tfxName;
    private javax.swing.JTextField txfFirstLastName;
    private javax.swing.JTextField txfID;
    private javax.swing.JTextField txfIDParent;
    private javax.swing.JTextField txfSecondLastName;
    // End of variables declaration//GEN-END:variables
}