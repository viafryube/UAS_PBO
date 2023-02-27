
package crud;

import crud.preview.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class form extends javax.swing.JFrame {

    public form() {
       initComponents();
       GetData();
       databaru = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        t_gaji = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        t_nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_nohp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t_alamat = new javax.swing.JTextField();
        j_new = new javax.swing.JButton();
        j_save = new javax.swing.JButton();
        j_delete = new javax.swing.JButton();
        j_exit = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        t_jabatan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_view = new javax.swing.JTable();
        jButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 102, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA KARYAWAN ");

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Karyawan");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Karyawan");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gaji");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jabatan");

        t_id.setName(""); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No HP");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alamat");

        j_new.setBackground(new java.awt.Color(204, 204, 204));
        j_new.setText("New");
        j_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_newActionPerformed(evt);
            }
        });

        j_save.setBackground(new java.awt.Color(204, 204, 204));
        j_save.setText("Save");
        j_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_saveActionPerformed(evt);
            }
        });

        j_delete.setBackground(new java.awt.Color(204, 204, 204));
        j_delete.setText("Delete");
        j_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_deleteActionPerformed(evt);
            }
        });

        j_exit.setBackground(new java.awt.Color(204, 204, 204));
        j_exit.setText("Exit");
        j_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_exitActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("Preview");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        t_jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satpam", "Manager", "Marketing", "Administrasi" }));
        t_jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jabatanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j_save)
                    .addComponent(j_new, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j_exit)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)))
                .addGap(206, 206, 206))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_gaji, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_nohp, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(t_alamat))
                            .addComponent(t_jabatan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_new)
                    .addComponent(j_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_save)
                    .addComponent(j_exit)
                    .addComponent(jToggleButton1))
                .addGap(10, 10, 10))
        );

        table_view.setBackground(new java.awt.Color(204, 204, 204));
        table_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Karyawan", "Nama Karyawan", "Gaji", "Jabatan", "No HP", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_viewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_view);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("FORM", jPanel3);
        jTabbedPane1.addTab("CHART", jButton2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_viewMouseClicked
        
        try {
            databaru = false;
            int row = table_view.getSelectedRow();
            String idPil = table_view.getModel().getValueAt(row, 0).toString();
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();

            ResultSet sql = stm.executeQuery("SELECT * FROM crud WHERE id='" + idPil + "'");

            if(sql.next()){
                int jabatan = sql.getInt("jabatan");
                
                t_id.setText(sql.getString("id"));//mengambil value dengan balutan properti id
                t_nama.setText(sql.getString("nama"));//mengambil value dengan balutan properti nama
                t_gaji.setText(sql.getString("gaji"));//mengambil value dengan balutan properti gaji
                if(jabatan == 1){
                    t_jabatan.setSelectedItem("Satpam");
                } else if(jabatan == 2){
                    t_jabatan.setSelectedItem("Manager");
                } else if(jabatan == 3){
                    t_jabatan.setSelectedItem("Marketing");
                } else if(jabatan == 4){
                    t_jabatan.setSelectedItem("Administrasi");
                }
                t_nohp.setText(sql.getString("no_hp"));//mengambil value dengan balutan properti no_hp
                t_alamat.setText(sql.getString("alamat"));//mengambil value dengan balutan properti alamat
            }
        } catch (SQLException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_viewMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
//        PreviewForm previewForm = new PreviewForm ();
//
//        previewForm.setVisible(true);
        Preview preview = new Preview();
        preview.setID(1);
        String idd = Integer.toString(preview.getID());
        t_id.setText(idd);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void j_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_j_exitActionPerformed

    private void j_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_deleteActionPerformed

        try {
            String sql = "DELETE FROM crud WHERE id='" + t_id.getText() + "' ";
            Connection conn = koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            j_newActionPerformed(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Dihapus, " + ex);
        }
        GetData();
    }//GEN-LAST:event_j_deleteActionPerformed

    private void j_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_saveActionPerformed

        if (databaru) {
            //disini, default nilainya databaru menjadi True
            try {
                String jabatan = (String) t_jabatan.getSelectedItem();
                int jabatann = 0;
                if(jabatan.equals("Satpam")){
                    jabatann = 1;
                } else if(jabatan.equals("Manager")){
                    jabatann = 2;
                } else if(jabatan.equals("Marketing")){
                    jabatann = 3;
                } else if(jabatan.equals("Administrasi")){
                    jabatann = 4;
                }
                String sql = "INSERT INTO crud VALUES ('%s', '%s', '%s', '%s', '%s', '%s')";
                sql = String.format(
                    sql,
                    t_id.getText(),
                    t_nama.getText(),
                    t_gaji.getText(),
                    jabatann,
                    t_nohp.getText(),
                    t_alamat.getText()
                );
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");//memberikan pesan berhasil disimpan

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Disimpan, " + ex);//memberikan pesan gagal disimpan
            }
        }else{
            try{
                String jabatan = (String) t_jabatan.getSelectedItem();
                int jabatann = 0;
                if(jabatan.equals("Satpam")){
                    jabatann = 1;
                } else if(jabatan.equals("Manager")){
                    jabatann = 2;
                } else if(jabatan.equals("Marketing")){
                    jabatann = 3;
                } else if(jabatan.equals("Administrasi")){
                    jabatann = 4;
                }
                
                String sql = "UPDATE crud SET nama='%s', gaji='%s', jabatan='%s', no_hp='%s', alamat='%s' WHERE id='%s' ";
                sql = String.format(
                    sql,
                    t_nama.getText(),
                    t_gaji.getText(),
                    jabatann,
                    t_nohp.getText(),
                    t_alamat.getText(),
                    t_id.getText()
                );

                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Berhasil Diedit");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Diedit, " + ex);
            }
        }
        GetData();
    }//GEN-LAST:event_j_saveActionPerformed

    private void j_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_newActionPerformed

        databaru = true;

        t_id.setText("");//set value textfield  menjadi kosong
        t_nama.setText("");//set value textfield  menjadi kosong
        t_gaji.setText("");//set value textfield  menjadi kosong
        t_nohp.setText("");//set value textfield  menjadi kosong
        t_alamat.setText("");//set value textfield  menjadi kosong
    }//GEN-LAST:event_j_newActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            String query = "SELECT jabatan, "
            + "COUNT(CASE WHEN jabatan=1 THEN 1 END) as jabatanSatpam,"
            + "COUNT(CASE WHEN jabatan=2 THEN 1 END) as jabatanManager,"
            + "COUNT(CASE WHEN jabatan=3 THEN 1 END) as jabatanMarketing,"
            + "COUNT(CASE WHEN jabatan=4 THEN 1 END) as jabatanAdministrasi from crud";

            ResultSet rs = stm.executeQuery(query);
            DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
            while (rs.next()) {
                int[] count = {rs.getInt("jabatanSatpam"), rs.getInt("jabatanManager"), rs.getInt("jabatanMarketing"), rs.getInt("jabatanAdministrasi")};
                barChartData.setValue(count[0], "3", "Satpam");
                barChartData.setValue(count[1], "4", "Manager");
                barChartData.setValue(count[2], "5", "Marketing");
                barChartData.setValue(count[3], "6", "Administrasi");
            }
            JFreeChart bCD = ChartFactory.createBarChart(" Chart Jabatan Karyawan", "", "Range Jabatan ",
                barChartData, PlotOrientation.HORIZONTAL, false, true, false);
            CategoryPlot bChDa = bCD.getCategoryPlot();
            bChDa.setRangeGridlinePaint(Color.BLACK);
            ChartPanel barPanel = new ChartPanel(bCD);
            jButton2.removeAll();
            jButton2.add(barPanel, BorderLayout.CENTER);
            jButton2.validate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void t_jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_jabatanActionPerformed
    public boolean databaru;
    private final koneksi koneksi = new koneksi();
    
    public String jabatann;
    
     private void GetData() {
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("select * from crud");

            DefaultTableModel model = (DefaultTableModel) table_view.getModel();

            model.setRowCount(0);

            while (sql.next()) {
                String id = sql.getString("id");
                String nama = sql.getString("nama");
                String gaji = sql.getString("gaji");
                int jabatan = sql.getInt("jabatan");
                    if (jabatan == 1) {
                        jabatann = "Satpam";
                    } else if (jabatan == 2) {
                        jabatann = "Manager";
                    } else if (jabatan == 3) {
                        jabatann = "Marketing";
                    } else if (jabatan == 4) {
                        jabatann = "Administrasi";
                    }
                    String jabatannn = jabatann;
                String nohp = sql.getString("no_hp");
                String alamat = sql.getString("alamat");

                model.addRow(new Object[]{id, nama, gaji, jabatannn, nohp, alamat});
            }
        } catch (SQLException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
            //memberikan pesan Gagal Dihapus
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton j_delete;
    private javax.swing.JButton j_exit;
    private javax.swing.JButton j_new;
    private javax.swing.JButton j_save;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JTextField t_gaji;
    private javax.swing.JTextField t_id;
    private javax.swing.JComboBox<String> t_jabatan;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_nohp;
    private javax.swing.JTable table_view;
    // End of variables declaration//GEN-END:variables
}
