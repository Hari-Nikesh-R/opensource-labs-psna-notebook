# Chapter 4: Inheritance — The Family Tree

## The story

Design wants three hero types: Warrior, Mage, Archer. The first draft
copy-pastes `name`, `health`, and `introduce()` into all three files.

> Elowen winces. "Every one of these is still just a hero underneath. Don't
> repeat the family resemblance — declare it once."

## The concept

**Inheritance** lets a class reuse another class's fields and methods with
`extends`. The shared blueprint (`Character`) holds what every hero type has
in common; each subclass adds only what makes it different. `super(...)`
calls the parent's constructor. `protected` fields are visible to subclasses
(unlike `private`).

## Basic example

```java
public class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void introduce() {
        System.out.println("I am " + name + ", standing strong at " + health + " HP!");
    }
}
```

```java
public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }
}

public class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health);
    }
}
```

```java
Warrior finn = new Warrior("Finn", 100);
Mage zara = new Mage("Zara", 80);
finn.introduce();
zara.introduce();
```

Neither `Warrior` nor `Mage` redefines `introduce()` — they inherit it for
free from `Character`.

## Try it yourself

Create a class `Archer` that `extends Character`, with a constructor that
forwards `name` and `health` via `super(...)`. Create an `Archer` in `Main`
and call `introduce()`.

<details>
<summary>Solution</summary>

```java
public class Archer extends Character {
    public Archer(String name, int health) {
        super(name, health);
    }
}
```

</details>

---
Next: [Polymorphism](05-polymorphism.md)
