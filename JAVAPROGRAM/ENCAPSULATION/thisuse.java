class human{

    private String name="Honey";
    private int age=20;

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
        return name;
    }//getter method

    public void setAge(int age){
        this.age = age;
    } 
    //setter method

    public int getAge(){
        return age;
    }
}
public class thisuse {
    public static void main(String[] args) {
        human h1 = new human();
        h1.setName("John");
        h1.setAge(30);

        System.out.println("Name: " + h1.getName());
        System.out.println("Age: " + h1.getAge());
    }
}