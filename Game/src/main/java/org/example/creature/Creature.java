package org.example.creature;

import org.example.action.Combat;

public class Creature implements Combat {

    public Creature(String name, int health, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }

    String name;
    int health;
    int attack;
    int defence;

    public Creature() {

    }

    @Override
    public void attack() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
}
