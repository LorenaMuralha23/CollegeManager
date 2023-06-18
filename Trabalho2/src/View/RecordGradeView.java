package View;

import Model.ClassModel;
import Model.ExamModel;
import Model.Main;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RecordGradeView extends javax.swing.JPanel {

    ClassModel classToRecordGrades;
    DefaultTableModel modelRecordGradeTable;
    ArrayList<Float> inicialValues = new ArrayList<>();

    public RecordGradeView(ClassModel classToRecord) {
        initComponents();
        modelRecordGradeTable = new DefaultTableModel();
        studentsTable.getTableHeader().setBackground(new Color(167, 135, 226));
        studentsTable.getTableHeader().setForeground(new Color(255, 255, 255));
        this.classToRecordGrades = classToRecord;
        classNameField.setText(classToRecord.getName());

        startComboBox();
        
    }

    

    public void startComboBox() {
        examsComboBox.removeAllItems();
        if (!classToRecordGrades.getFinishedExams().isEmpty()) {
            for (int i = 0; i < classToRecordGrades.getFinishedExams().size(); i++) {
                examsComboBox.addItem(classToRecordGrades.getFinishedExams().get(i).getName());
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
        FormPanel = new javax.swing.JPanel();
        loginLabel2 = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        examsComboBox = new javax.swing.JComboBox<>();
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();
=======
>>>>>>> 374e150 (serialization finished)
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JLabel();
        subtitleLabel1 = new javax.swing.JLabel();
        classNameField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
<<<<<<< HEAD
=======
        jLabel2 = new javax.swing.JLabel();
>>>>>>> 374e150 (serialization finished)

        setBackground(new java.awt.Color(241, 234, 255));
        setPreferredSize(new java.awt.Dimension(983, 800));

        MainPanel.setBackground(new java.awt.Color(241, 234, 255));

        SideMenuPanel.setBackground(new java.awt.Color(241, 234, 255));

        sideMenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sideMenusideMenuImg.png"))); // NOI18N

        javax.swing.GroupLayout SideMenuPanelLayout = new javax.swing.GroupLayout(SideMenuPanel);
        SideMenuPanel.setLayout(SideMenuPanelLayout);
        SideMenuPanelLayout.setHorizontalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuLabel)
        );
        SideMenuPanelLayout.setVerticalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuPanelLayout.createSequentialGroup()
                .addComponent(sideMenuLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        FormPanel.setBackground(new java.awt.Color(241, 234, 255));

        loginLabel2.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel2.setText("Record Grades");

        subtitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel.setText("Class:");

        examsComboBox.setBackground(new java.awt.Color(160, 108, 255));
        examsComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examsComboBox.setForeground(new java.awt.Color(255, 255, 255));
        examsComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        examsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                examsComboBoxItemStateChanged(evt);
            }
        });

<<<<<<< HEAD
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 44, 169));
        jLabel1.setText("Reset all");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

=======
>>>>>>> 374e150 (serialization finished)
        saveBtn.setBackground(new java.awt.Color(88, 44, 169));
        saveBtn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("SAVE");
        saveBtn.setBorder(null);
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(88, 44, 169));
        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        subtitleLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel1.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel1.setText("Choose an exam:");

        classNameField.setBackground(new java.awt.Color(160, 108, 255));
        classNameField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classNameField.setForeground(new java.awt.Color(255, 255, 255));
        classNameField.setText("jTextField1");

        studentsTable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Number Of Right Answers", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentsTable.setToolTipText("");
        jScrollPane2.setViewportView(studentsTable);

<<<<<<< HEAD
=======
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 8, 69));
        jLabel2.setText("*Click save after set the number of right answers or change for another exam in the comboBox.*");

>>>>>>> 374e150 (serialization finished)
        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(820, 820, 820))
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(FormPanelLayout.createSequentialGroup()
                                        .addComponent(subtitleLabel1)
                                        .addGap(3, 3, 3)
                                        .addComponent(examsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subtitleLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(classNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)))
=======
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(FormPanelLayout.createSequentialGroup()
                                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2)
                                            .addGroup(FormPanelLayout.createSequentialGroup()
                                                .addComponent(subtitleLabel1)
                                                .addGap(3, 3, 3)
                                                .addComponent(examsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                                .addComponent(subtitleLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(classNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(33, 33, 33)))))
>>>>>>> 374e150 (serialization finished)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(loginLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(examsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtitleLabel1))
                    .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(classNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtitleLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
>>>>>>> 374e150 (serialization finished)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addGap(48, 48, 48))
        );

        FormPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {classNameField, examsComboBox});

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        String msg = """
                     Are you sure you want to quit?
                     Alert: Changes you didn't save will be removed forever
                     """;
        int option = Main.controller.window.showConfirmMsg(msg);
        if (option == 0) {
            Main.controller.recordGradePanel = null;
            Main.controller.teacherDashboardPanel = new TeacherDashboardView();
            Main.controller.showScreen(Main.controller.teacherDashboardPanel);
        }
    }//GEN-LAST:event_backBtnMouseClicked

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        ExamModel ex = Main.controller.findFinishedExamByName(classToRecordGrades, examsComboBox.getSelectedItem().toString());
        Main.controller.saveGradeTable((DefaultTableModel) studentsTable.getModel(), classToRecordGrades, ex);
    }//GEN-LAST:event_saveBtnMouseClicked

    private void examsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_examsComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedItem = examsComboBox.getSelectedItem().toString();
<<<<<<< HEAD
            System.out.println("Item selecionado: " + selectedItem);
=======
>>>>>>> 374e150 (serialization finished)
            ExamModel exam = Main.controller.findFinishedExamByName(classToRecordGrades, selectedItem);
            Main.controller.fillRecordGradeTable((DefaultTableModel) studentsTable.getModel(), classToRecordGrades, exam);
        }
    }//GEN-LAST:event_examsComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideMenuPanel;
    private javax.swing.JLabel backBtn;
    private javax.swing.JTextField classNameField;
    private javax.swing.JComboBox<String> examsComboBox;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
=======
    private javax.swing.JLabel jLabel2;
>>>>>>> 374e150 (serialization finished)
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel sideMenuLabel;
    private javax.swing.JTable studentsTable;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel1;
    // End of variables declaration//GEN-END:variables
}
