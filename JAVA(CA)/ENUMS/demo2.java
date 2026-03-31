enum Direction{
    NORTH(0), SOUTH(180), EAST(90), WEST(270);
    private int value;
    Direction(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
public class demo2 {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
        System.out.println("Direction: " + dir);
        System.out.println("Direction value: " + dir.getValue());
    }
}