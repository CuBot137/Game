package org.example;

import org.example.Direction.Left;
import org.example.creature.Creature;
import org.example.creature.Goblin;
import org.example.creature.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main extends Creature {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Left left = new Left();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Welcome to the game!");
        System.out.print("What is your name: ");

        String pName = scanner.next();
        Player player = new Player(pName, 10, 2, 1);
        System.out.println("You wake up in a cave with 2 paths. Which do you pick?");
        System.out.println("Left or Right?");
        String direction = scanner.next();

        if(direction.equalsIgnoreCase("Left")){
            left.L1();
            String action = scanner.next();

            if (action.equalsIgnoreCase("Walk past")){
                left.walkPast();
                while (Left.lesserGoblin.getHealth() > 1){
                    System.out.println("What do you do?\nAttack or Defend or Flee?");
                    action = scanner.next();
                    System.out.println(action);
                    switch (action.toLowerCase()){
                        case "attack":
                            System.out.println("You ready yourself and lunge at the gross Goblin");
                            left.goblinAttack(player.getAttack(), player.getDefence(), player.getHealth());
                            break;
                        case "defend":

                            break;
                        case "flee":

                            break;
                    }
                }


                if(action.equalsIgnoreCase("Attack")){
                    do {

                    }while (Left.lesserGoblin.getHealth() > 1);
                }

            } else if (action.equalsIgnoreCase("Inspect")) {
                
            }


        } else if (direction.equalsIgnoreCase("Right")) {

        }else{
            System.out.println("You're too stupid ");
        }
    }


}