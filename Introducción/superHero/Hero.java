/**
 * La clase { Hero } representa a un héroe con atributos básicos
 * como: Nombre (name), Fuerza (strength) y Salud (health) 
 * 
 * Métodos principales
 * calculatePunchDamage() - Calcula el daño de un golpe normal.
 * calculateSpecialAttackDamage() - Calcula el daño de un ataque especial en base al tipo.
 */
public class Hero {

    String name = "Hero";
    int strength = 20;
    int health = 100;

    public int calculatePunchDamage() {
        return strength * 2;
    }

    public int calculateSpecialAttackDamage(String attackType) {
        int damage = strength;

        if (attackType.equals("Fire punch")) {
        damage = damage * 2;
        } else if (attackType.equals("Ice Blast")) {
        damage = damage * 3;
        }

        return damage;

    }
}
