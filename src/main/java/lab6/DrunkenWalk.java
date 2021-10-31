package lab6;

public class DrunkenWalk extends RandomWalk {

    private int fallIntoTheLackTimes = 0;
    private final int walkTimes = 5;

    public DrunkenWalk(int borderLength, int maxSteps) {
        super(borderLength, maxSteps);
    }

    @Override
    public void walk() {

        for (int i = 0; i < 5; i++) {
            super.walk();
            if (super.isBounds()) this.fallIntoTheLackTimes++;
        }

        System.out.println("Fall into the lack times: " + fallIntoTheLackTimes);
    }
}
