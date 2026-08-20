# Chapter 5: Polymorphism — One Command, Many Echoes

## The story

The battle system needs every character to fight differently — a Warrior
swings steel, a Mage hurls fire — but the game loop shouldn't need a giant
`if/else` checking the type of every character on every turn.

> "Give the loop one command," says Elowen. "Let each hero answer it in
> their own way."

## The concept

**Polymorphism** ("many forms") lets subclasses override a parent method
with `@Override`, giving it their own behavior. Code that calls the method
through the parent type automatically runs whichever version belongs to the
real object. One call site, many outcomes.

## Basic example

```java
public class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}
```

```java
public class Warrior extends Character {
    public Warrior(String name, int health) { super(name, health); }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword for 20 damage!");
    }
}

public class Mage extends Character {
    public Mage(String name, int health) { super(name, health); }

    @Override
    public void attack() {
        System.out.println(name + " hurls a fireball for 35 damage!");
    }
}
```

```java
Character[] party = {
    new Warrior("Finn", 100),
    new Mage("Zara", 80)
};

for (Character c : party) {
    c.attack();
}
```

Output:

```
Finn swings a sword for 20 damage!
Zara hurls a fireball for 35 damage!
```

The loop never asks what kind of character each one is — it just calls
`c.attack()`, and Java runs the right version automatically.

## Try it yourself

Add an overridden `attack()` to `Archer`: `"<name> fires a piercing arrow for
15 damage!"`. Put a Warrior, a Mage, and your Archer into one `Character[]`
array and loop over it, calling `attack()` on each.

<details>
<summary>Solution</summary>

```java
public class Archer extends Character {
    public Archer(String name, int health) { super(name, health); }

    @Override
    public void attack() {
        System.out.println(name + " fires a piercing arrow for 15 damage!");
    }
}
```

</details>

---
Next: [Abstraction](06-abstraction.md)
