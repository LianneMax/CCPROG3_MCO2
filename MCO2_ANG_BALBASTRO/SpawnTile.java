/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mco2_ang_balbastro;

import java.util.Random;

/**
 * Represents a Spawn Tile in the game.
 * Spawn tiles can be disabled after one use.
 * Child class of Tile.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 2.0
 */
public class SpawnTile extends Tile {
    /**
     * The SpawnTile's enabled state
     */
    private boolean isEnabled;
    
    /**
     * The Enemy stored in the SpawnTile
     */
    private Enemy CEnemy;
    
    /**
     * The treasure stored in the SpawnTile
     */
    private int nRunes;
    
    /**
     * The status of this tile's choice of spawning an enemy
     */
    private boolean pickedEnemy;
    
    /**
     * The status of this tile's choice of spawning an enemy
     */
    private boolean pickedRunes;
    
    /**
     * Sole constructor.
     * 
     * Specifies whether the Tile is Locked or Unlocked
     * Is enabled for spawning at the start.
     * @param isUnlocked 
     */
    SpawnTile(boolean isUnlocked){
        super(isUnlocked);
        this.isEnabled = true;
        this.nRunes = 0;
        
        this.pickedEnemy = false;
        this.pickedRunes = false;
    }
    
    /**
     * Chooses between spawning an enemy or treasure.
     * 
     * Enemies have a 75% chance of spawning.
     * Treasure Runes have a 25% chance of spawning.
     * @param CPlayer
     * @param nAreaIndex
     * @param strAreaName 
     */
    public void spawn(Player CPlayer, int nAreaIndex, String strAreaName){
        if(isEnabled && super.getIsTouched() && nAreaIndex != 3){
            Random random = new Random();
           //Chooses between 0-3
           //0 - Runes (25% or 1/4 chance), 1 to 3 - Enemy (75% or 3/4 chance)
           int nChoice = random.nextInt(3);

           if(nChoice > 0){
               pickedEnemy = true;
               generateEnemy(nAreaIndex, strAreaName);
               System.out.println("ENEMY, " + nChoice);
           }
           else{
               pickedRunes = true;
               generateRunes();
               System.out.println("Runes, " + nChoice);
           }
        }
        
        //if player is in Elden Throne
        else{
            pickedRunes = true;
            generateRunes();
        }

    }
    
    /**
     * Generates random amount of Runes from 50 - 150.
     */
    public void generateRunes(){
        Random random = new Random();
        this.nRunes = random.nextInt(50, 150);
    }
    
    /**
     * Gives runes to the given Player.
     * @param CPlayer 
     */
    public void giveRunes(Player CPlayer){
        CPlayer.addRunes(nRunes);
    }
    
    /**
     * Generates an enemy.
     * @param nAreaIndex
     * @param strAreaName 
     */
    public void generateEnemy(int nAreaIndex, String strAreaName){
        this.CEnemy = new Enemy(nAreaIndex, strAreaName);
        
        String strName[][] = {{"Godrick Soldier", "Godrick Archer", "Godrick Knight"},
                                {"Living Jar", "Glintstone Sorcerer", "Battlemage"}};
                            
        int nHealth[][] = {{20, 30}, {25, 35}, {70, 80}};
        int nAttack[][] = {{70, 80}, {110, 120}, {120, 130}};
        double nDef[][] = {{0.20, 0.15, 0.10}, {0.50, 0.15, 0.20}, {0.25, 0.25, 0.20}};       
        
        
        int nChoice = generateRandomNum(0,2);
        
        this.CEnemy.setHealth(nHealth[nChoice]);
        this.CEnemy.setAttack(nAttack[nChoice]);
        this.CEnemy.setPhysDef(nDef[nChoice][0]);
        this.CEnemy.setSorcDef(nDef[nChoice][1]);
        this.CEnemy.setIncaDef(nDef[nChoice][2]);

        this.CEnemy.setEnemyType(nChoice + 1);
        this.CEnemy.setName(strName[this.CEnemy.getAreaIndex()-1][nChoice]);
    }
    
    /**
     * Generates a random Integer given two specified lower and upper bounds
     * @param nLower
     * @param nUpper
     * @return 
     */
    public int generateRandomNum(int nLower, int nUpper){
        Random random = new Random();
        return random.nextInt(nLower,nUpper);
    }
    
    /**
     * Disables the tile for spawning.
     */
    public void disable(){
        this.isEnabled = false;
    }
    
    /**
     * Gets the enabled status of the tile.
     * @return the enabled status of the tile
     */
    public boolean getIsEnabled(){
        return this.isEnabled;
    }
        
    /**
     * Gets the enemy stored in the tile.
     * @return the enemy stored in the tile.
     */
    public Enemy getEnemy(){
        return this.CEnemy;
    }
    
    /**
     * Gets the runes stored in the tile.
     * @return the runes stored in the tile.
     */
    public int getRunes(){
        return this.nRunes;
    }
    
    /**
     * Gets the status of the tile's spawn choice.
     * @return the status of the picked enemy choice
     */
    public boolean getPickedEnemy(){
        return this.pickedEnemy;
    }
        
    /**
     * Gets the status of the tile's spawn choice.
     * @return the status of the picked runes choice
     */
    public boolean getPickedRunes(){
        return this.pickedRunes;
    }
   
}
