public class Main {

    public static void main(String args[]) {
        Hero hero1 = new Hero();
        hero1.name = "Spider-Man";

        int punchDamage = hero1.calculatePunchDamage();
        int specialAttackDamage = hero1.calculateSpecialAttackDamage("Ice Blast");

        System.out.println("Name of the Hero: " + hero1.name);
        System.out.println("Ouch, your punch caused " + punchDamage + "% damage.");
        System.out.println("Your Ice Blast for " + specialAttackDamage + "% damage.");
    }
}
