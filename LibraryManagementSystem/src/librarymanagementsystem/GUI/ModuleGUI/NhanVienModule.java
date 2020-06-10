package librarymanagementsystem.GUI.ModuleGUI;

import java.awt.Color;
import java.util.ArrayList;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.Toolkit.FileProcessing.*;
import librarymanagementsystem.GUI.Table.*;
import librarymanagementsystem.GUI.HienThiGUI.*;
import librarymanagementsystem.DTO.*;
import librarymanagementsystem.BUS.*;
import librarymanagementsystem.GUI.*;

import javax.swing.JPanel;

public class NhanVienModule {
    //private static DataProcessing dp = new DataProcessing();
    //private static QLChiTietSachBUS chiTietSachBUS = new QLChiTietSachBUS();
    //private static QLTheBUS theBUS = new QLTheBUS();
    //private static QLPhieuMuonBUS phieuMuonBUS = new QLPhieuMuonBUS();
    //private static QLNhanVienBUS nhanVienBUS = new QLNhanVienBUS();
    //private static QLKhachHangBUS khachHangBUS = new QLKhachHangBUS();
    
    public JPanel getNhanVienModule() {
        initComponents();
        
        return jPanel1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nhanVien_Table = new javax.swing.JPanel();
        searchtextfield = new javax.swing.JTextField();
        search_bar = new javax.swing.JLabel();
        them_btn = new javax.swing.JLabel();
        nhapexcel_btn = new javax.swing.JLabel();
        xuatexcel_btn = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.setBounds(0, 0, 940, 600);
        //getContentPane().add(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setOpaque(false);

        searchtextfield.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchtextfield.setForeground(new java.awt.Color(82, 210, 202));
        searchtextfield.setText("Tìm Kiếm...");
        searchtextfield.setBorder(null);
        searchtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextfieldActionPerformed(evt);
            }
        });
        searchtextfield.setBounds(100, 63, 240, 30);
        jPanel1.add(searchtextfield);

        search_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T185554.332.png"))); // NOI18N
        search_bar.setBounds(40, 55, 320, 46);
        jPanel1.add(search_bar);

        them_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203841.556.png"))); // NOI18N
        them_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                them_btnMouseClicked(evt);
            }
        });
        them_btn.setBounds(410, 30, 160, 78);
        jPanel1.add(them_btn);

        nhapexcel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203937.073.png"))); // NOI18N
        nhapexcel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapexcel_btnMouseClicked(evt);
            }
        });
        nhapexcel_btn.setBounds(580, 30, 160, 78);
        
        jPanel1.add(nhapexcel_btn);

        xuatexcel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203932.633.png"))); // NOI18N
        xuatexcel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatexcel_btnMouseClicked(evt);
            }
        });xuatexcel_btn.setBounds(750, 30, 160, 78);
        jPanel1.add(xuatexcel_btn);
        
        nhanVien_Table = new QLNhanVienTable().getTable();
        nhanVien_Table.setBounds(42, 150, 860, 440);
        
        jPanel1.add(nhanVien_Table);
        
        //pack();
    }// </editor-fold>                        

    private void them_btnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        System.out.println("Thêm");
    }                                     

    private void nhapexcel_btnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.out.println("Nhập Excel");
        ArrayList <QLNhanVienDTO> sach = new ImportFile().readFileExcel_QLNhanVien();
    }                                          

    private void xuatexcel_btnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.out.println("Xuất Excel");
        new ExportFile().writeFileExcel_QLNhanVien();
    }                                          

    private void searchtextfieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel search_bar;
    private static javax.swing.JTextField searchtextfield;
    private static javax.swing.JLabel them_btn;
    private static javax.swing.JLabel nhapexcel_btn;
    private static javax.swing.JLabel xuatexcel_btn;
    private static javax.swing.JPanel nhanVien_Table;
    // End of variables declaration                 
}
