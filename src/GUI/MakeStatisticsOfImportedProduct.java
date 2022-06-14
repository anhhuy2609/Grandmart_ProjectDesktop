/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.MakeStatistic_BUS;
import DTO.Employee_DTO;
import DTO.Statictis_DTO;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author DELL
 */
public class MakeStatisticsOfImportedProduct extends javax.swing.JFrame {

    /**
     * Creates new form MakeStatisticsOfSoldPro
     */
    MakeStatistic_BUS busMakeStatistic = new MakeStatistic_BUS();
    Statictis_DTO dtoStatistics = null;
    Employee_DTO dtoStorekeeper = null;
    ArrayList<Statictis_DTO> list = new ArrayList<>();
    public MakeStatisticsOfImportedProduct(Employee_DTO storekeeper) {
        initComponents();
        dtoStorekeeper = storekeeper;
        setResizable(false);
        setLocationRelativeTo(null);    
        createTable();
    }
    
    DefaultTableModel tblStatisticsModel;
    public void createTable(){
        tblStatisticsModel = new DefaultTableModel();
        //Tạo bảng
        String title[] = {"Product ID", "Product name","Imported quantity"};
        tblStatisticsModel.setColumnIdentifiers(title);
        tblStatistics.setModel(tblStatisticsModel);
        //cho phép sắp xếp từng cột
        tblStatistics.setAutoCreateRowSorter(true);
        //không cho sửa dữ liệu trong bảng
        tblStatistics.setEnabled(false); 
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dcDateImported = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_MakeStatistics = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatistics = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_PrintOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 122));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/12 - imported product icon - 1.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("MAKE STATISTICS OF IMPORTED PRODUCT");

        btn_turnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_turnback.setText("Turn back");
        btn_turnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 120));

        jPanel2.setBackground(new java.awt.Color(239, 250, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcDateImported.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dcDateImported, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 250, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Imported date:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, 30));

        jPanel3.setBackground(new java.awt.Color(239, 252, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make statistics");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 80));

        btn_MakeStatistics.setBackground(new java.awt.Color(51, 204, 255));
        btn_MakeStatistics.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_MakeStatistics.setForeground(new java.awt.Color(255, 255, 255));
        btn_MakeStatistics.setBorder(null);
        btn_MakeStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MakeStatisticsActionPerformed(evt);
            }
        });
        jPanel3.add(btn_MakeStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 80));

        tblStatistics.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStatistics);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 890, 250));

        jPanel4.setBackground(new java.awt.Color(239, 252, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Export Excel");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        btn_PrintOut.setBackground(new java.awt.Color(51, 204, 255));
        btn_PrintOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_PrintOut.setForeground(new java.awt.Color(255, 255, 255));
        btn_PrintOut.setBorder(null);
        btn_PrintOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintOutActionPerformed(evt);
            }
        });
        jPanel4.add(btn_PrintOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 950, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            StorekeeperHome home = new StorekeeperHome(dtoStorekeeper);
            home.setVisible(true);
        }
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btn_MakeStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MakeStatisticsActionPerformed
        // TODO add your handling code here:
        if(dcDateImported.getCalendar()== null)
            JOptionPane.showMessageDialog(this, "Required fields are empty", "Please enter imported date!", JOptionPane.ERROR_MESSAGE);
        else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tblStatisticsModel.setRowCount(0);        
            list = busMakeStatistic.getProductListForMakeStatisticsImported(sdf.format(dcDateImported.getDate()));
            //Load employee information into the table
            for(int i = 0; i < list.size(); i++){
                Statictis_DTO dtoStatistics = list.get(i);
                String[] rows = {String.valueOf(dtoStatistics.getPro_id()),dtoStatistics.getName(), String.valueOf(dtoStatistics.getImported_quantity())}; 
                tblStatisticsModel.addRow(rows);
            }
            if(tblStatistics.getRowCount() < 1){
                JOptionPane.showMessageDialog(this, "No match result.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_MakeStatisticsActionPerformed

    private void btn_PrintOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintOutActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Make statistics");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("THONG KE SAN PHAM NHAP NGAY "+ sdf.format(dcDateImported.getDate()));

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("PRODUCT ID");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("PRODUCT NAME");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("IMPORTED QUANTITY");
            list = busMakeStatistic.getProductListForMakeStatisticsImported(sdf.format(dcDateImported.getDate()));
            for(int i = 0; i < list.size(); i++){
                Statictis_DTO dtoStatistics = list.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(String.valueOf(dtoStatistics.getPro_id()));
                row.createCell(2).setCellValue(dtoStatistics.getName());
                row.createCell(3).setCellValue(String.valueOf(dtoStatistics.getImported_quantity()));
            }
            FileOutputStream out = new FileOutputStream(new File("D:/Imported Product("+sdf.format(dcDateImported.getDate())+").xlsx"));
            workbook.write(out);
            JOptionPane.showMessageDialog(this, "Export to excel successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_PrintOutActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MakeStatistics;
    private javax.swing.JButton btn_PrintOut;
    private javax.swing.JButton btn_turnback;
    private com.toedter.calendar.JDateChooser dcDateImported;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStatistics;
    // End of variables declaration//GEN-END:variables
}
