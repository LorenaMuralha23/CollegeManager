package View;

import Model.ClassModel;
import Model.Main;
import Model.TeacherModel;
import Model.UserModel;
import javax.swing.JOptionPane;

public class JoinClassView extends javax.swing.JPanel {

    ClassModel classSelected;
    
    public JoinClassView() {
        initComponents();
        classSelected = null;
        startComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SideMenuPanel = new javax.swing.JPanel();
        sideMenuLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginLabel3 = new javax.swing.JLabel();
        joinClassBtn = new javax.swing.JButton();
        exitBtn1 = new javax.swing.JButton();
        subtitleLabel = new javax.swing.JLabel();
        classesComboBox = new javax.swing.JComboBox<>();
        loginLabel4 = new javax.swing.JLabel();
        statisticPanel = new javax.swing.JPanel();
        subtitleLabel2 = new javax.swing.JLabel();
        numberOfStudentsLabel = new javax.swing.JLabel();
        subtitleLabel4 = new javax.swing.JLabel();
        statisticPanel1 = new javax.swing.JPanel();
        subtitleLabel14 = new javax.swing.JLabel();
        numberOfExamsLabel = new javax.swing.JLabel();
        subtitleLabel16 = new javax.swing.JLabel();
        statisticPanel2 = new javax.swing.JPanel();
        subtitleLabel8 = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        statisticPanel3 = new javax.swing.JPanel();
        subtitleLabel11 = new javax.swing.JLabel();
        subtitleLabel13 = new javax.swing.JLabel();
        teacherNameLabel = new javax.swing.JLabel();

        MainPanel.setBackground(new java.awt.Color(241, 234, 255));

        SideMenuPanel.setBackground(new java.awt.Color(241, 234, 255));

        sideMenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentSideMenuImgStudentSideMenu.png"))); // NOI18N

        javax.swing.GroupLayout SideMenuPanelLayout = new javax.swing.GroupLayout(SideMenuPanel);
        SideMenuPanel.setLayout(SideMenuPanelLayout);
        SideMenuPanelLayout.setHorizontalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideMenuPanelLayout.setVerticalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuLabel)
        );

        jPanel1.setBackground(new java.awt.Color(241, 234, 255));

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Join a class");

        joinClassBtn.setBackground(new java.awt.Color(88, 44, 169));
        joinClassBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        joinClassBtn.setForeground(new java.awt.Color(255, 255, 255));
        joinClassBtn.setText("Join class");
        joinClassBtn.setBorder(null);
        joinClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        joinClassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinClassBtnMouseClicked(evt);
            }
        });

        exitBtn1.setBackground(new java.awt.Color(88, 44, 169));
        exitBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exitBtn1.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn1.setText("Exit");
        exitBtn1.setBorder(null);
        exitBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtn1MouseClicked(evt);
            }
        });

        subtitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel.setText("Select a class:");

        classesComboBox.setBackground(new java.awt.Color(160, 108, 255));
        classesComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        classesComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classesComboBoxItemStateChanged(evt);
            }
        });

        loginLabel4.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel4.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel4.setText("Details:");

        statisticPanel.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel2.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel2.setText("Number of students in this class:");

        numberOfStudentsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numberOfStudentsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numberOfStudentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numberOfStudentsLabel.setText("0");

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
                        .addComponent(numberOfStudentsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitleLabel4)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfStudentsLabel)
                    .addGroup(statisticPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(subtitleLabel4)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        statisticPanel1.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel1.setPreferredSize(new java.awt.Dimension(354, 166));

        subtitleLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel14.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel14.setText("Number of exams in this subject:");

        numberOfExamsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numberOfExamsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numberOfExamsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numberOfExamsLabel.setText("0");

        subtitleLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel16.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel16.setText("exams for the nexts weeks");

        javax.swing.GroupLayout statisticPanel1Layout = new javax.swing.GroupLayout(statisticPanel1);
        statisticPanel1.setLayout(statisticPanel1Layout);
        statisticPanel1Layout.setHorizontalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addGroup(statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subtitleLabel14))
                    .addGroup(statisticPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(numberOfExamsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitleLabel16)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        statisticPanel1Layout.setVerticalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfExamsLabel)
                    .addGroup(statisticPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(subtitleLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel2.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel2.setPreferredSize(new java.awt.Dimension(354, 166));

        subtitleLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel8.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel8.setText("Subject:");

        subjectLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(42, 8, 69));
        subjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subjectLabel.setText("xxxxx");

        javax.swing.GroupLayout statisticPanel2Layout = new javax.swing.GroupLayout(statisticPanel2);
        statisticPanel2.setLayout(statisticPanel2Layout);
        statisticPanel2Layout.setHorizontalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel8)
                .addContainerGap(291, Short.MAX_VALUE))
            .addComponent(subjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel2Layout.setVerticalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectLabel)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        statisticPanel3.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel3.setPreferredSize(new java.awt.Dimension(354, 166));

        subtitleLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel11.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel11.setText("Teacher:");

        subtitleLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel13.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        teacherNameLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        teacherNameLabel.setForeground(new java.awt.Color(42, 8, 69));
        teacherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherNameLabel.setText("XXXXX");

        javax.swing.GroupLayout statisticPanel3Layout = new javax.swing.GroupLayout(statisticPanel3);
        statisticPanel3.setLayout(statisticPanel3Layout);
        statisticPanel3Layout.setHorizontalGroup(
            statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanel3Layout.createSequentialGroup()
                        .addComponent(subtitleLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(statisticPanel3Layout.createSequentialGroup()
                        .addComponent(teacherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtitleLabel13)
                        .addGap(70, 70, 70))))
        );
        statisticPanel3Layout.setVerticalGroup(
            statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(statisticPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(subtitleLabel13))
                    .addGroup(statisticPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherNameLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subtitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statisticPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statisticPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statisticPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(joinClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {statisticPanel, statisticPanel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel)
                    .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statisticPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(statisticPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statisticPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(statisticPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(joinClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(loginLabel3)
                    .addContainerGap(714, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtn1MouseClicked
        Main.controller.enterClassViewPanel = null;
        Main.controller.studentsDashboardPanel = new StudentsDashboardView();
        Main.controller.showScreen(Main.controller.studentsDashboardPanel);
    }//GEN-LAST:event_exitBtn1MouseClicked

    private void joinClassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinClassBtnMouseClicked
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to join this class?", "Confirm Question", WIDTH, HEIGHT);
        if(opt == 0){
            String selectedClass = classesComboBox.getSelectedItem().toString();
            Main.controller.joinClass(selectedClass);
        }else{
            JOptionPane.showMessageDialog(null, "Joining canceled!", "Operation Canceled", HEIGHT);
        }
    }//GEN-LAST:event_joinClassBtnMouseClicked

    private void classesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classesComboBoxItemStateChanged
        if(classesComboBox.getSelectedIndex() != -1){
            classSelected = Main.controller.findClassByName(classesComboBox.getSelectedItem().toString());
            startDashBoardInfo();
        }
    }//GEN-LAST:event_classesComboBoxItemStateChanged
    
    public void startComboBox(){
        UserModel userLogged = Main.controller.getUserLogged();
        classesComboBox.removeAllItems();
        for (int i = 0; i < Main.controller.usersDB.size(); i++) {
            //passa pelo DB
            if (Main.controller.usersDB.get(i) instanceof TeacherModel) {
                //eh um professor -> pega as turmas
                TeacherModel userAux = (TeacherModel) Main.controller.usersDB.get(i);
                for (int j = 0; j < userAux.getClasses().size(); j++) {
                    classesComboBox.addItem(userAux.getClasses().get(j).getName());
                }
            }
        }
    }

    public void startDashBoardInfo(){
        
        if(classSelected != null){
            numberOfStudentsLabel.setText(Main.controller.getNumberOfStudents(classSelected));
            numberOfExamsLabel.setText(Main.controller.getNumOfExams(classSelected));
            teacherNameLabel.setText(Main.controller.getClassTeacherName(classSelected));
            subjectLabel.setText(Main.controller.getClassSubject(classSelected));
        }else{
            numberOfStudentsLabel.setText("0");
            numberOfExamsLabel.setText("0");
            teacherNameLabel.setText("XXXXX");
            subjectLabel.setText("XXXX");
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideMenuPanel;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JButton exitBtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joinClassBtn;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel loginLabel4;
    private javax.swing.JLabel numberOfExamsLabel;
    private javax.swing.JLabel numberOfStudentsLabel;
    private javax.swing.JLabel sideMenuLabel;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JPanel statisticPanel1;
    private javax.swing.JPanel statisticPanel2;
    private javax.swing.JPanel statisticPanel3;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel11;
    private javax.swing.JLabel subtitleLabel13;
    private javax.swing.JLabel subtitleLabel14;
    private javax.swing.JLabel subtitleLabel16;
    private javax.swing.JLabel subtitleLabel2;
    private javax.swing.JLabel subtitleLabel4;
    private javax.swing.JLabel subtitleLabel8;
    private javax.swing.JLabel teacherNameLabel;
    // End of variables declaration//GEN-END:variables
}
