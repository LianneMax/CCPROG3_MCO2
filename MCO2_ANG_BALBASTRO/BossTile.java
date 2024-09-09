/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mco2_ang_balbastro;

/**
 * Represents a special tile on the game board that contains a boss enemy.
 * Boss tiles can be disabled after one use and locked/unlocked.
 * Provides methods for generating a boss.
 * Child class of Tile.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 2.0
 */
public class BossTile extends Tile {
    /**
     * The Enabled state of the Boss Tile
     */
    private boolean isEnabled;
    
    /**
     * The Boss container
     */
    private Enemy CBoss;
    
    /**
     * The Runes that this BossTile could reward the player
     */
    private int nRunes;
    
    /**
     * Sole constructor. Requires the unlocked state of the tile upon creation.
     * @param isUnlocked 
     */
    BossTile(boolean isUnlocked){
        super(isUnlocked);
        this.isEnabled = true;
    }
    
    /**
     * Gives Runes to a specified Player.
     * @param CPlayer 
     */
    public void giveRunes(Player CPlayer){
        CPlayer.addRunes(nRunes);
    }
    
    /**
     * Generates a Boss.
     * @param nAreaIndex
     * @param strAreaName 
     */
    public void generateBoss(int nAreaIndex, String strAreaName){
        this.CBoss = new Enemy(nAreaIndex, strAreaName);
        
        String strName[] = {"Godrick the Grafted", "Rennala, Queen of the Full Moon", "The Elden Beast"};
                            
        int nHealth[][] = {{200, 200}, {400, 400}, {800, 800}};
        int nAttack[][] = {{150, 300}, {200, 300}, {250, 500}};
        double nDef[][] = {{0.35, 0.20, 0.15}, {0.15, 0.35, 0.25}, {0.25, 0.50, 0.40}};
               
        this.CBoss.setEnemyType(4); 
        this.CBoss.setHealth(nHealth[nAreaIndex - 1]);
        this.CBoss.setAttack(nAttack[nAreaIndex - 1]);

        CBoss.setPhysDef(nDef[nAreaIndex - 1][0]);
        CBoss.setSorcDef(nDef[nAreaIndex - 1][1]);
        CBoss.setIncaDef(nDef[nAreaIndex - 1][2]);

        this.CBoss.setName(strName[nAreaIndex - 1]);
        disable();
    }
    
    /**
     * Disables the Tile.
     */
    public void disable(){
        this.isEnabled = false;
    }
    
    /**
     * Gets isEnabled.
     * @return this.isEnabled
     */
    public boolean getIsEnabled(){
        return this.isEnabled;
    }
    
    /**
     * Gets the Boss contained in this Tile.
     * @return this.CBoss
     */
    public Enemy getBoss(){
        return this.CBoss;
    }
    
}
