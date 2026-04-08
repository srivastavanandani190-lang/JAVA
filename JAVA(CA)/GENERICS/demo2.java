public class demo2{
    public static void main(String[] args) {
        pair<String, String> p1=new pair<>("hello","world");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        pair<Integer, Integer> p2=new pair<>(1,2);
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
    }
}
class pair<T, U>{
    private T first;
    private U second;
    public pair(T first,U second){
        this.first=first;
        this.second=second;
    }
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
}