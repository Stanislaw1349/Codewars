import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;


public class FighterTest {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Sergey", 9, 5);
        Fighter fighter2 = new Fighter("Ivan", 8, 4);

        System.out.println(declareWinner(fighter1, fighter2, "Sergey"));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        //  int count1 = fighter1.health / fighter2.damagePerAttack;
        // int count2 = fighter2.health / fighter1.damagePerAttack;
        while (fighter1.health > 0 && fighter2.health > 0){
            fighter1.health -= fighter2.damagePerAttack;
            fighter2.health -= fighter1.damagePerAttack;
        }


        if (fighter1.health <= 0 && fighter2.health <= 0) {
            return firstAttacker;
        } else if (fighter1.health > fighter2.health) {
            return fighter1.name;
        } else {
            return fighter2.name;
        }
    }
}
