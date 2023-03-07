/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_management;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static stock_management.Registration.url;

/**
 *
 * @author USER
 */
public class Add_Purchase extends javax.swing.JFrame {

    /**
     * Creates new form Add_Purchase
     */
    public Add_Purchase() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    String cur_purchase= null;
    String month =  null;
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        order_no_tf = new javax.swing.JTextField();
        order_date_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        item_id_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        item_name_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amt_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quantity_tf = new javax.swing.JTextField();
        upload_btn = new javax.swing.JButton();
        total_amt_btn = new javax.swing.JButton();
        total_amt_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vendor_name_tf = new javax.swing.JTextField();
        checkavail_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        quantity_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("Order_No :");

        order_no_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_no_tfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("Order_Date :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setText("Vendor_name :  ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setText("Item_Name :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setText("Quantity :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setText("Item_Id:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setText("Amount :");

        upload_btn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        upload_btn.setText("DONE");
        upload_btn.setEnabled(false);
        upload_btn.setMaximumSize(new java.awt.Dimension(195, 33));
        upload_btn.setMinimumSize(new java.awt.Dimension(195, 33));
        upload_btn.setPreferredSize(new java.awt.Dimension(195, 33));
        upload_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_btnActionPerformed(evt);
            }
        });

        total_amt_btn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        total_amt_btn.setText("Total Amount");
        total_amt_btn.setEnabled(false);
        total_amt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_amt_btnActionPerformed(evt);
            }
        });

        total_amt_label.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText(" Add New Purchase");

        checkavail_btn.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        checkavail_btn.setText("Check Availability");
        checkavail_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkavail_btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Available:");

        quantity_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addComponent(checkavail_btn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(amt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantity_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(total_amt_btn)
                                        .addGap(15, 15, 15)
                                        .addComponent(total_amt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(order_date_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendor_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(order_no_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(upload_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order_no_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(order_date_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vendor_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(item_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkavail_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(item_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(quantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quantity_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(amt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total_amt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(total_amt_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upload_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upload_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_btnActionPerformed
        // TODO add your handling code here: 
        String order_no,order_date,vendor_name,item_name,item_id,quantity,in,tot_amt;
        order_no= order_no_tf.getText();
        order_date= order_date_tf.getText();
        vendor_name= vendor_name_tf.getText();
        item_name= item_name_tf.getText();
        item_id= item_id_tf.getText();
        quantity= quantity_tf.getText();
        in="IN";
        tot_amt= total_amt_label.getText();
        String query = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,"root","");
            Statement st= conn.createStatement();
            int a=st.executeUpdate("insert into transactions values('"+order_no+"','"+order_date+"','"+item_name+"','"+item_id+"','"+in+"','"+vendor_name+"','"+quantity+"','"+tot_amt+"')");
             
            if(a==1){
                JOptionPane.showMessageDialog(this," Purchase Order Created Successfully ");
                
            }
                    
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this," Purchase Order Creation failed ","Error",JOptionPane.ERROR_MESSAGE);
        }
        String q= quantity_lbl.getText();
        Integer q1= Integer.parseInt(q);
        q1=q1+Integer.parseInt(quantity_tf.getText());
        String quant = q1.toString();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,"root","");
            Statement stmt=conn.createStatement();
            stmt.executeUpdate("update items set No_of_Units='"+quant+"' where Item_Name = '"+item_name+"'");
                                
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this," Purchase Order Creation failed ","Error",JOptionPane.ERROR_MESSAGE);
           
        }
        Double p = Double.parseDouble(cur_purchase);
        p = p + Double.parseDouble(total_amt_label.getText());
        try{
            Connection conn= DriverManager.getConnection(url,"root","");
            Statement st= conn.createStatement();
            query = "update report set Purchase_amt = '"+p+"' where Month ='"+month+"'";
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
        close();
        new Purchase().setVisible(true);
        
    }//GEN-LAST:event_upload_btnActionPerformed

    private void total_amt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_amt_btnActionPerformed
        // TODO add your handling code here:       
        String quantity = quantity_tf.getText();
        String amt = amt_tf.getText();
        double quantity_double = Double.parseDouble(quantity);
        double amt_double = Double.parseDouble(amt);
        double total_amt = quantity_double * amt_double;
        String total_amt_str = String.valueOf(total_amt); 
        total_amt_label.setText(total_amt_str);
        upload_btn.setEnabled(true);
    }//GEN-LAST:event_total_amt_btnActionPerformed

    private void order_no_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_no_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_no_tfActionPerformed

    private void checkavail_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkavail_btnActionPerformed
        // TODO add your handling code here:
        String order_date =  order_date_tf.getText();
        String var= item_name_tf.getText();
        String item_id = null, purchase_rate = null,quantity_item= null;
        try{
            Connection conn= DriverManager.getConnection(url,"root","");
            Statement st= conn.createStatement();
            String query = "select * from items where Item_Name = '"+var+"'";
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                item_id = rs.getString("Item_Id");
                purchase_rate = rs.getString("Purchase_Rate");
                quantity_item = rs.getString("No_of_Units");
            }
               
        }
        catch(Exception e){
            System.out.println(e);
        }
        item_id_tf.setText(item_id);
        amt_tf.setText(purchase_rate);
        quantity_lbl.setText(quantity_item);
        total_amt_btn.setEnabled(true);
        
        if(order_date.contains("-01-")){
            month = "Jan_21";
        }
        else if(order_date.contains("-02-")){
            month = "Feb_21";
        }
        else if(order_date.contains("-03-")){
            month = "Mar_21";
        }
        else if(order_date.contains("-04-")){
            month = "Apr_21";
        }
        else if(order_date.contains("-05-")){
            month = "May_21";
        }
        else if(order_date.contains("-06-")){
            month = "Jun_21";
        }
        else if(order_date.contains("-07-")){
            month = "Jul_21";
        }
        else if(order_date.contains("-08-")){
            month = "Aug_21";
        }
        else if(order_date.contains("-09-")){
            month = "Sep_21";
        }
        else if(order_date.contains("-10-")){
            month = "Oct_21";
        }
        else if(order_date.contains("-11-")){
            month = "Nov_21";
        }
        else if(order_date.contains("-12-")){
            month = "Dec_21";
        }
        try{
            
            Connection conn= DriverManager.getConnection(url,"root","");
            Statement st= conn.createStatement();
            String query = "select purchase_amt from report where Month = '"+month+"'";
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                cur_purchase = rs.getString("Purchase_amt");                
            }
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_checkavail_btnActionPerformed
        
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
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt_tf;
    private javax.swing.JButton checkavail_btn;
    private javax.swing.JTextField item_id_tf;
    private javax.swing.JTextField item_name_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField order_date_tf;
    private javax.swing.JTextField order_no_tf;
    private javax.swing.JLabel quantity_lbl;
    private javax.swing.JTextField quantity_tf;
    private javax.swing.JButton total_amt_btn;
    private javax.swing.JLabel total_amt_label;
    private javax.swing.JButton upload_btn;
    private javax.swing.JTextField vendor_name_tf;
    // End of variables declaration//GEN-END:variables
}
