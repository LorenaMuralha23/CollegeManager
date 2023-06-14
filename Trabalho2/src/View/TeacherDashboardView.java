package View;

import Model.ClassModel;
import Model.ExamModel;
import Model.Main;
import Model.TeacherModel;
import Model.UserModel;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class TeacherDashboardView extends javax.swing.JPanel {

    public TeacherDashboardView() {
        initComponents();
        startComboBox();
    }

    public void startComboBox() {//-> perguntar para o professor
        UserModel userLogged = Main.controller.getUserLogged();
        classesComboBox.removeAllItems();
        if (userLogged instanceof TeacherModel) {
            ArrayList<ClassModel> userClasses = ((TeacherModel) userLogged).getClasses();
            if (!userClasses.isEmpty()) {
                for (int i = 0; i < userClasses.size(); i++) {
                    classesComboBox.addItem(userClasses.get(i).getName());
                }
            }else{
                classesComboBox.setEnabled(false);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        subtitleLabel = new javax.swing.JLabel();
        loginLabel1 = new javax.swing.JLabel();
        subtitleLabel1 = new javax.swing.JLabel();
        classesComboBox = new javax.swing.JComboBox<>();
        loginLabel2 = new javax.swing.JLabel();
        statisticPanel = new javax.swing.JPanel();
        subtitleLabel2 = new javax.swing.JLabel();
        numOfStudentsLabel = new javax.swing.JLabel();
        subtitleLabel4 = new javax.swing.JLabel();
        statisticPanel1 = new javax.swing.JPanel();
        subtitleLabel5 = new javax.swing.JLabel();
        prctOfAppLabel = new javax.swing.JLabel();
        subtitleLabel7 = new javax.swing.JLabel();
        statisticPanel2 = new javax.swing.JPanel();
        subtitleLabel8 = new javax.swing.JLabel();
        numExamsLabel = new javax.swing.JLabel();
        subtitleLabel10 = new javax.swing.JLabel();
        statisticPanel3 = new javax.swing.JPanel();
        subtitleLabel11 = new javax.swing.JLabel();
        prctOfFailureLabeç = new javax.swing.JLabel();
        subtitleLabel13 = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        recordGradeBtn = new javax.swing.JLabel();
        viewStudentsBtn = new javax.swing.JLabel();
        scheduleExamBtn = new javax.swing.JLabel();
        viewClassBtn = new javax.swing.JLabel();
        addClassBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 234, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sideMenusideMenuImg.png"))); // NOI18N

        javax.swing.GroupLayout sideMenuPanelLayout = new javax.swing.GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideMenuPanelLayout.setVerticalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel1.setBackground(new java.awt.Color(241, 234, 255));

        subtitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel.setText("Select a class:");

        loginLabel1.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel1.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel1.setText("Options");

        subtitleLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel1.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel1.setText("Classes dashboard");

        classesComboBox.setBackground(new java.awt.Color(160, 108, 255));
        classesComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        classesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classesComboBoxItemStateChanged(evt);
            }
        });
        classesComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classesComboBoxMouseClicked(evt);
            }
        });

        loginLabel2.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel2.setText("Overview");

        statisticPanel.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel2.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel2.setText("Number of students in this class:");

        numOfStudentsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numOfStudentsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numOfStudentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numOfStudentsLabel.setText("19");

        subtitleLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel4.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel4.setText("students joined this class");

        javax.swing.GroupLayout statisticPanelLayout = new javax.swing.GroupLayout(statisticPanel);
        statisticPanel.setLayout(statisticPanelLayout);
        statisticPanelLayout.setHorizontalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addGroup(statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subtitleLabel2))
                    .addGroup(statisticPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(numOfStudentsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitleLabel4)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numOfStudentsLabel)
                    .addGroup(statisticPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(subtitleLabel4)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        statisticPanel1.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel1.setPreferredSize(new java.awt.Dimension(354, 166));

        subtitleLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel5.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel5.setText("Percentage of approvement in this class:");

        prctOfAppLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        prctOfAppLabel.setForeground(new java.awt.Color(42, 8, 69));
        prctOfAppLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prctOfAppLabel.setText("50%");

        subtitleLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel7.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel7.setText("of approvement");

        javax.swing.GroupLayout statisticPanel1Layout = new javax.swing.GroupLayout(statisticPanel1);
        statisticPanel1.setLayout(statisticPanel1Layout);
        statisticPanel1Layout.setHorizontalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(prctOfAppLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLabel7)
                .addGap(67, 67, 67))
        );
        statisticPanel1Layout.setVerticalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel5)
                .addGap(18, 18, 18)
                .addGroup(statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prctOfAppLabel)
                    .addGroup(statisticPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(subtitleLabel7)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        statisticPanel2.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel2.setPreferredSize(new java.awt.Dimension(354, 166));

        subtitleLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel8.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel8.setText("Number of exams in this subject:");

        numExamsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numExamsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numExamsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numExamsLabel.setText("3");

        subtitleLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel10.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel10.setText("exams for the nexts weeks");

        javax.swing.GroupLayout statisticPanel2Layout = new javax.swing.GroupLayout(statisticPanel2);
        statisticPanel2.setLayout(statisticPanel2Layout);
        statisticPanel2Layout.setHorizontalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel2Layout.createSequentialGroup()
                .addGroup(statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subtitleLabel8))
                    .addGroup(statisticPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(numExamsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitleLabel10)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        statisticPanel2Layout.setVerticalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numExamsLabel)
                    .addGroup(statisticPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(subtitleLabel10)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        statisticPanel3.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel3.setPreferredSize(new java.awt.Dimension(354, 166));

        subtitleLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel11.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel11.setText("Percentage of failure in this class:");

        prctOfFailureLabeç.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        prctOfFailureLabeç.setForeground(new java.awt.Color(42, 8, 69));
        prctOfFailureLabeç.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prctOfFailureLabeç.setText("50%");

        subtitleLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel13.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel13.setText("of failure");

        javax.swing.GroupLayout statisticPanel3Layout = new javax.swing.GroupLayout(statisticPanel3);
        statisticPanel3.setLayout(statisticPanel3Layout);
        statisticPanel3Layout.setHorizontalGroup(
            statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel11)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prctOfFailureLabeç)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtitleLabel13)
                .addGap(107, 107, 107))
        );
        statisticPanel3Layout.setVerticalGroup(
            statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prctOfFailureLabeç))
                    .addGroup(statisticPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(subtitleLabel13)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Statistics");

        recordGradeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recordGradeBtn.setForeground(new java.awt.Color(42, 8, 69));
        recordGradeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recordGradeIconBtn.png"))); // NOI18N
        recordGradeBtn.setText("Record Grades");
        recordGradeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recordGradeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordGradeBtnMouseClicked(evt);
            }
        });

        viewStudentsBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewStudentsBtn.setForeground(new java.awt.Color(42, 8, 69));
        viewStudentsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/classStatisticIconBtn.png"))); // NOI18N
        viewStudentsBtn.setText("View Students Statistics");
        viewStudentsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewStudentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewStudentsBtnMouseClicked(evt);
            }
        });

        scheduleExamBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scheduleExamBtn.setForeground(new java.awt.Color(42, 8, 69));
        scheduleExamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/examIconBtn.png"))); // NOI18N
        scheduleExamBtn.setText("Schedule an Exam");
        scheduleExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleExamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleExamBtnMouseClicked(evt);
            }
        });

        viewClassBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewClassBtn.setForeground(new java.awt.Color(42, 8, 69));
        viewClassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewClassIconBtn.png"))); // NOI18N
        viewClassBtn.setText("View class details");
        viewClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewClassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewClassBtnMouseClicked(evt);
            }
        });

        addClassBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addClassBtn.setForeground(new java.awt.Color(42, 8, 69));
        addClassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIconImg.png"))); // NOI18N
        addClassBtn.setText("Add a new class");
        addClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addClassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addClassBtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 8, 69));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOutIcon.png"))); // NOI18N
        jLabel2.setText("Log Out");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(subtitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addClassBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(statisticPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(statisticPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(statisticPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewStudentsBtn)
                                    .addComponent(scheduleExamBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewClassBtn)
                                    .addComponent(recordGradeBtn))
                                .addGap(182, 182, 182)))
                        .addGap(78, 189, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(subtitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {statisticPanel, statisticPanel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(subtitleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginLabel2)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtitleLabel)
                            .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addClassBtn))
                        .addGap(24, 24, 24)
                        .addComponent(loginLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisticPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scheduleExamBtn)
                    .addComponent(viewClassBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewStudentsBtn)
                    .addComponent(recordGradeBtn))
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
            .addComponent(sideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void classesComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classesComboBoxMouseClicked

    }//GEN-LAST:event_classesComboBoxMouseClicked

    private void addClassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addClassBtnMouseClicked
        Main.controller.crtClassPanel = new CreateClassView();
        Main.controller.showScreen(Main.controller.crtClassPanel);
    }//GEN-LAST:event_addClassBtnMouseClicked

    private void scheduleExamBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleExamBtnMouseClicked
        Main.controller.scheduleExamPanel = new ScheduleExamView();
        Main.controller.teacherDashboardPanel = null;
        Main.controller.showScreen(Main.controller.scheduleExamPanel);
    }//GEN-LAST:event_scheduleExamBtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Main.controller.logOut();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void viewClassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewClassBtnMouseClicked
        ClassModel classToDetails = Main.controller.findClassByName(classesComboBox.getSelectedItem().toString());
        Main.controller.classDetailsPanel = new ClassDetailsView(classToDetails);
        Main.controller.showScreen(Main.controller.classDetailsPanel);
    }//GEN-LAST:event_viewClassBtnMouseClicked

    private void viewStudentsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStudentsBtnMouseClicked
        ClassModel classToDetails = Main.controller.findClassByName(classesComboBox.getSelectedItem().toString());
        Main.controller.studentStcDashboardView = new StudentStcDashboardView(classToDetails);
        Main.controller.showScreen(Main.controller.studentStcDashboardView);
    }//GEN-LAST:event_viewStudentsBtnMouseClicked

    private void recordGradeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordGradeBtnMouseClicked
        ClassModel classToDetails = Main.controller.findClassByName(classesComboBox.getSelectedItem().toString());
        Main.controller.showScreen(new RecordGradeView(classToDetails));
    }//GEN-LAST:event_recordGradeBtnMouseClicked

    private void classesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classesComboBoxItemStateChanged
         if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedItem = classesComboBox.getSelectedItem().toString();
            System.out.println("Item selecionado: " + selectedItem);
            ClassModel classToChange = Main.controller.findClassByName(selectedItem);
             startDashBoardInfo(classToChange);
        }
    }//GEN-LAST:event_classesComboBoxItemStateChanged
    
    private void startDashBoardInfo(ClassModel classToChange){
        numOfStudentsLabel.setText(Main.controller.getNumberOfStudents(classToChange));
        numExamsLabel.setText(Main.controller.getNumberOfExamsFromClass(classToChange));
        prctOfAppLabel.setText(Main.controller.getPrctOfApprovement(classToChange));
        prctOfFailureLabeç.setText(Main.controller.getPrctOfFailure(classToChange));
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addClassBtn;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel numExamsLabel;
    private javax.swing.JLabel numOfStudentsLabel;
    private javax.swing.JLabel prctOfAppLabel;
    private javax.swing.JLabel prctOfFailureLabeç;
    private javax.swing.JLabel recordGradeBtn;
    private javax.swing.JLabel scheduleExamBtn;
    private javax.swing.JPanel sideMenuPanel;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JPanel statisticPanel1;
    private javax.swing.JPanel statisticPanel2;
    private javax.swing.JPanel statisticPanel3;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel1;
    private javax.swing.JLabel subtitleLabel10;
    private javax.swing.JLabel subtitleLabel11;
    private javax.swing.JLabel subtitleLabel13;
    private javax.swing.JLabel subtitleLabel2;
    private javax.swing.JLabel subtitleLabel4;
    private javax.swing.JLabel subtitleLabel5;
    private javax.swing.JLabel subtitleLabel7;
    private javax.swing.JLabel subtitleLabel8;
    private javax.swing.JLabel viewClassBtn;
    private javax.swing.JLabel viewStudentsBtn;
    // End of variables declaration//GEN-END:variables
}
