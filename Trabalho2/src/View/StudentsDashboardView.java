package View;

import java.awt.Image;
import javax.swing.ImageIcon;

public class StudentsDashboardView extends javax.swing.JPanel {
    
   
    
    public StudentsDashboardView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideMenuPanel = new javax.swing.JPanel();
        ImgWrapperLabel = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        subtitleLabel = new javax.swing.JLabel();
        loginLabel1 = new javax.swing.JLabel();
        subtitleLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        loginLabel2 = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        statisticPanel6 = new javax.swing.JPanel();
        subtitleLabel17 = new javax.swing.JLabel();
        subtitleLabel18 = new javax.swing.JLabel();
        statisticPanel4 = new javax.swing.JPanel();
        subtitleLabel4 = new javax.swing.JLabel();
        subtitleLabel14 = new javax.swing.JLabel();
        statisticPanel = new javax.swing.JPanel();
        subtitleLabel2 = new javax.swing.JLabel();
        subtitleLabel3 = new javax.swing.JLabel();
        subtitleLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        statisticPanel8 = new javax.swing.JPanel();
        subtitleLabel22 = new javax.swing.JLabel();
        subtitleLabel23 = new javax.swing.JLabel();
        statisticPanel7 = new javax.swing.JPanel();
        subtitleLabel19 = new javax.swing.JLabel();
        subtitleLabel20 = new javax.swing.JLabel();
        statisticPanel5 = new javax.swing.JPanel();
        subtitleLabel16 = new javax.swing.JLabel();
        subtitleLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 234, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        ImgWrapperLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentSideMenuImgStudentSideMenu.png"))); // NOI18N

        javax.swing.GroupLayout SideMenuPanelLayout = new javax.swing.GroupLayout(SideMenuPanel);
        SideMenuPanel.setLayout(SideMenuPanelLayout);
        SideMenuPanelLayout.setHorizontalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgWrapperLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideMenuPanelLayout.setVerticalGroup(
            SideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgWrapperLabel)
        );

        MainPanel.setBackground(new java.awt.Color(241, 234, 255));

        subtitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel.setText("Select a class:");

        loginLabel1.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel1.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel1.setText("Exam info");

        subtitleLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel1.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel1.setText("Your dashboard");

        jComboBox1.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        loginLabel2.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel2.setText("Overview");

        loginLabel3.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(42, 8, 69));
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel3.setText("Statistics");

        statisticPanel6.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel6.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel17.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel17.setText("Class Averange:");

        subtitleLabel18.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel18.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel18.setText("12.5");

        javax.swing.GroupLayout statisticPanel6Layout = new javax.swing.GroupLayout(statisticPanel6);
        statisticPanel6.setLayout(statisticPanel6Layout);
        statisticPanel6Layout.setHorizontalGroup(
            statisticPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel6Layout.setVerticalGroup(
            statisticPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel17)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel18)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel4.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel4.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel4.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel4.setText("Total Averange:");

        subtitleLabel14.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel14.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel14.setText("4.5");

        javax.swing.GroupLayout statisticPanel4Layout = new javax.swing.GroupLayout(statisticPanel4);
        statisticPanel4.setLayout(statisticPanel4Layout);
        statisticPanel4Layout.setHorizontalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel4Layout.setVerticalGroup(
            statisticPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel4)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel14)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel2.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel2.setText("Exams Finished:");

        subtitleLabel3.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel3.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel3.setText("19");

        javax.swing.GroupLayout statisticPanelLayout = new javax.swing.GroupLayout(statisticPanel);
        statisticPanel.setLayout(statisticPanelLayout);
        statisticPanelLayout.setHorizontalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel2)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subtitleLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        subtitleLabel15.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitleLabel15.setText("Choose an exam:");

        jComboBox2.setBackground(new java.awt.Color(160, 108, 255));
        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 1", "Class 2", "Class 3", "Class 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        statisticPanel8.setBackground(new java.awt.Color(226, 213, 246));

        subtitleLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel22.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel22.setText("Exams Finished:");

        subtitleLabel23.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel23.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel23.setText("19");

        javax.swing.GroupLayout statisticPanel8Layout = new javax.swing.GroupLayout(statisticPanel8);
        statisticPanel8.setLayout(statisticPanel8Layout);
        statisticPanel8Layout.setHorizontalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel8Layout.setVerticalGroup(
            statisticPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel22)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticPanel7.setBackground(new java.awt.Color(226, 213, 246));
        statisticPanel7.setPreferredSize(new java.awt.Dimension(217, 138));

        subtitleLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel19.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel19.setText("Class Averange:");

        subtitleLabel20.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel20.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel20.setText("12.5");

        javax.swing.GroupLayout statisticPanel7Layout = new javax.swing.GroupLayout(statisticPanel7);
        statisticPanel7.setLayout(statisticPanel7Layout);
        statisticPanel7Layout.setHorizontalGroup(
            statisticPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel7Layout.setVerticalGroup(
            statisticPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel19)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        statisticPanel5.setBackground(new java.awt.Color(198, 167, 250));
        statisticPanel5.setPreferredSize(new java.awt.Dimension(217, 145));

        subtitleLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtitleLabel16.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel16.setText("Total Averange:");

        subtitleLabel21.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        subtitleLabel21.setForeground(new java.awt.Color(42, 8, 69));
        subtitleLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel21.setText("4.5");

        javax.swing.GroupLayout statisticPanel5Layout = new javax.swing.GroupLayout(statisticPanel5);
        statisticPanel5.setLayout(statisticPanel5Layout);
        statisticPanel5Layout.setHorizontalGroup(
            statisticPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subtitleLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(subtitleLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statisticPanel5Layout.setVerticalGroup(
            statisticPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel16)
                .addGap(18, 18, 18)
                .addComponent(subtitleLabel21)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(statisticPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(subtitleLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(statisticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(subtitleLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(loginLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                                .addComponent(loginLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(subtitleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel2)
                .addGap(22, 22, 22)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(loginLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(loginLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitleLabel15)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statisticPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statisticPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgWrapperLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideMenuPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JPanel statisticPanel4;
    private javax.swing.JPanel statisticPanel5;
    private javax.swing.JPanel statisticPanel6;
    private javax.swing.JPanel statisticPanel7;
    private javax.swing.JPanel statisticPanel8;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel1;
    private javax.swing.JLabel subtitleLabel14;
    private javax.swing.JLabel subtitleLabel15;
    private javax.swing.JLabel subtitleLabel16;
    private javax.swing.JLabel subtitleLabel17;
    private javax.swing.JLabel subtitleLabel18;
    private javax.swing.JLabel subtitleLabel19;
    private javax.swing.JLabel subtitleLabel2;
    private javax.swing.JLabel subtitleLabel20;
    private javax.swing.JLabel subtitleLabel21;
    private javax.swing.JLabel subtitleLabel22;
    private javax.swing.JLabel subtitleLabel23;
    private javax.swing.JLabel subtitleLabel3;
    private javax.swing.JLabel subtitleLabel4;
    // End of variables declaration//GEN-END:variables
}
