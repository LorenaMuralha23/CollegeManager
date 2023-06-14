package View;

import Model.Main;
import java.awt.Cursor;

public class CreateClassView extends javax.swing.JPanel {


    public CreateClassView() {
        initComponents();
        
        teacherField.setText(Main.controller.getUserLogged().getName());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeUserBtnGroup = new javax.swing.ButtonGroup();
        crtAccountLink = new javax.swing.JLabel();
        txtLabel = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        LogoImgPanel = new javax.swing.JPanel();
        imgWrapperLabel = new javax.swing.JLabel();
        CrtAccountFormPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        teacherField = new javax.swing.JTextField();
        teacherLabel = new javax.swing.JLabel();
        subjectField = new javax.swing.JTextField();
        subjectLabel = new javax.swing.JLabel();
        totalOfExamsLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        minAverAppLabel = new javax.swing.JLabel();
        weightedOptBtn = new javax.swing.JRadioButton();
        normalOptBtn = new javax.swing.JRadioButton();
        createNewAccBtn = new javax.swing.JButton();
        minimumAverangeField = new javax.swing.JTextField();
        totalOfExamField1 = new javax.swing.JTextField();
        backBtn1 = new javax.swing.JLabel();

        crtAccountLink.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        crtAccountLink.setForeground(new java.awt.Color(88, 44, 169));
        crtAccountLink.setText("Create an Account");
        crtAccountLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtLabel.setText("Not registered yet?");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 873));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        LogoImgPanel.setBackground(new java.awt.Color(255, 255, 255));

        imgWrapperLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crtClassLogoImg.png"))); // NOI18N

        javax.swing.GroupLayout LogoImgPanelLayout = new javax.swing.GroupLayout(LogoImgPanel);
        LogoImgPanel.setLayout(LogoImgPanelLayout);
        LogoImgPanelLayout.setHorizontalGroup(
            LogoImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgWrapperLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LogoImgPanelLayout.setVerticalGroup(
            LogoImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgWrapperLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CrtAccountFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        loginLabel.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Create a class");

        nameField.setBackground(new java.awt.Color(159, 107, 255));
        nameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setBorder(null);

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(42, 8, 69));
        nameLabel.setText("Name:*");

        teacherField.setBackground(new java.awt.Color(159, 107, 255));
        teacherField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        teacherField.setForeground(new java.awt.Color(255, 255, 255));
        teacherField.setBorder(null);
        teacherField.setEnabled(false);

        teacherLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(42, 8, 69));
        teacherLabel.setText("Teacher:");

        subjectField.setBackground(new java.awt.Color(159, 107, 255));
        subjectField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subjectField.setForeground(new java.awt.Color(255, 255, 255));
        subjectField.setBorder(null);

        subjectLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(42, 8, 69));
        subjectLabel.setText("Subject:*");

        totalOfExamsLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        totalOfExamsLabel.setForeground(new java.awt.Color(42, 8, 69));
        totalOfExamsLabel.setText("Total of Exams:*");

        selectLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(42, 8, 69));
        selectLabel.setText("Select the averange calculous:*");

        minAverAppLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        minAverAppLabel.setForeground(new java.awt.Color(42, 8, 69));
        minAverAppLabel.setText("Minimum averange for approvement:*");

        weightedOptBtn.setBackground(new java.awt.Color(40, 20, 77));
        typeUserBtnGroup.add(weightedOptBtn);
        weightedOptBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        weightedOptBtn.setForeground(new java.awt.Color(40, 20, 77));
        weightedOptBtn.setText("Weighted Average");
        weightedOptBtn.setBorder(null);
        weightedOptBtn.setOpaque(false);
        weightedOptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weightedOptBtnMouseClicked(evt);
            }
        });

        normalOptBtn.setBackground(new java.awt.Color(40, 20, 77));
        typeUserBtnGroup.add(normalOptBtn);
        normalOptBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        normalOptBtn.setForeground(new java.awt.Color(40, 20, 77));
        normalOptBtn.setText("Normal");
        normalOptBtn.setBorder(null);
        normalOptBtn.setOpaque(false);

        createNewAccBtn.setBackground(new java.awt.Color(88, 44, 169));
        createNewAccBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        createNewAccBtn.setForeground(new java.awt.Color(255, 255, 255));
        createNewAccBtn.setText("CREATE NEW");
        createNewAccBtn.setBorder(null);
        createNewAccBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNewAccBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewAccBtnMouseClicked(evt);
            }
        });

        minimumAverangeField.setBackground(new java.awt.Color(159, 107, 255));
        minimumAverangeField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        minimumAverangeField.setForeground(new java.awt.Color(255, 255, 255));
        minimumAverangeField.setText("0");
        minimumAverangeField.setBorder(null);

        totalOfExamField1.setBackground(new java.awt.Color(159, 107, 255));
        totalOfExamField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalOfExamField1.setForeground(new java.awt.Color(255, 255, 255));
        totalOfExamField1.setText("0");
        totalOfExamField1.setBorder(null);
        totalOfExamField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalOfExamField1ActionPerformed(evt);
            }
        });

        backBtn1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        backBtn1.setForeground(new java.awt.Color(88, 44, 169));
        backBtn1.setText("Back");
        backBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CrtAccountFormPanelLayout = new javax.swing.GroupLayout(CrtAccountFormPanel);
        CrtAccountFormPanel.setLayout(CrtAccountFormPanelLayout);
        CrtAccountFormPanelLayout.setHorizontalGroup(
            CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(normalOptBtn)
                .addGap(98, 98, 98)
                .addComponent(weightedOptBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrtAccountFormPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minAverAppLabel)
                    .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherField, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalOfExamsLabel)
                    .addComponent(subjectLabel)
                    .addComponent(teacherLabel)
                    .addComponent(nameLabel)
                    .addComponent(selectLabel)
                    .addComponent(minimumAverangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalOfExamField1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(backBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CrtAccountFormPanelLayout.setVerticalGroup(
            CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(loginLabel)
                .addGap(26, 26, 26)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacherLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subjectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalOfExamsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalOfExamField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(minAverAppLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimumAverangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectLabel)
                .addGap(18, 18, 18)
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightedOptBtn)
                    .addComponent(normalOptBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn1)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(CrtAccountFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CrtAccountFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void createNewAccBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewAccBtnMouseClicked
        int calcType = 0;
        
        if(totalOfExamField1.getText().equals("")){
            totalOfExamField1.setText("0");
        }
        
        if(minimumAverangeField.getText().equals("")){
            minimumAverangeField.setText("0");
        }
        
        if(normalOptBtn.isSelected()){
            calcType = 1;
        }else if(weightedOptBtn.isSelected()){
            calcType = 2;
        }
        Main.controller.createClass(nameField.getText(), subjectField.getText(), Integer.valueOf(totalOfExamField1.getText()), Float.valueOf(minimumAverangeField.getText()), calcType);
    }//GEN-LAST:event_createNewAccBtnMouseClicked

    public void cleanFields(){
        nameField.setText("");
        subjectField.setText("");
        totalOfExamField1.setText("");
        minimumAverangeField.setText("");
        typeUserBtnGroup.clearSelection();
    }
    
    private void weightedOptBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightedOptBtnMouseClicked
        
    }//GEN-LAST:event_weightedOptBtnMouseClicked

    private void totalOfExamField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalOfExamField1ActionPerformed
        
    }//GEN-LAST:event_totalOfExamField1ActionPerformed

    private void backBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtn1MouseClicked
        Main.controller.teacherDashboardPanel = null;
        Main.controller.teacherDashboardPanel = new TeacherDashboardView();
        Main.controller.showScreen(Main.controller.teacherDashboardPanel);
    }//GEN-LAST:event_backBtn1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CrtAccountFormPanel;
    private javax.swing.JPanel LogoImgPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel backBtn1;
    private javax.swing.JButton createNewAccBtn;
    private javax.swing.JLabel crtAccountLink;
    private javax.swing.JLabel imgWrapperLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel minAverAppLabel;
    private javax.swing.JTextField minimumAverangeField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton normalOptBtn;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JTextField subjectField;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField teacherField;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JTextField totalOfExamField1;
    private javax.swing.JLabel totalOfExamsLabel;
    private javax.swing.JLabel txtLabel;
    private javax.swing.ButtonGroup typeUserBtnGroup;
    private javax.swing.JRadioButton weightedOptBtn;
    // End of variables declaration//GEN-END:variables
}
