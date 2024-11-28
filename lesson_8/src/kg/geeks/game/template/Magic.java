package kg.geeks.game.template;

import kg.geeks.game.logic.RPG_Game;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boostDamage = 10;
        if (RPG_Game.roundNumber < 4){
        boss.setHealth(boss.getHealth() - (getDamage() + boostDamage));
        System.out.println("Magic " + this.getName() + " Boost damage " + boostDamage);
        }
    }
}

