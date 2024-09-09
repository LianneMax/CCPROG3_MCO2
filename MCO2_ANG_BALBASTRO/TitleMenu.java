/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mco2_ang_balbastro;

/**
 * Displays the title screen.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 1.0
 */
public class TitleMenu extends javax.swing.JFrame {
    /**
     * Sole Constructor.
     * Creates new form TitleMenu
     */
    public TitleMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        labEldenLeft = new javax.swing.JLabel();
        labEldenRight = new javax.swing.JLabel();
        labRogueLeft = new javax.swing.JLabel();
        labRogueRight = new javax.swing.JLabel();
        butStart = new javax.swing.JButton();
        butExit = new javax.swing.JButton();
        panelUnderline = new javax.swing.JPanel();
        labBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 38, 41));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labEldenLeft.setFont(new java.awt.Font("Serif", 1, 78)); // NOI18N
        labEldenLeft.setForeground(new java.awt.Color(47, 64, 45));
        labEldenLeft.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labEldenLeft.setText("E");
        labEldenLeft.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(labEldenLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 60, 80));

        labEldenRight.setFont(new java.awt.Font("Serif", 1, 58)); // NOI18N
        labEldenRight.setForeground(new java.awt.Color(47, 64, 45));
        labEldenRight.setText("LDEN");
        jPanel1.add(labEldenRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, -1));

        labRogueLeft.setBackground(new java.awt.Color(47, 64, 45));
        labRogueLeft.setFont(new java.awt.Font("Serif", 1, 58)); // NOI18N
        labRogueLeft.setForeground(new java.awt.Color(47, 64, 45));
        labRogueLeft.setText("ROGU");
        jPanel1.add(labRogueLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        labRogueRight.setFont(new java.awt.Font("Serif", 1, 78)); // NOI18N
        labRogueRight.setForeground(new java.awt.Color(47, 64, 45));
        labRogueRight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labRogueRight.setText("E");
        labRogueRight.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labRogueRight.setAlignmentY(0.0F);
        jPanel1.add(labRogueRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, 80));

        butStart.setBackground(new java.awt.Color(230, 210, 135));
        butStart.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        butStart.setForeground(new java.awt.Color(255, 255, 255));
        butStart.setText("START");
        butStart.setFocusable(false);
        butStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStartActionPerformed(evt);
            }
        });
        jPanel1.add(butStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 210, 50));

        butExit.setBackground(new java.awt.Color(230, 210, 135));
        butExit.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        butExit.setForeground(new java.awt.Color(255, 255, 255));
        butExit.setText("EXIT");
        butExit.setFocusable(false);
        butExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExitActionPerformed(evt);
            }
        });
        jPanel1.add(butExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 210, 50));

        panelUnderline.setBackground(new java.awt.Color(47, 64, 45));

        javax.swing.GroupLayout panelUnderlineLayout = new javax.swing.GroupLayout(panelUnderline);
        panelUnderline.setLayout(panelUnderlineLayout);
        panelUnderlineLayout.setHorizontalGroup(
            panelUnderlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        panelUnderlineLayout.setVerticalGroup(
            panelUnderlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(panelUnderline, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 370, 10));

        labBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mco2_ang_balbastro/Backgrounds/TitleMenu.jpg"))); // NOI18N
        jPanel1.add(labBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Opens the character creation screen.
     * @param evt 
     */
    private void butStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStartActionPerformed
            
            java.awt.EventQueue.invokeLater(() -> {
            new CharacterCreation().setVisible(true);
            this.dispose();
        });
    }//GEN-LAST:event_butStartActionPerformed

    /**
     * Exits the program entirely.
     * @param evt 
     */
    private void butExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_butExitActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExit;
    private javax.swing.JButton butStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labBackground;
    private javax.swing.JLabel labEldenLeft;
    private javax.swing.JLabel labEldenRight;
    private javax.swing.JLabel labRogueLeft;
    private javax.swing.JLabel labRogueRight;
    private javax.swing.JPanel panelUnderline;
    // End of variables declaration//GEN-END:variables
}