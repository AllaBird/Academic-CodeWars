package HW_7;

public class Main {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            do {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;

            }while (fighter2.health > 0 && fighter1.health >0);

        } else if (firstAttacker.equals(fighter2.name)) {
            do {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
               if(fighter1.health<=0){
                   return fighter2.name;
               }
               fighter2.health=fighter2.health-fighter1.damagePerAttack;
            }
            while (fighter1.health > 0 && fighter2.health > 0);
        }
        if(fighter1.health>fighter2.health){
            return fighter1.name;
        }
        else {
            return fighter2.name;
        }
    }



    public static void main(String[] args) {
        Fighter first = new Fighter("Lew",10,2);
        Fighter second = new Fighter("Harry", 5, 4);
        System.out.println(declareWinner(first,second,"Lew"));
    }


    }


