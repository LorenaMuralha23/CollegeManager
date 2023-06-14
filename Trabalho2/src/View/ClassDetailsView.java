package View;

import Model.ClassModel;
import Model.ExamModel;
import Model.Main;
import Model.TeacherModel;
import Model.UserModel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClassDetailsView extends javax.swing.JPanel {

    ClassModel classToSeeDetails;

    public ClassDetailsView(ClassModel classToSeeDetails) {
        initComponents();
        this.classToSeeDetails = classToSeeDetails;
        studentsTable.getTableHeader().setBackground(new Color(167, 135, 226));
        studentsTable.getTableHeader().setForeground(new Color(255, 255, 255));
        startInfo();

        //Main.controller.preencheJTable((DefaultTableModel)this.tb_funcionarios.getModel());
        Main.controller.fillStudentsTable((DefaultTableModel) this.studentsTable.getModel(), this.classToSeeDetails);
    }

    public void startInfo() {
        classNameField.setText(classToSeeDetails.getName());
        subjectField.setText(classToSeeDetails.getSubject());
        teacherField.setText(classToSeeDetails.getTeacher().getName());
        startComboBox();
    }

    public void startComboBox() {
        examsComboBox.removeAllItems();
        if (!this.classToSeeDetails.getExamList().isEmpty()) {
            for (int i = 0; i < this.classToSeeDetails.getExamList().size(); i++) {
                if(!this.classToSeeDetails.getExamList().get(i).getIsFinished()){
                    examsComboBox.addItem(this.classToSeeDetails.getExamList().get(i).getName());
                }
            }
        } else {
            examsComboBox.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SideMenuPanel = new javax.swing.JPanel();
        sideMenuLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginLabel2 = new javax.swing.JLabel();
        teacherLabel = new javax.swing.JLabel();
        classNameField = new javax.swing.JTextField();
        teacherField = new javax.swing.JTextField();
        teacherLabel1 = new javax.swing.JLabel();
        subjectField = new javax.swing.JTextField();
        teacherLabel2 = new javax.swing.JLabel();
        examsComboBox = new javax.swing.JComboBox<>();
        subjectLabel = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        finishClassBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        finishedExamCB = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(241, 234, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        MainPanel.setBackground(new java.awt.Color(241, 234, 255));

        SideMenuPanel.setBackground(new java.awt.Color(241, 234, 255));

        sideMenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sideMenusideMenuImg.png"))); // NOI18N

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

        loginLabel2.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel2.setText("Students in the class:");

        teacherLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(42, 8, 69));
        teacherLabel.setText("Name:");

        classNameField.setBackground(new java.awt.Color(158, 107, 255));
        classNameField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classNameField.setForeground(new java.awt.Color(255, 255, 255));
        classNameField.setBorder(null);

        teacherField.setEditable(false);
        teacherField.setBackground(new java.awt.Color(158, 107, 255));
        teacherField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        teacherField.setForeground(new java.awt.Color(255, 255, 255));
        teacherField.setBorder(null);
        teacherField.setEnabled(false);

        teacherLabel1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        teacherLabel1.setForeground(new java.awt.Color(42, 8, 69));
        teacherLabel1.setText("Teacher:");

        subjectField.setBackground(new java.awt.Color(158, 107, 255));
        subjectField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        subjectField.setForeground(new java.awt.Color(255, 255, 255));
        subjectField.setBorder(null);

        teacherLabel2.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        teacherLabel2.setForeground(new java.awt.Color(42, 8, 69));
        teacherLabel2.setText("Subject:");

        examsComboBox.setBackground(new java.awt.Color(160, 108, 255));
        examsComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examsComboBox.setForeground(new java.awt.Color(255, 255, 255));

        subjectLabel.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(42, 8, 69));
        subjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subjectLabel.setText("Choose an exam:");

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Class Details");

        studentsTable.setBackground(new java.awt.Color(255, 255, 255));
        studentsTable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentsTable);

        finishClassBtn.setBackground(new java.awt.Color(88, 44, 169));
        finishClassBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        finishClassBtn.setForeground(new java.awt.Color(255, 255, 255));
        finishClassBtn.setText("Finish class");
        finishClassBtn.setBorder(null);
        finishClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finishClassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishClassBtnMouseClicked(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(88, 44, 169));
        exitBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Back");
        exitBtn.setBorder(null);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        finishedExamCB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        finishedExamCB.setForeground(new java.awt.Color(42, 8, 69));
        finishedExamCB.setText("finished?");
        finishedExamCB.setOpaque(false);
        finishedExamCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishedExamCBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(teacherLabel)
                                    .addComponent(teacherLabel1)
                                    .addComponent(classNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                                    .addComponent(teacherField))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subjectField)
                                    .addComponent(teacherLabel2)
                                    .addComponent(subjectLabel)
                                    .addComponent(examsComboBox, 0, 206, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(finishedExamCB)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(finishClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherLabel)
                    .addComponent(teacherLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherLabel1)
                            .addComponent(subjectLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examsComboBox)
                            .addComponent(finishedExamCB))))
                .addGap(18, 18, 18)
                .addComponent(loginLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finishClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        finishExamWasSelected();
        thereWasChanges();
        Main.controller.classDetailsPanel = null;
        Main.controller.teacherDashboardPanel = new TeacherDashboardView();
        Main.controller.showScreen(Main.controller.teacherDashboardPanel);
    }//GEN-LAST:event_exitBtnMouseClicked

    public void thereWasChanges() {
        if (!classNameField.getText().equals(classToSeeDetails.getName()) || !subjectField.getText().equals(classToSeeDetails.getSubject())) {
            String newName = classNameField.getText();
            String newSubject = subjectField.getText();
            Main.controller.updateClass(classToSeeDetails, newName, newSubject);
        }
    }

    public void finishExamWasSelected() {
        if (finishedExamCB.isSelected()) {
            ExamModel examToFinish = Main.controller.findExamByName(classToSeeDetails, examsComboBox.getSelectedItem().toString());
            if (examToFinish != null) {
                Main.controller.finishExam(examToFinish, classToSeeDetails);
                finishedExamCB.setSelected(false);
                if(classToSeeDetails.getExamList().isEmpty()){
                    examsComboBox.setEnabled(false);
                    finishedExamCB.setEnabled(false);
                }
            }
        }
    }

    private void finishClassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishClassBtnMouseClicked
        Main.controller.finishClass(this.classToSeeDetails);
        exitBtnMouseClicked(evt);
    }//GEN-LAST:event_finishClassBtnMouseClicked

    private void finishedExamCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishedExamCBMouseClicked
        finishExamWasSelected();
    }//GEN-LAST:event_finishedExamCBMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideMenuPanel;
    private javax.swing.JTextField classNameField;
    private javax.swing.JComboBox<String> examsComboBox;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton finishClassBtn;
    private javax.swing.JCheckBox finishedExamCB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel sideMenuLabel;
    private javax.swing.JTable studentsTable;
    private javax.swing.JTextField subjectField;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField teacherField;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JLabel teacherLabel1;
    private javax.swing.JLabel teacherLabel2;
    // End of variables declaration//GEN-END:variables

}
