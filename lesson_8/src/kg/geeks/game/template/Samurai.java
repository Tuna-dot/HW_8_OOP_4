package kg.geeks.game.template;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;

public class Samurai extends Hero {
    public Samurai(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.VACCINE_AND_VIRUS);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
     RPG_Game.random = new Random();
     int random = RPG_Game.random.nextInt(2);
       if ( random == 0) {
           int virus = 30 ;
           boss.setHealth(boss.getHealth() - virus);
           System.out.println("Samurai " + getName() +" applied the virus and inflicted "
                   + virus + " damage");
        } else if ( random == 1) {
           int vaccines = 15 ;
           boss.setHealth(boss.getHealth() + vaccines);
           System.out.println("Samurai " + getName() + " applied the vaccines and restored "
           + vaccines + " health");

       }
    }
}

