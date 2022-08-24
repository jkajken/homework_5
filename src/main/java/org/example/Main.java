package org.example;

public class Main {
    public static void main(String[] args) {
        Hero Thor = new Hero(250,100, "Lightning");
        Hero BlackWidow = new Hero (280,110);

        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHeroDamage() + " " + createHeroes()[i].getHeroHealth()
                    + " " + createHeroes()[i].getSuperPower());
        }



        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(150);
        boss.setBossDefence("Critical");
        System.out.println("BossHealth : " + boss.getBossHealth()+" " + "BossDamage : "
                + boss.getBossDamage()+ " " + "BossDefence : " + boss.getBossDefence() );

    }

    public static Hero [] createHeroes() {
        Hero Spider = new Hero(230, 150, "Climing");
        Hero Bat = new Hero(220, 115);
        Hero Ant = new Hero(180, 120, "PoisonKill");

        Hero[] nextGenerationHeroes = { Spider,Bat,Ant};
        return nextGenerationHeroes;
    }
}