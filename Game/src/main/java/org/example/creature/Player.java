package org.example.creature;

import org.example.creature.Creature;

import java.util.ArrayList;
import java.util.Random;

public class Player extends Creature {
    Random random = new Random();
    public Player(String name, int health, int attack, int defence) {
        super(name, health, attack, defence);
    }
    public ArrayList<Object> inventory = new ArrayList<>();

    public Player() {
        super();
    }

    @Override
    public void attack() {
        int rand = random.nextInt(1,10)+1;
        if (rand == 1){
        }
    }


}
