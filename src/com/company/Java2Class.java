package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.text.MessageFormat;

public class Java2Class extends javax.swing.JFrame {

    //Connect to DBMS
    private static final String username = "Student"; // Root system username
    private static final String password = "Java2Password";// Root system password
    //DB Table connector
    private static final String dbConn = "jdbc:mysql://localhost:127.0.0.1:3306/java2class.javaclass_connector";

    Connection SQLConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;

    public Java2Class() {
        initComponents();
        this.setLocationRelativeTo(null);

        upDateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_Backgrond = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_StudentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_FName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_MI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_LName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_CityTown = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_State = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ZIP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Phone = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_ButtonOptions = new javax.swing.JPanel();
        btton_UpdateEntry = new javax.swing.JButton();
        btton_AddEntry1 = new javax.swing.JButton();
        btton_Clear = new javax.swing.JButton();
        btton_Delete = new javax.swing.JButton();
        btton_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java 2 MySQL Connector");

        panel_Banner.setBackground(new java.awt.Color(204, 255, 255));
        panel_Banner.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("Java 2 MySQL Connector");

        javax.swing.GroupLayout panel_BannerLayout = new javax.swing.GroupLayout(panel_Banner);
        panel_Banner.setLayout(panel_BannerLayout);
        panel_BannerLayout.setHorizontalGroup(
                panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_BannerLayout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(248, Short.MAX_VALUE))
        );
        panel_BannerLayout.setVerticalGroup(
                panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_BannerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Backgrond.setBackground(new java.awt.Color(204, 255, 255));
        panel_Backgrond.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Student ID:");

        txt_StudentID.setEditable(false);
        txt_StudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("First Name:");

        txt_FName.setText(" ");
        txt_FName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("MI:");

        txt_MI.setText(" ");
        txt_MI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Last Name:");

        txt_LName.setText(" ");
        txt_LName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address:");

        txt_Address.setText(" ");
        txt_Address.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("City/Town:");

        txt_CityTown.setText(" ");
        txt_CityTown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("State:");

        txt_State.setText(" ");
        txt_State.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ZIP:");

        txt_ZIP.setText(" ");
        txt_ZIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Phone:");

        txt_Phone.setText(" ");
        txt_Phone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_Email.setText(" ");
        txt_Email.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("E-Mail:");

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Student ID", "First Name", "MI", "Last Name", "Address", "City/Town", "State", "ZIP", "Phone", "E-Mail"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panel_BackgrondLayout = new javax.swing.GroupLayout(panel_Backgrond);
        panel_Backgrond.setLayout(panel_BackgrondLayout);
        panel_BackgrondLayout.setHorizontalGroup(
                panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txt_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel10))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                                                                .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel11)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                                                                .addComponent(txt_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel4)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txt_MI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel5)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txt_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                                                                .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel7)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txt_CityTown, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel8)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txt_State, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel9)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txt_ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        panel_BackgrondLayout.setVerticalGroup(
                panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_BackgrondLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txt_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_MI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(txt_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txt_CityTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(txt_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(txt_ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_BackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ButtonOptions.setBackground(new java.awt.Color(204, 255, 255));
        panel_ButtonOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btton_UpdateEntry.setBackground(new java.awt.Color(51, 0, 255));
        btton_UpdateEntry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btton_UpdateEntry.setForeground(new java.awt.Color(255, 255, 255));
        btton_UpdateEntry.setText("Update Entry");
        btton_UpdateEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btton_UpdateEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_UpdateEntryActionPerformed(evt);
            }
        });

        btton_AddEntry1.setBackground(new java.awt.Color(51, 0, 255));
        btton_AddEntry1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btton_AddEntry1.setForeground(new java.awt.Color(255, 255, 255));
        btton_AddEntry1.setText("Add to MySQL");
        btton_AddEntry1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btton_AddEntry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btton_AddEntry1ActionPerformed(evt);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        btton_Clear.setBackground(new java.awt.Color(51, 0, 255));
        btton_Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btton_Clear.setForeground(new java.awt.Color(255, 255, 255));
        btton_Clear.setText("Clear Entry");
        btton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_ClearActionPerformed(evt);
            }
        });

        btton_Delete.setBackground(new java.awt.Color(51, 0, 255));
        btton_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btton_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btton_Delete.setText("Delete Entry");
        btton_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btton_Exit.setBackground(new java.awt.Color(51, 0, 255));
        btton_Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btton_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btton_Exit.setText("Exit");
        btton_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ButtonOptionsLayout = new javax.swing.GroupLayout(panel_ButtonOptions);
        panel_ButtonOptions.setLayout(panel_ButtonOptionsLayout);
        panel_ButtonOptionsLayout.setHorizontalGroup(
                panel_ButtonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_ButtonOptionsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_ButtonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ButtonOptionsLayout.createSequentialGroup()
                                                .addGroup(panel_ButtonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btton_AddEntry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btton_Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btton_UpdateEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(15, 15, 15))
                                        .addGroup(panel_ButtonOptionsLayout.createSequentialGroup()
                                                .addComponent(btton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ButtonOptionsLayout.createSequentialGroup()
                                                .addComponent(btton_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        panel_ButtonOptionsLayout.setVerticalGroup(
                panel_ButtonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_ButtonOptionsLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btton_AddEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btton_UpdateEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(panel_Backgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_ButtonOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel_Backgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_ButtonOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //=========== DB CONNECTION to Java Class_Connector ===================
    public void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            SQLConn = DriverManager.getConnection(dbConn, username, password);
            pst = SQLConn.prepareStatement("select * from java2class.javaclass_connector");

            rs = pst.executeQuery();
            ResultSetMetaData StData = rs.getMetaData();

            q = StData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (i = 1; i <= q; i++)
                {
                    columnData.add(rs.getShort("student ID"));
                    columnData.add(rs.getShort("First Name"));
                    columnData.add(rs.getShort("MI"));
                    columnData.add(rs.getShort("Last Name"));
                    columnData.add(rs.getShort("Address"));
                    columnData.add(rs.getShort("City/Town"));
                    columnData.add(rs.getShort("State"));
                    columnData.add(rs.getShort("ZIP"));
                    columnData.add(rs.getShort("EMAIL"));
                    columnData.add(rs.getShort("Phone"));
                }
                RecordTable.addRow(columnData);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    //=========== END DB CONNECTION to Java Class_Connector ===============

    private void btton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_ExitActionPerformed
        // EXIT button
        JFrame frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit Java 2 MySQL Connector?", "Java 2 MySQL Connector",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btton_ExitActionPerformed

    private void btton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_ClearActionPerformed
        // CLEAR entry button
        txt_StudentID.setText("");
        txt_FName.setText("");
        txt_MI.setText("");
        txt_LName.setText("");
        txt_Address.setText("");
        txt_CityTown.setText("");
        txt_State.setText("");
        txt_ZIP.setText("");
        txt_Phone.setText("");
        txt_Email.setText("");
    }//GEN-LAST:event_btton_ClearActionPerformed

    private void btton_AddEntry1ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {//GEN-FIRST:event_btton_AddEntry1ActionPerformed
        // ===== ADD ENTRY to MySQL DB =====
        try {
            Class.forName("com.mysql.jdbc.Driver");
            SQLConn = DriverManager.getConnection(dbConn, username, password);
            pst = SQLConn.prepareStatement("Insert into javaclass_connector(Student ID = ?, First Name = ?, "
                    + "Last Name = ?, EMAIL=?, Phone=?)");

            pst.setString(1, txt_StudentID.getText());
            pst.setString(2, txt_FName.getText());
            pst.setString(3, txt_MI.getText());
            pst.setString(4, txt_LName.getText());
            pst.setString(5, txt_Address.getText());
            pst.setString(6, txt_CityTown.getText());
            pst.setString(7, txt_State.getText());
            pst.setString(8, txt_ZIP.getText());
            pst.setString(9, txt_Phone.getText());
            pst.setString(10, txt_Email.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added to Database");
            upDateDB();

            }
         catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(Java2Class.class.getName()).log(java.util.logging.Level.SEVERE,
                     null, ex);
         }
         catch (SQLException ex){
                    java.util.logging.Logger.getLogger(Java2Class.class.getName()).log(java.util.logging.Level.SEVERE,
                            null, ex);
                }
    }//GEN-LAST:event_btton_AddEntry1ActionPerformed

    private void btton_UpdateEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_UpdateEntryActionPerformed
        //===== Automatic STUDENT ID NUMBER =====
        int numb;
        String StudentID = "";
        numb = 1000 + (int)(Math.random()*1000);
        StudentID += numb + 100;
        txt_StudentID.setText(StudentID);

        // ======== Update Entry information to TABLE =====
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        model.addRow(new Object []
                {txt_StudentID.getText(),txt_FName.getText(),txt_MI.getText(), txt_LName.getText(),
                        txt_Address.getText(),txt_CityTown.getText(), txt_State.getText(), txt_ZIP.getText(),
                        txt_Phone.getText(), txt_Email.getText()});
    }//GEN-LAST:event_btton_UpdateEntryActionPerformed

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
            java.util.logging.Logger.getLogger(Java2Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java2Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java2Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java2Class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java2Class().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btton_AddEntry1;
    private javax.swing.JButton btton_Clear;
    private javax.swing.JButton btton_Delete;
    private javax.swing.JButton btton_Exit;
    private javax.swing.JButton btton_UpdateEntry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel_Backgrond;
    private javax.swing.JPanel panel_Banner;
    private javax.swing.JPanel panel_ButtonOptions;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_CityTown;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_MI;
    private javax.swing.JTextField txt_Phone;
    private javax.swing.JTextField txt_State;
    private javax.swing.JTextField txt_StudentID;
    private javax.swing.JTextField txt_ZIP;
    // End of variables declaration//GEN-END:variables
}