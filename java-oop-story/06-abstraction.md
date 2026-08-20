# Chapter 6: Abstraction — The Master Plan

## The story

A new hire, unfamiliar with the battle system, writes
`new Character("Bandit", 50)` directly into a quest script. It compiles fine
— and then sits doing nothing but the bland default `"Bandit attacks!"`,
because nobody gave it a real move.

> Elowen shakes her head. "`Character` was never meant to exist on its own.
> It's a concept every hero fits, not a hero itself. Let's make that
> official."

## The concept

**Abstraction** means marking a class `abstract` so it can never be
instantiated directly — only extended. An `abstract` method has no body at
all; it's a contract that every subclass is compiler-forced to fulfill. This
is the flip side of polymorphism: polymorphism lets each subclass answer
differently, abstraction guarantees every subclass *must* answer at all.

## Basic example

```java
public abstract class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack();
}

// new Character("Bandit", 50);  // will not compile: abstract classes can't be built directly
```

Nothing else changes — `Warrior`, `Mage`, and `Archer` from the last chapter
already override `attack()`, so they still compile and run exactly as
before. The only thing that vanished is the mistake.

## Try it yourself

Change `Character` to `abstract` and make `attack()` an abstract method (no
body). Confirm your Warrior, Mage, and Archer still compile untouched, then
create a new subclass, `Cleric`, with its own `attack()` line.

<details>
<summary>Solution</summary>

```java
public class Cleric extends Character {
    public Cleric(String name, int health) { super(name, health); }

    @Override
    public void attack() {
        System.out.println(name + " channels holy light for 10 damage!");
    }
}
```

</details>

---
Back to: [Index](README.md)
