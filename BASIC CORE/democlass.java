class call{
    public void playmusic(){
        System.out.println("Playing music...");
    }   
    public String getmepen(int cost){
        if(cost>5000){
            return "Premium Membership";
        }
        else{
            return "Basic Membership";
        }
    }
}
public class democlass {
    public static void main(String[] args) {
        call obj = new call();
        obj.playmusic();
        String membership = obj.getmepen(60);
        System.out.println("You have: " + membership);
    }
}