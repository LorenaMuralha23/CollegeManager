/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author USER
 */
public class MsgStudentView extends javax.swing.JPanel {

    /**
     * Creates new form StudentMessageView
     */
    public MsgStudentView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SideMenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fromField = new javax.swing.JPanel();
        loginLabel2 = new javax.swing.JLabel();
        teacherField = new javax.swing.JTextField();
        fromLabel = new javax.swing.JLabel();
        aboutField = new javax.swing.JTextField();
        aboutLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        classField = new javax.swing.JTextField();
        classLabel = new javax.swing.JLabel();
        contentField = new javax.swing.JTextField();
        contentLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();

        MainPanel.setBackground(new java.awt.Color(241, 234, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MsgSideMenuImg.png"))); // NOI18N

        javax.swing.GroupLayout SideMenuPanelLayout = new javax.swing.GroupLayout(SideMenuPanel);
        SideMenuPanel.setLayout(SideMenuPanelLayout);
        SideMenuPanelLayout.setHorizontalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideMenuPanelLayout.setVerticalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fromField.setBackground(new java.awt.Color(241, 234, 255));

        loginLabel2.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel2.setText("Message");

        teacherField.setBackground(new java.awt.Color(158, 107, 255));
        teacherField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        teacherField.setForeground(new java.awt.Color(255, 255, 255));
        teacherField.setBorder(null);
        teacherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherFieldActionPerformed(evt);
            }
        });

        fromLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(42, 8, 69));
        fromLabel.setText("From:");

        aboutField.setBackground(new java.awt.Color(158, 107, 255));
        aboutField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        aboutField.setBorder(null);
        aboutField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutFieldActionPerformed(evt);
            }
        });

        aboutLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(42, 8, 69));
        aboutLabel.setText("About:");

        dateField.setBackground(new java.awt.Color(158, 107, 255));
        dateField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dateField.setBorder(null);
        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(42, 8, 69));
        dateLabel.setText("Date:");

        classField.setBackground(new java.awt.Color(158, 107, 255));
        classField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        classField.setBorder(null);
        classField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classFieldActionPerformed(evt);
            }
        });

        classLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        classLabel.setForeground(new java.awt.Color(42, 8, 69));
        classLabel.setText("Class:");

        contentField.setBackground(new java.awt.Color(158, 107, 255));
        contentField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        contentField.setBorder(null);
        contentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentFieldActionPerformed(evt);
            }
        });

        contentLabel.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        contentLabel.setForeground(new java.awt.Color(42, 8, 69));
        contentLabel.setText("Content:");

        loginBtn.setBackground(new java.awt.Color(88, 44, 169));
        loginBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Back");
        loginBtn.setBorder(null);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromFieldLayout = new javax.swing.GroupLayout(fromField);
        fromField.setLayout(fromFieldLayout);
        fromFieldLayout.setHorizontalGroup(
            fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addComponent(loginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addGroup(fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromLabel)
                            .addComponent(aboutLabel)
                            .addComponent(teacherField, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(aboutField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classLabel)
                            .addComponent(classField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addGroup(fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contentLabel)
                            .addComponent(contentField, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromFieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        fromFieldLayout.setVerticalGroup(
            fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromFieldLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginLabel2)
                .addGap(18, 18, 18)
                .addGroup(fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addComponent(fromLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(fromFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addComponent(aboutLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aboutField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fromFieldLayout.createSequentialGroup()
                        .addComponent(classLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(contentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void teacherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherFieldActionPerformed

    private void aboutFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutFieldActionPerformed

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void classFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classFieldActionPerformed

    private void contentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideMenuPanel;
    private javax.swing.JTextField aboutField;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JTextField classField;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField contentField;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel fromField;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JTextField teacherField;
    // End of variables declaration//GEN-END:variables
}
