package org.example.action;

import org.example.Direction.Left;

import java.util.Random;

public class Combat {
    Random rand = new Random();
    Left left = new Left();
    public void playerAttackGoblin(){
        int pDamage = Crit(left.player.getAttack());
        pDamage = pDamage - left.lesserGoblin.getDefence();
        left.lesserGoblin.setHealth(left.lesserGoblin.getHealth() - pDamage);
        System.out.println("You punch the goblin in his big silly face and did "+ pDamage+" damage.");
    }
    public void playerDefendGoblin(){
        int pDefence = left.player.getDefence()+ rand.nextInt(1,5)+1;
        if (pDefence - left.lesserGoblin.getAttack() > 0){
            System.out.println("The Goblin attacks but you kick it away");
        }
    }
    public void goblinAttackPlayer(){
        int gDamage = Crit(left.lesserGoblin.getAttack());
        gDamage -= left.player.getDefence();
        left.player.setHealth(left.player.getHealth() - gDamage);
        System.out.println("The little shit bit your ankles and did "+ gDamage+" damage");
    }

    public int Crit (int attack){
        int crit = rand.nextInt(1,10)+1;
        if (crit == 7){
            attack += attack * 1.5;
            System.out.println("CRITICAL HIT BABY!");
        }
        return attack;
    }
    public boolean StunCounter (){
        boolean stunned = false;
        int stun = rand.nextInt(1,3)+1;
        if (stun == 2){
            stunned = true;
        }
        return stunned;
    }
    public boolean Flee(){
        int flee = rand.nextInt(0,1)+1;
        if(flee == 1){
            return true;
        }else {
            return false;
        }
    }
}
