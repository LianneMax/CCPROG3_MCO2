/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mco2_ang_balbastro;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Displays a screen and facilitates an in-game Battle.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 1.0
 */
public class Battle extends javax.swing.JFrame {
    private Player CPlayer;
    private Enemy CEnemy;
    private boolean isOver; 
    private boolean isBoss;
    
    private Random randomGenerator;
    private ArrayList<Weapon> weaponList;
    private boolean isPlayerTurn;


    
    /**
     * Sole constructor. Requires a Player and an Enemy for creation.
     * @param CPlayer
     * @param CEnemy 
     */
    public Battle(Player CPlayer, Enemy CEnemy) {
        this.CPlayer = CPlayer;
        this.CEnemy = CEnemy;
        this.isOver = false;
        this.isBoss = isBoss;
        
        weaponList = Weapon.initializeWeapons();
        this.randomGenerator = new Random();
        isPlayerTurn = true;
        initComponents();
        updateBattleDetails();
        initializeHealthBars();
        updateHealthBars();

      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneDetails = new javax.swing.JScrollPane();
        txtBattleDetails = new javax.swing.JTextPane();
        labGame = new javax.swing.JLabel();
        labG = new javax.swing.JLabel();
        labY = new javax.swing.JLabel();
        labPlayer = new javax.swing.JLabel();
        labEnemy = new javax.swing.JLabel();
        healthPlayer = new javax.swing.JProgressBar();
        healthEnemy = new javax.swing.JProgressBar();
        boxSelectAttack = new javax.swing.JComboBox<>();
        bDodge = new javax.swing.JButton();
        txtEnemyDetails = new javax.swing.JTextField();
        panelUnderline = new javax.swing.JPanel();
        labBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBattleDetails.setEditable(false);
        txtBattleDetails.setBackground(new java.awt.Color(204, 204, 255));
        txtBattleDetails.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        paneDetails.setViewportView(txtBattleDetails);

        getContentPane().add(paneDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 330, 70));

        labGame.setFont(new java.awt.Font("Serif", 1, 58)); // NOI18N
        labGame.setForeground(new java.awt.Color(255, 255, 255));
        labGame.setText("ATTL");
        getContentPane().add(labGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        labG.setFont(new java.awt.Font("Serif", 1, 78)); // NOI18N
        labG.setForeground(new java.awt.Color(255, 255, 255));
        labG.setText("B");
        getContentPane().add(labG, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        labY.setFont(new java.awt.Font("Serif", 1, 78)); // NOI18N
        labY.setForeground(new java.awt.Color(255, 255, 255));
        labY.setText("E");
        labY.setToolTipText("");
        labY.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(labY, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        labPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mco2_ang_balbastro/Backgrounds/Player_Battle.png"))); // NOI18N
        getContentPane().add(labPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
        getContentPane().add(labEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 110, 140));

        healthPlayer.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        healthPlayer.setForeground(new java.awt.Color(60, 62, 106));
        getContentPane().add(healthPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 20));

        healthEnemy.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        healthEnemy.setForeground(new java.awt.Color(60, 62, 106));
        healthEnemy.setValue(90);
        getContentPane().add(healthEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, 20));

        boxSelectAttack.setBackground(new java.awt.Color(204, 204, 255));
        boxSelectAttack.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        boxSelectAttack.setForeground(new java.awt.Color(93, 90, 74));
        boxSelectAttack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATTACK", "PHYSICAL", "SORCERY", "INCANTATION" }));
        boxSelectAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSelectAttackActionPerformed(evt);
            }
        });
        getContentPane().add(boxSelectAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 150, 40));

        bDodge.setBackground(new java.awt.Color(204, 204, 255));
        bDodge.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bDodge.setForeground(new java.awt.Color(93, 90, 74));
        bDodge.setText("DODGE");
        bDodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodgeActionPerformed(evt);
            }
        });
        getContentPane().add(bDodge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 160, 40));

        txtEnemyDetails.setEditable(false);
        txtEnemyDetails.setBackground(new java.awt.Color(204, 204, 255));
        txtEnemyDetails.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        txtEnemyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnemyDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnemyDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 150, 50));

        panelUnderline.setBackground(new java.awt.Color(60, 62, 106));

        javax.swing.GroupLayout panelUnderlineLayout = new javax.swing.GroupLayout(panelUnderline);
        panelUnderline.setLayout(panelUnderlineLayout);
        panelUnderlineLayout.setHorizontalGroup(
            panelUnderlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panelUnderlineLayout.setVerticalGroup(
            panelUnderlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(panelUnderline, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 330, -1));

        labBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mco2_ang_balbastro/Backgrounds/GameLobby.jpg"))); // NOI18N
        getContentPane().add(labBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
private void playerAttack(String attackType) {
    int damage = calculatePlayerDamage(attackType);
    CEnemy.takeDamage(damage);
    updateHealthBars();
    addBattleDetails(CPlayer.getName() + " used " + attackType + " and dealt " + damage + " damage!");
    if (CEnemy.getCurrentHealth() <= 0) {
        endBattle(true);
    } else {
        // It's now the enemy's turn, but we still want to update the battle details to show the incoming damage
        isPlayerTurn = false; // Set the turn to enemy's before updating details
        updateBattleDetails(); // Update battle details for the enemy's turn
        enemyTurn();
    }
}

    
      // This method calculates the player's damage based on the selected attack type.
    private int calculatePlayerDamage(String attackType) {
    int damage = 0;
    double enemyDefense = 0.0;
    int equippedWeaponIndex = CPlayer.getEquippedWeaponIndex(); // Retrieve the equipped weapon index

    if (equippedWeaponIndex >= 0 && equippedWeaponIndex < CPlayer.getWeapons().size()) {
        Weapon equippedWeapon = CPlayer.getWeapons().get(equippedWeaponIndex); // Retrieve the equipped weapon

        switch (attackType.toUpperCase()) {
            case "PHYSICAL":
                damage = (int) ((CPlayer.getStrength() + equippedWeapon.getStrength()) * (1 - CEnemy.getPhysDef()));
                break;
            case "SORCERY":
                damage = (int) ((CPlayer.getIntelligence() + equippedWeapon.getIntelligence()) * (1 - CEnemy.getSorcDef()));
                break;
            case "INCANTATION":
                damage = (int) ((CPlayer.getFaith() + equippedWeapon.getFaith()) * (1 - CEnemy.getIncaDef()));
                break;
            default:
                break;
        }
    }

    return damage;
    }
    
private void playerDodge() {
    if (successfulDodge()) {
        addBattleDetails(CPlayer.getName() + " successfully dodged the attack!");
    } else {
        int damage = calculateEnemyDamage();
        CPlayer.setHealth(CPlayer.getHealth() - damage);
        updateHealthBars();
        addBattleDetails(CPlayer.getName() + " failed to dodge and took " + damage + " damage!");
        if (CPlayer.getHealth() <= 0) {
            endBattle(false);
        }
    }
}

private boolean successfulDodge() {
    int dodgeRate = CPlayer.getDodgeRate(); 
    int dodgeRoll = randomGenerator.nextInt(100)+ 1;
    return dodgeRoll < dodgeRate;
}

private void enemyTurn() {
    if (!successfulDodge()) {
        int damage = calculateEnemyDamage();
        CPlayer.setHealth(CPlayer.getHealth() - damage);
        updateHealthBars(); 
        
        String enemyAttackDetail = CEnemy.getName() + " attacks and deals " + damage + " damage!";
        addBattleDetails(enemyAttackDetail);
        
        if (CPlayer.getHealth() <= 0) {
            endBattle(false);
        }
    } else {
        String dodgeDetail = CPlayer.getName() + " dodged the attack!";
        addBattleDetails(dodgeDetail);
    }
    // Add a slight delay here if you want the message to show up after the text updates.
    try {
        Thread.sleep(500); // Wait for half a second.
    } catch (InterruptedException ex) {
        // Handle exception if needed.
    }
    // Show a prompt for the enemy turn.
    JOptionPane.showMessageDialog(null, "It's the enemy's turn!", "Enemy Turn", JOptionPane.INFORMATION_MESSAGE);
}  
    
private int calculateEnemyDamage() {
    int attackValue = randomGenerator.nextInt(CEnemy.getFinalAttack() - CEnemy.getBaseAttack() + 1) + CEnemy.getBaseAttack();
    return attackValue; // Do not multiply by area index unless specified in your game rules
}

// Call this method at the start of the battle to initialize the health bars
private void initializeHealthBars() {
    healthPlayer.setMaximum(CPlayer.getMaxHealth());
    healthPlayer.setValue(CPlayer.getHealth());

    healthEnemy.setMaximum(CEnemy.getFinalHealth());
    healthEnemy.setValue(CEnemy.getCurrentHealth());
}

// Call this method every time the health of the player or enemy changes
private void updateHealthBars() {
    healthPlayer.setValue(CPlayer.getHealth());
    healthEnemy.setValue(CEnemy.getCurrentHealth());
}

private void endBattle(boolean playerWon) {
    isOver = true;
    int runesGained;
    String message;

    if (playerWon) {
        // The player won the battle
        if (isBoss) {
            runesGained = CEnemy.getFinalHealth() * 5;
            message = "GREAT ENEMY FELLED!";
        } else {
            runesGained = CEnemy.getFinalHealth() * 2;
            message = "ENEMY FELLED!";
        }

        CPlayer.addRunes(runesGained);
        JOptionPane.showMessageDialog(this, message + "\n" + CPlayer.getName() + " gained " + runesGained + " runes.", "Battle Won", JOptionPane.INFORMATION_MESSAGE);

        // Update battle details with the result message
        addBattleDetails(message + " " + CPlayer.getName() + " gained " + runesGained + " runes.");

        // Return to the area, keeping the damage taken
        this.dispose();
        // Assuming you have a reference to the Area class, make it visible again.
        // area.setVisible(true); // You need to pass the reference to the Area instance to the Battle class.
    } else {
        // The player lost the battle
        runesGained = 0;
        message = "YOU DIED. " + CPlayer.getName() + " has been defeated.";

        CPlayer.setRunes(runesGained); // runesGained is 0 here
        CPlayer.setHealth(CPlayer.getCurrentHealth());

        JOptionPane.showMessageDialog(this, message, "Battle Lost", JOptionPane.INFORMATION_MESSAGE);
        
        // Update battle details with the result message
        addBattleDetails(message);

        // Return to the Game Lobby since the player died
        this.dispose();
        new GameLobby(CPlayer).setVisible(true);
    }
}


    private void addBattleDetails(String text) {
        txtBattleDetails.setText(txtBattleDetails.getText() + "\n" + text);
    }

private void updateBattleDetails() {
    int potentialEnemyDamage = calculatePotentialEnemyDamage();
    String enemyDetails = String.format("Area Name: %s\n Enemy Type: %s\n Enemy Name: %s",
                                        CEnemy.getAreaName(),
                                        CEnemy.getEnemyType(),
                                        CEnemy.getName());

    txtEnemyDetails.setText(enemyDetails); // Set the text to the txtEnemyDetails JTextField

    String battleDetails = """
                         Battle Start!
                         Player HP: %d
                         Enemy HP: %d
                         Incoming Enemy Damage: %d
                         %s""".formatted(
                             CPlayer.getMaxHealth(),
                             CEnemy.getFinalHealth(),
                             potentialEnemyDamage,
                             (isPlayerTurn ? "Player's turn." : "Enemy's turn.")
                         );

    txtBattleDetails.setText(battleDetails);
}

// This method calculates the potential damage an enemy could do.
private int calculatePotentialEnemyDamage() {
    
    int lowAttack = CEnemy.getBaseAttack();
    int highAttack = CEnemy.getFinalAttack();

    int averageAttack = (lowAttack + highAttack) / 2;
    return averageAttack; 
}
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void bDodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodgeActionPerformed
        playerDodge();
    }//GEN-LAST:event_bDodgeActionPerformed

    private void boxSelectAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSelectAttackActionPerformed
        String attackType = boxSelectAttack.getSelectedItem().toString();
        if (!attackType.equals("ATTACK")) { // "ATTACK" is not an attack type, it's a prompt in the combobox
            playerAttack(attackType);
        }
    }//GEN-LAST:event_boxSelectAttackActionPerformed

    private void txtEnemyDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnemyDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnemyDetailsActionPerformed

    /**
     * Gets the truth value of the game-over state
     * @return the truth value of isOver
     */
    public boolean getIsOver(){
        return this.isOver;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDodge;
    private javax.swing.JComboBox<String> boxSelectAttack;
    private javax.swing.JProgressBar healthEnemy;
    private javax.swing.JProgressBar healthPlayer;
    private javax.swing.JLabel labBackground;
    private javax.swing.JLabel labEnemy;
    private javax.swing.JLabel labG;
    private javax.swing.JLabel labGame;
    private javax.swing.JLabel labPlayer;
    private javax.swing.JLabel labY;
    private javax.swing.JScrollPane paneDetails;
    private javax.swing.JPanel panelUnderline;
    private javax.swing.JTextPane txtBattleDetails;
    private javax.swing.JTextField txtEnemyDetails;
    // End of variables declaration//GEN-END:variables
} 
