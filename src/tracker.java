
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKKU
 */
public class tracker extends javax.swing.JFrame {

    /**
     * Creates new form tracker
     */
    public tracker() {
        initComponents();
    }
     public tracker(double para){
        initComponents();
        jLabel1.setText(Double.toString(para));
        jLabel2.setText(Double.toString(para));
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel3.setText("Expense");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 190, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image (3).jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 0, 320, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(610, 0, 170, 160);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No.", "IName", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 340, 402);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(390, 200, 100, 40);

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jButton2.setText("GET HELP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(360, 360, 120, 40);

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jButton3.setText("PREVIOUS DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(490, 360, 180, 40);

        jButton4.setBackground(new java.awt.Color(51, 204, 0));
        jButton4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(670, 200, 120, 40);

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel6.setText("Serial No.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(400, 30, 90, 30);

        jTextField2.setEditable(false);
        jTextField2.setText("1");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(560, 30, 180, 30);

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel7.setText("Item Name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(400, 80, 90, 30);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(560, 80, 180, 30);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel8.setText("Price");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(400, 130, 90, 30);

        jTextField4.setToolTipText("Can't Be Null");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(560, 130, 180, 30);

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel9.setText("Remaining Amount");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(390, 310, 160, 30);

        jButton5.setBackground(new java.awt.Color(51, 204, 0));
        jButton5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jButton5.setText("UNDO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(530, 200, 100, 40);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(590, 270, 160, 30);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(590, 310, 150, 30);

        jLabel10.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel10.setText("Spendable Amount");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(390, 270, 160, 30);

        jButton6.setBackground(new java.awt.Color(51, 204, 0));
        jButton6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jButton6.setText("RESET ALL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(680, 360, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int Sno= Integer.parseInt(jTextField2.getText());
        String Iname= jTextField3.getText();
        double price= Double.parseDouble(jTextField4.getText());
        double sam = Double.parseDouble(jLabel1.getText());
        double minus=sam;
        
        
        
        
        if(price<0)
        {
            JOptionPane.showMessageDialog(this,"Price Can't Be Negative");
        }
        
        
        
       
        else if(price>sam)
        {
            JOptionPane.showMessageDialog(null,"You Have Reached Your Spending Limit");
        }
        
        else
        {
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
           DriverManager.getConnection("jdbc:mysql://localhost:3306/mtracker",
            "root", "1234");
            Statement stmt = (Statement) con.createStatement();
            String query = "INSERT INTO item VALUES('"+Sno+"','"+Iname+"',"
                    + "'"+price+"');";
          stmt.executeUpdate(query);
    Sno++;
    jTextField2.setText(Integer.toString(Sno));
           JOptionPane.showMessageDialog(this,"To View Changes Please Click Refresh");
           jTextField3.setText("");
            jTextField4.setText("");
        }
        catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    }   
        }
        
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
           DriverManager.getConnection("jdbc:mysql://localhost:3306/mtracker",
            "root", "1234");
            Statement stmt = (Statement) con.createStatement();
         String left="SELECT SUM(Price) FROM item;";
          ResultSet rs= stmt.executeQuery(left);
            if(rs.next())
            {
           String sum=rs.getString("sum(Price)");
          double sum1= Double.parseDouble(sum);
          minus=sam-sum1;
          if(minus>0)
          {
            jLabel2.setText(Double.toString(minus));
            }
          else
            {
                JOptionPane.showMessageDialog(this, "Not Acceptable");
            }
            }
            

        }
        catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    }   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
DefaultTableModel model = (DefaultTableModel)
jTable1.getModel();

int rows=model.getRowCount();
if (rows>0)
{
for (int i=0; i<rows; i++)
model.removeRow(0); 
}

try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/mtracker",
"root", "1234");
Statement stmt = (Statement) con.createStatement();
String query="SELECT * FROM item;";
ResultSet rs = stmt.executeQuery(query);
while(rs.next())
{
String SNo = rs.getString("SNo");
String Iname = rs.getString("Iname");
String price = rs.getString("price");
model.addRow (new Object[] {SNo, Iname,price});
}     
}
catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String Price= jTextField4.getText();
       double sam=Double.parseDouble(jLabel1.getText());
       double minus;
       int sn=Integer.parseInt(jTextField2.getText());
        String IName= jTextField3.getText();
       
        
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
           DriverManager.getConnection("jdbc:mysql://localhost:3306/mtracker",
            "root", "1234");
            Statement stmt = (Statement) con.createStatement();
String query = "DELETE FROM item WHERE IName='"+IName+"' AND Price='"+Price+"';";
          stmt.executeUpdate(query);
          sn--;
          jTextField2.setText(sn+"");
          jTextField3.setText("");
          jTextField4.setText("");
           JOptionPane.showMessageDialog(this,"To View Changes Please Click Refresh");
        }
        catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    }   
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
           DriverManager.getConnection("jdbc:mysql://localhost:3306/mtracker",
            "root", "1234");
            Statement stmt = (Statement) con.createStatement();
         String left="SELECT SUM(Price) FROM item;";
          ResultSet rs= stmt.executeQuery(left);
            if(rs.next())
            {
           String sum=rs.getString("sum(Price)");
          double sum1= Double.parseDouble(sum);
          minus=sam-sum1;
            jLabel2.setText(Double.toString(minus));
            
            }

        }
        catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    }  
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

  DefaultTableModel model = (DefaultTableModel)
jTable1.getModel();

int rows=model.getRowCount();
if (rows>0)
{
for (int i=0; i<rows; i++)
model.removeRow(0); 
}

try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/mtracker",
"root", "1234");
Statement stmt = (Statement) con.createStatement();
String query="SELECT * FROM item;";
ResultSet rs = stmt.executeQuery(query);
while(rs.next())
{
String SNo = rs.getString("SNo");
String Iname = rs.getString("Iname");
String price = rs.getString("price");
model.addRow (new Object[] {SNo, Iname,price});
}     
}
catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
double save = Double.parseDouble(jLabel1.getText());
double rem = Double.parseDouble(jLabel2.getText());
double buy = rem*0.4;
double buy1= rem*0.7;
double price = Double.parseDouble(jTextField4.getText());

if(price<buy)
{
    JOptionPane.showMessageDialog(this,"Buy It");
}
else if(price<buy1)
{
    JOptionPane.showMessageDialog(this,"Think About Buying Or Not");
}
else{
    JOptionPane.showMessageDialog(this,"Don't Buy It");
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
DefaultTableModel model = (DefaultTableModel)
jTable1.getModel();
jTextField2.setText("1");
int rows=model.getRowCount();
if (rows>0)
{
for (int i=0; i<rows; i++)
model.removeRow(0); 
}

try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/mtracker",
"root", "1234");
Statement stmt = (Statement) con.createStatement();
String query="DELETE FROM item;";
stmt.executeUpdate(query);
   
}
catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        
}
double asd =Double.parseDouble(jLabel1.getText());
jLabel2.setText(Double.toString(asd));
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
