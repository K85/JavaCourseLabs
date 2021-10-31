package lab6;

import java.util.Random;

public enum MoveDirection {
    MOVE_UP(0, -1 ),
    MOVE_DOWN(0, 1),
    MOVE_LEFT(-1, 0),
    MOVE_RIGHT(1, 0);
    private static final Random random = new Random();
    private final int offsetX;
    private final int offsetY;

    MoveDirection(int offsetX, int offsetY) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public static MoveDirection generate() {
        return MoveDirection.values()[random.nextInt(MoveDirection.values().length)];
    }

    public int getOffsetX() {
        return offsetX;
    }
    public int getOffsetY() {
        return offsetY;
    }
}
