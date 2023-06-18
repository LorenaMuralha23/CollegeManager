package View;

import Model.Main;
import java.awt.Cursor;

public class CreateAccountView extends javax.swing.JPanel {

    public CreateAccountView() {
        initComponents();

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
        firstNameField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailAddresLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPswField = new javax.swing.JPasswordField();
        txtLabel1 = new javax.swing.JLabel();
        confPasswordLabel = new javax.swing.JLabel();
        studentOptBtn = new javax.swing.JRadioButton();
        txtLabel2 = new javax.swing.JLabel();
        teacherOptnBtn = new javax.swing.JRadioButton();
        createNewAccBtn = new javax.swing.JButton();
        singInLink = new javax.swing.JLabel();
        txtLabel3 = new javax.swing.JLabel();

        crtAccountLink.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        crtAccountLink.setForeground(new java.awt.Color(88, 44, 169));
        crtAccountLink.setText("Create an Account");
        crtAccountLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtLabel.setText("Not registered yet?");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        LogoImgPanel.setBackground(new java.awt.Color(255, 255, 255));

        imgWrapperLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crtAccImg.png"))); // NOI18N

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
        loginLabel.setText("Create your account");

        firstNameField.setBackground(new java.awt.Color(159, 107, 255));
        firstNameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(255, 255, 255));
        firstNameField.setBorder(null);

        firstNameLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(42, 8, 69));
        firstNameLabel.setText("First Name:");

        usernameField.setBackground(new java.awt.Color(159, 107, 255));
        usernameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(null);

        usernameLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(42, 8, 69));
        usernameLabel.setText("Username:");

        emailField.setBackground(new java.awt.Color(159, 107, 255));
        emailField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setBorder(null);

        emailAddresLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        emailAddresLabel.setForeground(new java.awt.Color(42, 8, 69));
        emailAddresLabel.setText("Email address:");

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(42, 8, 69));
        passwordLabel.setText("Password:");

        passwordField.setBackground(new java.awt.Color(160, 108, 255));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);

        confirmPswField.setBackground(new java.awt.Color(160, 108, 255));
        confirmPswField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmPswField.setForeground(new java.awt.Color(255, 255, 255));
        confirmPswField.setBorder(null);

        txtLabel1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        txtLabel1.setForeground(new java.awt.Color(42, 8, 69));
        txtLabel1.setText("Are you:");

        confPasswordLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        confPasswordLabel.setForeground(new java.awt.Color(42, 8, 69));
        confPasswordLabel.setText("Confirm password:");

        studentOptBtn.setBackground(new java.awt.Color(40, 20, 77));
        typeUserBtnGroup.add(studentOptBtn);
        studentOptBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentOptBtn.setForeground(new java.awt.Color(40, 20, 77));
        studentOptBtn.setText("Student");
        studentOptBtn.setBorder(null);
<<<<<<< HEAD
=======
        studentOptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
>>>>>>> 374e150 (serialization finished)
        studentOptBtn.setOpaque(false);

        txtLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtLabel2.setForeground(new java.awt.Color(40, 20, 77));
        txtLabel2.setText("or");
        txtLabel2.setToolTipText("");

        teacherOptnBtn.setBackground(new java.awt.Color(40, 20, 77));
        typeUserBtnGroup.add(teacherOptnBtn);
        teacherOptnBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        teacherOptnBtn.setForeground(new java.awt.Color(40, 20, 77));
        teacherOptnBtn.setText("Teacher");
        teacherOptnBtn.setBorder(null);
<<<<<<< HEAD
=======
        teacherOptnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
>>>>>>> 374e150 (serialization finished)
        teacherOptnBtn.setOpaque(false);

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

        singInLink.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        singInLink.setForeground(new java.awt.Color(88, 44, 169));
        singInLink.setText("Sing in");
        singInLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        singInLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singInLinkMouseClicked(evt);
            }
        });

        txtLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
<<<<<<< HEAD
=======
        txtLabel3.setForeground(new java.awt.Color(40, 20, 77));
>>>>>>> 374e150 (serialization finished)
        txtLabel3.setText("Already have an account?");

        javax.swing.GroupLayout CrtAccountFormPanelLayout = new javax.swing.GroupLayout(CrtAccountFormPanel);
        CrtAccountFormPanel.setLayout(CrtAccountFormPanelLayout);
        CrtAccountFormPanelLayout.setHorizontalGroup(
            CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrtAccountFormPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(createNewAccBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(confPasswordLabel)
                        .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLabel1)
                            .addComponent(passwordField)
                            .addComponent(passwordLabel)
                            .addComponent(emailField)
                            .addComponent(emailAddresLabel)
                            .addComponent(usernameField)
                            .addComponent(usernameLabel)
                            .addComponent(firstNameField)
                            .addComponent(firstNameLabel)
                            .addComponent(confirmPswField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
            .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(teacherOptnBtn)
                        .addGap(47, 47, 47)
                        .addComponent(txtLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(studentOptBtn))
                    .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(txtLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(singInLink)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
            .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(teacherOptnBtn)
                .addGap(47, 47, 47)
                .addComponent(txtLabel2)
                .addGap(47, 47, 47)
                .addComponent(studentOptBtn)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrtAccountFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrtAccountFormPanelLayout.createSequentialGroup()
                        .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(createNewAccBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(confPasswordLabel)
                                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLabel1)
                                    .addComponent(passwordField)
                                    .addComponent(passwordLabel)
                                    .addComponent(emailField)
                                    .addComponent(emailAddresLabel)
                                    .addComponent(usernameField)
                                    .addComponent(usernameLabel)
                                    .addComponent(firstNameField)
                                    .addComponent(firstNameLabel)
                                    .addComponent(confirmPswField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrtAccountFormPanelLayout.createSequentialGroup()
                        .addComponent(txtLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(singInLink)
                        .addGap(181, 181, 181))))
>>>>>>> 374e150 (serialization finished)
        );
        CrtAccountFormPanelLayout.setVerticalGroup(
            CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrtAccountFormPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLabel)
                .addGap(26, 26, 26)
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailAddresLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPswField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentOptBtn)
                    .addComponent(txtLabel2)
                    .addComponent(teacherOptnBtn))
                .addGap(30, 30, 30)
                .addComponent(createNewAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CrtAccountFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabel3)
                    .addComponent(singInLink))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void singInLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singInLinkMouseClicked
        Main.controller.showScreen(Main.controller.loginPanel);
    }//GEN-LAST:event_singInLinkMouseClicked

    private void createNewAccBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewAccBtnMouseClicked
        int userType = 0;
        if (teacherOptnBtn.isSelected()) {
            userType = 1;
        } else if (studentOptBtn.isSelected()) {
            userType = 2;
        }
    
        Main.controller.createAccount(firstNameField.getText(), usernameField.getText(), emailField.getText(),
                String.valueOf(passwordField.getPassword()), String.valueOf(confirmPswField.getPassword()), userType);
        cleanFields();
    }//GEN-LAST:event_createNewAccBtnMouseClicked

    public void cleanFields(){
        firstNameField.setText("");
        usernameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        confirmPswField.setText("");
        typeUserBtnGroup.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CrtAccountFormPanel;
    private javax.swing.JPanel LogoImgPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel confPasswordLabel;
    private javax.swing.JPasswordField confirmPswField;
    private javax.swing.JButton createNewAccBtn;
    private javax.swing.JLabel crtAccountLink;
    private javax.swing.JLabel emailAddresLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel imgWrapperLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel singInLink;
    private javax.swing.JRadioButton studentOptBtn;
    private javax.swing.JRadioButton teacherOptnBtn;
    private javax.swing.JLabel txtLabel;
    private javax.swing.JLabel txtLabel1;
    private javax.swing.JLabel txtLabel2;
    private javax.swing.JLabel txtLabel3;
    private javax.swing.ButtonGroup typeUserBtnGroup;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
