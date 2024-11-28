package kg.geeks.game.template;

import kg.geeks.game.logic.RPG_Game;

public class Bomber extends Hero {
    boolean alreadyExecudet = false;

    public Bomber(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.EXPLOSION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        int explosionDamage = 100;

        if (!alreadyExecudet){

            if (this.getHealth() == 0 ){
            boss.setHealth(boss.getHealth() - explosionDamage );
            System.out.println("Bomber " + getName() + " exploded and caused "
            + explosionDamage + " damage");
            alreadyExecudet = true;
             }
        }
    }
}


