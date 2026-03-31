class student implements Cloneable {
    int id;
    String name;
    
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class dem1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        student s1 = new student();
        s1.id = 101;
        s1.name = "John";
        student s2 = (student) s1.clone();
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
    }
}  
