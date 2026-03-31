enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("Move up (Y+1)");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Move down (Y-1)");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Move right (X+1)");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Move left (X-1)");
        }
    };
    public abstract void move();
}
public class demo3 {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
        dir.move(); // Output: Move up (Y+1)

        dir = Direction.EAST;
        dir.move(); // Output: Move right (X+1)
    }
}