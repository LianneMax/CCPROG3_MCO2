package mco2_ang_balbastro;

//import java.util.Random;

/**
 * Represents an enemy in a game.
 * Each enemy has a name, type, area, and statistics for health, attack, and defense.
 * 
 * @version 2.0
 * @author ANG, JEREMIAH MAXWELL
 * @author BALBASTRO, LIANNE MAXENE
 */
public class Enemy {
    // This Enemy's name
    private String strName;     

    // This Enemy's type represented as an integer
    private int nEnemyType;

    // The name of the Area that this Enemy belongs to
    private String strAreaName;

    // The Area Index that identifies which Area the Enemy belongs to
    private int nAreaIndex;

    // The list of this Enemy's Base Health and Final Health
    private int[] nHealth;

    // The list of this Enemy's Base Attack and Final Attack statistics
    private int[] nAttack;

    // This Enemy's Physical Defense statistic
    private double fPhysDef;

    // This Enemy's Sorcery Defense statistic
    private double fSorcDef;

    // This Enemy's Incantation Defense statistic
    private double fIncaDef;
    
    // This Enemy's Current Health statistic
    private int currentHealth;

    /**
     * Constructor for the Enemy class, initializing with the area index and area name.
     * Note: Make sure to initialize health and attack arrays before using them.
     * 
     * @param nAreaIndex The index of the area where the enemy appears.
     * @param strAreaName The name of the area.
     */
    public Enemy(int nAreaIndex, String strAreaName) {
        this.nAreaIndex = nAreaIndex;
        this.strAreaName = strAreaName;
        // Initialization of health and attack arrays or other logic here
    }

    // Getters and Setters with added comments for clarity

    /**
     * Gets the enemy's name.
     * @return The name of the enemy.
     */
    public String getName() {
        return strName;
    }

    /**
     * Sets the enemy's name.
     * @param strName The new name for the enemy.
     */
    public void setName(String strName) {
        this.strName = strName;
    }

    /**
     * Gets the enemy's type.
     * @return The type of the enemy as an integer.
     */
    public int getEnemyType() {
        return nEnemyType;
    }

    /**
     * Sets the enemy's type.
     * @param nEnemyType The new type for the enemy.
     */
    public void setEnemyType(int nEnemyType) {
        this.nEnemyType = nEnemyType;
    }

    /**
     * Gets the name of the area where the enemy is located.
     * @return The name of the area.
     */
    public String getAreaName() {
        return this.strAreaName;
    }

    /**
     * Gets the area index where the enemy is located.
     * @return The index of the area.
     */
    public int getAreaIndex() {
        return nAreaIndex;
    }

    /**
     * Gets the enemy's base health value.
     * @return The base health of the enemy.
     */
    public int getBaseHealth() {
        return nHealth[0];
    }

    /**
     * Gets the enemy's final health value.
     * @return The final health of the enemy.
     */
    public int getFinalHealth() {
        return nHealth[1];
    }

    /**
     * Gets the current health of the enemy.
     * @return The current health of the enemy.
     */
    public int getCurrentHealth() {
        return this.currentHealth;
    }

    /**
     * Sets the health values for the enemy.
     * @param nHealth An array containing base and final health values.
     */
    public void setHealth(int[] nHealth) {
        this.nHealth = nHealth;
    }

    /**
     * Sets the current health of the enemy.
     * @param currentHealth The new current health for the enemy.
     */
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    /**
     * Gets the base attack of the enemy.
     * @return The base attack value.
     */
    public int getBaseAttack() {
        return nAttack[0];
    }

    /**
     * Gets the final attack of the enemy.
     * @return The final attack value.
     */
    public int getFinalAttack() {
        return nAttack[1];
    }

    /**
     * Sets the attack values for the enemy.
     * @param nAttack An array containing base and final attack values.
     */
    public void setAttack(int[] nAttack) {
        this.nAttack = nAttack;
    }

    /**
     * Gets the physical defense of the enemy.
     * @return The physical defense value.
     */
    public double getPhysDef() {
        return fPhysDef;
    }

    /**
     * Sets the physical defense of the enemy.
     * @param fPhysDef The new physical defense value.
     */
    public void setPhysDef(double fPhysDef) {
        this.fPhysDef = fPhysDef;
    }

    /**
     * Gets the sorcery defense of the enemy.
     * @return The sorcery defense value.
     */
    public double getSorcDef() {
        return fSorcDef;
    }

    /**
     * Sets the sorcery defense of the enemy.
     * @param fSorcDef The new sorcery defense value.
     */
    public void setSorcDef(double fSorcDef) {
        this.fSorcDef = fSorcDef;
    }

    /**
     * Gets the incantation defense of the enemy.
     * @return The incantation defense value.
     */
    public double getIncaDef() {
        return fIncaDef;
    }

    /**
     * Sets the incantation defense of the enemy.
     * @param fIncaDef The new incantation defense value.
     */
    public void setIncaDef(double fIncaDef) {
        this.fIncaDef = fIncaDef;
    }

    /**
     * Reduces the current health of the enemy by the specified damage.
     * Ensures that the health does not drop below 0.
     * @param damage The amount of damage to inflict on the enemy.
     */
    public void takeDamage(int damage) {
        this.currentHealth = Math.max(0, this.currentHealth - damage);
    }
}
