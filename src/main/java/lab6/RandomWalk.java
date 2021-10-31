package lab6;

public class RandomWalk {

    // start at (0, 0)
private Position curPosition;
private final int maxSteps;
private int curSteps;
private final Position topLeftLimitPosition;
private final Position bottomRightLimitPosition;

    public RandomWalk(int maxSteps) {
        this(99999999, maxSteps);
    }
    public RandomWalk(int borderLength, int maxSteps) {
        this(borderLength, maxSteps, 0, 0);
    }
    public RandomWalk(int borderLength, int maxSteps, int startX, int startY) {
        this.topLeftLimitPosition = new Position(-borderLength, -borderLength);
        this.bottomRightLimitPosition = new Position(borderLength, borderLength);
        this.maxSteps = maxSteps;
        this.curPosition = new Position(startX, startY);
    }

    public Position getCurPosition() {
        return curPosition;
    }
    public void setCurPosition(Position curPosition) {
        this.curPosition = curPosition;
    }

    public void takeStep() {
        MoveDirection md = MoveDirection.generate();
        this.getCurPosition().plus(md.getOffsetX(), md.getOffsetY());
        this.curSteps++;
    }

    public boolean moreSteps() {
        return  curSteps < maxSteps;
    }

    // return true if inner bounds.
    public boolean isBounds() {
        return (this.curPosition.getX() >= this.topLeftLimitPosition.getX()
        && this.curPosition.getX() <= this.bottomRightLimitPosition.getX())
                && (this.curPosition.getY() >= this.topLeftLimitPosition.getY()
        && this.curPosition.getY() <= this.bottomRightLimitPosition.getY());
    }

    public void takeSteps(int times) {
        for (int i = 0; i < times; i++) takeStep();
    }

    // simulate walks
    public void walk() {
        while (moreSteps() && isBounds()) {
            takeStep();
            trace();
        }
    }

    public void trace() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "RandomWalk{" +
                "curPosition=" + curPosition +
                ", maxSteps=" + maxSteps +
                ", curSteps=" + curSteps +
                ", topLeftLimitPosition=" + topLeftLimitPosition +
                ", bottomRightLimitPosition=" + bottomRightLimitPosition +
                '}';
    }

}
