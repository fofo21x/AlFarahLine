/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinef;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author farah
 */
public class Fligths extends javax.swing.JFrame {

    /**
     * Creates new form Flgthe
     */
    public Fligths() {
        initComponents();
        DisplayFlight();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        FSourceCb = new javax.swing.JComboBox<>();
        FDestCb = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        SeatsTb = new javax.swing.JTextField();
        SaveBth = new javax.swing.JButton();
        EditDtn = new javax.swing.JButton();
        DeleteDtn = new javax.swing.JButton();
        BackDtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Alfarah Airline");

        jLabel3.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Manage Fligths");

        jPanel22.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Flight Code");

        jLabel5.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Source");

        jLabel6.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Destination");

        jLabel7.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Takeof Date");

        jLabel8.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Namber Of Seats");

        FCodeTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        FCodeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeTbActionPerformed(evt);
            }
        });

        FSourceCb.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dubai", "Abu Dhabi", "Sharjah", "Al Ain", "Al Ajman", "Ras Al Khaimah" }));

        FDestCb.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        FDestCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dubai", "Abu Dhabi", "Sharjah", "Al Ain", "Al Ajman", "Ras Al Khaimah" }));
        FDestCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDestCbActionPerformed(evt);
            }
        });

        FDate.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N

        SeatsTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        SeatsTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatsTbActionPerformed(evt);
            }
        });

        SaveBth.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        SaveBth.setForeground(new java.awt.Color(153, 0, 153));
        SaveBth.setText("Save");
        SaveBth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBthMouseClicked(evt);
            }
        });

        EditDtn.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        EditDtn.setForeground(new java.awt.Color(153, 0, 153));
        EditDtn.setText("Edit");
        EditDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditDtnMouseClicked(evt);
            }
        });
        EditDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDtnActionPerformed(evt);
            }
        });

        DeleteDtn.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        DeleteDtn.setForeground(new java.awt.Color(153, 0, 153));
        DeleteDtn.setText("Delete");
        DeleteDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteDtnMouseClicked(evt);
            }
        });
        DeleteDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDtnActionPerformed(evt);
            }
        });

        BackDtn.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        BackDtn.setForeground(new java.awt.Color(153, 0, 153));
        BackDtn.setText("Back");
        BackDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackDtnMouseClicked(evt);
            }
        });
        BackDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackDtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Fligths List");

        FlightsTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        FlightsTable.setRowHeight(25);
        FlightsTable.setSelectionBackground(new java.awt.Color(153, 0, 153));
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(FlightsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FDestCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SeatsTb)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SaveBth, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(EditDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(DeleteDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(BackDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314))))
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SeatsTb)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FDestCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FCodeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeTbActionPerformed

    private void FDestCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDestCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FDestCbActionPerformed

    private void SeatsTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatsTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeatsTbActionPerformed

    private void EditDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditDtnActionPerformed

    private void DeleteDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteDtnActionPerformed

    private void BackDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackDtnActionPerformed

    private void BackDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackDtnMouseClicked
Connection Con =  null;
PreparedStatement pst = null;
ResultSet Rs = null ,Rsl= null;
Statement St= null, Stl=null;
private void DisplayFlight()
{
     try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("select * from FlightTbl");
           FlightsTable.setModel(DbUtils.resultSetToTableModel(Rs));
           
     }catch (Exception e){
     }

}
   
      private void Clear ()
    {
        FCodeTb.setText("");
        SeatsTb.setText("");
        
    }
        
        
  
    
    private void SaveBthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBthMouseClicked
       if(FCodeTb.getText(). isEmpty() || SeatsTb.getText(). isEmpty() || FSourceCb.getSelectedIndex() ==-1|| FDestCb.getSelectedIndex() == -1 )     
    
{
    JOptionPane.showMessageDialog(this, "Missing Information");
   }else{
      try{
           
          Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          PreparedStatement Add= Con.prepareStatement("insert into FlightTbl values(?,?,?,?,?)");
          Add.setString(1,FCodeTb.getText());
          Add.setString(2,FSourceCb.getSelectedItem().toString());
          Add.setString(3,FDestCb.getSelectedItem().toString());
          Add.setString(4,FDate.getDate().toString());
          Add.setInt(5,Integer.valueOf(SeatsTb.getText()));
          int row =Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Flight Added");
          Con.close();
          DisplayFlight();
          Clear();
          
      }catch (Exception e){
      JOptionPane.showMessageDialog(this,e);
      }
}
    
    }//GEN-LAST:event_SaveBthMouseClicked

    private void DeleteDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteDtnMouseClicked
     
              if(Key == "") {
           JOptionPane.showMessageDialog(this, "select a Flight");
       }else{
          try{
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
              String Query = "Delete from FlightTbl where FlCode='"+Key+"'";
              Statement Del = Con.createStatement();
              Del.executeUpdate(Query);
              JOptionPane.showMessageDialog(this,"Flight Delete");
              DisplayFlight();
           
          }catch (Exception e){
             JOptionPane.showMessageDialog(this,e);

          } 
       }
    
    }//GEN-LAST:event_DeleteDtnMouseClicked
   String Key ="";
    private void FlightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableMouseClicked
       
       DefaultTableModel model = (DefaultTableModel)FlightsTable.getModel();
       int MyIndex = FlightsTable.getSelectedRow();
       Key = model.getValueAt(MyIndex, 0).toString();
       FSourceCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
       FDestCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
       SeatsTb.setText(model.getValueAt(MyIndex, 4).toString());
       
     
    }//GEN-LAST:event_FlightsTableMouseClicked
 
    private void EditDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditDtnMouseClicked
       
                if(Key == "")
{
    JOptionPane.showMessageDialog(this, "Select A Flight");
   }else{
      try{
       //   CountPassengers(); 
          Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          String Query ="Update FlightTbl set FlSource=?,FlDest=?,FlDate=?,FlSeats=? where FlCode=?";
          PreparedStatement Add= Con.prepareStatement(Query);
          Add.setString(5,Key);
          Add.setString(1,FSourceCb.getSelectedItem().toString());
          Add.setString(2,FDestCb.getSelectedItem().toString()); 
          Add.setString(3,FDate.getDate().toString());
          Add.setString(4,SeatsTb.getText());
          int row =Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Flight Updated");
          Con.close();
          DisplayFlight();
          Clear();
          
      }catch (Exception e){
      JOptionPane.showMessageDialog(this,e);
      }
                }
  
    }//GEN-LAST:event_EditDtnMouseClicked

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
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fligths().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackDtn;
    private javax.swing.JButton DeleteDtn;
    private javax.swing.JButton EditDtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox<String> FDestCb;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JButton SaveBth;
    private javax.swing.JTextField SeatsTb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
