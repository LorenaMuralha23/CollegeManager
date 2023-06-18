package View;

import Model.ClassModel;
import Model.ExamModel;
import Model.Main;
import Model.StudentModel;
import Model.TeacherModel;
import Model.UserModel;

public class StudentStcDashboardView extends javax.swing.JPanel {

    long[] ids;
    ClassModel classToSeeDetails;
    ExamModel ex = null;
    
    public StudentStcDashboardView(ClassModel classDetails) {
        initComponents();
        ids = new long[classDetails.getStudentsList().size()];
        this.classToSeeDetails = classDetails;
        classCorrespondingField.setText(classToSeeDetails.getName());
        if(!classToSeeDetails.getExamList().isEmpty()){
           ex = classToSeeDetails.getExamList().get(0); 
        }
        if (studentsComboBox.getSelectedIndex() == -1) {
            if (!classToSeeDetails.getStudentsList().isEmpty()) {
<<<<<<< HEAD
                System.out.println("AQUI!");
                setDashboardInfo(classToSeeDetails.getStudentsList().get(0).getId(), classToSeeDetails.getStudentsList().get(0));
                System.out.println("ID: " + classToSeeDetails.getStudentsList().get(0).getId());
=======
                setDashboardInfo(classToSeeDetails.getStudentsList().get(0).getId(), classToSeeDetails.getStudentsList().get(0));
>>>>>>> 374e150 (serialization finished)
                startStudentsComboBox();
                startExamsComboBox();
            } else {
                studentsComboBox.setEnabled(false);
                examComboBox.setEnabled(false);
            }
        }

    }

    public void startStudentsComboBox() {
        studentsComboBox.removeAllItems();
        if (!classToSeeDetails.getStudentsList().isEmpty()) {
            for (int i = 0; i < classToSeeDetails.getStudentsList().size(); i++) {
                ids[i] = classToSeeDetails.getStudentsList().get(i).getId();
                studentsComboBox.addItem(classToSeeDetails.getStudentsList().get(i).getName());
            }
        }

    }

    public void startExamsComboBox() {
        examComboBox.removeAllItems();
        if (!classToSeeDetails.getStudentsList().isEmpty()) {
            StudentModel student = Main.controller.findStudentById(classToSeeDetails.getStudentsList().get(0).getId(), classToSeeDetails);
            for (int i = 0; i < student.getStudentExams().size(); i++) {

                if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classToSeeDetails.getName())) {
                    examComboBox.addItem(student.getStudentExams().get(i).getName());
                }

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenuPanel = new javax.swing.JPanel();
        sideMenuLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        subtitleLabel = new javax.swing.JLabel();
        loginLabel1 = new javax.swing.JLabel();
        subtitleLabel1 = new javax.swing.JLabel();
        studentsComboBox = new javax.swing.JComboBox<>();
        loginLabel2 = new javax.swing.JLabel();
        statisticPanel = new javax.swing.JPanel();
        subtitleLabel2 = new javax.swing.JLabel();
        examsFinishedLabel = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        statisticPanel4 = new javax.swing.JPanel();
        subtitleLabel4 = new javax.swing.JLabel();
        totalAverangeLabel = new javax.swing.JLabel();
        statisticPanel6 = new javax.swing.JPanel();
        subtitleLabel17 = new javax.swing.JLabel();
        classAverange = new javax.swing.JLabel();
        subtitleLabel6 = new javax.swing.JLabel();
        examComboBox = new javax.swing.JComboBox<>();
        statisticPanel8 = new javax.swing.JPanel();
        subtitleLabel7 = new javax.swing.JLabel();
        wrondAnswLabel = new javax.swing.JLabel();
        statisticPanel1 = new javax.swing.JPanel();
        subtitleLabel8 = new javax.swing.JLabel();
        numRightAwnsLabel = new javax.swing.JLabel();
        statisticPanel2 = new javax.swing.JPanel();
        subtitleLabel10 = new javax.swing.JLabel();
        totalSquoreLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        subtitleLabel3 = new javax.swing.JLabel();
        classCorrespondingField = new javax.swing.JTextField();

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

        studentsComboBox.setBackground(new java.awt.Color(160, 108, 255));
        studentsComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentsComboBox.setForeground(new java.awt.Color(255, 255, 255));
        studentsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                studentsComboBoxItemStateChanged(evt);
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

        examsFinishedLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        examsFinishedLabel.setForeground(new java.awt.Color(42, 8, 69));
        examsFinishedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        examsFinishedLabel.setText("0");

        javax.swing.GroupLayout statisticPanelLayout = new javax.swing.GroupLayout(statisticPanel);
        statisticPanel.setLayout(statisticPanelLayout);
        statisticPanelLayout.setHorizontalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(examsFinishedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel2)
                .addGap(18, 18, 18)
                .addComponent(examsFinishedLabel)
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

        totalAverangeLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        totalAverangeLabel.setForeground(new java.awt.Color(42, 8, 69));
        totalAverangeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAverangeLabel.setText("0");

        javax.swing.GroupLayout statisticPanel4Layout = new javax.swing.GroupLayout(statisticPanel4);
        statisticPanel4.setLayout(statisticPanel4Layout);
        statisticPanel4Layout.setHorizontalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(totalAverangeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel4Layout.setVerticalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel4)
                .addGap(18, 18, 18)
                .addComponent(totalAverangeLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel6.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel6.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel17.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel17.setText("Class Averange:");

        classAverange.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        classAverange.setForeground(new java.awt.Color(42, 8, 69));
        classAverange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classAverange.setText("0");

        javax.swing.GroupLayout statisticPanel6Layout = new javax.swing.GroupLayout(statisticPanel6);
        statisticPanel6.setLayout(statisticPanel6Layout);
        statisticPanel6Layout.setHorizontalGroup(
            statisticPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(classAverange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel6Layout.setVerticalGroup(
            statisticPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel17)
                .addGap(18, 18, 18)
                .addComponent(classAverange)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        subtitleLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel6.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel6.setText("Choose an exam:");

        examComboBox.setBackground(new java.awt.Color(160, 108, 255));
        examComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examComboBox.setForeground(new java.awt.Color(255, 255, 255));
        examComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                examComboBoxItemStateChanged(evt);
            }
        });

        statisticPanel8.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel8.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel7.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel7.setText("Number of wrong answers:");

        wrondAnswLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        wrondAnswLabel.setForeground(new java.awt.Color(42, 8, 69));
        wrondAnswLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wrondAnswLabel.setText("0");

        javax.swing.GroupLayout statisticPanel8Layout = new javax.swing.GroupLayout(statisticPanel8);
        statisticPanel8.setLayout(statisticPanel8Layout);
        statisticPanel8Layout.setHorizontalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(wrondAnswLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel8Layout.setVerticalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wrondAnswLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel1.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel1.setPreferredSize(new java.awt.Dimension(217, 120));

        subtitleLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel8.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel8.setText("Number of right answers:");

        numRightAwnsLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        numRightAwnsLabel.setForeground(new java.awt.Color(42, 8, 69));
        numRightAwnsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numRightAwnsLabel.setText("0");

        javax.swing.GroupLayout statisticPanel1Layout = new javax.swing.GroupLayout(statisticPanel1);
        statisticPanel1.setLayout(statisticPanel1Layout);
        statisticPanel1Layout.setHorizontalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(numRightAwnsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel1Layout.setVerticalGroup(
            statisticPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel8)
                .addGap(18, 18, 18)
                .addComponent(numRightAwnsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel2.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel2.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel10.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel10.setText("Total squore:");

        totalSquoreLabel.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        totalSquoreLabel.setForeground(new java.awt.Color(42, 8, 69));
        totalSquoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalSquoreLabel.setText("0.0");

        javax.swing.GroupLayout statisticPanel2Layout = new javax.swing.GroupLayout(statisticPanel2);
        statisticPanel2.setLayout(statisticPanel2Layout);
        statisticPanel2Layout.setHorizontalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(totalSquoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel2Layout.setVerticalGroup(
            statisticPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel10)
                .addGap(18, 18, 18)
                .addComponent(totalSquoreLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginBtn.setBackground(new java.awt.Color(88, 44, 169));
        loginBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Back");
        loginBtn.setBorder(null);
<<<<<<< HEAD
=======
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
>>>>>>> 374e150 (serialization finished)
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        subtitleLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel3.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel3.setText("Class:");

        classCorrespondingField.setBackground(new java.awt.Color(160, 108, 255));
        classCorrespondingField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classCorrespondingField.setForeground(new java.awt.Color(255, 255, 255));
        classCorrespondingField.setBorder(null);

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(loginLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(148, 148, 148)
                                            .addComponent(statisticPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(148, 148, 148)
                                            .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(subtitleLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                                        .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                                        .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 374e150 (serialization finished)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subtitleLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(classCorrespondingField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 49, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(subtitleLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                                .addComponent(examComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                                .addComponent(examComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 374e150 (serialization finished)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(classCorrespondingField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtitleLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subtitleLabel)
                        .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
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
                    .addComponent(examComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(statisticPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(statisticPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statisticPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {classCorrespondingField, studentsComboBox});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        Main.controller.teacherDashboardPanel = new TeacherDashboardView();
        Main.controller.studentStcDashboardView = null;
        Main.controller.showScreen(Main.controller.teacherDashboardPanel);
    }//GEN-LAST:event_loginBtnMouseClicked

    private void studentsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_studentsComboBoxItemStateChanged
        if (studentsComboBox.getSelectedIndex() != -1) {
            StudentModel std = Main.controller.findStudentById(ids[studentsComboBox.getSelectedIndex()], classToSeeDetails);
            setDashboardInfo(std.getId(), std);
        }
    }//GEN-LAST:event_studentsComboBoxItemStateChanged

    private void examComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_examComboBoxItemStateChanged
        if (studentsComboBox.getSelectedIndex() != -1) {
            StudentModel std = Main.controller.findStudentById(ids[studentsComboBox.getSelectedIndex()], classToSeeDetails);
            ex = Main.controller.findFinishedExamByName(classToSeeDetails, examComboBox.getSelectedItem().toString());
            setDashboardInfo(std.getId(), std);
        }
    }//GEN-LAST:event_examComboBoxItemStateChanged

    public void setDashboardInfo(long id, StudentModel studentModel) {
        StudentModel student = Main.controller.findStudentById(id, classToSeeDetails);
        examsFinishedLabel.setText(Main.controller.getNumExamFinished(classToSeeDetails));
        totalAverangeLabel.setText(Main.controller.getTotalAverange(student, classToSeeDetails));
        classAverange.setText(Main.controller.getClassAverange(classToSeeDetails));
        if(ex != null){
            numRightAwnsLabel.setText(Main.controller.getNumberOfRightAnswers(ex, student));
            wrondAnswLabel.setText(Main.controller.getNumberOfWrongAnswers(ex, student));
            totalSquoreLabel.setText(Main.controller.getTotalSquore(ex, student));
        }else{
            //the exam is not finished yet
            numRightAwnsLabel.setText("0");
            wrondAnswLabel.setText("0");
            totalSquoreLabel.setText("0");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classAverange;
    private javax.swing.JTextField classCorrespondingField;
    private javax.swing.JComboBox<String> examComboBox;
    private javax.swing.JLabel examsFinishedLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel numRightAwnsLabel;
    private javax.swing.JLabel sideMenuLabel;
    private javax.swing.JPanel sideMenuPanel;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JPanel statisticPanel1;
    private javax.swing.JPanel statisticPanel2;
    private javax.swing.JPanel statisticPanel4;
    private javax.swing.JPanel statisticPanel6;
    private javax.swing.JPanel statisticPanel8;
    private javax.swing.JComboBox<String> studentsComboBox;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel1;
    private javax.swing.JLabel subtitleLabel10;
    private javax.swing.JLabel subtitleLabel17;
    private javax.swing.JLabel subtitleLabel2;
    private javax.swing.JLabel subtitleLabel3;
    private javax.swing.JLabel subtitleLabel4;
    private javax.swing.JLabel subtitleLabel6;
    private javax.swing.JLabel subtitleLabel7;
    private javax.swing.JLabel subtitleLabel8;
    private javax.swing.JLabel totalAverangeLabel;
    private javax.swing.JLabel totalSquoreLabel;
    private javax.swing.JLabel wrondAnswLabel;
    // End of variables declaration//GEN-END:variables
}
