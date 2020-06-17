
package librarymanagementsystem.GUI.ThemSuaGUI;

import java.awt.Color;
import javax.swing.JOptionPane;
import librarymanagementsystem.BUS.QLPhieuPhatBUS;
import librarymanagementsystem.DTO.QLPhieuPhatDTO;
import librarymanagementsystem.GUI.*;
import librarymanagementsystem.Toolkit.DataProcessing;

public class ThemPhieuPhatForm  extends javax.swing.JFrame{
    int x_Mouse, y_Mouse; // For Moving Window
    static String error_mess;
    DataProcessing dp = new DataProcessing();
    static QLPhieuPhatBUS ppBUS = new QLPhieuPhatBUS();
    
    public ThemPhieuPhatForm() {
        initComponents();
        setSize(830, 261);
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
    private void initComponents() {
        
        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        movingWindow = new javax.swing.JLabel();
        maPM_Label = new javax.swing.JLabel();
        tienPhat_Label = new javax.swing.JLabel();
        maLDP_Label = new javax.swing.JLabel();
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
        
        
        maPM_Label.setBackground(new java.awt.Color(245, 247, 250));
        maPM_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maPM_Label.setText("dfgfdg");
        maPM_Label.setBorder(null);
        maPM_Label.setOpaque(false);
        maPM_Label.setBounds(50, 128, 160, 30);
        jPanel1.add(maPM_Label);
        
        maLDP_Label.setBackground(new java.awt.Color(245, 247, 250));
        maLDP_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maLDP_Label.setText("fgdfdg");
        maLDP_Label.setBorder(null);
        maLDP_Label.setOpaque(false);
        maLDP_Label.setBounds(305, 128, 160, 30);
        jPanel1.add(maLDP_Label);

        tienPhat_Label.setBackground(new java.awt.Color(245, 247, 250));
        tienPhat_Label.setText("200000");
        tienPhat_Label.setBorder(null);
        tienPhat_Label.setOpaque(false);
        tienPhat_Label.setBounds(572, 128, 160, 30);
        jPanel1.add(tienPhat_Label);

        nhanVienForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtoolssuapp.png"))); // NOI18N
        nhanVienForm.setBounds(0, 0, 830, 261);
        jPanel1.add(nhanVienForm);
        jPanel1.setBounds(0, 0, 830, 261);
        
        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean check_input(String maPM, String maLDP){
         if (maPM.equals("")){
            error_mess = "Mã Phiếu Phạt trống!!!";
            return false;
        }
         if (maLDP.equals("")){
            error_mess = "Mã Lý Do Phạt trống!!!";
            return false;
        }
         if (dp.check_maMuonSach(maPM)){
            error_mess = "Mã Phiếu Mượn bị sai!!!";
            return false;
        }
          if (dp.check_maLDPhat(maLDP)){
            error_mess = "Mã Lý Do Phạt bị sai!!!";
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
        String maPM = maPM_Label.getText();
        String maLDP = maLDP_Label.getText();
        String maPP = dp.next_maPhieuPhat(ppBUS.getPKey());
        int tienPhat = Integer.parseInt(tienPhat_Label.getText());
        
         if (check_input(maPM, maLDP)){
            System.out.println("Nhập Thành Công");
            if (ppBUS.add(maPP, maPM, maLDP, tienPhat)){
                new AlertGUI(3, "Success", "Nhập Phiếu Phạt Thành Công!!!", "Quay Lại").setVisible(true);
                this.dispose();
            }
        }
        else{
            System.err.println(error_mess);
            System.out.println("Sửa Thất Bại");
            new AlertGUI(2, "Error", error_mess, "Quay Lại").setVisible(true);
            // Alert Form
        }
        
        System.out.println(maPP);
        System.out.println(maPM);
        System.out.println(maLDP);
        
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
            java.util.logging.Logger.getLogger(ThemPhieuPhatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuPhatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuPhatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuPhatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPhieuPhatForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nhanVienForm;
    private javax.swing.JLabel movingWindow;
    private javax.swing.JLabel tienPhat_Label;
    private javax.swing.JLabel maPM_Label;
    private javax.swing.JLabel maLDP_Label;
    // End of variables declaration//GEN-END:variables
}
