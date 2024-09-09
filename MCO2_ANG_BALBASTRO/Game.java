/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mco2_ang_balbastro;

/**
 * Opens the TitleMenu to start the game.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 1.0
 */
public class Game {
    public void run(){
        java.awt.EventQueue.invokeLater(() -> {
            new TitleMenu().setVisible(true);
        });
    }
}
