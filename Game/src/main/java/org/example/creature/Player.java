package org.example.creature;

import java.util.ArrayList;
import java.util.Random;

public class Player{

    String name;
    int attack;
    int defence;
    int health;
    public ArrayList<Object> inventory;

    public Player(int health, int attack, int defence, ArrayList<Object> inventory ) {
        this.name = name;
        this.attack =attack;
        this.defence = defence;
        this.health = health;
        this.inventory = inventory;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Object> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.inventory = inventory;
    }
}
