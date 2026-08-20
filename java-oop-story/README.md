# The Character Codex — Java OOP for Beginners

A short story used to teach Java's four pillars of Object-Oriented Programming (OOP)
through hands-on examples. You've just joined **Bytehaven Studios** as a new engineer,
and your mentor, **Elowen**, has you rebuild the character system for an RPG —
one concept at a time.

## How to use this

Each file below is one lesson: a short story bit, the concept explained plainly, a
basic runnable Java example, and a small exercise to try yourself. Go in order —
each chapter builds on the last.

1. [Classes & Objects](01-classes-and-objects.md) — the blueprint
2. [Constructors](02-constructors.md) — building a hero fully-formed
3. [Encapsulation](03-encapsulation.md) — guarding the data
4. [Inheritance](04-inheritance.md) — sharing a family of characters
5. [Polymorphism](05-polymorphism.md) — one call, many behaviors
6. [Abstraction](06-abstraction.md) — forcing a contract

## Running the examples

- **No install:** paste the code into an online compiler like replit.com or jdoodle.com.
- **Local:** save as `Main.java`, then run:
  ```
  javac Main.java
  java Main
  ```

## Cheat sheet

| Pillar | What it means | Java mechanism |
|---|---|---|
| Encapsulation | Hide data; only change it through controlled methods | `private` fields + getters/methods |
| Inheritance | Share common structure instead of repeating it | `extends`, `super(...)` |
| Polymorphism | One method call, different behavior per object | `@Override`, calling through the parent type |
| Abstraction | Define a contract every subclass must fulfill | `abstract class`, `abstract` methods |
