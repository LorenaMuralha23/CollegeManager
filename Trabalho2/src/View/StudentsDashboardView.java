package View;

import Model.ClassModel;
import Model.Main;
import Model.StudentModel;
import Model.TeacherModel;
import Model.UserModel;
import java.util.ArrayList;

public class StudentsDashboardView extends javax.swing.JPanel {

    public StudentsDashboardView() {
        initComponents();
        msgNotification.setVisible(false);
        startComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        SideMenuPanel2 = new javax.swing.JPanel();
        ImgWrapperLabel2 = new javax.swing.JLabel();
        MainPanel2 = new javax.swing.JPanel();
        subtitleLabel4 = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        subtitleLabel5 = new javax.swing.JLabel();
        classesComboBox = new javax.swing.JComboBox<>();
        loginLabel4 = new javax.swing.JLabel();
        loginLabel5 = new javax.swing.JLabel();
        statisticPanel6 = new javax.swing.JPanel();
        subtitleLabel17 = new javax.swing.JLabel();
        subtitleLabel18 = new javax.swing.JLabel();
        statisticPanel4 = new javax.swing.JPanel();
        subtitleLabel6 = new javax.swing.JLabel();
        subtitleLabel14 = new javax.swing.JLabel();
        statisticPanel = new javax.swing.JPanel();
        subtitleLabel7 = new javax.swing.JLabel();
        subtitleLabel8 = new javax.swing.JLabel();
        subtitleLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        statisticPanel8 = new javax.swing.JPanel();
        subtitleLabel22 = new javax.swing.JLabel();
        subtitleLabel23 = new javax.swing.JLabel();
        statisticPanel7 = new javax.swing.JPanel();
        subtitleLabel19 = new javax.swing.JLabel();
        subtitleLabel20 = new javax.swing.JLabel();
        statisticPanel5 = new javax.swing.JPanel();
        subtitleLabel16 = new javax.swing.JLabel();
        subtitleLabel21 = new javax.swing.JLabel();
        joinClassBtn = new javax.swing.JLabel();
        msgNotification = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SideMenuPanel3 = new javax.swing.JPanel();
        ImgWrapperLabel3 = new javax.swing.JLabel();
        MainPanel3 = new javax.swing.JPanel();
        subtitleLabel9 = new javax.swing.JLabel();
        loginLabel6 = new javax.swing.JLabel();
        subtitleLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        loginLabel7 = new javax.swing.JLabel();
        loginLabel8 = new javax.swing.JLabel();
        statisticPanel9 = new javax.swing.JPanel();
        subtitleLabel24 = new javax.swing.JLabel();
        subtitleLabel25 = new javax.swing.JLabel();
        statisticPanel10 = new javax.swing.JPanel();
        subtitleLabel11 = new javax.swing.JLabel();
        subtitleLabel26 = new javax.swing.JLabel();
        statisticPanel1 = new javax.swing.JPanel();
        subtitleLabel12 = new javax.swing.JLabel();
        subtitleLabel13 = new javax.swing.JLabel();
        subtitleLabel27 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        statisticPanel11 = new javax.swing.JPanel();
        subtitleLabel28 = new javax.swing.JLabel();
        subtitleLabel29 = new javax.swing.JLabel();
        statisticPanel12 = new javax.swing.JPanel();
        subtitleLabel30 = new javax.swing.JLabel();
        subtitleLabel31 = new javax.swing.JLabel();
        statisticPanel13 = new javax.swing.JPanel();
        subtitleLabel32 = new javax.swing.JLabel();
        subtitleLabel33 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(241, 234, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 800));

        ImgWrapperLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentSideMenuImg.png"))); // NOI18N

        javax.swing.GroupLayout SideMenuPanel2Layout = new javax.swing.GroupLayout(SideMenuPanel2);
        SideMenuPanel2.setLayout(SideMenuPanel2Layout);
        SideMenuPanel2Layout.setHorizontalGroup(
            SideMenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuPanel2Layout.createSequentialGroup()
                .addComponent(ImgWrapperLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SideMenuPanel2Layout.setVerticalGroup(
            SideMenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgWrapperLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainPanel2.setBackground(new java.awt.Color(241, 234, 255));

        subtitleLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel4.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel4.setText("Select a class:");

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Exam info");

        subtitleLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel5.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel5.setText("Your dashboard");

        classesComboBox.setBackground(new java.awt.Color(160, 108, 255));
        classesComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        classesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesComboBoxActionPerformed(evt);
            }
        });

        loginLabel4.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel4.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel4.setText("Overview");

        loginLabel5.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel5.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel5.setText("Statistics");

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
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel4.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel4.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel6.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel6.setText("Total Averange:");

        subtitleLabel14.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel14.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel14.setText("4.5");

        javax.swing.GroupLayout statisticPanel4Layout = new javax.swing.GroupLayout(statisticPanel4);
        statisticPanel4.setLayout(statisticPanel4Layout);
        statisticPanel4Layout.setHorizontalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel4Layout.setVerticalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel6)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel14)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel7.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel7.setText("Exams Finished:");

        subtitleLabel8.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel8.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel8.setText("19");

        javax.swing.GroupLayout statisticPanelLayout = new javax.swing.GroupLayout(statisticPanel);
        statisticPanel.setLayout(statisticPanelLayout);
        statisticPanelLayout.setHorizontalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel7)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subtitleLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel15.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel15.setText("Choose an exam:");

        jComboBox4.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        statisticPanel8.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel22.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel22.setText("Exams Finished:");

        subtitleLabel23.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel23.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel23.setText("19");

        javax.swing.GroupLayout statisticPanel8Layout = new javax.swing.GroupLayout(statisticPanel8);
        statisticPanel8.setLayout(statisticPanel8Layout);
        statisticPanel8Layout.setHorizontalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel8Layout.setVerticalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel22)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel7.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel7.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel19.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel19.setText("Class Averange:");

        subtitleLabel20.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel20.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel20.setText("12.5");

        javax.swing.GroupLayout statisticPanel7Layout = new javax.swing.GroupLayout(statisticPanel7);
        statisticPanel7.setLayout(statisticPanel7Layout);
        statisticPanel7Layout.setHorizontalGroup(
            statisticPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel7Layout.setVerticalGroup(
            statisticPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel19)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel5.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel5.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel16.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel16.setText("Total Averange:");

        subtitleLabel21.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel21.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel21.setText("4.5");

        javax.swing.GroupLayout statisticPanel5Layout = new javax.swing.GroupLayout(statisticPanel5);
        statisticPanel5.setLayout(statisticPanel5Layout);
        statisticPanel5Layout.setHorizontalGroup(
            statisticPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel5Layout.setVerticalGroup(
            statisticPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel16)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel21)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        joinClassBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        joinClassBtn.setForeground(new java.awt.Color(42, 8, 69));
        joinClassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIconImg.png"))); // NOI18N
        joinClassBtn.setText("Join class");
        joinClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        joinClassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinClassBtnMouseClicked(evt);
            }
        });

        msgNotification.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        msgNotification.setForeground(new java.awt.Color(42, 8, 69));
        msgNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/messageIcon.png"))); // NOI18N
        msgNotification.setText("You have a new message!");
        msgNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logOutBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(42, 8, 69));
        logOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOutIcon.png"))); // NOI18N
        logOutBtn.setText("Log Out");
        logOutBtn.setToolTipText("");
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainPanel2Layout = new javax.swing.GroupLayout(MainPanel2);
        MainPanel2.setLayout(MainPanel2Layout);
        MainPanel2Layout.setHorizontalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addComponent(subtitleLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(261, 261, 261)
                        .addComponent(msgNotification)
                        .addGap(52, 52, 52))
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanel2Layout.createSequentialGroup()
                                .addComponent(statisticPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanel2Layout.createSequentialGroup()
                                .addComponent(subtitleLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanel2Layout.createSequentialGroup()
                                .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(MainPanel2Layout.createSequentialGroup()
                                    .addComponent(subtitleLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(joinClassBtn))
                                .addComponent(loginLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                            .addComponent(loginLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(64, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn)
                .addGap(32, 32, 32))
        );
        MainPanel2Layout.setVerticalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel5)
                    .addComponent(msgNotification))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel4)
                .addGap(22, 22, 22)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel4)
                    .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joinClassBtn))
                .addGap(24, 24, 24)
                .addComponent(loginLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(loginLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel15)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(241, 234, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1100, 800));

        ImgWrapperLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentSideMenuImg.png"))); // NOI18N

        javax.swing.GroupLayout SideMenuPanel3Layout = new javax.swing.GroupLayout(SideMenuPanel3);
        SideMenuPanel3.setLayout(SideMenuPanel3Layout);
        SideMenuPanel3Layout.setHorizontalGroup(
            SideMenuPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuPanel3Layout.createSequentialGroup()
                .addComponent(ImgWrapperLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SideMenuPanel3Layout.setVerticalGroup(
            SideMenuPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgWrapperLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainPanel3.setBackground(new java.awt.Color(241, 234, 255));

        subtitleLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel9.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel9.setText("Select a class:");

        loginLabel6.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel6.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel6.setText("Exam info");

        subtitleLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel10.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel10.setText("Your dashboard");

        jComboBox5.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));

        loginLabel7.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel7.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel7.setText("Overview");

        loginLabel8.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel8.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel8.setText("Statistics");

        statisticPanel9.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel9.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel24.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel24.setText("Class Averange:");

        subtitleLabel25.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel25.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel25.setText("12.5");

        javax.swing.GroupLayout statisticPanel9Layout = new javax.swing.GroupLayout(statisticPanel9);
        statisticPanel9.setLayout(statisticPanel9Layout);
        statisticPanel9Layout.setHorizontalGroup(
            statisticPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel9Layout.setVerticalGroup(
            statisticPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel24)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel25)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel10.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel10.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel11.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel11.setText("Total Averange:");

        subtitleLabel26.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel26.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel26.setText("4.5");

        javax.swing.GroupLayout statisticPanel10Layout = new javax.swing.GroupLayout(statisticPanel10);
        statisticPanel10.setLayout(statisticPanel10Layout);
        statisticPanel10Layout.setHorizontalGroup(
            statisticPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel10Layout.setVerticalGroup(
            statisticPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel11)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel26)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel1.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel12.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel12.setText("Exams Finished:");

        subtitleLabel13.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel13.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel13.setText("19");

        javax.swing.GroupLayout statisticPanel1Layout = new javax.swing.GroupLayout(statisticPanel1);
        statisticPanel1.setLayout(statisticPanel1Layout);
        statisticPanel1Layout.setHorizontalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel1Layout.setVerticalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel12)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subtitleLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel27.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel27.setText("Choose an exam:");

        jComboBox6.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));

        statisticPanel11.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel28.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel28.setText("Exams Finished:");

        subtitleLabel29.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel29.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel29.setText("19");

        javax.swing.GroupLayout statisticPanel11Layout = new javax.swing.GroupLayout(statisticPanel11);
        statisticPanel11.setLayout(statisticPanel11Layout);
        statisticPanel11Layout.setHorizontalGroup(
            statisticPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel11Layout.setVerticalGroup(
            statisticPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel28)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel12.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel12.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel30.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel30.setText("Class Averange:");

        subtitleLabel31.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel31.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel31.setText("12.5");

        javax.swing.GroupLayout statisticPanel12Layout = new javax.swing.GroupLayout(statisticPanel12);
        statisticPanel12.setLayout(statisticPanel12Layout);
        statisticPanel12Layout.setHorizontalGroup(
            statisticPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel12Layout.setVerticalGroup(
            statisticPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel30)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel31)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel13.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel13.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel32.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel32.setText("Total Averange:");

        subtitleLabel33.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel33.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel33.setText("4.5");

        javax.swing.GroupLayout statisticPanel13Layout = new javax.swing.GroupLayout(statisticPanel13);
        statisticPanel13.setLayout(statisticPanel13Layout);
        statisticPanel13Layout.setHorizontalGroup(
            statisticPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel13Layout.setVerticalGroup(
            statisticPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel32)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel33)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanel3Layout = new javax.swing.GroupLayout(MainPanel3);
        MainPanel3.setLayout(MainPanel3Layout);
        MainPanel3Layout.setHorizontalGroup(
            MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitleLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanel3Layout.createSequentialGroup()
                        .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanel3Layout.createSequentialGroup()
                                .addComponent(statisticPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanel3Layout.createSequentialGroup()
                                .addComponent(subtitleLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanel3Layout.createSequentialGroup()
                                .addComponent(statisticPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(MainPanel3Layout.createSequentialGroup()
                                    .addComponent(subtitleLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(loginLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainPanel3Layout.setVerticalGroup(
            MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(subtitleLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel7)
                .addGap(22, 22, 22)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel9)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(loginLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(loginLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel27)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(SideMenuPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SideMenuPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(SideMenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SideMenuPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void startComboBox() {

        if (Main.controller.getUserLogged() instanceof StudentModel) {
            StudentModel userAux = (StudentModel) Main.controller.getUserLogged();
            if (!userAux.getClassesList().isEmpty()) {

                for (int i = 0; i < userAux.getClassesList().size(); i++) {
                    classesComboBox.addItem(userAux.getClassesList().get(i).getName());
                }

            } else {
                classesComboBox.setEnabled(false);
            }

        }

    }

    private void classesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesComboBoxActionPerformed

    }//GEN-LAST:event_classesComboBoxActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        UserModel userLogged = Main.controller.getUserLogged();
        classesComboBox.removeAllItems();
        for (int i = 0; i < Main.controller.usersDB.size(); i++) {
            //passa pelo DB
            if (Main.controller.usersDB.get(i) instanceof TeacherModel) {
                //eh um professor -> pega as turmas
                TeacherModel userAux = (TeacherModel) Main.controller.usersDB.get(i);
                for (int j = 0; j < userAux.getClasses().size(); j++) {
                    classesComboBox.addItem(userAux.getClasses().get(i).getName());
                }
            }
        }

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void joinClassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinClassBtnMouseClicked
        Main.controller.studentsDashboardPanel = null;
        Main.controller.enterClassViewPanel = new JoinClassView();
        Main.controller.showScreen(Main.controller.enterClassViewPanel);
    }//GEN-LAST:event_joinClassBtnMouseClicked

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked
        Main.controller.studentsDashboardPanel = null;
        Main.controller.logOut();
    }//GEN-LAST:event_logOutBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgWrapperLabel2;
    private javax.swing.JLabel ImgWrapperLabel3;
    private javax.swing.JPanel MainPanel2;
    private javax.swing.JPanel MainPanel3;
    private javax.swing.JPanel SideMenuPanel2;
    private javax.swing.JPanel SideMenuPanel3;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel joinClassBtn;
    private javax.swing.JLabel logOutBtn;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel loginLabel4;
    private javax.swing.JLabel loginLabel5;
    private javax.swing.JLabel loginLabel6;
    private javax.swing.JLabel loginLabel7;
    private javax.swing.JLabel loginLabel8;
    private javax.swing.JLabel msgNotification;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JPanel statisticPanel1;
    private javax.swing.JPanel statisticPanel10;
    private javax.swing.JPanel statisticPanel11;
    private javax.swing.JPanel statisticPanel12;
    private javax.swing.JPanel statisticPanel13;
    private javax.swing.JPanel statisticPanel4;
    private javax.swing.JPanel statisticPanel5;
    private javax.swing.JPanel statisticPanel6;
    private javax.swing.JPanel statisticPanel7;
    private javax.swing.JPanel statisticPanel8;
    private javax.swing.JPanel statisticPanel9;
    private javax.swing.JLabel subtitleLabel10;
    private javax.swing.JLabel subtitleLabel11;
    private javax.swing.JLabel subtitleLabel12;
    private javax.swing.JLabel subtitleLabel13;
    private javax.swing.JLabel subtitleLabel14;
    private javax.swing.JLabel subtitleLabel15;
    private javax.swing.JLabel subtitleLabel16;
    private javax.swing.JLabel subtitleLabel17;
    private javax.swing.JLabel subtitleLabel18;
    private javax.swing.JLabel subtitleLabel19;
    private javax.swing.JLabel subtitleLabel20;
    private javax.swing.JLabel subtitleLabel21;
    private javax.swing.JLabel subtitleLabel22;
    private javax.swing.JLabel subtitleLabel23;
    private javax.swing.JLabel subtitleLabel24;
    private javax.swing.JLabel subtitleLabel25;
    private javax.swing.JLabel subtitleLabel26;
    private javax.swing.JLabel subtitleLabel27;
    private javax.swing.JLabel subtitleLabel28;
    private javax.swing.JLabel subtitleLabel29;
    private javax.swing.JLabel subtitleLabel30;
    private javax.swing.JLabel subtitleLabel31;
    private javax.swing.JLabel subtitleLabel32;
    private javax.swing.JLabel subtitleLabel33;
    private javax.swing.JLabel subtitleLabel4;
    private javax.swing.JLabel subtitleLabel5;
    private javax.swing.JLabel subtitleLabel6;
    private javax.swing.JLabel subtitleLabel7;
    private javax.swing.JLabel subtitleLabel8;
    private javax.swing.JLabel subtitleLabel9;
    // End of variables declaration//GEN-END:variables
}
