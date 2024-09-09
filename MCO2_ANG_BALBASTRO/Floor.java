package mco2_ang_balbastro;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * An array of tiles
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 2.0
 */
public class Floor {
    private javax.swing.JFrame FloorFrame;
    private ArrayList<javax.swing.JLabel> FloorBack;
    
    private ArrayList<Tile> Tiles;
    private ArrayList<javax.swing.JLabel> TileLabels;
    private javax.swing.JLabel PlayerSprite;
    
    public Floor(){
        setFloorFrames(new javax.swing.JFrame());
        setFloorBack(new ArrayList<javax.swing.JLabel>());
        
        setTiles(new ArrayList<Tile>());
        setTileLabels(new ArrayList<javax.swing.JLabel>());
        setPlayerSprite(new javax.swing.JLabel());
    }
    
     public ArrayList<javax.swing.JLabel> getFloorBack(){
        return this.FloorBack;
    }
    
    public void setFloorBack(ArrayList<javax.swing.JLabel> FloorBack){
        this.FloorBack = FloorBack;
    }
    
    public javax.swing.JLabel getPlayerSprite(){
        return this.PlayerSprite;
    }
    
    public void setPlayerSprite(javax.swing.JLabel PlayerSprite){
        this.PlayerSprite = PlayerSprite;
    }
   
    
    public javax.swing.JFrame getFloorFrames(){
        return this.FloorFrame;
    }
    
    public void setFloorFrames(javax.swing.JFrame FloorFrame){
        this.FloorFrame = FloorFrame;
    }
    
    public ArrayList<Tile> getTiles(){
        return this.Tiles;
    }
    
    public void setTiles(ArrayList<Tile> aTiles){
        this.Tiles = aTiles;
    }
    
    public ArrayList<javax.swing.JLabel> getTileLabels(){
        return this.TileLabels;
    }
    
    public void setTileLabels(ArrayList<javax.swing.JLabel> TileLabels){
        this.TileLabels = TileLabels;
    }
    
}
