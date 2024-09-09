/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mco2_ang_balbastro;

/**
 * Represents generic function tiles in the game.
 * Parent class of SpawnTile and BossTile.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 1.0
 */
public class Tile {
    /**
     * The Tile's unlocked status 
     */
    private boolean isUnlocked;
    
    /**
     * The Tile's touched status
     */
    private boolean isTouched;
    
    /**
     * The Tile's graphical representation
     */
    protected javax.swing.JLabel tileLabel;
    
    /**
     * Sole constructor. 
     * Specifies the unlocked state of the tile.
     * @param isUnlocked 
     */
    Tile(boolean isUnlocked){
        this.isUnlocked = isUnlocked;
        this.isTouched = false;
        this.tileLabel = new javax.swing.JLabel();
    }
    
    public javax.swing.JLabel getLabel(){
        return this.tileLabel;
    }
        
    public void setLabel(javax.swing.JLabel tileLabel){
        this.tileLabel = tileLabel;
    }
    
    /**
     * Gets the touched status of the tile.
     * @return the touched status of the tile
     */
    public boolean getIsTouched(){
        return this.isTouched;
    }
    
    /**
     * Sets the touched status of the tile.
     * @param isTouched 
     */
    public void setIsTouched(boolean isTouched){
        this.isTouched = isTouched;
    }
    
    
    
}
