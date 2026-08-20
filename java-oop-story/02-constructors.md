# Chapter 2: Constructors — Waking the Golem

## The story

A tester storms in: "Every hero spawns blank! Name is `null`, health is `0`,
until someone manually sets them!"

> Elowen laughs. "That's what happens when you build a golem and forget the
> waking words. A hero should be born ready. That's what a **constructor**
> is for."

## The concept

A **constructor** is a special method, named exactly like the class, that
runs automatically when you write `new`. It takes starting values as
parameters and assigns them, so no object is ever created blank.

## Basic example

```java
public class Hero {
    String name;
    int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void introduce() {
        System.out.println("I am " + name + ", standing strong at " + health + " HP!");
    }
}
```

```java
Hero finn = new Hero("Finn", 100);
Hero luna = new Hero("Luna", 90);
finn.introduce();
luna.introduce();
```

`this.name` means "the `name` field that belongs to *this* object" — it's how
the constructor tells the parameter apart from the field with the same name.

## Try it yourself

Give `Villain` a constructor that takes `name` and `menace`. Create two
villains, each in a single line, with different stats, and call `taunt()`
on both.

<details>
<summary>Solution</summary>

```java
public class Villain {
    String name;
    int menace;

    Villain(String name, int menace) {
        this.name = name;
        this.menace = menace;
    }

    void taunt() {
        System.out.println(name + " sneers, radiating " + menace + " menace!");
    }
}
```

```java
Villain grix = new Villain("Grix", 42);
Villain moura = new Villain("Moura", 77);
grix.taunt();
moura.taunt();
```

</details>

---
Next: [Encapsulation](03-encapsulation.md)
