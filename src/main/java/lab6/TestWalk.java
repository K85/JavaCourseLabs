package lab6;

import java.util.Scanner;

public class TestWalk {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter border length: ");
        int borderLength = scanner.nextInt();
        System.out.println("Please enter maxSteps: ");
        int maxSteps = scanner.nextInt();

        // Problem 1
        RandomWalk randomWalk1 = new RandomWalk(borderLength, maxSteps);
        randomWalk1.walk();

        // Problem 2
        RandomWalk randomWalk2 = new DrunkenWalk(borderLength, maxSteps);
        randomWalk2.walk();

        // Problem 3
        Collisions collisions = new Collisions(100000);
        collisions.simulate();
        System.out.println("collide times = " + collisions.getCollideTimes());

    }
}
