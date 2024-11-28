package kg.geeks.game.template;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;

public class King extends Hero {
    public King(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAITAMA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        RPG_Game.random = new Random();
        int chanseToCallSaitamy = RPG_Game.random.nextInt(10);
        if (chanseToCallSaitamy == 0) {
            boss.setHealth(0);
            System.out.println("Saitama got angry and killed the boss");
        }

    }

}

