package lab3;

import java.util.Random;

/*
 * RollingDice.java
 * Copyright (C) 2021  <@TEETH>
 *
 * Distributed under terms of the MIT license.
 */

public class RollingDice {

  public static int draw() {
    return new Random().nextInt(6) + 1;
  }

  public static void main(String[] args) {

    int one = draw();
    int another = draw();
    System.out.println(String.format("one dice: %d, another dice: %d\n", one, another));
    System.out.println(String.format("sum: %d\n", one + another));
  }
}
