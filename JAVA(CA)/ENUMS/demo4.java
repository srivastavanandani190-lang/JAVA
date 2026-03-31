enum Direction {
    NORTH, SOUTH, EAST, WEST;
}
public class demo4 {
    public static void main(String[] args) {
        Direction[] directions = Direction.values();
        System.out.println("Current direction: " + directions[2]); 
       for (Direction dir : directions) {
            System.out.println(dir);
        }
        Direction dir = Direction.valueOf("SOUTH");
        //name
        System.out.println("Direction name: " + dir.name()); // Output: SOUTH

    }
}
//values()-->we can iterate in this enum
//valueOf(-->we can get the enum constant by name)
//name()-->we can get the name of the enum constant as a string
//toString()-->we can get the string representation of the enum constant (by default, it returns the name of the constant)
//ordinal()-->we can get the ordinal (position) of the enum constant in the enum declaration (starting from 0)
