package org.example.Direction;

import org.example.creature.Goblin;
import org.example.creature.Player;

import java.util.Random;

public class Left extends Player {
    Random rand = new Random();
    public Left() {
        super();
    }
    public static Goblin lesserGoblin = new Goblin("LesserGoblin", 5, 2,1);

    public Left(String name, int health, int attack, int defence) {
        super(name, health, attack, defence);
    }

    public void L1(){
        System.out.println("You stumble down the left passage way. On your way you pass a dead rotting body.");
        System.out.println("What do you do?");
        System.out.println("Walk past or Inspect body?");
    }

    public void walkPast(){
        System.out.println("You are creeped out by the rotting corpse. Instead of risking getting diseases you walk past the corpse.");
        System.out.println("As you walk you meet a small goblin creature. It is clearly hostile towards you and is getting ready to attack.");

    }

    public void goblinAttack(int attack, int defence, int health){
        int damage = attack - lesserGoblin.getDefence();
        damage += attack;
        int crit = rand.nextInt(1,10)+1;
        if (crit == 7){
            damage += damage * 1.5;
        }
        lesserGoblin.setHealth(lesserGoblin.getHealth() - damage);
        System.out.println("You punch the goblin in his big silly face and did "+ damage+" damage.");
    }
}
