/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mco2_ang_balbastro;

import javax.swing.JOptionPane;

/**
 * Displays the screen where statistics can be leveled up.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 1.0
 */
public class LevelUp extends javax.swing.JFrame {
    /**
     * The Player to be leveled up.
     */
    private Player CPlayer;
    
    /**
     * The cost of an upgrade.
     */
    private int nRuneCost;
    
    /**
     * Sole Constructor. 
     * 
     * Requires a Player to be passed to this LevelUp.
     * Creates new form LevelUp.
     * @param CPlayer
     */
    public LevelUp(Player CPlayer) {
        this.CPlayer = CPlayer;
//        this.CPlayer.setRunes(500); //for testing purposes
        initComponents();
        
    }

    /**
     * Displays the Player's name, job class, and statistics.
     * @param CPlayer 
     */
    public void displayDetails(Player CPlayer){
        setRuneCost();
                
        txtRuneCount.setContentType("text/html"); // Allows HTML content
        String strRuneCount = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Runes: </b>" + CPlayer.getRunes() + "</div><br/>" +
                        "</body></html>";
        txtRuneCount.setText(strRuneCount);
        
        txtHealthDetails.setContentType("text/html"); // Allows HTML content
        String strCurrentHealth = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Upgrade Cost: </b>" + this.nRuneCost +
                        "<div style='text-align: center;'><b>Current Health: </b>" + CPlayer.getHealth() + "</div><br/>" +
                        "</body></html>";
        txtHealthDetails.setText(strCurrentHealth);
        
        txtEnduranceDetails.setContentType("text/html"); // Allows HTML content
        String strCurrentEndurance = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Upgrade Cost: </b>" + this.nRuneCost +
                        "<div style='text-align: center;'><b>Current Endurance: </b>" + CPlayer.getEndurance() + "</div><br/>" +
                        "</body></html>";
        txtEnduranceDetails.setText(strCurrentEndurance);
        
        txtDexterityDetails.setContentType("text/html"); // Allows HTML content
        String strCurrentDexterity = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Upgrade Cost: </b>" + this.nRuneCost +
                        "<div style='text-align: center;'><b>Current Dexterity: </b>" + CPlayer.getDexterity() + "</div><br/>" +
                        "</body></html>";
        txtDexterityDetails.setText(strCurrentDexterity);
        
        txtStrengthDetails.setContentType("text/html"); // Allows HTML content
        String strCurrentStrength = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Upgrade Cost: </b>" + this.nRuneCost +
                        "<div style='text-align: center;'><b>Current Strength: </b>" + CPlayer.getStrength() + "</div><br/>" +
                        "</body></html>";
        txtStrengthDetails.setText(strCurrentStrength);
        
        txtIntelligenceDetails.setContentType("text/html"); // Allows HTML content
        String strCurrentIntelligence = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Upgrade Cost: </b>" + this.nRuneCost +
                        "<div style='text-align: center;'><b>Current Intelligence: </b>" + CPlayer.getIntelligence() + "</div><br/>" +
                        "</body></html>";
        txtIntelligenceDetails.setText(strCurrentIntelligence);
        
        txtFaithDetails.setContentType("text/html"); // Allows HTML content
        String strCurrentFaith = "<html>" +
                        "<body>" +
                        "<div style='text-align: center;'><b>Upgrade Cost: </b>" + this.nRuneCost +
                        "<div style='text-align: center;'><b>Current Faith: </b>" + CPlayer.getFaith() + "</div><br/>" +
                        "</body></html>";
        txtFaithDetails.setText(strCurrentFaith);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labLevelUpLeft = new javax.swing.JLabel();
        labLevelUpMid = new javax.swing.JLabel();
        labLevelUpRight = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtHealthDetails = new javax.swing.JTextPane();
        txtRuneCount = new javax.swing.JTextPane();
        bBack = new javax.swing.JButton();
        bHealth = new javax.swing.JButton();
        bEndurance = new javax.swing.JButton();
        txtEnduranceDetails = new javax.swing.JTextPane();
        bDexterity = new javax.swing.JButton();
        txtDexterityDetails = new javax.swing.JTextPane();
        txtStrengthDetails = new javax.swing.JTextPane();
        bStrength = new javax.swing.JButton();
        bIntelligence = new javax.swing.JButton();
        txtIntelligenceDetails = new javax.swing.JTextPane();
        bFaith = new javax.swing.JButton();
        txtFaithDetails = new javax.swing.JTextPane();
        labBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labLevelUpLeft.setFont(new java.awt.Font("Serif", 1, 78)); // NOI18N
        labLevelUpLeft.setForeground(new java.awt.Color(238, 233, 211));
        labLevelUpLeft.setText("L");
        getContentPane().add(labLevelUpLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        labLevelUpMid.setFont(new java.awt.Font("Serif", 1, 58)); // NOI18N
        labLevelUpMid.setForeground(new java.awt.Color(238, 233, 211));
        labLevelUpMid.setText("EVEL U");
        getContentPane().add(labLevelUpMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        labLevelUpRight.setFont(new java.awt.Font("Serif", 1, 78)); // NOI18N
        labLevelUpRight.setForeground(new java.awt.Color(238, 233, 211));
        labLevelUpRight.setText("P");
        getContentPane().add(labLevelUpRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(238, 233, 211));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 190, -1));

        txtHealthDetails.setEditable(false);
        txtHealthDetails.setBackground(new java.awt.Color(230, 210, 135));
        txtHealthDetails.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtHealthDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 50));

        txtRuneCount.setEditable(false);
        txtRuneCount.setBackground(new java.awt.Color(230, 210, 135));
        txtRuneCount.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtRuneCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 30));

        bBack.setBackground(new java.awt.Color(238, 233, 211));
        bBack.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        bBack.setForeground(new java.awt.Color(93, 90, 74));
        bBack.setText("BACK");
        bBack.setFocusable(false);
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 120, 40));

        bHealth.setBackground(new java.awt.Color(238, 233, 211));
        bHealth.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        bHealth.setForeground(new java.awt.Color(93, 90, 74));
        bHealth.setText("LEVEL HEALTH");
        bHealth.setFocusable(false);
        bHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHealthActionPerformed(evt);
            }
        });
        getContentPane().add(bHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 50));

        bEndurance.setBackground(new java.awt.Color(238, 233, 211));
        bEndurance.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        bEndurance.setForeground(new java.awt.Color(93, 90, 74));
        bEndurance.setText("LEVEL ENDURANCE");
        bEndurance.setFocusable(false);
        bEndurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnduranceActionPerformed(evt);
            }
        });
        getContentPane().add(bEndurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 210, 50));

        txtEnduranceDetails.setEditable(false);
        txtEnduranceDetails.setBackground(new java.awt.Color(230, 210, 135));
        txtEnduranceDetails.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEnduranceDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 210, 50));

        bDexterity.setBackground(new java.awt.Color(238, 233, 211));
        bDexterity.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        bDexterity.setForeground(new java.awt.Color(93, 90, 74));
        bDexterity.setText("LEVEL DEXTERITY");
        bDexterity.setFocusable(false);
        bDexterity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDexterityActionPerformed(evt);
            }
        });
        getContentPane().add(bDexterity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 210, 50));

        txtDexterityDetails.setEditable(false);
        txtDexterityDetails.setBackground(new java.awt.Color(230, 210, 135));
        txtDexterityDetails.setForeground(new java.awt.Color(255, 255, 255));
        txtDexterityDetails.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDexterityDetails.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDexterityDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 210, 50));

        txtStrengthDetails.setEditable(false);
        txtStrengthDetails.setBackground(new java.awt.Color(230, 210, 135));
        txtStrengthDetails.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtStrengthDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, 50));

        bStrength.setBackground(new java.awt.Color(238, 233, 211));
        bStrength.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        bStrength.setForeground(new java.awt.Color(93, 90, 74));
        bStrength.setText("LEVEL STRENGTH");
        bStrength.setFocusable(false);
        bStrength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStrengthActionPerformed(evt);
            }
        });
        getContentPane().add(bStrength, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, 50));

        bIntelligence.setBackground(new java.awt.Color(238, 233, 211));
        bIntelligence.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        bIntelligence.setForeground(new java.awt.Color(93, 90, 74));
        bIntelligence.setText("LEVEL INTELLIGENCE");
        bIntelligence.setFocusable(false);
        bIntelligence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIntelligenceActionPerformed(evt);
            }
        });
        getContentPane().add(bIntelligence, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 210, 50));

        txtIntelligenceDetails.setEditable(false);
        txtIntelligenceDetails.setBackground(new java.awt.Color(230, 210, 135));
        txtIntelligenceDetails.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtIntelligenceDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 210, 50));

        bFaith.setBackground(new java.awt.Color(238, 233, 211));
        bFaith.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        bFaith.setForeground(new java.awt.Color(93, 90, 74));
        bFaith.setText("LEVEL FAITH");
        bFaith.setFocusable(false);
        bFaith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFaithActionPerformed(evt);
            }
        });
        getContentPane().add(bFaith, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 210, 50));

        txtFaithDetails.setEditable(false);
        txtFaithDetails.setBackground(new java.awt.Color(230, 210, 135));
        txtFaithDetails.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtFaithDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 210, 50));

        labBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mco2_ang_balbastro/Backgrounds/LevelUp.jpg"))); // NOI18N
        getContentPane().add(labBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 980, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Opens the Game Lobby again when Back button is pressed
     * @param evt 
     */
    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new GameLobby(CPlayer).setVisible(true);
            this.dispose();
        });
    }//GEN-LAST:event_bBackActionPerformed

    /**
     * Increases the Player's health stat by 1 level if Player has enough runes.
     * @param evt 
     */
    private void bHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHealthActionPerformed
        int nLackingRunes = this.nRuneCost - CPlayer.getRunes();
        
        if(CPlayer.getHealth() < 50 && nLackingRunes < 0){
            CPlayer.increaseLevel(1);
            CPlayer.setHealth(CPlayer.getHealth() + 1);
            CPlayer.spendRunes(this.nRuneCost);
            JOptionPane.showMessageDialog(this, "Your health is now Level " + CPlayer.getHealth() + "\nPlayer Level: " + CPlayer.getPlayerLevel(), "Upgrade successful", JOptionPane.INFORMATION_MESSAGE);
            
            //Update details
            displayDetails(CPlayer);
        }

        else if(CPlayer.getHealth() >= 50){
            JOptionPane.showMessageDialog(this, "Your health is already Level 50", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(nLackingRunes > 0){
            
            JOptionPane.showMessageDialog(this, "Not enough runes\nYou need " + nLackingRunes + " more runes" , "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bHealthActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        displayDetails(CPlayer); //change placement, must update every upgrade
    }//GEN-LAST:event_formWindowOpened

    /**
     * Increases the Player's endurance stat by 1 level if Player has enough runes.
     * @param evt 
     */
    private void bEnduranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnduranceActionPerformed
       int nLackingRunes = this.nRuneCost - CPlayer.getRunes();

       if (CPlayer.getEndurance() < 50 && nLackingRunes < 0) {
            CPlayer.increaseLevel(1);
            CPlayer.setEndurance(CPlayer.getEndurance() + 1);
            CPlayer.spendRunes(this.nRuneCost);
            JOptionPane.showMessageDialog(this, "Your endurance is now Level " + CPlayer.getEndurance() + "\nPlayer Level: " + CPlayer.getPlayerLevel(), "Upgrade successful", JOptionPane.INFORMATION_MESSAGE);

            // Update details
            displayDetails(CPlayer);
        } else if (CPlayer.getEndurance() >= 50) {
            JOptionPane.showMessageDialog(this, "Your endurance is already Level 50", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        } else if (nLackingRunes > 0) {
            JOptionPane.showMessageDialog(this, "Not enough runes\nYou need " + nLackingRunes + " more runes", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bEnduranceActionPerformed

    /**
     * Increases the Player's dexterity stat by 1 level if Player has enough runes.
     * @param evt 
     */
    private void bDexterityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDexterityActionPerformed

        int nLackingRunes = this.nRuneCost - CPlayer.getRunes();

        if (CPlayer.getDexterity() < 50 && nLackingRunes < 0) {
            CPlayer.increaseLevel(1);
            CPlayer.setDexterity(CPlayer.getDexterity() + 1);
            CPlayer.spendRunes(this.nRuneCost);
            JOptionPane.showMessageDialog(this, "Your dexterity is now Level " + CPlayer.getDexterity() + "\nPlayer Level: " + CPlayer.getPlayerLevel(), "Upgrade successful", JOptionPane.INFORMATION_MESSAGE);

            // Update details
            displayDetails(CPlayer);
        } else if (CPlayer.getDexterity() >= 50) {
            JOptionPane.showMessageDialog(this, "Your dexterity is already Level 50", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        } else if (nLackingRunes > 0) {
            JOptionPane.showMessageDialog(this, "Not enough runes\nYou need " + nLackingRunes + " more runes", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDexterityActionPerformed

    /**
     * Increases the Player's strength stat by 1 level if Player has enough runes.
     * @param evt 
     */
    private void bStrengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStrengthActionPerformed
        int nLackingRunes = this.nRuneCost - CPlayer.getRunes();

        if (CPlayer.getStrength() < 50 && nLackingRunes < 0) {
            CPlayer.increaseLevel(1);
            CPlayer.setStrength(CPlayer.getStrength() + 1);
            CPlayer.spendRunes(this.nRuneCost);
            JOptionPane.showMessageDialog(this, "Your strength is now Level " + CPlayer.getStrength() + "\nPlayer Level: " + CPlayer.getPlayerLevel(), "Upgrade successful", JOptionPane.INFORMATION_MESSAGE);

            // Update details
            displayDetails(CPlayer);
        } else if (CPlayer.getStrength() >= 50) {
            JOptionPane.showMessageDialog(this, "Your strength is already Level 50", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        } else if (nLackingRunes > 0) {
            JOptionPane.showMessageDialog(this, "Not enough runes\nYou need " + nLackingRunes + " more runes", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bStrengthActionPerformed

    /**
     * Increases the Player's intelligence stat by 1 level if Player has enough runes.
     * @param evt 
     */
    private void bIntelligenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIntelligenceActionPerformed
        int nLackingRunes = this.nRuneCost - CPlayer.getRunes();

        if (CPlayer.getIntelligence() < 50 && nLackingRunes < 0) {
            CPlayer.increaseLevel(1);
            CPlayer.setIntelligence(CPlayer.getIntelligence() + 1);
            CPlayer.spendRunes(this.nRuneCost);
            JOptionPane.showMessageDialog(this, "Your intelligence is now Level " + CPlayer.getIntelligence() + "\nPlayer Level: " + CPlayer.getPlayerLevel(), "Upgrade successful", JOptionPane.INFORMATION_MESSAGE);

            // Update details
            displayDetails(CPlayer);
        } else if (CPlayer.getIntelligence() >= 50) {
            JOptionPane.showMessageDialog(this, "Your intelligence is already Level 50", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        } else if (nLackingRunes > 0) {
            JOptionPane.showMessageDialog(this, "Not enough runes\nYou need " + nLackingRunes + " more runes", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bIntelligenceActionPerformed
    
    /**
     * Increases the Player's faith stat by 1 level if Player has enough runes.
     * @param evt 
     */
    private void bFaithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFaithActionPerformed
        int nLackingRunes = this.nRuneCost - CPlayer.getRunes();

        if (CPlayer.getFaith() < 50 && nLackingRunes < 0) {
            CPlayer.increaseLevel(1);
            CPlayer.setFaith(CPlayer.getFaith() + 1);
            CPlayer.spendRunes(this.nRuneCost);
            JOptionPane.showMessageDialog(this, "Your faith is now Level " + CPlayer.getFaith() + "\nPlayer Level: " + CPlayer.getPlayerLevel(), "Upgrade successful", JOptionPane.INFORMATION_MESSAGE);

            // Update details
            displayDetails(CPlayer);
        } else if (CPlayer.getFaith() >= 50) {
            JOptionPane.showMessageDialog(this, "Your faith is already Level 50", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        } else if (nLackingRunes > 0) {
            JOptionPane.showMessageDialog(this, "Not enough runes\nYou need " + nLackingRunes + " more runes", "Upgrade rejected", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bFaithActionPerformed

    /**
     * Sets the rune cost.
     */
    public void setRuneCost(){
        this.nRuneCost = (CPlayer.getPlayerLevel() * 100)/2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bDexterity;
    private javax.swing.JButton bEndurance;
    private javax.swing.JButton bFaith;
    private javax.swing.JButton bHealth;
    private javax.swing.JButton bIntelligence;
    private javax.swing.JButton bStrength;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labBackground;
    private javax.swing.JLabel labLevelUpLeft;
    private javax.swing.JLabel labLevelUpMid;
    private javax.swing.JLabel labLevelUpRight;
    private javax.swing.JTextPane txtDexterityDetails;
    private javax.swing.JTextPane txtEnduranceDetails;
    private javax.swing.JTextPane txtFaithDetails;
    private javax.swing.JTextPane txtHealthDetails;
    private javax.swing.JTextPane txtIntelligenceDetails;
    private javax.swing.JTextPane txtRuneCount;
    private javax.swing.JTextPane txtStrengthDetails;
    // End of variables declaration//GEN-END:variables
}