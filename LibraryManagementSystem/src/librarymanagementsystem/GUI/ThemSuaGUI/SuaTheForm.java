
package librarymanagementsystem.GUI.ThemSuaGUI;

import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import librarymanagementsystem.GUI.*;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.BUS.QLTheBUS;
import librarymanagementsystem.DTO.QLTheDTO;

public class SuaTheForm extends javax.swing.JFrame{
    int x_Mouse, y_Mouse; // For Moving Window
    static String error_mess;
    DataProcessing dp = new DataProcessing();
    static QLTheBUS theBUS = new QLTheBUS();
    String mt;
    QLTheDTO the;
    
    public SuaTheForm(String maThe) {
        the = new QLTheBUS().getThe(maThe);
        mt = maThe;
        initComponents(the.getMaKhachHang(), the.getNgayCap(), the.getNgayHetHan());
        setSize(830, 243);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String maKH, String ngayCap, String ngayHetHan) {
        
        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        movingWindow = new javax.swing.JLabel();
        ngayCap_textField = new javax.swing.JTextField();
        maKH_Label = new javax.swing.JLabel();
        ngayHetHan_Label = new javax.swing.JLabel();
        nhanVienForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T235936.194.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.setBounds(10, 7, 35, 35);
        jPanel1.add(addButton);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools (43).png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.setBounds(790, 16, 20, 20);
        jPanel1.add(exitButton);

        movingWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingWindowMouseDragged(evt);
            }
        });
        movingWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingWindowMousePressed(evt);
            }
        });
        movingWindow.setBounds(0, 0, 830, 60);
        jPanel1.add(movingWindow);
        
        
        maKH_Label.setBackground(new java.awt.Color(245, 247, 250));
        maKH_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maKH_Label.setText(maKH);
        maKH_Label.setBorder(null);
        maKH_Label.setOpaque(false);
        maKH_Label.setBounds(48, 125, 160, 30);
        jPanel1.add(maKH_Label);

        ngayCap_textField.setBackground(new java.awt.Color(245, 247, 250));
        ngayCap_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ngayCap_textField.setText(ngayCap);
        ngayCap_textField.setBorder(null);
        ngayCap_textField.setOpaque(false);
        ngayCap_textField.setBounds(305, 125, 160, 30);
        jPanel1.add(ngayCap_textField);
        
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1= Calendar.getInstance();
        Date tmp = Date.valueOf(ngayCap_textField.getText());
        c1.setTime(tmp);
        c1.roll(Calendar.YEAR,1);
        
        ngayHetHan_Label.setBackground(new java.awt.Color(245, 247, 250));
        ngayHetHan_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ngayHetHan_Label.setText(dateFormat.format(c1.getTime()));
        ngayHetHan_Label.setBorder(null);
        ngayHetHan_Label.setOpaque(false);
        ngayHetHan_Label.setBounds(560, 125, 160, 30);
        jPanel1.add(ngayHetHan_Label);

        nhanVienForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtoolssuathe.png"))); // NOI18N
        nhanVienForm.setBounds(0, 0, 830, 243);
        jPanel1.add(nhanVienForm);
        jPanel1.setBounds(0, 0, 830, 243);
        
        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean check_input(String ngayCap){
        if (ngayCap.equals("")){
            error_mess = "Ngày Cấp trống!!!";
            return false;
        }
        if (dp.check_ngaythangnam(ngayCap)){
            error_mess = "Ngày Cấp nhập sai!!!";
            return false;
        }
        return true;
    }
    
    private void movingWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingWindowMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x - x_Mouse, y - y_Mouse);
    }//GEN-LAST:event_movingWindowMouseDragged

    
    private void movingWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingWindowMousePressed
        x_Mouse = evt.getX();
        y_Mouse = evt.getY();
    }//GEN-LAST:event_movingWindowMousePressed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        String maKH = maKH_Label.getText();
        String ngayCap = ngayCap_textField.getText();
        String ngayHetHan = ngayHetHan_Label.getText();
        String maThe = mt;
        
        if (check_input(ngayCap)){
            int option = JOptionPane.showConfirmDialog(
                null, 
                "Bạn có muốn sửa Thẻ " + maThe + " ?", 
                "Xóa Thẻ", 
                JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                System.out.println("Nhập Thành Công");
                if (theBUS.mod(maThe, ngayHetHan, ngayCap, ngayHetHan)){
                    new AlertGUI(3, "Success", "Sửa Thẻ Thành Công!!!", "Quay Lại").setVisible(true);
                    this.dispose();
                }
            }
        }
        else{
            System.err.println(error_mess);
            System.out.println("Sửa Thất Bại");
            new AlertGUI(2, "Error", error_mess, "Quay Lại").setVisible(true);
            // Alert Form
        }
        
        System.out.println(maThe);
        System.out.println(maKH);
        System.out.println(ngayCap);
        System.out.println(ngayHetHan);
        
    }//GEN-LAST:event_addButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(SuaTheForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaTheForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaTheForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaTheForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaTheForm("T000020").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nhanVienForm;
    private javax.swing.JLabel movingWindow;
    private javax.swing.JTextField ngayCap_textField;
    private javax.swing.JLabel maKH_Label;
    private javax.swing.JLabel ngayHetHan_Label;
    // End of variables declaration//GEN-END:variables
}
