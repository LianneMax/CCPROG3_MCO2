package mco2_ang_balbastro;

import java.util.ArrayList;

/**
 * Represents a player in the game.
 * This class provides methods to manage player attributes and actions.
 * 
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 * @version 2.0
 */
public class Player {
    private String strName;
    private int nPlayer_Level;
    private String strJobClass;

    private int maxHealth;
    private int nHealth;
    private int currentHealth;

    private int nDexterity;
    private int nIntelligence;
    private int nEndurance;
    private int nStrength;
    private int nFaith;

    private int nRunes;

    private ArrayList<Weapon> weapons;
    private int equippedWeaponIndex = -1;
    private ArrayList<Boolean> weaponOwnership;

    private int nCurrentFloor;
    private boolean isInteracting;
    private int[] clearedAreas = {0, 0, 0};
    private int[] lastPosition = {0, 0};

    /**
     * Sole constructor for Player.
     * Initializes the Player's number of Runes to 0.
     */
    public Player() {
        this.nRunes = 100000;
        this.weapons = new ArrayList<>();
        this.currentHealth = this.maxHealth;


        this.equippedWeaponIndex = -1;
        weaponOwnership = new ArrayList<>();
                for(int i = 0; i < 24; i++) {
            weaponOwnership.add(false);
        }

        clearedAreas[0] = 1; //TODO: REMOVE BEFORE SUBMISSION
        clearedAreas[1] = 1;
        
        this.nCurrentFloor = 0;
        setInteractStatus(false);

    }
         
    public void calculateMaxHealth() {
        int weaponHealthBonus = 0;
        if (equippedWeaponIndex >= 0 && equippedWeaponIndex < weapons.size()) {
            Weapon equippedWeapon = weapons.get(equippedWeaponIndex);
            weaponHealthBonus = equippedWeapon.getHp();
        }
        this.maxHealth = 100 * ((nHealth + weaponHealthBonus) / 2);
        this.currentHealth = maxHealth;
    }

    public int getDodgeRate() {
        int weaponEnduranceBonus = 0;

        if (equippedWeaponIndex >= 0 && equippedWeaponIndex < weapons.size()) {
            weaponEnduranceBonus = weapons.get(equippedWeaponIndex).getEndurance();
        }

        return 20 + ((nEndurance + weaponEnduranceBonus) / 2);
    }

    public ArrayList<Weapon> getWeapons() {
        return this.weapons;
    }
    
    public int[] getClearedAreas(){
        return this.clearedAreas;
    }

    public int[] getLastPosition(){
        return this.lastPosition;
    }

    public void setLastPosition(int x, int y){
        this.lastPosition[0] = x;
        this.lastPosition[1] = y;
    }

    public int getCurrentFloor(){
        return this.nCurrentFloor;
    }

    public void setCurrentFloor(int nCurrentFloor){
        this.nCurrentFloor = nCurrentFloor;
    }

    public boolean getInteractStatus(){
        return this.isInteracting;
    }

    public void setInteractStatus(boolean isInteracting){
        this.isInteracting = isInteracting;
    }

    public void acquireWeapon(int index) {
        weaponOwnership.set(index, true);

    }

    public boolean isWeaponOwned(int index) {
        return weaponOwnership.get(index);
    }

    public void increaseLevel(int nAddedLevel) {
        this.nPlayer_Level += nAddedLevel;
    }

    public void addRunes(int nAddedRunes) {
        this.nRunes += nAddedRunes;
    }

    public void spendRunes(int nCost) {
        this.nRunes -= nCost;
    }

    /**
     *
     * @param index
     */
    public void setEquippedWeaponIndex(int index) {
        this.equippedWeaponIndex = index;
    }


    // Getters and Setters
    public String getName() {
        return strName;
    }

    public void setName(String strName) {
        this.strName = strName.substring(0, Math.min(strName.length(), 25));
    }

    public int getPlayerLevel() {
        return nPlayer_Level;
    }

    public void setPlayerLevel(int nPlayer_Level) {
        this.nPlayer_Level = nPlayer_Level;
    }

    public String getJobClass() {
        return strJobClass;
    }

    public void setJobClass(String strJobClass) {
        this.strJobClass = strJobClass;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getHealth() {
        return this.nHealth;
    }

    public void setHealth(int nHealth) {
        this.nHealth = nHealth;
    }

    public int getDexterity() {
        return nDexterity;
    }

    public void setDexterity(int nDexterity) {
        this.nDexterity = nDexterity;
    }

    public int getIntelligence() {
        return nIntelligence;
    }

    public void setIntelligence(int nIntelligence) {
        this.nIntelligence = nIntelligence;
    }

    public int getEndurance() {
        return nEndurance;
    }

    public void setEndurance(int nEndurance) {
        this.nEndurance = nEndurance;
    }

    public int getStrength() {
        return nStrength;
    }

    public void setStrength(int nStrength) {
        this.nStrength = nStrength;
    }

    public int getFaith() {
        return nFaith;
    }

    public void setFaith(int nFaith) {
        this.nFaith = nFaith;
    }

    public int getRunes() {
        return nRunes;
    }

    public void setRunes(int nRunes) {
        this.nRunes = nRunes;
    }

    public int getEquippedWeaponIndex() {
        return this.equippedWeaponIndex;    
    }

}