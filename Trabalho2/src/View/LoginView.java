package View;

import Model.Main;
import java.awt.Cursor;

/**
 *
 * @author USER
 */
public class LoginView extends javax.swing.JPanel {

    
    public LoginView() {
        initComponents();
        
        //Setting cursor pointer
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        crtAccountLink.setCursor(cursor);
        loginBtn.setCursor(cursor);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        logoWrapperPanel = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        loginFormPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        txtLabel = new javax.swing.JLabel();
        crtAccountLink = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1078, 700));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginLogoImglogo.png"))); // NOI18N
        imgLabel.setLabelFor(logoWrapperPanel);

        javax.swing.GroupLayout logoWrapperPanelLayout = new javax.swing.GroupLayout(logoWrapperPanel);
        logoWrapperPanel.setLayout(logoWrapperPanelLayout);
        logoWrapperPanelLayout.setHorizontalGroup(
            logoWrapperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logoWrapperPanelLayout.setVerticalGroup(
            logoWrapperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loginFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        loginLabel.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("LOG IN");

        emailLabel.setFont(new java.awt.Font("Dialog", 0, 23)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(42, 8, 69));
        emailLabel.setText("Email:");

        emailField.setBackground(new java.awt.Color(159, 107, 255));
        emailField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setBorder(null);

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 23)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(42, 8, 69));
        passwordLabel.setText("Password:");

        passwordField.setBackground(new java.awt.Color(160, 108, 255));
        passwordField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);

        txtLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtLabel.setText("Not registered yet?");

        crtAccountLink.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        crtAccountLink.setForeground(new java.awt.Color(88, 44, 169));
        crtAccountLink.setText("Create an Account");
        crtAccountLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        crtAccountLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crtAccountLinkMouseClicked(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(88, 44, 169));
        loginBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setBorder(null);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(txtLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crtAccountLink)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(loginLabel)
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabel)
                    .addComponent(crtAccountLink))
                .addGap(59, 59, 59)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(loginFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(logoWrapperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(logoWrapperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    
    //Login btn clicked
    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        Main.controller.logInAccount(emailField.getText(), String.valueOf(passwordField.getPassword()));
    }//GEN-LAST:event_loginBtnMouseClicked

    private void crtAccountLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crtAccountLinkMouseClicked
        Main.controller.crtAccountPanel = new CreateAccountView();
        Main.controller.showScreen(Main.controller.crtAccountPanel);
    }//GEN-LAST:event_crtAccountLinkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel crtAccountLink;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel logoWrapperPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel txtLabel;
    // End of variables declaration//GEN-END:variables
}
