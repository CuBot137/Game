package org.example.Direction;

import org.example.creature.Goblin;
import org.example.creature.Player;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.ArrayList;
import java.util.Random;

public class Left{
    Random rand = new Random();
    ArrayList<Object> inventory = new ArrayList<>();
    public Player player = new Player(10, 2, 1, inventory);
    public Goblin lesserGoblin = new Goblin("LesserGoblin", 7, 2, 1);
    public void L1(){
        System.out.println("You stumble down the left passage way. On your way you pass a dead rotting body.");
        System.out.println("What do you do?");
        System.out.println("Walk past or Inspect body?");
    }
    public void walkPast(){
        System.out.println("You are creeped out by the rotting corpse. Instead of risking getting diseases you walk past the corpse.");
        System.out.println("As you walk you meet a small goblin creature. It is clearly hostile towards you and is getting ready to attack.");
    }
}
