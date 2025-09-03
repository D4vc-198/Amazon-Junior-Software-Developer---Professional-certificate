# Clases y Objetos en Java

Este proyecto contiene 2 clases principales:
1. `Main`
    - Contiene el método main, que es el punto de inicio del programa.
    - Aqui se crea un objeto de la clase `Hero`.
2. `Hero`
    - Representa el molde o plantilla para crear un Héroe.
    - Contiene atributos (propiedades) y 2 métodos:
        - `calculatePunchDamage`: Calcula el daño de un golpe normal.
        - `calculateSpecialAttackDamage`: Calcula el daño de un ataque especial en base al tipo.

## Clase
Una `clase` es una plantilla que define cómo serán los objetos.
```Java
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

```

## Objeto
Un `Objeto` es una instancia de la clase: Un Héroe creado a partir de una plantilla.
```Java
Hero hero1 = new Hero();
hero1.name = "Spider-Man";
int punchDamage = hero1.calculatePunchDamage();
int specialAttackDamage = hero1.calculateSpecialAttackDamage("Ice Blast");
```


