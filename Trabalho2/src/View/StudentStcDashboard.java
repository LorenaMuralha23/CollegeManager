/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class StudentStcDashboard extends javax.swing.JPanel {
    
   
    
    public StudentStcDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subtitleLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        sideMenuPanel = new javax.swing.JPanel();
        sideMenuLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        subtitleLabel = new javax.swing.JLabel();
        loginLabel1 = new javax.swing.JLabel();
        subtitleLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        loginLabel2 = new javax.swing.JLabel();
        statisticPanel = new javax.swing.JPanel();
        subtitleLabel2 = new javax.swing.JLabel();
        subtitleLabel3 = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        statisticPanel4 = new javax.swing.JPanel();
        subtitleLabel4 = new javax.swing.JLabel();
        subtitleLabel14 = new javax.swing.JLabel();
        statisticPanel6 = new javax.swing.JPanel();
        subtitleLabel17 = new javax.swing.JLabel();
        subtitleLabel18 = new javax.swing.JLabel();
        subtitleLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        statisticPanel8 = new javax.swing.JPanel();
        subtitleLabel7 = new javax.swing.JLabel();
        subtitleLabel21 = new javax.swing.JLabel();
        statisticPanel1 = new javax.swing.JPanel();
        subtitleLabel8 = new javax.swing.JLabel();
        subtitleLabel9 = new javax.swing.JLabel();
        statisticPanel2 = new javax.swing.JPanel();
        subtitleLabel10 = new javax.swing.JLabel();
        subtitleLabel11 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();

        subtitleLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel5.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel5.setText("Select a class:");

        jComboBox2.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(241, 234, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        sideMenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sideMenusideMenuImg.png"))); // NOI18N

        javax.swing.GroupLayout sideMenuPanelLayout = new javax.swing.GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideMenuPanelLayout.setVerticalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuLabel)
        );

        jPanel1.setBackground(new java.awt.Color(241, 234, 255));

        subtitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel.setText("Select a student:");

        loginLabel1.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel1.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel1.setText("Exam Info:");

        subtitleLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel1.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel1.setText("Student dashboard");

        jComboBox1.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andrew Alexander", "Ted Mosby", "Stefani Joanne", "Katheryn Elizabeth" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        loginLabel2.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel2.setText("Overview");

        statisticPanel.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel2.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel2.setText("Exams Finished:");

        subtitleLabel3.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel3.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel3.setText("19");

        javax.swing.GroupLayout statisticPanelLayout = new javax.swing.GroupLayout(statisticPanel);
        statisticPanel.setLayout(statisticPanelLayout);
        statisticPanelLayout.setHorizontalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel2)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Statistics");

        statisticPanel4.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel4.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel4.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel4.setText("Total Averange:");

        subtitleLabel14.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel14.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel14.setText("4.5");

        javax.swing.GroupLayout statisticPanel4Layout = new javax.swing.GroupLayout(statisticPanel4);
        statisticPanel4.setLayout(statisticPanel4Layout);
        statisticPanel4Layout.setHorizontalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel4Layout.setVerticalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel4)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel14)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        statisticPanel6.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel6.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel17.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel17.setText("Class Averange:");

        subtitleLabel18.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel18.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel18.setText("12.5");

        javax.swing.GroupLayout statisticPanel6Layout = new javax.swing.GroupLayout(statisticPanel6);
        statisticPanel6.setLayout(statisticPanel6Layout);
        statisticPanel6Layout.setHorizontalGroup(
            statisticPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel6Layout.setVerticalGroup(
            statisticPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel17)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel18)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        subtitleLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel6.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel6.setText("Choose an exam:");

        jComboBox3.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        statisticPanel8.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel8.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel7.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel7.setText("Number of wrong answers:");

        subtitleLabel21.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel21.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel21.setText("7");

        javax.swing.GroupLayout statisticPanel8Layout = new javax.swing.GroupLayout(statisticPanel8);
        statisticPanel8.setLayout(statisticPanel8Layout);
        statisticPanel8Layout.setHorizontalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel8Layout.setVerticalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel21)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        statisticPanel1.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel1.setPreferredSize(new java.awt.Dimension(217, 120));

        subtitleLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel8.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel8.setText("Number of right answers:");

        subtitleLabel9.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel9.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel9.setText("3");

        javax.swing.GroupLayout statisticPanel1Layout = new javax.swing.GroupLayout(statisticPanel1);
        statisticPanel1.setLayout(statisticPanel1Layout);
        statisticPanel1Layout.setHorizontalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel1Layout.setVerticalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel8)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel2.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel2.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel10.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel10.setText("Total squore:");

        subtitleLabel11.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel11.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel11.setText("3.5");

        javax.swing.GroupLayout statisticPanel2Layout = new javax.swing.GroupLayout(statisticPanel2);
        statisticPanel2.setLayout(statisticPanel2Layout);
        statisticPanel2Layout.setHorizontalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel2Layout.setVerticalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel10)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginBtn.setBackground(new java.awt.Color(88, 44, 169));
        loginBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Back");
        loginBtn.setBorder(null);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(subtitleLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                                        .addComponent(loginLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(148, 148, 148)
                                        .addComponent(statisticPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(148, 148, 148)
                                        .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 37, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(subtitleLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(statisticPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(subtitleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginLabel3)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(statisticPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statisticPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(loginLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(statisticPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(statisticPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statisticPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel sideMenuLabel;
    private javax.swing.JPanel sideMenuPanel;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JPanel statisticPanel1;
    private javax.swing.JPanel statisticPanel2;
    private javax.swing.JPanel statisticPanel4;
    private javax.swing.JPanel statisticPanel6;
    private javax.swing.JPanel statisticPanel8;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel1;
    private javax.swing.JLabel subtitleLabel10;
    private javax.swing.JLabel subtitleLabel11;
    private javax.swing.JLabel subtitleLabel14;
    private javax.swing.JLabel subtitleLabel17;
    private javax.swing.JLabel subtitleLabel18;
    private javax.swing.JLabel subtitleLabel2;
    private javax.swing.JLabel subtitleLabel21;
    private javax.swing.JLabel subtitleLabel3;
    private javax.swing.JLabel subtitleLabel4;
    private javax.swing.JLabel subtitleLabel5;
    private javax.swing.JLabel subtitleLabel6;
    private javax.swing.JLabel subtitleLabel7;
    private javax.swing.JLabel subtitleLabel8;
    private javax.swing.JLabel subtitleLabel9;
    // End of variables declaration//GEN-END:variables
}
