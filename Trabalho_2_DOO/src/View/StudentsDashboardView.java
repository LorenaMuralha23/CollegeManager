package View;

import Model.ClassModel;
import Model.ExamModel;
import Model.Main;
import Model.StudentModel;
import java.util.ArrayList;

public class StudentsDashboardView extends javax.swing.JPanel {

    ExamModel ex;
    ClassModel classSelected;

    public StudentsDashboardView() {
        initComponents();
        ex = null;
        classSelected = null;
        startComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        SideMenuPanel2 = new javax.swing.JPanel();
        ImgWrapperLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SideMenuPanel3 = new javax.swing.JPanel();
        ImgWrapperLabel3 = new javax.swing.JLabel();
        MainPanel3 = new javax.swing.JPanel();
        subtitleLabel9 = new javax.swing.JLabel();
        loginLabel6 = new javax.swing.JLabel();
        subtitleLabel10 = new javax.swing.JLabel();
        classesComboBox = new javax.swing.JComboBox<>();
        loginLabel7 = new javax.swing.JLabel();
        loginLabel8 = new javax.swing.JLabel();
        statisticPanel9 = new javax.swing.JPanel();
        subtitleLabel24 = new javax.swing.JLabel();
        classAverangeLabel = new javax.swing.JLabel();
        statisticPanel10 = new javax.swing.JPanel();
        subtitleLabel11 = new javax.swing.JLabel();
        totalAverangeLabel = new javax.swing.JLabel();
        statisticPanel1 = new javax.swing.JPanel();
        subtitleLabel12 = new javax.swing.JLabel();
        examsFinishedLabel = new javax.swing.JLabel();
        subtitleLabel27 = new javax.swing.JLabel();
        examsComboBox = new javax.swing.JComboBox<>();
        statisticPanel11 = new javax.swing.JPanel();
        subtitleLabel28 = new javax.swing.JLabel();
        numberOfRightAwrsLabel = new javax.swing.JLabel();
        statisticPanel12 = new javax.swing.JPanel();
        subtitleLabel30 = new javax.swing.JLabel();
        totalSquoreLabel = new javax.swing.JLabel();
        statisticPanel13 = new javax.swing.JPanel();
        subtitleLabel32 = new javax.swing.JLabel();
        numberOfWrongAwrsLabel = new javax.swing.JLabel();
        joinClassBtn = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(241, 234, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 800));

        ImgWrapperLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentSideMenuImgStudentSideMenu.png"))); // NOI18N

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

        jPanel4.setBackground(new java.awt.Color(241, 234, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1100, 800));

        ImgWrapperLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentSideMenuImgStudentSideMenu.png"))); // NOI18N

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
        loginLabel6.setText("Finished Exams info");

        subtitleLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel10.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel10.setText("Your dashboard");

        classesComboBox.setBackground(new java.awt.Color(160, 108, 255));
        classesComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        classesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classesComboBoxItemStateChanged(evt);
            }
        });

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

        classAverangeLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        classAverangeLabel.setForeground(new java.awt.Color(42, 8, 69));
        classAverangeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classAverangeLabel.setText("0.0");

        javax.swing.GroupLayout statisticPanel9Layout = new javax.swing.GroupLayout(statisticPanel9);
        statisticPanel9.setLayout(statisticPanel9Layout);
        statisticPanel9Layout.setHorizontalGroup(
            statisticPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(classAverangeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel9Layout.setVerticalGroup(
            statisticPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel24)
                .addGap(18, 18, 18)
                .addComponent(classAverangeLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel10.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel10.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel11.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel11.setText("Total Averange:");

        totalAverangeLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        totalAverangeLabel.setForeground(new java.awt.Color(42, 8, 69));
        totalAverangeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAverangeLabel.setText("0.0");

        javax.swing.GroupLayout statisticPanel10Layout = new javax.swing.GroupLayout(statisticPanel10);
        statisticPanel10.setLayout(statisticPanel10Layout);
        statisticPanel10Layout.setHorizontalGroup(
            statisticPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(totalAverangeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel10Layout.setVerticalGroup(
            statisticPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel11)
                .addGap(18, 18, 18)
                .addComponent(totalAverangeLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel1.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel12.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel12.setText("Exams Finished:");

        examsFinishedLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        examsFinishedLabel.setForeground(new java.awt.Color(42, 8, 69));
        examsFinishedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        examsFinishedLabel.setText("0");

        javax.swing.GroupLayout statisticPanel1Layout = new javax.swing.GroupLayout(statisticPanel1);
        statisticPanel1.setLayout(statisticPanel1Layout);
        statisticPanel1Layout.setHorizontalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(examsFinishedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel1Layout.setVerticalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel12)
                .addGap(18, 18, 18)
                .addComponent(examsFinishedLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subtitleLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel27.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel27.setText("Choose an exam:");

        examsComboBox.setBackground(new java.awt.Color(160, 108, 255));
        examsComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examsComboBox.setForeground(new java.awt.Color(255, 255, 255));
        examsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                examsComboBoxItemStateChanged(evt);
            }
        });

        statisticPanel11.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel28.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel28.setText("Number of right answers:");

        numberOfRightAwrsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numberOfRightAwrsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numberOfRightAwrsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberOfRightAwrsLabel.setText("0");

        javax.swing.GroupLayout statisticPanel11Layout = new javax.swing.GroupLayout(statisticPanel11);
        statisticPanel11.setLayout(statisticPanel11Layout);
        statisticPanel11Layout.setHorizontalGroup(
            statisticPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(numberOfRightAwrsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel11Layout.setVerticalGroup(
            statisticPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel28)
                .addGap(18, 18, 18)
                .addComponent(numberOfRightAwrsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel12.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel12.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel30.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel30.setText("Total Squore:");

        totalSquoreLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        totalSquoreLabel.setForeground(new java.awt.Color(42, 8, 69));
        totalSquoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalSquoreLabel.setText("0");

        javax.swing.GroupLayout statisticPanel12Layout = new javax.swing.GroupLayout(statisticPanel12);
        statisticPanel12.setLayout(statisticPanel12Layout);
        statisticPanel12Layout.setHorizontalGroup(
            statisticPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(totalSquoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );
        statisticPanel12Layout.setVerticalGroup(
            statisticPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel30)
                .addGap(18, 18, 18)
                .addComponent(totalSquoreLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel13.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel13.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel32.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel32.setText("Number of wrong answers:");

        numberOfWrongAwrsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numberOfWrongAwrsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numberOfWrongAwrsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberOfWrongAwrsLabel.setText("0");

        javax.swing.GroupLayout statisticPanel13Layout = new javax.swing.GroupLayout(statisticPanel13);
        statisticPanel13.setLayout(statisticPanel13Layout);
        statisticPanel13Layout.setHorizontalGroup(
            statisticPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(numberOfWrongAwrsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel13Layout.setVerticalGroup(
            statisticPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel32)
                .addGap(18, 18, 18)
                .addComponent(numberOfWrongAwrsLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        joinClassBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        joinClassBtn.setForeground(new java.awt.Color(42, 8, 69));
        joinClassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIconImg.png"))); // NOI18N
        joinClassBtn.setText("Join Class");
        joinClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        joinClassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinClassBtnMouseClicked(evt);
            }
        });

        logOutBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(42, 8, 69));
        logOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOutIcon.png"))); // NOI18N
        logOutBtn.setText("Log Out");
        logOutBtn.setToolTipText("");
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(42, 8, 69));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 8, 69));
        jLabel1.setText("NoC = The exam was not corrected yet");
        jLabel1.setToolTipText("");

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
                        .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logOutBtn)
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
                                    .addComponent(examsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(joinClassBtn))
                                    .addComponent(loginLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loginLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MainPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(981, Short.MAX_VALUE))
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
                    .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joinClassBtn))
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
                    .addComponent(examsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
                .addGap(1033, 1033, 1033))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void joinClassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinClassBtnMouseClicked
        Main.controller.enterClassViewPanel = new JoinClassView();
        Main.controller.studentsDashboardPanel = null;
        Main.controller.showScreen(Main.controller.enterClassViewPanel);
    }//GEN-LAST:event_joinClassBtnMouseClicked

    private void classesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classesComboBoxItemStateChanged
        classSelected = Main.controller.findClassByName(classesComboBox.getSelectedItem().toString());
        startExamComboBox();
    }//GEN-LAST:event_classesComboBoxItemStateChanged

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked
        Main.controller.logOut();
    }//GEN-LAST:event_logOutBtnMouseClicked

    private void examsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_examsComboBoxItemStateChanged
        if (classesComboBox.getSelectedIndex() != -1) {
            if (classSelected != null) {
                if (!classSelected.getFinishedExams().isEmpty()) {
                    if (examsComboBox.getSelectedItem() != null) {
                        startDashboardInfo();
                        ex = Main.controller.findFinishedExamByName(classSelected, examsComboBox.getSelectedItem().toString());
                    } else {
                        ex = null;
                    }
                }
            }
        }
    }//GEN-LAST:event_examsComboBoxItemStateChanged

    public void startComboBox() {

        if (Main.controller.getUserLogged() instanceof StudentModel userAux) {
            if (!userAux.getClassesList().isEmpty()) {

                for (int i = 0; i < userAux.getClassesList().size(); i++) {
                    classesComboBox.addItem(userAux.getClassesList().get(i).getName());
                }
            } else {
                classesComboBox.setEnabled(false);
            }

        }

    }

    public void startExamComboBox() {
        examsComboBox.removeAllItems();
        if (Main.controller.getUserLogged() instanceof StudentModel userAux) {

            if (classSelected != null) {

                if (!userAux.getStudentExams().isEmpty()) {

                    for (int i = 0; i < userAux.getStudentExams().size(); i++) {
                        if (userAux.getStudentExams().get(i).getClassCorresponding().getName().equals(classSelected.getName())) {
                            if (userAux.getStudentExams().get(i).getIsFinished()) {
                                examsComboBox.addItem(userAux.getStudentExams().get(i).getName());
                                ex = Main.controller.findFinishedExamByName(classSelected, examsComboBox.getSelectedItem().toString());
                            }
                        }
                    }
                }
            }

        }
        startDashboardInfo();
    }

    public void startDashboardInfo() {
        if (Main.controller.getUserLogged() instanceof StudentModel userAux) {

            if (classesComboBox.getSelectedIndex() != -1) {
                ClassModel classSelected = Main.controller.findClassByName(classesComboBox.getSelectedItem().toString());
                examsFinishedLabel.setText(Main.controller.getNumExamFinished(classSelected));
                totalAverangeLabel.setText(Main.controller.getTotalAverangeTxt(userAux, classSelected));
                classAverangeLabel.setText(Main.controller.getClassAverange(classSelected));

                if (ex != null) {
                    if (ex.getIsFinished() && ex.getCorrectedStatus()) {
                        numberOfRightAwrsLabel.setText(Main.controller.getNumberOfRightAnswers(ex, userAux));
                        numberOfWrongAwrsLabel.setText(Main.controller.getNumberOfWrongAnswers(ex, userAux));
                        totalSquoreLabel.setText(Main.controller.getTotalSquore(ex, userAux));
                    } else {
                        numberOfRightAwrsLabel.setText("NoC");
                        numberOfWrongAwrsLabel.setText("NoC");
                        totalSquoreLabel.setText("NoC");
                    }
                } else {
                    numberOfRightAwrsLabel.setText("0");
                    numberOfWrongAwrsLabel.setText("0");
                    totalSquoreLabel.setText("0");
                }

            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgWrapperLabel2;
    private javax.swing.JLabel ImgWrapperLabel3;
    private javax.swing.JPanel MainPanel3;
    private javax.swing.JPanel SideMenuPanel2;
    private javax.swing.JPanel SideMenuPanel3;
    private javax.swing.JLabel classAverangeLabel;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JComboBox<String> examsComboBox;
    private javax.swing.JLabel examsFinishedLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel joinClassBtn;
    private javax.swing.JLabel logOutBtn;
    private javax.swing.JLabel loginLabel6;
    private javax.swing.JLabel loginLabel7;
    private javax.swing.JLabel loginLabel8;
    private javax.swing.JLabel numberOfRightAwrsLabel;
    private javax.swing.JLabel numberOfWrongAwrsLabel;
    private javax.swing.JPanel statisticPanel1;
    private javax.swing.JPanel statisticPanel10;
    private javax.swing.JPanel statisticPanel11;
    private javax.swing.JPanel statisticPanel12;
    private javax.swing.JPanel statisticPanel13;
    private javax.swing.JPanel statisticPanel9;
    private javax.swing.JLabel subtitleLabel10;
    private javax.swing.JLabel subtitleLabel11;
    private javax.swing.JLabel subtitleLabel12;
    private javax.swing.JLabel subtitleLabel24;
    private javax.swing.JLabel subtitleLabel27;
    private javax.swing.JLabel subtitleLabel28;
    private javax.swing.JLabel subtitleLabel30;
    private javax.swing.JLabel subtitleLabel32;
    private javax.swing.JLabel subtitleLabel9;
    private javax.swing.JLabel totalAverangeLabel;
    private javax.swing.JLabel totalSquoreLabel;
    // End of variables declaration//GEN-END:variables
}
