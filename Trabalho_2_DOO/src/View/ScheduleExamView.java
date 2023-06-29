package View;

import Model.ClassModel;
import Model.ExceptionModel;
import Model.Main;
import Model.TeacherModel;
import Model.UserModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;

public class ScheduleExamView extends javax.swing.JPanel {

    MaskFormatter mfdate;
    String errorMsg = "";
    LocalDate date;

    public ScheduleExamView() {
        try {
            mfdate = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Main.controller.window.showErrorMsg("An unexpected error ocurred: " + ex.getMessage());
        }
        initComponents();

        dateField.setFont(new Font("Tahoma", Font.BOLD, 18));
        dateField.setForeground(new Color(255, 255, 255));

        startComboBox();

        String firstItem = classesComboBox.getSelectedItem().toString();
        setWeightEnableField(firstItem);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrtAccountFormPanel = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        teacherLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        classesComboBox = new javax.swing.JComboBox<>();
        numQuestField = new javax.swing.JTextField();
        numQuestionLabel = new javax.swing.JLabel();
        valueOfEachField = new javax.swing.JTextField();
        valEachQuestLabel = new javax.swing.JLabel();
        weightOfExamField = new javax.swing.JTextField();
        totalSquoreLabel = new javax.swing.JLabel();
        warnStudentsField = new javax.swing.JTextField();
        warningForStudentsLabel = new javax.swing.JLabel();
        createExamBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JLabel();
        dateField = new javax.swing.JFormattedTextField(mfdate);

        CrtAccountFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CrtAccountFormPanelLayout = new javax.swing.GroupLayout(CrtAccountFormPanel);
        CrtAccountFormPanel.setLayout(CrtAccountFormPanelLayout);
        CrtAccountFormPanelLayout.setHorizontalGroup(
            CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        CrtAccountFormPanelLayout.setVerticalGroup(
            CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(241, 234, 255));

        MainPanel.setBackground(new java.awt.Color(241, 234, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sideMenusideMenuImg.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(241, 234, 255));

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Schedule an Exam");

        nameField.setBackground(new java.awt.Color(158, 107, 255));
        nameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setBorder(null);

        teacherLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(42, 8, 69));
        teacherLabel.setText("Name:");

        dateLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(42, 8, 69));
        dateLabel.setText("Date:*");

        subjectLabel.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(42, 8, 69));
        subjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subjectLabel.setText("Class:");

        classesComboBox.setBackground(new java.awt.Color(160, 108, 255));
        classesComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        classesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        classesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classesComboBoxItemStateChanged(evt);
            }
        });

        numQuestField.setBackground(new java.awt.Color(158, 107, 255));
        numQuestField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numQuestField.setForeground(new java.awt.Color(255, 255, 255));
        numQuestField.setBorder(null);

        numQuestionLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        numQuestionLabel.setForeground(new java.awt.Color(42, 8, 69));
        numQuestionLabel.setText("Number of questions:*");

        valueOfEachField.setBackground(new java.awt.Color(158, 107, 255));
        valueOfEachField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueOfEachField.setForeground(new java.awt.Color(255, 255, 255));
        valueOfEachField.setBorder(null);

        valEachQuestLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        valEachQuestLabel.setForeground(new java.awt.Color(42, 8, 69));
        valEachQuestLabel.setText("Value of each question:*");

        weightOfExamField.setEditable(false);
        weightOfExamField.setBackground(new java.awt.Color(158, 107, 255));
        weightOfExamField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        weightOfExamField.setForeground(new java.awt.Color(255, 255, 255));
        weightOfExamField.setText("0");
        weightOfExamField.setBorder(null);
        weightOfExamField.setEnabled(false);

        totalSquoreLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        totalSquoreLabel.setForeground(new java.awt.Color(42, 8, 69));
        totalSquoreLabel.setText("Weight of exam:");

        warnStudentsField.setBackground(new java.awt.Color(158, 107, 255));
        warnStudentsField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        warnStudentsField.setForeground(new java.awt.Color(255, 255, 255));
        warnStudentsField.setBorder(null);

        warningForStudentsLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        warningForStudentsLabel.setForeground(new java.awt.Color(42, 8, 69));
        warningForStudentsLabel.setText("Warning for students:");

        createExamBtn.setBackground(new java.awt.Color(88, 44, 169));
        createExamBtn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        createExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        createExamBtn.setText("SCHEDULE EXAM");
        createExamBtn.setBorder(null);
        createExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createExamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createExamBtnMouseClicked(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(88, 44, 169));
        backBtn.setText("Cancel All");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        dateField.setBackground(new java.awt.Color(158, 107, 255));
        dateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(warnStudentsField)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(warningForStudentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(numQuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subjectLabel)
                                        .addComponent(numQuestField)))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valEachQuestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valueOfEachField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalSquoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(weightOfExamField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backBtn)
                                .addGap(18, 18, 18)
                                .addComponent(createExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherLabel))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateLabel)
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateField, weightOfExamField});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(loginLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherLabel)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(subjectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numQuestionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numQuestField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valEachQuestLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueOfEachField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(totalSquoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weightOfExamField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(warningForStudentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnStudentsField, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addGap(37, 37, 37))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateField, weightOfExamField});

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public void startComboBox() {
        UserModel userLogged = Main.controller.getUserLogged();
        classesComboBox.removeAllItems();
        if (userLogged instanceof TeacherModel) {
            ArrayList<ClassModel> userClasses = ((TeacherModel) userLogged).getClasses();
            if (!userClasses.isEmpty()) {
                for (int i = 0; i < userClasses.size(); i++) {
                    classesComboBox.addItem(userClasses.get(i).getName());
                }
            } else {
                classesComboBox.setEnabled(false);
            }
        }
    }

    private void dateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFieldFocusLost
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dateTxt = dateField.getText();

            //verify if, in case the user put 29/02 as a date, if the year is a leap year
            if (dateTxt.substring(0, 2).equals("29") && dateTxt.substring(3, 5).equals("02")) {
                if (!validateLeapYear(Integer.parseInt(dateTxt.substring(6, 9)))) {
                    dateField.setText("28/" + dateTxt.substring(3, 5) + dateTxt.substring(6, 10));
                    throw new ExceptionModel("You can't use 29/02 if it is not a leap year!");
                }
            }

            this.date = LocalDate.parse(dateTxt, formatter);
            if (!validateDate(this.date)) {
                throw new ExceptionModel(this.errorMsg);
            }

        } catch (DateTimeParseException e) {
            Main.controller.window.showErrorMsg("Set a valid date!");
        } catch (ExceptionModel e) {
            Main.controller.window.showErrorMsg(e.getMessage());
            dateField.setFocusLostBehavior(JFormattedTextField.PERSIST);
            dateField.setText("");
            dateField.setValue(null);
        }
    }//GEN-LAST:event_dateFieldFocusLost

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked

        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to permanently remove this item?", "Confirm delection", WIDTH);

        if (option == 0) {
            Main.controller.scheduleExamPanel = null;
            Main.controller.teacherDashboardPanel = new TeacherDashboardView();
            Main.controller.showScreen(Main.controller.teacherDashboardPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Operation Canseled!", errorMsg, HEIGHT);
        }

    }//GEN-LAST:event_backBtnMouseClicked

    private void createExamBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createExamBtnMouseClicked

        Main.controller.scheduleExam(nameField.getText(), date, classesComboBox.getSelectedItem().toString(), Integer.valueOf(numQuestField.getText()), Float.valueOf(valueOfEachField.getText()),
                Float.valueOf(weightOfExamField.getText()), warnStudentsField.getText());
    }//GEN-LAST:event_createExamBtnMouseClicked

    private void classesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classesComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedItem = classesComboBox.getSelectedItem().toString();
            setWeightEnableField(selectedItem);
        }
    }//GEN-LAST:event_classesComboBoxItemStateChanged

    public void setWeightEnableField(String selectedItem) {
        if (Main.controller.getUserLogged() instanceof TeacherModel) {
            ClassModel classAux = Main.controller.findClassByName(selectedItem);
            if (classAux.getCalcType() == 2) {
                weightOfExamField.setEnabled(true);
                weightOfExamField.setEditable(true);
            } else {
                weightOfExamField.setEnabled(false);
                weightOfExamField.setEditable(false);
            }

        }
    }

    //this method verify if the date is not in the pass or at the present day
    public boolean validateDate(LocalDate dateToVerify) {
        boolean isValid = true;

        if (dateToVerify.isBefore(LocalDate.now()) || dateToVerify.equals(LocalDate.now())) {

            errorMsg = "Date must not be in the pass or present!";
            isValid = false;
        }

        return isValid;
    }

    public boolean validateLeapYear(int year) {
        boolean isValid = false;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isValid = true;
        }

        return isValid;
    }

    public void cleanFields() {
        nameField.setText("");
        dateField.setText("");
        numQuestField.setText("");
        valueOfEachField.setText("");
        weightOfExamField.setText("0");
        warnStudentsField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CrtAccountFormPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel backBtn;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JButton createExamBtn;
    private javax.swing.JFormattedTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numQuestField;
    private javax.swing.JLabel numQuestionLabel;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JLabel totalSquoreLabel;
    private javax.swing.JLabel valEachQuestLabel;
    private javax.swing.JTextField valueOfEachField;
    private javax.swing.JTextField warnStudentsField;
    private javax.swing.JLabel warningForStudentsLabel;
    private javax.swing.JTextField weightOfExamField;
    // End of variables declaration//GEN-END:variables
}
