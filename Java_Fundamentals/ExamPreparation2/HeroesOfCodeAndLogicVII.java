package Java_Fundamentals.ExamPreparation2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new TreeMap<>(); //Име на героя -> HP
        Map<String, Integer> heroesMP = new TreeMap<>(); //Име на героя -> MP

        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int hero = 1; hero <= countHeroes ; hero++) {
            String input = scanner.nextLine();
            //"Solmyr 85 120" -> split " " -> ["Solmyr", "85", "120"]
            String [] tokens = input.split("\\s+");
            //["Solmyr", "85", "120"]
            String heroName = tokens[0]; //"Solmyr"
            int hp = Integer.parseInt(tokens[1]); //"85" -> parse -> 85
            int mp = Integer.parseInt(tokens[2]); //"120" -> parse -> 120

            //hp
            if(hp <= 100) {
                //име на герой -> hp
                heroesHP.put(heroName, hp);
            }

            //mp
            if(mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }

        String command = scanner.nextLine();

        while(!command.equals("End")){
            String [] tokens = command.split(" - ");
            String commandName = tokens[0];
            String heroName = tokens[1];

            switch(commandName) {
                case "CastSpell":
                    //tokens = ["CastSpell", "{heroName}", "80", "Dracarys"]
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    int mpCurrent = heroesMP.get(heroName);

                    if(mpCurrent >= mpNeeded){
                        //мога да направя магията -> текущото MP >= нужното
                        int mpLeft = mpCurrent - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    } else {
                        //не мога
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    //tokens = ["TakeDamage", "{hero name}", "{damage}", "{attacker}"]
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentHP = heroesHP.get(heroName) - damage;
                    if(currentHP > 0) {
                        //жив
                        heroesHP.put(heroName, currentHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    } else {
                        //умрял
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    //tokens = ["Recharge", "{hero name}", "{amount}"];
                    int amountIncrease = Integer.parseInt(tokens[2]);
                    int currentMp = heroesMP.get(heroName);
                    int increaseMp = currentMp + amountIncrease;
                    if(increaseMp > 200) {
                        increaseMp = 200;
                    }
                    heroesMP.put(heroName, increaseMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increaseMp - currentMp);
                    break;
                case "Heal":
                    //tokens = ["Heal", "{hero name}", "{amount}"];
                    int amount = Integer.parseInt(tokens[2]);
                    int currentHp = heroesHP.get(heroName);
                    int increaseHp = currentHp + amount;
                    if(increaseHp > 100) {
                        increaseHp = 100;
                    }
                    heroesHP.put(heroName, increaseHp);
                    System.out.printf("%s healed for %d HP!%n", heroName, increaseHp - currentHp);
                    break;
            }

            command = scanner.nextLine();
        }

        //име на герой -> hp
        heroesHP.entrySet().stream()
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                //име -> hp
                .forEach(hero -> {
                    String heroName = hero.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + hero.getValue());
                    System.out.println("  MP: " + heroesMP.get(heroName));
                });
    }
}