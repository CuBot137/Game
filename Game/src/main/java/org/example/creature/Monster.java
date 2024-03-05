package org.example.creature;

public class Monster {

    String name;
    int attack;
    int defence;
    int health;

    Monster(String name, int attack, int defence, int health){
        this.name = name;
        this.attack =attack;
        this.defence = defence;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
