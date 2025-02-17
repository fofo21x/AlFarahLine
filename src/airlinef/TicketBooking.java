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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author farah
 */
public class TicketBooking extends javax.swing.JFrame {

    /**
     * Creates new form TideBooing
     */
    public TicketBooking() {
        initComponents();
        GetPassenger();
        NationalityTb.setEditable(false);
        PassNameTb.setEditable(false);
        PassNumTb.setEditable(false);
        GenTb.setEditable(false);
        GetFlights();
        DisplayBooking();
        
        
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
        jLabel3 = new javax.swing.JLabel();
        FCodeCb = new javax.swing.JComboBox<>();
        jPanel27 = new javax.swing.JPanel();
        GenTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BookDtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        ResetDtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BackDtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PassNumTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PassNameTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NationalityTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PassIdCb = new javax.swing.JComboBox<>();
        AmountTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Tickest Booking");

        FCodeCb.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        FCodeCb.setForeground(new java.awt.Color(153, 0, 153));
        FCodeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeCbActionPerformed(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        GenTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        GenTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Passenger Name");

        BookDtn.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        BookDtn.setForeground(new java.awt.Color(153, 0, 153));
        BookDtn.setText("Book");
        BookDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookDtnMouseClicked(evt);
            }
        });
        BookDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookDtnActionPerformed(evt);
            }
        });

        BookingTable.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        BookingTable.setRowHeight(25);
        BookingTable.setSelectionBackground(new java.awt.Color(204, 0, 204));
        jScrollPane2.setViewportView(BookingTable);

        ResetDtn.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        ResetDtn.setForeground(new java.awt.Color(153, 0, 153));
        ResetDtn.setText("Reset");
        ResetDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetDtnMouseClicked(evt);
            }
        });
        ResetDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetDtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Gender");

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

        jLabel7.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Passport Number ");

        jLabel9.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Bookings");

        jLabel8.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Amount");

        PassNumTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        PassNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNumTbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("Flight Code");

        jLabel2.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Alfarah Airline");

        PassNameTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        PassNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNameTbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Nationality");

        NationalityTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        NationalityTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityTbActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("Passenger Id");

        PassIdCb.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        PassIdCb.setForeground(new java.awt.Color(153, 0, 153));
        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });

        AmountTb.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        AmountTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PassIdCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BookDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(ResetDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(BackDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(553, 553, 553)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(0, 65, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NationalityTb)
                            .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FCodeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeCbActionPerformed

    private void GenTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenTbActionPerformed
      
    private void DisplayBooking()
{
     try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("select * from BookingTbl");
           BookingTable.setModel(DbUtils.resultSetToTableModel(Rs));
           
     }catch (Exception e){
     }

}
    int TId = 0;
    private void CountFlights()
    {
     try {
        Stl= Con.createStatement();
        Rsl =Stl.executeQuery("select Max(TicketId) from BookingTbl"); 
        Rsl.next();
        TId = Rsl.getInt(1)+1;
        
     } catch (Exception e){
     }    
    }
    private void BookDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookDtnMouseClicked
  if(PassIdCb.getSelectedIndex() ==-1 || FCodeCb.getSelectedIndex() ==-1  || AmountTb.getText().isEmpty())      
    
{
    JOptionPane.showMessageDialog(this, "Missing Information");
   }else{
      try{
          CountFlights(); 
          Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          PreparedStatement Add= Con.prepareStatement("insert into BookingTbl values(?,?,?,?,?,?,?)");
          Add.setInt(1,TId);
          Add.setString(2,PassNameTb.getText());
          Add.setString(3,FCodeCb.getSelectedItem().toString());
          Add.setString(4,GenTb.getText());
          Add.setString(5,PassNumTb.getText());
          Add.setInt(6,Integer.valueOf(AmountTb.getText()));
          Add.setString(7,NationalityTb.getText());
          int row =Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Ticket Booked");
          Con.close();
          DisplayBooking();
          Clear();
          
      }catch (Exception e){
      JOptionPane.showMessageDialog(this,e);
      }
}
    
                                   
    }//GEN-LAST:event_BookDtnMouseClicked

    private void BookDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookDtnActionPerformed

    private void ResetDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetDtnActionPerformed
    Connection Con =  null;
    PreparedStatement pst = null;
    ResultSet Rs = null ,Rsl= null;
    Statement St= null, Stl=null;
      private void GetPassenger()
            
    {
        try {
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
             St = Con.createStatement();
             String Query ="select * from PassengersTbl ";
             Rs =St.executeQuery(Query);
             while(Rs.next())
             {
                String PId =String.valueOf(Rs.getInt("PId"));
                PassIdCb.addItem(PId);
             }
        }catch (Exception e) {
            
        }
    }
     private void GetPassengerData()
    {
        String Query  = "select * from PassengersTbl where PId ="+PassIdCb.getSelectedItem().toString();
        Statement St;
        ResultSet Rs;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
           St =Con.createStatement();
           Rs =St.executeQuery(Query);
           if (Rs.next())
           {
               PassNameTb.setText(Rs.getString("PName"));
               GenTb.setText(Rs.getString("PGen"));
               PassNumTb.setText(Rs.getString("Ppass"));
               NationalityTb.setText(Rs.getString("PNat"));
               
           }
        }catch (Exception e){
            
        }
    }  
    
    
    private void BackDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackDtnActionPerformed

    private void PassNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNumTbActionPerformed

    private void NationalityTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityTbActionPerformed

    private void PassNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNameTbActionPerformed

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
      GetPassengerData();
    }//GEN-LAST:event_PassIdCbActionPerformed

    private void AmountTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTbActionPerformed

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
      
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void BackDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDtnMouseClicked
       new MainForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackDtnMouseClicked
    private void Clear()
    {
          FCodeCb.setSelectedIndex(-1);
    //   PassIdCb.setSelectedIndex(-1);
       PassNameTb.setText("");
       PassNumTb.setText("");
       GenTb.setText("");
       NationalityTb.setText("");
       AmountTb.setText("");
       
                                        
   
  
    }
    private void ResetDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetDtnMouseClicked
      Clear();
      
      
    }//GEN-LAST:event_ResetDtnMouseClicked
   
    private void GetFlights()
            
    {
        try {
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
             St = Con.createStatement();
             String Query ="select * from FlightTbl ";
             Rs =St.executeQuery(Query);
             while(Rs.next())
             {
                String FCode =Rs.getString("FlCode");
                FCodeCb.addItem(FCode);
             }
        }catch (Exception e) {
            
        }
    }
   
    
 
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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JButton BackDtn;
    private javax.swing.JButton BookDtn;
    private javax.swing.JTable BookingTable;
    private javax.swing.JComboBox<String> FCodeCb;
    private javax.swing.JTextField GenTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox<String> PassIdCb;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JButton ResetDtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
