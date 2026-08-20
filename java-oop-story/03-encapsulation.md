# Chapter 3: Encapsulation — The Vault Keeper

## The story

Disaster: somewhere in the code, a careless line reads `finn.health = -9999;`
and the game crashes.

> Elowen isn't surprised. "You left the vault door wide open. Anyone can reach
> in and set `health` to whatever they want. Time to post a guard."

## The concept

**Encapsulation** means hiding a field behind `private` and only allowing
changes through methods you control. The field can no longer be touched
directly from outside the class — every change goes through the "guard,"
which can enforce rules like "health never drops below zero."

## Basic example

```java
public class Hero {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }
}
```

```java
Hero finn = new Hero("Finn", 100);
finn.takeDamage(30);
System.out.println(finn.getHealth()); // 70

finn.takeDamage(9999);
System.out.println(finn.getHealth()); // 0, never negative

// finn.health = -50;   // will not compile: health is private now
```

## Try it yourself

Make `menace` in `Villain` private, add `getMenace()`, and add a method
`loseMenace(int amount)` that lowers menace but never below `0`.

<details>
<summary>Solution</summary>

```java
private int menace;

public int getMenace() { return menace; }

public void loseMenace(int amount) {
    menace -= amount;
    if (menace < 0) {
        menace = 0;
    }
}
```

</details>

---
Next: [Inheritance](04-inheritance.md)
