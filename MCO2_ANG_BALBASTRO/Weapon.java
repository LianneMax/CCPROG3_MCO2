    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package mco2_ang_balbastro;

    import java.util.ArrayList;
    import java.util.List;



    /**
     *
     * @author Lianne
     */
    public class Weapon {
        private String name;
        private int cost, dexterity, hp, endurance, strength, intelligence, faith, quantity;

        private boolean isOwned;

        // Constructor
        public Weapon(String name, int cost, int dexterity, int hp, int endurance, int strength, int intelligence, int faith, int quantity) {
            this.name = name;
            this.cost = cost;
            this.dexterity = dexterity;
            this.hp = hp;
            this.endurance = endurance;
            this.strength = strength;
            this.intelligence = intelligence;
            this.faith = faith;
            this.quantity = quantity;
        }

        // Static method to initialize and return a list of weapons
    public static ArrayList<Weapon> initializeWeapons() {
        ArrayList<Weapon> weapons = new ArrayList<>();

        weapons.add(new Weapon("Short Sword", 1000, 13, 0, 15, 15, 15, 15, 0));
        weapons.add(new Weapon("Rogier's Rapier", 2000, 18, 10, 25, 35, 35, 35, 0));
        weapons.add(new Weapon("Coded Sword", 4000, 21, 20, 35, 40, 40, 40, 0));
        weapons.add(new Weapon("Sword of Night and Flame", 8000, 25, 30, 45, 55, 55, 55, 0));
        weapons.add(new Weapon("Uchigatana", 1875, 15, 20, 35, 30, 0, 0, 0));
        weapons.add(new Weapon("Moonveil", 3750, 20, 30, 40, 45, 0, 0, 0));
        weapons.add(new Weapon("Rivers of Blood", 7500, 35, 40, 45, 60, 0, 0, 0));
        weapons.add(new Weapon("Hand of Malenia", 15000, 30, 50, 50, 75, 0, 0, 0));
        weapons.add(new Weapon("Whip", 1500, 20, 15, 60, 20, 0, 0, 0));
        weapons.add(new Weapon("Urumi", 3000, 25, 20, 70, 40, 10, 0, 0));
        weapons.add(new Weapon("Thorned Whip", 5000, 30, 30, 80, 50, 0, 40, 0));
        weapons.add(new Weapon("Hoslow's Petal Whip", 10000, 35, 35, 90, 55, 20, 20, 0));
        weapons.add(new Weapon("Claymore", 3000, 9, 15, 10, 20, 0, 0, 0));
        weapons.add(new Weapon("Starscourge Greatsword", 6000, 14, 20, 15, 40, 0, 0, 0));
        weapons.add(new Weapon("Inseparable Sword", 12000, 19, 25, 20, 70, 60, 60, 0));
        weapons.add(new Weapon("Maliketh's Black Blade", 24000, 24, 30, 25, 80, 40, 60, 0));
        weapons.add(new Weapon("Astrologer's Staff", 2000, 12, 5, 20, 5, 25, 15, 0));
        weapons.add(new Weapon("Albinauric Staff", 4000, 14, 10, 30, 10, 45, 35, 0));
        weapons.add(new Weapon("Staff of the Guilty", 8000, 16, 15, 40, 15, 65, 60, 0));
        weapons.add(new Weapon("Carian Regal Scepter", 16000, 18, 25, 50, 20, 85, 75, 0));
        weapons.add(new Weapon("Finger Seal", 2500, 10, 10, 45, 0, 15, 20, 0));
        weapons.add(new Weapon("Godslayer's Seal", 5000, 12, 15, 50, 0, 35, 40, 0));
        weapons.add(new Weapon("Golden Order Seal", 10000, 14, 20, 55, 0, 65, 65, 0));
        weapons.add(new Weapon("Dragon Communion Seal", 15000, 18, 25, 60, 0, 75, 80, 0));

        return weapons;
    }


        public void setOwned(boolean owned) {
            this.isOwned = owned;
        }

        public boolean isOwned() {
            return this.isOwned;
        }

        public void buyWeapon() {
            this.quantity++; // Increase the quantity since multiple purchases are allowed
            this.setOwned(true); // Mark as owned
        }

        // Getters


        public String getName() {
            return name;
        }

        public int getCost() {
            return cost;
        }

        public int getDexterity() {
            return dexterity;
        }

        public int getHp() {
            return hp;
        }

        public int getEndurance() {
            return endurance;
        }

        public int getStrength() {
            return strength;
        }

        public int getIntelligence() {
            return intelligence;
        }

        public int getFaith() {
            return faith;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public void setDexterity(int dexterity) {
            this.dexterity = dexterity;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void setEndurance(int endurance) {
            this.endurance = endurance;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public void setFaith(int faith) {
            this.faith = faith;
        }

        // Method to return details about the weapon
        public String getDetails(List<Weapon> weapons) {

        int index = weapons.indexOf(this);
        return String.format("""
                             -- Current Weapon Info --
                         WEAPON INDEX: %d
                         NAME: %s
                         COST: %d
                         DEXTERITY: %d
                         HP: %d
                         ENDURANCE: %d
                         STRENGTH: %d
                         INTELLIGENCE: %d
                         FAITH: %d
                             """,
               index, name, cost, dexterity, hp, endurance, strength, intelligence, faith);
        }
    }



