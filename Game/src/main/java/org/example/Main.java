package org.example;

import org.example.Direction.Left;
import org.example.action.Combat;
import org.example.creature.Player;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        boolean goblinFight = true;
        Random rand = new Random();
        Left left = new Left();
        Combat combat = new Combat();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Welcome to the game!");

        System.out.println("You wake up in a cave with 2 paths. Which do you pick?");
        System.out.println("Left or Right?");
        String direction = scanner.next();

        if(direction.equalsIgnoreCase("Left")){
            left.L1();
            String action = scanner.next();
            if (action.equalsIgnoreCase("Walk past")){
                left.walkPast();
                while (goblinFight){
                    boolean stun = false;
                    System.out.println("What do you do?\nAttack or Defend or Flee?");
                    action = scanner.next();
                    switch (action.toLowerCase()){
                        case "attack":
                            System.out.println("You ready yourself and lunge at the gross Goblin");
                            combat.playerAttackGoblin();
                            break;
                        case "defend":
                            combat.playerDefendGoblin();
                            stun = combat.StunCounter();
                            if (stun){
                                System.out.println("GOBLIN STUNNED");
                                continue;
                            }
                            break;
                        case "flee":
                            if(combat.Flee()){
                                System.out.println("You run past the Goblin in a fit of panic!");
                                goblinFight = false;
                            }else{
                                System.out.println("You attempt to flee but the Goblin blocks your path");
                            }
                            break;
                    }
                    if (goblinFight) {
                        int goblinAction = rand.nextInt(0, 3) + 1;
                        System.out.println("The Goblin ready's itself!");
                        switch (goblinAction) {
                            case 1:
                                combat.goblinAttackPlayer();
                                break;
                            case 2:

                        }
                    }
                    if (left.lesserGoblin.getHealth() >= 1){
                        goblinFight = false;
                    }
                }
                System.out.println("YEAH BABY!!!");
                if(left.lesserGoblin.getHealth() < 1){
                    System.out.println("You smash the Baby Goblin with your bare hands!!\nTheir tiny feeble body is now a puddle of green goo!!!");
                }


                if(action.equalsIgnoreCase("Attack")){
                    do {

                    }while (left.lesserGoblin.getHealth() > 1);
                }

            } else if (action.equalsIgnoreCase("Inspect")) {
                
            }


        } else if (direction.equalsIgnoreCase("Right")) {

        }else{
            System.out.println("You're too stupid ");
        }
    }


}