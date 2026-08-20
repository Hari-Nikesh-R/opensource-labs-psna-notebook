# Chapter 1: Classes & Objects — The Blueprint Room

## The story

Elowen leads you into a room full of drafting tables, each holding a folded
schematic labeled "Hero," "Villain," "Dragon."

> "Nobody builds a real hero from scratch every time," she says. "You draw the
> blueprint once — what a hero **has**, and what a hero **can do**. Then you
> stamp out as many actual heroes as the game needs. The blueprint is a
> **class**. Each hero you stamp out is an **object**."

## The concept

- A **class** is a blueprint: it defines fields (data) and methods (behavior).
- An **object** is one real instance built from that blueprint, created with `new`.
- You can create as many objects as you like from a single class, and each one
  has its own copy of the fields.

## Basic example

```java
public class Hero {
    String name;
    int health;

    void introduce() {
        System.out.println("I am " + name + ", standing strong at " + health + " HP!");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Hero finn = new Hero();
        finn.name = "Finn";
        finn.health = 100;
        finn.introduce();

        Hero luna = new Hero();
        luna.name = "Luna";
        luna.health = 90;
        luna.introduce();
    }
}
```

Output:

```
I am Finn, standing strong at 100 HP!
I am Luna, standing strong at 90 HP!
```

One blueprint (`Hero`), two independent objects (`finn` and `luna`).

## Try it yourself

Create a class `Villain` with fields `name` (String) and `menace` (int), and a
method `taunt()` that prints `"<name> sneers, radiating <menace> menace!"`.
Create one `Villain` object in `Main` and call `taunt()`.

<details>
<summary>Solution</summary>

```java
public class Villain {
    String name;
    int menace;

    void taunt() {
        System.out.println(name + " sneers, radiating " + menace + " menace!");
    }
}
```

```java
Villain grix = new Villain();
grix.name = "Grix";
grix.menace = 42;
grix.taunt();
```

</details>

---
Next: [Constructors](02-constructors.md)
