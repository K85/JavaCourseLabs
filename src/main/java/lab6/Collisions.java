package lab6;

public class Collisions {

    private final RandomWalk particle1;
    private final RandomWalk particle2;
    private int collideTimes = 0;


    public Collisions(int maxSteps) {
        particle1 = new RandomWalk(maxSteps);
        particle1.setCurPosition(new Position(-3, 0));

        particle2 = new RandomWalk(maxSteps);
        particle2.setCurPosition(new Position(3, 0));
    }

    public void simulate() {
        while (true) {
            // max steps !
            if (!(particle1.moreSteps() && particle2.moreSteps()))
                break;

            // take one step.
            particle1.takeStep();
            particle2.takeStep();

            // collision !
            if (particle1.getCurPosition().equals(particle2.getCurPosition())) {
                collideTimes++;
            }
        }

    }

    public int getCollideTimes() {
        return collideTimes;
    }
}
