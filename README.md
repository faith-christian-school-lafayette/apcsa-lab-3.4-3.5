# Lab 3.4-3.5 — Constructors and Methods

In this lab you finish the class `BusPass`: one student's pass for the city
bus, counted in rides. It is built the way `LunchAccount` is built in your
Unit 3 notes. The instructions for each part are in the comment block directly
above the code in `BusPass.java`, so read them there — this page is just the
map.

Plan on 30 to 45 minutes.

## What you will practice

- Writing constructors that set the initial state of an object.
- Giving a class two constructors with different parameter lists.
- Writing accessor methods and mutator methods.
- Using `return` to leave a method early.
- Writing a method that calls another method of the same class.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/BusPass.java`. That is the only file you turn in.
1. Work down the file. Each part is marked with a comment that starts with
   `TODO`; replace the placeholder line under it with your own code.

To run `BusPassRunner`, which makes two passes and prints what your methods
return:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## The parts

| Part | Code | What it is about |
| --- | --- | --- |
| 1 | `BusPass(String, int)` and the get methods | setting and reading state |
| 2 | `BusPass(String)` | a second constructor |
| 3 | `addRides(int)` | a void mutator |
| 4 | `ride()` | a mutator that returns a boolean |
| 5 | `getStatus()` | several `return` statements |
| 6 | `rideMany(int)` | calling your own method |

## Before you turn it in

- [ ] Every placeholder line under a `TODO` has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors.
- [ ] Both constructors give every instance variable a value.
- [ ] `new BusPass("Leo").getRidesLeft()` is 10, not 0.
- [ ] `addRides(-4)` changes nothing.
- [ ] `ride()` on an empty pass returns `false`, and `ridesLeft` never goes
      below 0.
- [ ] One ride left says `"1 ride left"`, and none says `"no rides left"`.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.

`BusPassRunner.java` is not graded, so you may change it however you like.

## Optional extension, not graded

1. Write `rideMany` a second way: a `while` loop that subtracts 1 from `trips`
   each time it rides. In `BusPassRunner`, store a number in a variable, pass
   that variable to `rideMany`, and print the variable afterwards. Did it
   change? Why not?
1. Make a new file, `Ticket.java`, with `private int seat;`,
   `private boolean used;`, `private String holder;`, a get method for each,
   and no constructor at all. Does `new Ticket()` compile? What do the three
   get methods return, and why?
